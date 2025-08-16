package EJERCICIOS;

public class CicloFor {

    char a = '*',  b = ' ';

    
    public void imprimirNumeros(int opcion) {
        switch (opcion) {
            case 1:
                for (int j = 0; j < 5; j++) {
                    for (int i = 0; i <= 5; i++) {
                        System.out.print("" + a + b);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int j = 1; j <= 5; j++){
                    if (j % 2 != 0) {
                        for (int i = 0; i <= 5; i++) {
                            System.out.print("" + a + b);  
                        }
                    } else {
                        for (int i = 0; i <= 5; i++) {
                            System.out.print("" + b + a);
                        }
                    }
                    System.out.println();        
                }
                break;
            case 3:
                for (int j = 1; j <= 5; j++) {
                    for (int i = 0; i < j; i++) {
                        System.out.print(a);
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int j = 1; j <= 5; j++) {
                    for (int i = 0; i < j; i++) {
                        System.out.print(a);
                    }
                    System.out.println();
                }
                for (int j = 4; j >= 1; j--) {
                    for (int i = 0; i < j; i++) {
                        System.out.print(a);
                    }
                    System.out.println();
                }
                break;
        }
        
    }
}