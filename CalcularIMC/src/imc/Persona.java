package imc;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_POR_DEFECTO = 'H';
    private static final double PESO_IDEAL_INFERIOR = 20;
    private static final double PESO_IDEAL_SUPERIOR = 25;

    public Persona() {
        this("", 0, SEXO_POR_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            return SEXO_POR_DEFECTO;
        }
        return sexo;
    }

    private String generarDNI() {
        // Generar el número de DNI aleatorio
        int numeroDNI = (int) (Math.random() * 90000000) + 10000000;

        // Generar la letra del DNI correspondiente al número
        char letraDNI = calcularLetraDNI(numeroDNI);

        return Integer.toString(numeroDNI) + letraDNI;
    }

    private char calcularLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % 23;

        return letrasDNI.charAt(indiceLetra);
    }

    public int calcularIMC() {
        double alturaEnMetros = altura / 100; // Convertir altura a metros
        double IMC = peso / (alturaEnMetros * alturaEnMetros);

        if (IMC < PESO_IDEAL_INFERIOR) {
            return -1; // Por debajo del peso ideal
        } else if (IMC >= PESO_IDEAL_INFERIOR && IMC <= PESO_IDEAL_SUPERIOR) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " cm";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
