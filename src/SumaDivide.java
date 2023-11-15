import java.util.Scanner;

public class SumaDivide {

public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa un numero para sumar: ");
    double n1 = scanner.nextDouble();
    System.out.println("Ingresa el segundo numero de la suma: ");
    double n2 = scanner.nextDouble();
    System.out.println("Ingresa el numero a dividir: ");
    double d1 = scanner.nextDouble();

    double divsion = (n1+n2)/d1;

    System.out.println("El resultado de la divison es: " + divsion);

    scanner.close();

}

}