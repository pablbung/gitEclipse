import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class collatz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contador=0,num,nMax=0;
		boolean disjuntos;
		ArrayList<Integer> orbitaCollatz=new ArrayList<>();
		ArrayList<ArrayList<Integer>> listaOrbitas=new ArrayList<>();
		ArrayList<Integer> cotas=new ArrayList<>();
		System.out.println("Introduce un numero entero positivo: ");
		/*
		 * do { if(contador>=1) System.out.
		 * println("Número erróneo, por favor introduce un numero entero positivo.");
		 * n=sc.nextInt(); contador++; }while(n<0);
		 */
		for(int n=5;n<12;n++) {
			num=n;
			//collatz function
			collatz(n,orbitaCollatz);
			listaOrbitas.add(orbitaCollatz);
			//buscamos el máximo y lo agregamos a lista de cotas
			nMax=searchingMax(orbitaCollatz);
			cotas.add(nMax);
			//System.out.println("La órbita de "+num+" es: ");
			/*
			 * for(Integer i:orbitaCollatz)System.out.print(i+", "); System.out.println("");
			 * System.out.println("El número de pasos es: "+(orbitaCollatz.size()-1));
			 * System.out.println("La cota es: "+nMax);
			 */
			System.out.println(Arrays.toString(fCollatz(orbitaCollatz)));
			orbitaCollatz.clear();
		}
		
	}

	private static int[] fCollatz(ArrayList<Integer> orbitaCollatz) {
		int[] tuplaCollatz=new int[2];
		tuplaCollatz[0]=orbitaCollatz.size()-1;
		tuplaCollatz[1]=searchingMax(orbitaCollatz);
		
		return tuplaCollatz;
	}

	private static int searchingMax(ArrayList<Integer> orbitaCollatz) {
		int nMax=0;
		for(int i=0;i<orbitaCollatz.size();i++) if(orbitaCollatz.get(i)>nMax) nMax=orbitaCollatz.get(i);
		return nMax;
		
	}

	private static void collatz(int n, ArrayList<Integer> orbitaCollatz) {
		while(n!=1) {
			orbitaCollatz.add(n);
			if(n%2==0) n=n/2;
			
			else n=(3*n)+1;
		}
		orbitaCollatz.add(n);
	}
}
