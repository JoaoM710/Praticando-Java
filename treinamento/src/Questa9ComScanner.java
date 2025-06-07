import java.util.Scanner;

public class Questa9ComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = Integer.parseInt(scanner.next());

        String mensagem;
        if (idade <= 18){
            mensagem = "Você é menor de idade!";
        } else {
            mensagem = "Você é maior de idade!";
        }

        System.out.println(mensagem);
    }
}
