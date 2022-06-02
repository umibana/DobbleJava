import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cards {
    ArrayList<Object> Elementos;


    ArrayList<Object> generacionMazo(int N) {
        ArrayList<Integer> firstCard = new ArrayList<Integer>();
        int i, j, k;
        for (i = 1; i <= N + 1; i++) {
            firstCard.add(i);
        }
        mazo.add(firstCard);
        for (i = 1; i <= N; i++) {
            ArrayList<Integer> nCards = new ArrayList<Integer>();
            nCards.add(1);
            for (j = 1; j <= N; j++) {
                nCards.add(i * N + (j + 1));
            }
            mazo.add(nCards);
        }
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                ArrayList<Integer> n2Cards = new ArrayList<Integer>();
                n2Cards.add(i + 1);
                for (k = 1; k <= N; k++) {
                    n2Cards.add(N + 2 + N * (k - 1) + (((i - 1) * (k - 1) + j - 1) % N));
                }
                mazo.add(n2Cards);
            }
        }
        return mazo;


