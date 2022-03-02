package Euler_Colin;

public class ArraySort {

    /**
     * Empty array for storing decreasing numbers
     */
    private int[] numbersDown= {};
    /**
     * Empty array for storing increasing numbers
     */
    private int[] numbersUp = {};

    /**
     * Array of twelve unsorted numbers
     */

    private int[] numbers = {4, 0, 10, 7, 999, 2, 2, 2, 34, 43, 40, 9};

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbersDown() {
        return numbersDown;
    }

    public void setNumbersDown(int[] numbersDown) {
        this.numbersDown = numbersDown;
    }

    public int[] getNumbersUp() {
        return numbersUp;
    }

    public void setNumbersUp(int[] numbersUp) {
        this.numbersUp = numbersUp;
    }

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
