import java.util.Scanner;

public class Main {

    String name;
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Primitive data type
        // byte
        byte isByte = 20;
        short isShort = 1000;
        int isInt = 20000;
        long isLong = 35000000;
        float isFloat = 12.3500f;
        double isDouble = 14.45;
        char isChar = ' ';
        boolean isBool = false;


        int sum0 = isByte + isShort + isInt;
        long sum = isByte + isShort + isInt + isLong;

        double sum2 = isFloat*30 + isDouble;

        float sum3 = isInt + isFloat;
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);

        // Tomar todos los numeros hasta encontrar un \n
        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();

        System.out.println("Ingresa un Nombre");
        scanner.nextLine();// Recibira el \n que quedo. value = "" Limpiar buffer
        String textInput = scanner.nextLine();

        System.out.println("Dime tu numero favorito");
        double myNum = scanner.nextDouble();
        isDouble = 50.2;

        scanner.close();

        if (age > 17){
            System.out.println("Eres mayor de edad");
        } else if (age == 12){
            System.out.println("Eres menor de edad");
        } else {

        }


        switch (age) {
            case 12:
                System.out.println("el numero es 12");
                break;
            default:
                System.out.println("");
        }

        switch (textInput) {
            case "Antony":
                System.out.println("el numero es 12");
                break;
            default:
                System.out.println("");
        }


    }
}