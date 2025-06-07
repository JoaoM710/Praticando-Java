import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();

        scanner.close();

        if (tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
