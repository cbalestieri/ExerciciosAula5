import java.util.ArrayList;
import java.util.List;

public class ExercicioEmSala5 {
    public static void main(String[] args) {

        List<Integer> meuArray = new ArrayList();
        meuArray.add(12);
        meuArray.add(2);
        meuArray.add(1);
        meuArray.add(5);
        meuArray.add(22);

        int somaPar = 0;
        int cont = 0;

        while (cont < meuArray.size()) {

            if (cont % 2 == 0) {
                somaPar;
            }
            cont++;
        }
        System.out.println(somaPar);
    }
}

//Erro de lógica: o programa retorna quanto números pares existem no Array e não a soma de todos eles.