import java.util.Calendar;

public class Vehiculo {

	
	//Constantes
	public static final int GASOIL=1;
	public static final int GASOLINA=2;
	public static final int ELECTRICO=3;
	public static final int HIBRIDO=4;
	public static final int ANYO_DEF=1990;
	public static final int PUERTAS_DEF=5;
	
	//atributos
	private String numBastidor;
	private String matricula;
	
	/**
	 * Puede haber 4 tipos de vehiculos: coche, moto, camion y furgoneta
	 */
	private String vehiculo;
	
	/**
	 * Esteampo especifica el tipo de vehiculo que nos encoontramos dependiendo del combustible
	 * 1-Gasoil
	 * 2-Gasolina 
	 * 3-Electrico
	 * 4-Hibrido
	 */
	private int tipoVehiculo;
	
	
	private double precioSinIva;
	private double precioConIva;
	private String marca;
	private String modelo;
	private String color;
	private int numPuertas;
	private int anyo;
	
	public Vehiculo() {
		this.numBastidor="";
		this.matricula="";
		this.vehiculo="";
		this.tipoVehiculo=0;
		this.precioSinIva=0;
		this.precioConIva=0;
		this.marca="";
		this.modelo="";
		this.color="";
		this.anyo= ANYO_DEF;
		this.numPuertas=PUERTAS_DEF;
		calculoPrecioColor();
		calculoPrecioAnyo();
		calculoPrecioTipo();
		
	}
	
	public Vehiculo(String numBastior, int tipoVehiculo, double precioSinIva, String color, int anyo) {
		this.numBastidor=numBastidor;
		this.matricula="";
		this.vehiculo="";
		this.tipoVehiculo=tipoVehiculo;
		this.precioSinIva=precioSinIva;
		this.precioConIva=0;
		this.marca="";
		this.modelo="";
		this.color=color;
		this.anyo= anyo;
		this.numPuertas=PUERTAS_DEF;
		calculoPrecioColor();
		calculoPrecioAnyo();
		calculoPrecioTipo();
	}
	public Vehiculo(String numBastior, String matricula, String vehiculo, int tipoVehiculo, double precioSinIva, double precioConIva, 
			String marca, String modelo, String color, int anyo, int numPuertas) {
		this.numBastidor=numBastidor;
		this.matricula=matricula;
		this.vehiculo=vehiculo;
		this.tipoVehiculo=tipoVehiculo;
		this.precioSinIva=precioSinIva;
		this.precioConIva=precioConIva;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.anyo= anyo;
		this.numPuertas=numPuertas;
		calculoPrecioColor();
		calculoPrecioAnyo();
		calculoPrecioTipo();
	}
	
	public String getNumBastidor() {
		return numBastidor;
		
	}
	public void setNumBastidor(String numBastidor) {
		this.numBastidor= numBastidor;
		
	}
	public String getMatricula() {
		return matricula;
		
	}
	public void setMatricula(String matricula) {
		this.matricula= matricula;
		
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo= vehiculo;
		
	}
	public int getTipoVehiculo() {
		return tipoVehiculo;
		
		
	}
	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo= tipoVehiculo;
		
	}
	public double getPrecioSinIva() {
		return precioSinIva;
		
	}
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva= precioSinIva;
		
	}
	
	public double getPrecioConIva() {
		return precioConIva;
		
	}
	
	public void setPrecioConIva(double precioConIva) {
		this.precioConIva= precioConIva;
		
	}
	
	public String getMarca() {
		return marca;
		
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
		
	}
	
	public String getModelo() {
		return modelo;
		
	}
	
	public void setModelo(String modelo) {
		this.modelo= modelo;
		
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color= color;
		
	}
	public int getNumPuertas() {
		return numPuertas;
		
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas= numPuertas;
		
	}
	
	public int getAnyo() {
		return anyo;
		
	}
	
	public void setAnyo(int anyo) {
		this.anyo= anyo;
		
	}
	public void calculoPrecioColor() {
		if(this.color=="BLANCO") {
			this.setPrecioSinIva(this.precioSinIva+100);
		}else if(this.color=="NEGRO") {
			this.setPrecioSinIva(this.precioSinIva+200);
		}else {
			this.setPrecioSinIva(this.precioSinIva+500);
		}
	}
	public void calculoPrecioAnyo() {
		//Obtenemos año actual
		Calendar cal= Calendar.getInstance();
		int year =cal.get(Calendar.YEAR);
		
		int diff=year-this.getAnyo();
		
		if(diff<5) {
			this.setPrecioSinIva(this.getPrecioSinIva()*1.05);
		}else if ((diff>=5)&&(diff<8)) {
			this.setPrecioSinIva(this.getPrecioSinIva()*1.10);
		}else if((diff>=8)&&(diff<10)) {
			this.setPrecioSinIva(this.getPrecioSinIva()*1.15);
		}else {
			this.setPrecioSinIva(this.getPrecioSinIva()*1.20);
		}
		
		
		
	}
	
	public void calculoPrecioTipo() {
			
			double precioCI= this.getPrecioSinIva();
			
			switch(this.getTipoVehiculo()) {
			case 1:
				precioCI=precioCI*1.19;
				break;
			case 2:
				precioCI=precioCI*1.15;
				break;
			case 4:
				precioCI=precioCI*1.07;
				break;
				
			
			}
			this.setPrecioSinIva(precioCI);
	}
	
	
	
	
}
