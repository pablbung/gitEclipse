package excepciones;
import java.util.*;
public class excepcion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,contador=0;
		boolean control=false;
		/*
		 * do { try{ n=sc.nextInt(); control=true; }catch(InputMismatchException e){
		 * System.out.println("Número erróneo"); sc.nextLine(); } finally { contador++;
		 * System.out.println("Has introducido  "+contador+" veces"); }
		 * }while(!control);
		 */
		n=pideNumero("Introduce tu edad: ");
		System.out.println("Acabas de introducir el número "+n);

	}

	private static Integer pideNumero(String s) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		boolean control=false;
		do {
			System.out.println(s);
			try {
				num=sc.nextInt();
				control=true;
			}catch(InputMismatchException e){
				System.out.println("Número erróneo");
				sc.nextLine();
			}
		}while(!control);
		return num;
	}
}
