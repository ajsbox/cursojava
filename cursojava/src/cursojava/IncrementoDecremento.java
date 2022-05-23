package cursojava;

public class IncrementoDecremento {
	public static void main(String[] args) {
		int a = 5;
		
		System.out.println(a); // a es 5
		a = a + 1;
		System.out.println(a); // a se incrementa a 6
		
		a++; // Usando el operador unario
		
		System.out.println(a);
		a--; // a se decrementa
		System.out.println(a);
	}

}
