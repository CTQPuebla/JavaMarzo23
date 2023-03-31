package com;

public class Yate extends Embarcacion{
	public int torqueHp;
	public int cantidadCamarotes;
	
	public Yate(String nombre,String tipoEmbarcacion, String marca, int modelo, int longitudPies, String combustible, int torqueHp, int cantidadCamarotes) {
		super(nombre,tipoEmbarcacion,marca,modelo,longitudPies,combustible);
		this.torqueHp = torqueHp;
		this.cantidadCamarotes = cantidadCamarotes;		
	}	
	public int getTorqueHp() {
		return torqueHp;
	}
	public void setTorqueHp(int torqueHp) {
		this.torqueHp = torqueHp;
	}
	public int getCantidadCamarotes() {
		return cantidadCamarotes;
	}
	public void setCantidadCamarotes(int cantidadCamarotes) {
		this.cantidadCamarotes = cantidadCamarotes;
	}
	@Override
	public String toString() {
		return "Yate [torqueHp=" + torqueHp + ", cantidadCamarotes=" + cantidadCamarotes + "]";
	}
	@Override
	public void datos() { 
		System.out.println("Nombre del Yate: "+getNombre()+
				"\nTipo de Embarcacón: "+getTipoEmbarcacion()+
				"\nMarca: "+getMarca()+
				"\nModelo: "+getModelo()+
				"\nLongitud: "+getLongitudPies()+" ft"+
				"\nTipo de Combustible: "+getCombustible()+
				"\nCaballos de Torque: "+torqueHp+" hp"+
				"\nCantidad de Camarotes: "+cantidadCamarotes+
				"\n");
	}
	

}
