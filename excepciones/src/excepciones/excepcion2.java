package excepciones;
import java.util.*;
public class excepcion2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contador=0,nFallos1=0,nFallos2=0,n1=0,n2=0;
		int[]division=new int[3];
		do {
			System.out.println("Division numero "+contador);
			division=doDivision(n1,n2);
			nFallos1+=division[2];
			nFallos2+=division[1];
			contador++;
			System.out.println("Has tenido "+nFallos1+" fallos de introduccion de datos");
			System.out.println("Has intentado dividir por cero "+nFallos2+" veces");
		}while(contador<5);
		
	}
	private static int[] doDivision(int a, int b) {
		Scanner sc=new Scanner(System.in);
		int division=0,nFallosCociente=0,nFallosNum=0;
		boolean control=false;
		int[]cosas=new int[3];
		do {
			System.out.println("Introduce un numerador: ");
			try {
				a=sc.nextInt();
				control=true;
			}catch(InputMismatchException e) {
				System.out.println("Número erróneo");
				sc.nextLine();
				nFallosNum++;
			}
		}while(!control);
		
		control=false;
		do {
			System.out.println("Introduce un denominador: ");
			try {
				b=sc.nextInt();
				division=a/b;
				control=true;
			}catch(InputMismatchException e) {
				System.out.println("Número erróneo");
				sc.nextLine();
				nFallosNum++;
			}
			catch(ArithmeticException e){
				System.out.println("Error, denominador 0");
				nFallosCociente++;
			}
		}while(!control);
		cosas[0]=division;
		cosas[1]=nFallosCociente;
		cosas[2]=nFallosNum;
		return cosas;
	}
}
