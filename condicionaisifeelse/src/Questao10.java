import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoCorreto = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.println("Digite o código de acesso: ");
        int codigoDigitado = scanner.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        boolean codigoValido = codigoDigitado == codigoCorreto;
        boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

        if (codigoValido && permissaoValida) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acesso incorreto.");
            }
            if (!permissaoValida) {
                System.out.println("- Nível de permissão inválido.");
            }
        }
        scanner.close();
    }
}
