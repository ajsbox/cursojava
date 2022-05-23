package cursojava;

public class SentenciaRamificaciones {
	public static void main(String[] args) {
		
		String[] frutas = {"Melon", "Fresa", "Uva"};
		
		// Primer ejemplo
		for(int i=1;i<=10;i++){  
	        if(i==5){   
	            continue;  
	        }  
	        System.out.println(i);  
	    }  
		
		
		// Segundo ejemplo
		for(int i = 1; i <= 10; ++i) {

		      // if value of i is between 4 and 9
		      // continue is executed
		      if (i > 4 && i < 9) {
		        continue;
		      }
		      System.out.println(i);
		}
		
		// foreach
		for (String fruta : frutas) 
		{ 
		    System.out.println("Nombre de la fruta: " + fruta);
		}
	}
}
