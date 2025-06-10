import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
        scanner.close();
    }
}
