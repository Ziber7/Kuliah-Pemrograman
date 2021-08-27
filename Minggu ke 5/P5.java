// Naufal Jundi Abyan
// 19537141013
// Teknologi Informasi(I.1)
// P5

import java.util.Scanner;
public class P5 {

    // Method to check whether an integer is prime.
    public static boolean isPrime(int number) {

        // DO NOT CHANGE THIS CODE!
        for(int i=2;i<=number/2;i++)
            if(number%i==0)
                return false;
        return true;
    }

    // Method to print primes in a specified range
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " , ");
            }  
        } 
        System.out.println("");
    }

    //Method to remove vowels from a string
    public static String removeVowels(String input) {
        String huruf = "";
        String words = input;
        for (int i = 0; i < words.length(); i++) {
            switch (words.charAt(i)) {
                case 'A' : case 'I' : case 'U' : case 'E' : case 'O' : break;
                case 'a' : case 'i' : case 'u' : case 'e' : case 'o' :break;
                default : huruf = huruf + input.charAt(i);
            }
        }
        return huruf;
    }

    // Method to generate and print the value of a number raised to an exponent
    public static double evaluateExponent(double number, int exponent) {
        double result = 1;
        int loop = 1;
        do {
            result = result * number;
            loop++;
        }while (loop <= exponent);
        return result;
    }

    // Method to find and print the minimum/maximum/mean of a set of positive numbers
    public static void computeStatistics(int sentinel) {
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        int count = 0;
        double mean = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (1 != 2){
            value = keyboard.nextInt();
            if (value == -1)
                break;
            if (value < min)
                min = value;
            else if (value > max)
                max = value;
            mean = value + mean;
            count++;
        }
        
        System.out.println("Count : " + count);
        System.out.println("Average : " + (mean / count));
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

    public static void main(String[] asgr) {
        
        Scanner no = new Scanner(System.in);
        System.out.print("Enter first range  : ");
        int start = no.nextInt();
        System.out.print("enter last range  : ");
        int end = no.nextInt();
        printPrimes(start, end);
        Scanner word = new Scanner(System.in);
        System.out.print("enter Words : ");
        String input = word.nextLine();
        System.out.println(removeVowels(input));
        double hasil = evaluateExponent(2.0, 16);
        System.out.println("2.0 to the 16 = " + hasil);
        computeStatistics(-1);
        System.out.print(0.1 + 0.2 +- 0.3);
    }
}

/*
Output
Enter first range  : 1
enter last range  : 23
1, 2, 3, 5, 7, 11, 13, 17, 19, 23,
enter Words : saya
sy
2.0 to the 16 = 65536.0
11
11
11
-1
Count : 3
Average : 11.0
Maximum : 11
Minimum : 11
*/