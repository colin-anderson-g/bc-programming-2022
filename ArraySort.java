import lombok.Getter;
import lombok.Setter;

public class ArraySort {


    /**
     * Empty array for storing decreasing numbers
     */
    @Getter @Setter
    private int[] numbersDown= {};

    /**
     * Empty array for storing increasing numbers
     */
    @Getter @Setter
    private int[] numbersUp = {};

    /**
     * Array of twelve unsorted numbers
     */
    @Getter @Setter
    private int[] numbers= {0, 4, 10, 7, 999, 2, 2, 2, 34, 43, 40, 9};



    /**
     * Method for number sorting, lowest to highest
     * @param numbers
     * @return
     */
    public int[] sortNumbersUp(int[] numbers) {

        //TODO: Sort numbers here

        return numbers;
    }


    /**
     * Method for number sorting, highest to lowest
     * @param numbers
     * @return
     */
    public int[] sortNumbersDown(int[] numbers) {

        //TODO: Sort numbers here

        return numbers;
    }

}
