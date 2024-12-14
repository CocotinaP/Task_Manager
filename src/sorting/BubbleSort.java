package sorting;

/**
 * Bubble sort operation.
 */
public class BubbleSort extends AbstractSorter {

    @Override
    public void sort(Integer[] numbers) {
        boolean ok = false;
        while(!ok){
            ok = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers [i] > numbers [i + 1]) {
                    Integer aux = numbers [i];
                    numbers [i] = numbers [i + 1];
                    numbers [i + 1] = aux;
                    ok = false;
                }
            }
        }
    }
}
