package cursojava;

public class OperadoresDesplazamiento {
	public static void main(String[] args) {
		
		// Desplazamiento a la izquierda
		int x = 45;                      // 00101101
		int desplazamiento = x << 2;     // 10110100
		
		System.out.println(desplazamiento);
		
		
		// Desplazamiento a la derecha
		                                    // 00101101
		int desplazamientoDerecha = x >> 2; // 00001011
		
		System.out.println(desplazamientoDerecha);
		
		
		// Operaciones OR --> | <-- El resultado es 0 cuando ambos operando son 0
		int a = 45;                                    // 00101101
		int b = 11;                                    // 00001011
		int or = a | b;								   // 00101111
		System.out.println("La operacion OR es: " + or); 
		
		
		// Operacion AND --> & <-- El resultado es 1 cuando ambos operandos son 1
		                                    			// 00101101 <-- 45
		                                    			// 00001011 <-- 11
		int and = a & b;								// 00001001 <-- 9
		System.out.println("La operacion AND es: " + and);
		
		
		// Operacion XOR --> ^ <-- El resultado es 1 cuando ambos operandos son 1 o 1
														   // 00101101 <-- 45
														   // 00001011 <-- 11
		int xor = a ^ b;								   // 00100110 <-- 38
		System.out.println("La operacion XOR es: " + xor); 
		
		
	}

}
