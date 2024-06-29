import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class ValidarNIFService {

    public static void main(String[] args) {
        SpringApplication.run(ValidarNIFService.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RestController
    public static class ValidarNIFController {

        private final ValidarNIFService validarNIFService;

        public ValidarNIFController(ValidarNIFService validarNIFService) {
            this.validarNIFService = validarNIFService;
        }

        @PostMapping("/validarDni")
        public boolean validarDni(@RequestBody String dni) {
            return validarNIFService.validarDni(dni);
        }

        @PostMapping("/calcularLetraNIF")
        public char calcularLetraNIF(@RequestBody String dni) throws DniFault {
            return validarNIFService.calcularLetraNIF(dni);
        }

        @PostMapping("/validarNif")
        public boolean validarNif(@RequestBody String nif) {
            return validarNIFService.validarNif(nif);
        }
    }

    public static class ValidarNIFService {

        private final RestTemplate restTemplate;

        public ValidarNIFService(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        public boolean validarDni(String dni) {
            Pattern pattern = Pattern.compile("[0-9]{8}");
            Matcher matcher = pattern.matcher(dni);
            return matcher.matches();
        }

        public char calcularLetraNIF(String dni) throws DniFault {
            if (!validarDni(dni)) {
                throw new DniFault("El DNI no es válido");
            }
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int index = Integer.parseInt(dni) % 23;
            return letras.charAt(index);
        }

        public boolean validarNif(String nif) {
            String dni = nif.substring(0, 8);
            char letra = nif.charAt(8);
            try {
                char letraCalculada = calcularLetraNIF(dni);
                return letra == letraCalculada;
            } catch (DniFault e) {
                return false;
            }
        }

        // Cliente Java
        public void llamarServicioWeb() {
            String dni = "12345678A"; // DNI de prueba
            boolean resultado = restTemplate.postForObject("http://localhost:8080/validarDni", dni, Boolean.class);
            System.out.println("Resultado de la validación del DNI: " + resultado);

            try {
                char letra = restTemplate.postForObject("http://localhost:8080/calcularLetraNIF", dni, Character.class);
                System.out.println("Letra del NIF: " + letra);
            } catch (DniFault e) {
                System.out.println("Error al calcular la letra del NIF: " + e.getMessage());
            }

            String nif = "12345678A"; // NIF de prueba
            resultado = restTemplate.postForObject("http://localhost:8080/validarNif", nif, Boolean.class);
            System.out.println("Resultado de la validación del NIF: " + resultado);
        }
    }

    public static class DniFault extends Exception {
        public DniFault(String mensaje) {
            super(mensaje);
        }
    }
}
