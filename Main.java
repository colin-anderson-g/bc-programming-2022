import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        ArraySort arraySortObj = new ArraySort();


        System.out.println("----- Original list of numbers -----");
        System.out.println(Arrays.toString(arraySortObj.getNumbers()));


        System.out.println("----- Increasing list of numbers -----");
        System.out.println(Arrays.toString(arraySortObj.sortNumbersUp(arraySortObj.getNumbers())));


        System.out.println("----- Decreasing list of numbers -----");
        //TODO: Print number sorted down

    }


}
