package es.Studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el numero 1");
		numero1 = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el numero 2");
		numero2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los dos números es:"+FuncSuma(numero1,numero2));
	}
	public static int FuncSuma(int a, int b)
	{
		return a+b;
	}
}
