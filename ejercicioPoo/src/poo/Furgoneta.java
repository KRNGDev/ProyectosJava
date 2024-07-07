package poo;

public class Furgoneta extends Vehiculo {

    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extras, int capacidad_carga) {
        super();
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extras;

    }

    public String getDatosFurgoneta() {
        return "La capacidad de carga es " + capacidad_carga + " y la plazas extras son " + plazas_extra;
    }

}
