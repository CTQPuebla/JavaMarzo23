package test;

import java.util.Date;

import com.Cliente;
import com.Empleado;

public class TestHerencia {
	public static void main(String[] args) {
		
	Cliente cliente1= new Cliente(new Date(), true, "jose", 'M', 26, "5av Oriente sur");	
		System.out.println("Cliente1 : " + cliente1);	
		
	}

}
