import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.10;
            double valorComDesconto = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado. Novo valor: R$" + valorComDesconto);
        } else {
            System.out.println("Desconto não aplicado. Valor total: R$" + valorCompra);
        }
        scanner.close();
    }
}
