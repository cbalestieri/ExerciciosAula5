import java.util.ArrayList;
import java.util.List;

public class ExercicioEmSala4 {

    public static void main(String[] args) {
        List<Integer> listanumeros = new ArrayList();
        listanumeros.add(10);
        listanumeros.add(8);
        listanumeros.add(2);

        int soma = 0;

        for (int i = 0; i <listanumeros.size(); i++) {
            soma+= listanumeros.get(i);

            System.out.println(soma);
        }
    }
}