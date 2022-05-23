package cursojava;

public class SentenciasDecision {
	public static void main(String[] args) {
		
		// if-else
		int a = 10;
		
		if(a == 10) {
			System.out.println("El numero es 10");
		}else {
			System.out.println("El numero no es 10");
		}
		
		int day = 5;
		String dayString;
		
		// switch-case
		switch (day) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia inválido";
                     break;
        }
        System.out.println(dayString);
	}
}
