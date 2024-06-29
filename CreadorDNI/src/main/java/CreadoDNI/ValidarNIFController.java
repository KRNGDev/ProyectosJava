import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidarNIFController {

    @Autowired
    private ValidarNIFService validarNIFService;

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
