import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus celsius ");
        double tempC = scanner.nextDouble();
        double tempF = (tempC * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é " + tempF);

        scanner.close();
    }
}
