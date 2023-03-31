package com;

public class Velero extends Yate{
	public int cantidadVelas;
	public String tipoQuilla;
	
	public Velero(String nombre, String tipoEmbarcacion, String marca, int modelo, int longitudPies, String combustible, int torqueHp, int cantidadCamarotes, int cantidadVelas, String tipoQuilla) {
		super(nombre,tipoEmbarcacion,marca,modelo,longitudPies,combustible,torqueHp,cantidadCamarotes);
		this.cantidadVelas = cantidadVelas;
		this.tipoQuilla = tipoQuilla;
		
	}

	public int getCantidadVelas() {
		return cantidadVelas;
	}

	public void setCantidadVelas(int cantidadVelas) {
		this.cantidadVelas = cantidadVelas;
	}

	public String getTipoQuilla() {
		return tipoQuilla;
	}

	public void setTipoQuilla(String tipoQuilla) {
		this.tipoQuilla = tipoQuilla;
	}

	@Override
	public String toString() {
		return "Velero [cantidadVelas=" + cantidadVelas + ", tipoQuilla=" + tipoQuilla + "]";
	}
	@Override
	public void datos() { 
		System.out.println("Nombre del Velero: "+getNombre()+
				"\nTipo de Embarcacón: "+getTipoEmbarcacion()+
				"\nMarca: "+getMarca()+
				"\nModelo: "+getModelo()+
				"\nLongitud: "+getLongitudPies()+" ft"+
				"\nTipo de Combustible: "+getCombustible()+
				"\nCaballos de Torque: "+getTorqueHp()+" hp"+
				"\nCantidad de Camarotes: "+getCantidadCamarotes()+
				"\nNumero de Velas: "+cantidadVelas+
				"\nTipo de Quilla: "+tipoQuilla+
				"\n");
	}

}
