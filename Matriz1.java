package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 {
 public static void main (String args[])
 {    Scanner ler = new Scanner (System.in);
	 
     int [][] matriz = new int [3][3];
	 int soma=0, i,j, x;
	 
	 for (i=0;i<3;i++)
	 {
		 for (j=0;j<3;j++)
		 {
			 System.out.println("Entre com um valor: ");
			 matriz[i][j] = ler.nextInt();
			 
			 if (matriz[i][j]>10)
			 {
				 soma++;
			 }
		 }
	 } 
	 for (i=0;i<3;i++)
	 {
		 for (j=0;j<3;j++)
		 {
			 if (matriz[i][j]>10)
			 System.out.println("Estes são os valores maiores que 10: "+ matriz[i][j]);
		 }
	 }
	 
	 System.out.println("Há "+ soma + " numeros maiores que 10.");
	  
	 
	 
	 
 }
}
