package Trip_Project_Euler;

public class Ten_Thousand_And_One_Prime{

    public static void main(String[] args) {

        int num = 10001;

        int A = 0;
        int B = 0;
        int Sum = 0;
        int C = 1;

        //System.out.println("1");
        while (C <= num){

            Sum = 0;
            A = 0;

            while (B > A){
                A++;

                    if (B % A == 0){
                        Sum++;
                    }
            }

            if (Sum == 2){
                System.out.println(C + ": " + B);
                C++;
            }

            B++;
        }
    }
}
