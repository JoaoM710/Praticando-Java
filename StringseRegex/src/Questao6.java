import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();

        String valorFormatado = String.format("R$ %.2F", valor);
        System.out.println("Valor formatado: " + valorFormatado);
        scanner.close();
    }
}
