package Project_Euler;

 public class Smallest_Multiple {

    public static void main(String[] args) {


        //loop Var
        int A = 0;
        int B = 1;
        //Seeing if its correct.
        int sum = 0;



        //Main loop
        while(sum != 20) {


            B++;
            sum = 0;

            //Individual number loop
            while (A < 20) {
                A++;

                //if number is not correct add one to sum
                if(B % A == 0) {
                    sum++;
                }
                //continues loop

            }
            //Resets loop
            A = 0;
        }
        System.out.println(B);

    }
 }