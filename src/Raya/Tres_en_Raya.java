package Raya;

import java.util.Scanner;
import java.util.Random;

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
     
        // Decidir quién empieza
        System.out.println("Lanzaremos la moneda");
        turno = r.nextInt(2) + 1; 
        System.out.println(turno == 1 ? "Empezaremos con " + j1 + "" : "Empezaremos con " + j2 + "");
        
        // Este bucle sera el principal del juego
        while (jugadas < 9 && ganador == 0) {
            System.out.println("\n=== Tablero del Juego ===");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabla[i][j] + " ");
                    if (j < 2) System.out.print("| ");
                }                   
                System.out.println();	                
                if (i < 2) System.out.println("----------"); // He añadido un separador entre filas
            }
    
            String jugador = turno == 1 ? j1 : j2;     
            char fichaActual = turno == 1 ? 'X' : 'O';      
            System.out.println("¡Le toca a " + jugador + "!"); 
                
            // Aqui pedire y comprobare el movimiento de cada jugador            
            int fila, columna;           
            do {               
            	System.out.print("Dime una fila (0 - 2): ");               
            	fila = x.nextInt();
                System.out.print("Ahora dime una columna (0 - 2): ");
                columna = x.nextInt();         
            } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tabla[fila][columna] != '-');

            tabla[fila][columna] = fichaActual;
            jugadas++;
            
            // Esta parte se encargara de verificar si hay ganador
            if ((tabla[0][0] == fichaActual && tabla[0][1] == fichaActual && tabla[0][2] == fichaActual) ||
                (tabla[1][0] == fichaActual && tabla[1][1] == fichaActual && tabla[1][2] == fichaActual) ||
                (tabla[2][0] == fichaActual && tabla[2][1] == fichaActual && tabla[2][2] == fichaActual) ||
                (tabla[0][0] == fichaActual && tabla[1][0] == fichaActual && tabla[2][0] == fichaActual) ||
                (tabla[0][1] == fichaActual && tabla[1][1] == fichaActual && tabla[2][1] == fichaActual) ||
                (tabla[0][2] == fichaActual && tabla[1][2] == fichaActual && tabla[2][2] == fichaActual) ||
                (tabla[0][0] == fichaActual && tabla[1][1] == fichaActual && tabla[2][2] == fichaActual) ||
                (tabla[0][2] == fichaActual && tabla[1][1] == fichaActual && tabla[2][0] == fichaActual)) {
                ganador = turno;
            } else {
                turno = (turno == 1) ? 2 : 1; // Cambiaremos turno
            }       
        }
        
        // Aqui mostrare el resultado        
        System.out.println("\n=== Tablero Final ===");       
        for (int i = 0; i < 3; i++) {           
        	for (int j = 0; j < 3; j++) {                
        		System.out.print(tabla[i][j] + " ");              
        		if (j < 2) System.out.print("| "); // Añado separadores entre columnas
            }
            System.out.println();
            if (i < 2) System.out.println("----------"); // Añado separador entre filas	
        }      
            if (ganador == 1) {
                System.out.println("¡El " + j1 + " ha ganado la partida!");
            } else if (ganador == 2) {
                System.out.println("¡El " + j2 + " ha ganado la partida!");
            } else {
                System.out.println("¡Vaya, habéis empatado!");
            }
                   
            // Aqui hare la parte de la revancha          
            System.out.print("¿Quereis jugar otra vez? (Si / No): ");
            if (x.next().equalsIgnoreCase("Si")) {
                main(args); // Reiniciar el juego
            } else {
                System.out.println("¡Hasta la próxima!");
            }
            x.close();
	}     
}