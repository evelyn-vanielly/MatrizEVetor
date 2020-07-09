package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 
{ public static void main (String args[]) 
 { Scanner ler = new Scanner (System.in);
	
	int somai=0, somap=0, x;
	int [] vetor=new int[6];
	
	for (x=0;x<6;x++)
	{
	  System.out.println ("Entre com um valor");
	  vetor [x]= ler.nextInt();
	
		if (vetor[x]%2==0)
		{ 
		    somap=somap+vetor[x];
		} 
			else if (vetor[x]%2!=0)
			{
				somai++;
			}
	 }		
	 for (x=0;x<6;x++)	
	 {
		 if (vetor[x]%2==0)
		 {
		 System.out.println("Este é um valor par: "+vetor[x] );
	     }
		 	else if (vetor[x]%2!=0) 
		 	{
			 System.out.println("Este é um valor impar "+vetor[x] );
		 	}
     }
	     System.out.println ("Esta é a soma dos numeros pares: "+somap);
		 System.out.println("Esta é a quantidade de numeros impares: "+somai);
	} 
}
	 
  
 
			 



