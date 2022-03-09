package Trip_Project_Euler;

public class Multiples{

    public static void main(String[] args){

        //What number it goes till.
        int Loop = 1000;

        int Sum = 0;

        //Creates A integer for the Loop
        int A = 0;

        //Creates a Loop
        while (A < Loop){

            if (A % 3 == 0 && A % 5 == 0){
                    Sum += A;
                //if false continue.

            } else if (A % 3 == 0) {
                    Sum += A;
                //System.out.println(A);

            } else if (A % 5 == 0) {
                    Sum += A;
                //System.out.println(A);

            }
            //Add 1 to A
            A++;
        }

        System.out.println(Sum);

    }
}

