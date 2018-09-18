package com.company;


public class Main {

    static int size = 40;

    static boolean isPrime(int p) {

        for (int i = 3; i * i < p; i+=2) {

            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] johan = johan();

        int[] katra = katra();


        System.out.printf("%n%nJohan:   Katra:%n%n");

        for(int i = 0; i < size;i++){

            System.out.printf("%3d %6d%n",johan[i],katra[i]);

        }
    }

    public static int[] johan() {

        double startTime, endTime, duration;

        startTime = System.nanoTime();

        int[] primeList = new int[size];

        primeList[0] = 2;

        int primeIndex = 1;

        for (int i = 3; primeIndex < size; i+=2) {

            if ((i > 10 && i % 10  == 5) || (i > 10 && i % 3 == 0) || (i % 2 == 0)) {
                continue;
            }
            if (isPrime(i)) {
                primeList[primeIndex] = i;
                primeIndex++;
            }
        }

//        for (var p : primeList) {
//            System.out.println(p);
//        }

        System.out.printf("Johan: %n%d%n",primeList[size - 1]);

        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000000;

        System.out.printf("Runtime: %.2f sec%n%n", duration);

        return primeList;

    }

    public static int[] katra() {
        long testStart = System.nanoTime();

        // How many primes do we want to look for?
//        int numPrime = 10001;

        // Storing primenumbers for testing
        int[] primeNum = new int[size];


        // Start with having first prime stored
        primeNum[0] = 2;

        // Start testing on 3 and increase by 2
        // After 2 (first prime) there are only odd numbers in prime

        for (int num = 3, count = 1; count < size; num += 2) {

            if (num > 10 && (num % 3 == 0 || num % 10 == 5)) {
                /*
                If the number is >10 and can be divided evenly
                with 3 or is ending in 5, the number is
                not a prime, so we skip to next number.
                */
                continue;
            }


            // Inner loop tests if number is prime by doing
            // modulos on previous primes until we reach beyond
            // the square root of num.
            for (int j = 0; j <= count + 1; j++) {
                if (primeNum[j] > Math.sqrt(num)) {
                    // Is a prime
                    primeNum[count] = num;
                    count++;
                    break;
                }

                if (num % primeNum[j] == 0) {
                    // Is not a prime
                    break;
                }

            }

        }

//        for (var p : primeNum) {
//            System.out.println(p);
//        }

        System.out.printf("Katra: %n%d%n",primeNum[size - 1]);
        long testHalt = System.nanoTime();
        System.out.printf("Runtime: %3.2f sec \n",
                ((double) (testHalt - testStart) / 1000000000));

        return primeNum;

    }

}

