import java.util.ArrayList;
import java.util.List;

public class ExercicioEmSala6 {
    public static void main(String[] args) {

        List<Integer> novoArray = new ArrayList();

        Integer numA = 12;
        novoArray.add(12);

        Integer numB = 2;
        novoArray.add(2);

        Integer numC = 1;
        novoArray.add(1);

        Integer numD = 5;
        novoArray.add(5);

        Integer numE = 22;
        novoArray.add(22);

        List<Integer> numerosPares = new ArrayList();

        for(int i = 0; i < novoArray.size(); i++){

            if(novoArray.get(i)% 2 == 0){


                numerosPares.add(novoArray.get(i));
            }
        }

        for(int k = 0; k <numerosPares.size(); k++){

            System.out.println(numerosPares.get(k));
        }
    }
}
