package matriz;

import javax.swing.JOptionPane;

import java.util.Scanner; 
import java.util.Random; 
public class main {
	public static void main(String[] args) {
		int matrizx,matrizy;
		Scanner ingresar = new Scanner(System.in);  
                Random aleat = new Random ();   
		
				matrizx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo de filas: "));
				matrizy = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo de columnas: "));
		System.out.println("Limite de numeros Aleatorios: "); 
                int aleatorios = ingresar.nextInt();		
		
		int principal[][] = new int [matrizx][matrizy];
		matriz m = new matriz(principal,matrizx,matrizy); 
			for(int x=0; x<matrizx; x++){
				for(int y=0; y<matrizy; y++){
					principal[x][y] = aleat.nextInt(aleatorios)+1;
				}}
		matriz vector = new matriz(principal, matrizx, matrizy);
		for(int x=0; x<matrizx; x++){
			for(int y=0; y<matrizy; y++){
				System.out.print(principal[x][y]+" ");
			}
			System.out.println("");	
		}
		m.mostrar();
		}}