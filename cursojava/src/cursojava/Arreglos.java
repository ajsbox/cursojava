package cursojava;

public class Arreglos {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		String[] frutas = new String[5];
		String[] marcas = {""};
		
		frutas[0] = "Melon";
		frutas[1] = "Fresa";
		frutas[2] = "Banana";
		frutas[3] = "Coco";
		frutas[4] = "Frambuesa";
		
		for(int y = 0; y < numeros.length; y++) {
			System.out.println("Numero: " + y);
		}
		
		for(int x = 0; x < frutas.length; x++) {
			System.out.println("Fruta: " + frutas[x]);
		}
	}
}
