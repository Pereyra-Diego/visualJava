package EJERCICIOS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CicloFor cicloFor = new CicloFor();
        System.out.println("EJERCICIO Ciclo For");
        System.out.println("1-Imprimir Figura 1");        
        System.out.println("2-Imprimir Figura 2");
        System.out.println("3-Imprimir Figura 3");
        System.out.println("4-Imprimir Figura 4");
        System.out.println("0-Salir");
        System.out.print("seleccione una opción: ");
        int opcion = scanner.nextInt();
        cicloFor.imprimirNumeros(opcion);
    }
    
}
