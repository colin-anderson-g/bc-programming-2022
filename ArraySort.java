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
    private int[] numbers = {4, 0, 10, 7, 999, 2, 2, 2, 34, 43, 40, 9};

    //0
    //4
    //7
    //10
    //2
    //2
    //2
    //34
    //43
    //40
    //9
    //999

    /**
     * Method for number sorting, lowest to highest
     * @param numbers
     * @return
     */
    public int[] sortNumbersUp(int[] numbers) {

        int tmp = 0;
        int index = 0;
        boolean flipped = false;

        while(index < numbers.length - 1) {
            while(index < numbers.length - 1) {
                if(numbers[index] > numbers[index+1]) {
                    tmp = numbers[index];
                    numbers[index] = numbers[index+1];
                    numbers[index+1] = tmp;
                    flipped = true;
                }
                index++;
            }

            if(flipped == false) {
                break;
            }

            index = 0;
            flipped = false;
        }

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
