package VetoresEMatrizes;

public class Exercicio1 {
	public static void main (String args[])
	{	
		int [] vetor = {1, 0, 5, -2, -5, 7};
		int soma=0, x=0, cont=0;
		
		for (x=0;x<6;x++)
		{    
		    if (x==0)
		    { 
			 soma= soma+ vetor[x];
		    }
		    if (x==1)
		    {
		    	soma=soma+vetor[x];
		    }
		    if (x==5)
			{
			   soma=soma+vetor[x];
		    }
		     
		}System.out.println ("O valor da soma é: "+ soma);
		
		   
		for (x=0;x<6;x++)
		{  
		   if (vetor[x]==vetor[4])
		    {
			  vetor[x]=100;   
		    }
	    }
	    
	    for (x=0;x<6;x++)
		{  
		 System.out.println("Os valores do vetor são:" + vetor[x]);   
		}
				}
	}	

				
	


