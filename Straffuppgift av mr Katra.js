public class Main {

    public static void main(String[] args) {
    
        long tal = 600851475143L;

        //long tal = 13195L;

        for (int i = 2; i < tal; i++) {
            while (tal % i == 0) {
                tal = tal / i;
            }
        }

        System.out.println(tal);

        System.out.println(factorial(tal, 2));

    }


    public static long factorial(long tal, int i) {

        if (i < tal) {
            if (tal % i == 0) {
                tal = tal / i;
            }
            factorial(tal, i = i + 1 );
        }

      return tal;

    }
}
