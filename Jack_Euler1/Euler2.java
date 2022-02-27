public class Euler2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int tmp = 0;
        int module = 2;
        int sum = module;

        while (tmp < 4_000_000) {
            tmp = a + b;
            if(tmp % module == 0 && tmp < 4_000_000){
                sum += tmp;
            }
            a = b;
            b = tmp;
        }

        System.out.println(sum);



    }



    
}
