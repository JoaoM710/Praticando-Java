import java.util.List;
import java.util.stream.Collectors;

public class Questao8 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream().toList()
                .stream().map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrados dos números: " + quadrados);
    }
}
