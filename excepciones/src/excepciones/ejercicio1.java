package excepciones;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,contador=0,nFallos=0,p=12;
		int[]cosas=new int[2];
		int[] enteros=new int[5];
		do {
			cosas=pideNumero("Introduce un número");
			enteros[contador]=cosas[0];
			contador++;
			nFallos+=cosas[1];
		}while(contador<5);
		System.out.println("Has tenido "+nFallos+" fallos");
	}
	private static int[] pideNumero(String s) {
		Scanner sc=new Scanner(System.in);
		int num=0,nFallos=0;
		int[]cosas=new int[2];
		boolean control=false;
		do {
			System.out.println(s);
			try {
				num=sc.nextInt();
				control=true;
			}catch(InputMismatchException e){
				System.out.println("Número erróneo");
				sc.nextLine();
				nFallos++;
			}
		}while(!control);
		cosas[0]=num;
		cosas[1]=nFallos;
		return cosas;
	}
}
