import java.util.List;
import java.util.ArrayList;

public class ExercicioEmSala5 {
    public static void main(String[] args) {

        List<Integer> meuArray = new ArrayList();

        Integer numA = 12;
        meuArray.add(12);

        Integer numB = 2;
        meuArray.add(2);

        Integer numC = 1;
        meuArray.add(1);

        Integer numD = 5;
        meuArray.add(5);

        Integer numE = 22;
        meuArray.add(22);

        int somaPar = 0;

        for (int i = 0; i < meuArray.size(); i++){

            if (meuArray.get(i) % 2 == 0) {
                somaPar = somaPar + meuArray.get(i);
            }
        }

        System.out.println(somaPar);
    }
}