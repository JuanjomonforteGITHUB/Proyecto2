import java.util.Scanner;
public class HolaMundo {
 
	public static void main(String[] args) {
		int num1;
		int num2;
		int numtot;

		Scanner recogerdatos = new Scanner(System.in);
		System.out.println("Hola DAW");
		
		System.out.println("Introduce el primer numero:");
			num1 = recogerdatos.nextInt(); 

			//Primer numero que introduce el usuario se almacena en la variable "num1"
		
		System.out.println("Introduce el segundo numero:");
			num2 = recogerdatos.nextInt(); 

			//Segundo numero que introduce el usuario se almacena en la variable "num2"
		
		numtot = num1 + num2;

		System.out.println("El resultado es: " + numtot); //Muestra el resultado final de la operacion
	}
 
}
