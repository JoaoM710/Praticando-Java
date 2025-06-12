import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Questao6 {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtual = LocalDate.of(2025, 3, 15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento ja ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }
    }
}
