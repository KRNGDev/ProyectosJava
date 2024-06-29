import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class vehiculoTest {

	Vehiculo v;
	Vehiculo n;
	Vehiculo a;
	
	
	@Test
	public void calculoPrecioColorTest1() {
		a=new Vehiculo();
		a.setColor("BLANCO");
		a.setPrecioSinIva(30000);
		a.calculoPrecioColor();
		assertEquals(30100,a.getPrecioSinIva(),0.01);
	}
	@Test
	public void calculoPrecioColorTest2() {
		a=new Vehiculo();
		a.setColor("ROJO");
		a.setPrecioSinIva(30000);
		a.calculoPrecioColor();
		assertEquals(30500,a.getPrecioSinIva(),0.01);
	}
	@Test
	public void calculoPrecioAnyo1() {
		v=new Vehiculo();
 		v.setAnyo(2016);
		v.setPrecioSinIva(30000);
		v.calculoPrecioAnyo();
		assertEquals(33000,v.getPrecioSinIva(),0.01);
	}
	@Test
	public void calculoPrecioAnyo2() {
		v=new Vehiculo();
		v.setAnyo(2000);
		v.setPrecioSinIva(30000);
		v.calculoPrecioAnyo();
		assertEquals(36000,v.getPrecioSinIva(),0.01);
	}
	@Test
	public void calculoPrecioTipoTest1() {
		n=new Vehiculo();
		n.setTipoVehiculo(2);
		n.setPrecioSinIva(30000);
		n.calculoPrecioTipo();
		assertEquals(34500,n.getPrecioConIva(),0.01);
	}
	@Test
	public void calculoPrecioTipoTest2() {
		n=new Vehiculo();
		n.setTipoVehiculo(1);
		n.setPrecioSinIva(30000);
		n.calculoPrecioTipo();
		assertEquals(35700,n.getPrecioConIva(),0.01);
	}
	

}
