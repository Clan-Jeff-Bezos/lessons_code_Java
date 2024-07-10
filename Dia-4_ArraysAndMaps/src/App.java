import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Arreglos enteros
        int[] name = new int[2]; // 0 1 .. >2 esta por fuera
        // name[2] = 1; // Cuidado que es un error de ejecución

        String[] personas = {"ana","andres","narciris"};

        System.out.println(personas.length); // saber el tamaño del array

        // Pidele al usuario 3 numeros
        int[] numeros = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 números");

        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();

        System.out.println(numeros); // metodo que se llama .toString()

        for (int i = 0; i < 3;i++){
            System.out.println("numero "+ (i+1)+ " " + numeros[i]);
        }

        int cont = 0;
        for(int num: numeros){
            cont++;
            System.out.println("numero "+ cont +""+ num);
        } 

        // type[] name = {values}

        // Matrices
        int[][] matrix = new int[2][3];

        // fila 1
        matrix[0][0] = 3; // columna 1
        matrix[0][1] = 3; // columna 2
        matrix[0][2] = 3; // columna 3
        
        // fila 2
        matrix[1][0] = 3; // columna 1
        matrix[1][1] = 3; // columna 2
        matrix[1][2] = 3; // columna 3


        for (int fila = 0; fila < 2; fila++){
            System.out.println("Fila "+ fila);

            for( int col = 0; col < 3; col++){
                System.out.println("columna "+ col);
            }
        }

        for (int[] fila: matrix){
            for(int col: fila){
                
            }
        }
    }
}
