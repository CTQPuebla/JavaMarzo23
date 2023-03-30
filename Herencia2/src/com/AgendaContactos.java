package com;

public class AgendaContactos {
	
	protected String nombrecontact;
	protected String telefono;
	protected String mail;
	
	AgendaContactos(){
		
	}

	public AgendaContactos(String nombrecontact, String telefono, String mail) {
		
		this.nombrecontact = nombrecontact;
		this.telefono = telefono;
		this.mail = mail;
	}

	public String getNombrecontact() {
		return nombrecontact;
	}

	public void setNombrecontact(String nombrecontact) {
		this.nombrecontact = nombrecontact;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "AgendaContactos [nombrecontact=" + nombrecontact + ", telefono=" + telefono + ", mail=" + mail + "]";
	}

	
	

}
