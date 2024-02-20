import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é igual a " + soma);
        System.out.println("A subtração de " + numero1 + " - " + numero2 + "é igual a" + subtracao);
        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + "é igual a" + multiplicacao);
        System.out.println("A divisão de " + numero1 + " / " + numero2 + "é igual a" + divisao);

        scanner.close();
    }
}
