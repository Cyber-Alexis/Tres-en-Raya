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
        }
      }
	}