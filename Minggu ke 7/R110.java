// Naufal Jundi Abyan
// 19537141019
// teknologi Informasi I.1
// R11


import java.util.Arrays;

public class R110 {
    public static void main(String[] args) {
        double[] grades = {81.2 , 92.5 , 48.9 , 78.8 , 45.5};
        int[] numbers = {12 , 42 , 33 , 67 , 92 , 58 , 33};
        String[] arguments = new String[9];
        System.out.println(grades.length);
        System.out.println(numbers.length);
        System.out.println(arguments.length);
        System.out.println(grades[0]);
        System.out.println(grades[2]);
        System.out.println(numbers[numbers.length - 1]);

        for (int i = 1;i < grades.length;i++)
            grades[i] = 90.5;
            numbers[2] = 99;
        for (int i = 0;i < 6;i++)
            arguments[i] = "Java";
        for (int i = 6;i < arguments.length;i++)
            arguments[i] = "C++";

        for (int i = 0;i < grades.length - 1;i++)
            System.out.print(grades[i] + ", ");
            System.out.println(grades[grades.length -1]);
        for (int i = 0;i < numbers.length;i++)
            System.out.print(numbers[i] + " ");
            System.out.println(" ");
        for (int i = 0;i < arguments.length - 1;i++)
            System.out.print(arguments[i] + "_");
        System.out.println(arguments[arguments.length - 1]);

        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(arguments));
    
        System.out.printf("%.3f" , arrayAverage(grades));
    }
        public static double arrayAverage(double[] array) {
            double result = 0;
        for (int i = 0;i < array.length;i++)
            result += array[i];
        double average = result / array.length;
        return average;        
        }}

/*
5
7
9
81.2
48.9
33
81.2, 90.5, 90.5, 90.5, 90.5
12 42 99 67 92 58 33
Java_Java_Java_Java_Java_Java_C++_C++_C++
[81.2, 90.5, 90.5, 90.5, 90.5]
[12, 42, 99, 67, 92, 58, 33]
[Java, Java, Java, Java, Java, Java, C++, C++, C++]
88.640
/*