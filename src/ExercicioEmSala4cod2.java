import java.util.ArrayList;
import java.util.List;

public class ExercicioEmSala4cod2 {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList();
        listaNumeros.add(1);
        listaNumeros.add(1);
        listaNumeros.add(1);

        for (int i = 0; i < listaNumeros.size(); i++) {
            listaNumeros.add(i);

            System.out.println(listaNumeros.get(i));
        }
    }
}

