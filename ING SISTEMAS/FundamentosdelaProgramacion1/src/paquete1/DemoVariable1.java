package paquete1;

public class DemoVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a;
		a = 1250L;
		a = -233372036854775808L;
		System.out.println(a);
		
		//declarar una variable tipo int
		int b;
		b = 1250;
		System.out.println(b);
		b = 2147483647;
		System.out.println(b);
		
		//declarar una variable tipo int
		short c = -32768;
		System.out.println(c);
		c = 500;
		System.out.println(c);
		
		//declarar una variable tipo byte
		byte d = -128;
		System.out.println(d);
		
		//decalrar una variable tipo float 
		float e = 3.0f;
		System.out.println(e);
		
		//decalrar una variable tipo double 
		double f = 5.18129;
		System.out.println(f);
		double g = 5.4e-2; //notcion cientifica
		System.out.println(g);
		g = 5.4e+5;
		System.out.println(g);
		
		//Valores especiales de float y double
		System.out.println(Math.sqrt(-1));
		System.out.println(1.1e200*1.1e200);
		System.out.println(-1.1e200*1.1e200);
		
		//declarar una variable tipo caracter
		char car1,car2= ' ';
		car1 = 'A';
		System.out.println(car1);
		System.out.println(car2);
		char car3 = '\t';
		System.out.println(car3);
		
		//Representacion de datos boleanos
		boolean bandera;
		bandera = true;
		System.out.println(bandera);
		bandera = false;
		System.out.println(bandera);
		bandera = true;
		if (bandera)
		System.out.println("cierto");
		else
			System.out.println("mentira");
		
		//Representacion de constante literales en Octal
		int varOctal;
		varOctal= 07;
		System.out.println(varOctal);
		
		//Representacion de constante lñiterales en Hexadecimal
		byte varHD;
		varHD=0xf;
		System.out.println(varHD);
		
		

	}

}
