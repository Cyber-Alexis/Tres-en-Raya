package Raya;

public class Tres_en_Raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
        Random r = new Random();

        // Declarar las variables
        char[][] tabla = new char[3][3];
        String j1, j2;
        int jugadas = 0, ganador = 0, turno;

        // Aqui inicializare el juego
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = '-';
            }
        }
        // Este apartado sirve para solicitar nombres
        System.out.print("¿Cómo te llamas, jugador 1?: ");
        j1 = x.nextLine();
        System.out.print("¿Cómo te llamas, jugador 2?: ");
        j2 = x.nextLine();
		        
	}
}