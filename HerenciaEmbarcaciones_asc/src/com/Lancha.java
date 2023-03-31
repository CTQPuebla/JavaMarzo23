package com;

public class Lancha extends Yate{
	public String tipoCasco;

	public Lancha(String nombre, String tipoEmbarcacion, String marca, int modelo, int longitudPies, String combustible,
			int torqueHp, int cantidadCamarotes, String tipoCasco) {
		super(nombre, tipoEmbarcacion, marca, modelo, longitudPies, combustible, torqueHp, cantidadCamarotes);
		this.tipoCasco = tipoCasco;
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}

	@Override
	public String toString() {
		return "Lancha [tipoCasco=" + tipoCasco + "]";
	}

@Override
public void datos() { 
	System.out.println("Nombre de la Embarcación: "+getNombre()+
			"\nTipo de Embarcación: "+getTipoEmbarcacion()+
			"\nMarca: "+getMarca()+
			"\nModelo: "+getModelo()+
			"\nLongitud: "+getLongitudPies()+" ft"+
			"\nTipo de Combustible: "+getCombustible()+
			"\nCaballos de Torque: "+getTorqueHp()+" hp"+
			"\nCantidad de Camarotes: "+getCantidadCamarotes()+
			"\nTipo de Casco: "+tipoCasco+
			"\n");
   }
	

}
