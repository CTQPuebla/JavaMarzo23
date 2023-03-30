package com;

public class aple extends celular{
	
	private int version;
	private int icloud;
	private String airdroop;
	
	
	
	public aple() {
		
	}

	public aple(String marca, String modelo, String tipoSistema, double tamano, int almacenamiento, int version,
			int icloud, String airdroop) {
		super(marca, modelo, tipoSistema, tamano, almacenamiento);
		this.version = version;
		this.icloud = icloud;
		this.airdroop = airdroop;
	}


	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getIcloud() {
		return icloud;
	}

	public void setIcloud(int icloud) {
		this.icloud = icloud;
	}

	public String getAirdroop() {
		return airdroop;
	}

	public void setAirdroop(String airdroop) {
		this.airdroop = airdroop;
	}

	@Override
	public String toString() {
		return "aple [version=" + version + ", icloud=" + icloud + ", airdroop=" + airdroop + "]";
	}
	public void datosAple() {
		System.out.println("marca :"+getMarca()+"\nmodelo :"+getModelo()+"\ntipo de Sistema:"+isTipoSistema()+"\ntamaño :"+getTamano()+"\nalmacenamiento: "+getAlmacenamiento()+"\nversion:"+getVersion()+"\nicloud: "+getIcloud()+"\nairdrop: "+getAirdroop());
	}
}
