package matriz;

import javax.swing.JOptionPane;
import java.util.Scanner; 
public class matriz {
	private int Array[][], x, y;
	
	public matriz(int principal[][], int x, int y){
		this.Array = principal;
		this.x = x;
		this.y = y;
	}
	public int[][] getArray() {
		return Array;
	}
	public void setArray(int[][] arr) {
		Array = Array;
	}
	public void mostrar(){
         int u=0,d=0,c=0;
         Scanner digito = new Scanner(System.in);
         System.out.println("Ingrese el digito a requerir: "); 
         int di=digito.nextInt();
         System.out.println("Numeros terminados en su digito ingresado:"); 
        for(int i=0;i<Array.length;i++){
              for(int j=0;j<Array[i].length;j++){
        if(Array[i][j]<=9)
          {
            if(Array[i][j]==di)
            	 System.out.println(Array[i][j]); 
          }
        if(Array[i][j]>=10 && Array[i][j]<=99)
        {
        	u = Array[i][j] % 10;
			
			
          if(u==di|| d==di)
          	 System.out.println(Array[i][j]); 
        }
        if(Array[i][j]>=100)
        {
			u = Array[i][j] % 10;
	
          if(u==di|| d==di||c==di)
    
          	 System.out.println(Array[i][j]); 
        }
  	  
         }
         }}}