package com;

 public class android extends celular {
	 
	 protected String version;
	protected double versionSeguridad;
	protected String cuentaGoogle;
	 
	 
	 public android() {
		 
		 
	 }

	
	public android(String marca, String modelo, String tipoSistema, double tamano, int almacenamiento, String version,
			double versionSeguridad, String cuentaGoogle) {
		super(marca, modelo, tipoSistema, tamano, almacenamiento);
		this.version = version;
		this.versionSeguridad = versionSeguridad;
		this.cuentaGoogle = cuentaGoogle;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getVersionSeguridad() {
		return versionSeguridad;
	}

	public void setVersionSeguridad(double versionSeguridad) {
		this.versionSeguridad = versionSeguridad;
	}

	public String getCuentaGoogle() {
		return cuentaGoogle;
	}

	public void setCuentaGoogle(String cuentaGoogle) {
		this.cuentaGoogle = cuentaGoogle;
	}

	
	@Override
	public String toString() {
		return "android [version=" + version + ", versionSeguridad=" + versionSeguridad + ", cuentaGoogle="
				+ cuentaGoogle + "]";
	}
	 
	public void datosAndroid() {
		System.out.println("marca: "+ getMarca()+ "\nmodelo: "+ getModelo()+"\nalmacenamiento: "+ getAlmacenamiento()+"\ntipoSistema: "+ isTipoSistema()+"\ntamaño: "+getTamano()+"\nalmacenamiento es: "
	+getAlmacenamiento()+"\n version :"+getVersion()+"\nversion seguridad : "+getVersionSeguridad()+"\ncuenta de google : "+getCuentaGoogle());
	} 
	 
 }