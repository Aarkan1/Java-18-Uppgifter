public class Main {

    public static void main(String[] args) {
    
        long tal = 600851475143L;
        long recurv = factorial(tal, 2);
        
        for (int i = 2; i < tal; i++) {
            while (tal % i == 0) {
                tal = tal / i;
            }
        }
        System.out.println(tal);
        System.out.println(recurv);
    }
    
    public static long factorial(long tal, int i) {

        if (i < tal) {
            if (tal % i == 0) {
                tal = tal / i;
            }
        }
        if (tal == i){
            return tal;   
        }
        return factorial(tal, i = i + 1 );
    }
}
