package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {
 public static void main (String args[])
 {    Scanner ler = new Scanner (System.in);
 
	 float [][] m1 = new float [2][2], m2 = new float[2][2];
	 float [][]	m3 = new float [2][2], m4 = new float[2][2];
	 int opcao, constt;
     
	 for (int i=0;i<2;i++)
	 {
		 for (int j=0;j<2;j++) 
		 {
			 System.out.println ("Insira um valor para M1: ");
			 m1[i][j] = ler.nextFloat();
		 }
	 }
	 for (int i=0;i<2;i++)
	 {
		 for (int j=0;j<2;j++) {
			 System.out.println ("Insira um valor para M2: ");
			 m2[i][j] = ler.nextFloat();
		 }
	 }
	 
	 System.out.println ("Escolha uma das opções:\n1 - para somar duas matrizes\n2- subtrair a primeira matriz da segunda\n3- adicionar uma constante a duas matrizes\n4 - imprimir as matrizes");
	 opcao = ler.nextInt();
	 
	 switch (opcao)
	 {
	 case 1: 
		 for (int i=0;i<2;i++)
		 { 
			 for (int j=0;j<2;j++) 
			 {
				 m3[i][j]=m1[i][j] + m2[i][j];
				 System.out.println("A soma é de: "+ m3[i][j]);
		     }   
	     } 
		 break;
	 	case 2: 
	 		 for (int i=0;i<2;i++)
			 { 
				 for (int j=0;j<2;j++) 
				 {
					 m4[i][j]=m1[i][j]- m2[i][j];
					 System.out.println("A soma é de: "+ m4[i][j]);
			     }   
		     } 
		  break;
	 		case 3:
	 			System.out.println ("Insira um valor para a constante: ");
	 			constt = ler.nextInt();
	 			for (int i=0;i<2;i++)
				 { 
					 for ( int j=0;j<2;j++) 
					 {
						m1[i][j]=m1[i][j]+constt;
						m2[i][j]=m2[i][j]+constt;
						System.out.println ("Estes é m1: "+m1[i][j]);
						System.out.println ("m2: "+m2[i][j]);
					 } 
				 }
	 			break;
	 			case 4:
	 				for (int i=0;i<2;i++)
					 { 
						 for (int j=0;j<2;j++) 
						 {
							 System.out.println ("Estes são os valores de m1: "+m1[i][j]);	
						 }
					 }
	 				for (int i=0;i<2;i++)
					 { 
						 for (int j=0;j<2;j++) 
						 {
							 System.out.println ("Estes são os valores de m2: "+m2[i][j]); 
						 }
					 }	 
	 				break;
	 				default: System.out.println("Opção inválida");
	          }
  }
}

	 