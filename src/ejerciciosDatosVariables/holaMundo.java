package ejerciciosDatosVariables;

public class holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo");
		
		//byte es el más pequeño para datos de tipo entero
		//byte valor numerico de 8 bits
		byte salas=127;
		//short valor numerico de 16 bits 
		short asientos = 1128;
		//int valor numerico de 32 bits 
		int dulces=3476;
		
		//long valor numericos de 64 bits
		long recaudacion=10000000000000L;
		
		System.out.println(salas);
		System.out.println(asientos);
		System.out.println(dulces);
		System.out.println(recaudacion);
		System.out.println(Long.MAX_VALUE);
		
		//datos en punto decimal
		//floar valor numerico de 32 bits
		
		float palomitas = 35.5f;
		System.out.println(palomitas);
		//double es usado para la representcion numerica
		double masaTierra=5.972e24d;
		System.out.println(masaTierra);
		
		//boolean sirve para representar valores booleanos tiene dos salidas, true or false
		//char sirve para representar un caracter o un numero
		
		//casting o casteo, sirve para realizar una conversion de tipos de datos aunoo más grande o uno más pequeño
		
		double ice = 59.70d;
		int iceEntero=(int) ice;
		
		System.out.println(iceEntero);
		
		long numLong = (long) ice;
		System.out.println(numLong);
		
		String cantidad ="85";
		String precio="59.7";
		
		int cantidadEntera=Integer.parseInt(cantidad);
		float precioFloat = Float.parseFloat(precio);
		
		System.out.println("el valor de la compra es: " + cantidadEntera*precioFloat);
		
		//operadores aritmeticos
		
		int dias = 28;
		dias = dias/2;
		System.out.println("dias: " + dias);
		
		//operadores de incremento y decremento
		
		int p=0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		//operadores 
		/*
		 ==, !=, <, >, <=, >=, 
		 */
		
		int a=10;
		int b=15;
		
		boolean resultado;
	
		resultado = a!= b;
		System.out.println("resultado de la comparacion es: " + resultado);
		
	}

}
