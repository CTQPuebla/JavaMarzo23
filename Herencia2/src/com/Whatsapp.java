package com;


public class Whatsapp extends AgendaContactos{
	
	
	private int mensajes;
	private boolean stados;
	
	public Whatsapp(){
	
	}
	
	//Whatsapp w = new Whatsapp();

//	public Whatsapp(String nombrecontact,String telefono,String mail, int mensajes, boolean stados) {
//		//super(nombrecontact,telefono);
//		this.mensajes = mensajes;
//		this.stados = stados;
//	}
//	
	public Whatsapp(int mensajes, boolean stados,String nombrecontact, String telefono,String mail) {
		super(nombrecontact,telefono,mail);
		this.mensajes = mensajes;
		this.stados = stados;
	}
	
	
	
	
	public Whatsapp(int mensajes, boolean stados) {
		super();
		this.mensajes = mensajes;
		this.stados = stados;
	}

	public void notificacion() {
		System.out.println("Tienes un mensaje de " + nombrecontact);
	}

	@Override
	public String toString() {
		return "Whatsapp [mensajes=" + mensajes + ", stados=" + stados + ", nombrecontact=" + nombrecontact
				+ ", telefono=" + telefono + ", mail=" + mail + "]";
	}


	
	
	
	
	


}
