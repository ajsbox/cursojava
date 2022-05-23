package cursojava;

public class OperadoresCondicionales {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int mayor;
		
		if((a == 10) && (b > 3)){
			System.out.println("Se cumplen las condiciones");
		}
		
		if((a == 10) || (b == 5)) {
			System.out.println("Una de las dos condiciones se cumple");
		}
		
		mayor = (a > b) ? a : b;
		System.out.println("El numero mayor es: " + mayor);
		
		System.out.println("Numero Mayor: " + ((a > b) ? "i es mayor" : "j es mayor"));
	}

}
