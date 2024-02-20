import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a primeira nota ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("digite o peso da primeira nota");
        double peso1 = scanner.nextDouble();

        System.out.println("digite a segunda nota ");
        double nota2 = scanner.nextDouble();
      
        System.out.println("digite o peso da segunda nota");
        double peso2 = scanner.nextDouble();

        System.out.println("digite a terceira nota");
        double nota3 = scanner.nextDouble();
      
        System.out.println("digite o peso da terceira nota");
        double peso3 = scanner.nextDouble();

        double pesos = peso1+peso2+peso3;
        double mediaPonderada = (nota1*peso1+nota2*peso2+nota3*peso3) / pesos;
        System.out.println("a média ponderada das notas é " + mediaPonderada);

        scanner.close();
    }
}
