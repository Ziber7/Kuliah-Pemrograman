// Naufal Jundi Abyan
// Teknologi Informasi I.1
// 19537141015
// Tugas Individu

import java.util.scanner;
import java.util.scanner;
public class  tugas_Individu {
    //Soal 7.3
    /*
    Write a program that reads the integers between 1
    and 100 and counts the occurrences of each. Assume the input ends with 0.
    Note that if a number occurs more than one time, the plural word "times"
    is used in the output.
    */
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int[] values = new int[100];
        System.out.printf("Enter the Integers between 1 and 100: ");
        do {
            input = in.nextInt();
            values[count] = input;
            count += 1;

        } while (input != 0);

        countOccurence(values);
    }

    public static void countOccurence(final int[] list) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");

        }
    }
    // Soal 7.8
    /*
     * Write two overload methods that return the average of an array with the
     * following headers: public static int average(int[] array) public static
     * double average(double[] array) Write a test program that prompts the user to
     * enter ten double values, invokes this method, and displays the average value.
     */

    public static void main2(final String[] args) {
        final java.util.scanner in = new java.util.Scanner(System.in);
        final int[] vals = new double[10];
        System.out.print("Enter to double values: ");

        for (int i = 0; i < 10; i++)
            vals[i] = in.nextDouble();
        System.out.printf("Average is: %.2f", average(vals));

    }

    public static int average(final int[] array) {
        int sum = 0;
        for (final int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average2(final int[] array) {
        double sum = 0.0;
        for (final double val : array)
            sum += val;
        return sum / array.length;
    }

    // Soal 7.15
    /*
     * (Eliminate duplicates) Write a method that returns a new array by eliminating
     * * the duplicate values in the array using the following method header: *
     * public static int[] eliminateDuplicates(int[] list) * Write a test program
     * that reads in ten integers, invokes the method, and * displays the result.
     */
    public static void main3(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final int[] numbers = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        final int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are:");
        for (final int e : distinctNumbers) {
            if (e > 0)
                System.out.print(" " + e);
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(final int[] list) {
        final int[] distinctList = new int[list.length];
        int i = 0; // index distinctList
        for (final int e : list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }

    /** linearSearch */
    public static int linearSearch(final int[] array, final int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    /*
     * Soal 7.19 (Sorted?) Write the following method that returns true if the list
     * is already sorted in increasing order. public static boolean isSorted(int[]
     * list) Write a test program that prompts the user to enter a list and displays
     * whether the list is sorted or not. Here is a sample run. Note that the first
     * number in the input indicates the number of the elements in the list. This
     * number is not part of the list. *
     */
    import java.util.Scanner;
    import 

    public static void main4(final String[] args) {
		final Scanner input = new Scanner(System.in);

		
		System.out.print("Enter list: ");
		final int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		
		System.out.println(
			"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

    public static boolean isSorted(final int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}

    /*
     * Soal 7.34 (Sort characters in a string) Write a method that returns a sorted
     * string using the following header: public static String sort(String s) For
     * example, sort("acb") returns abc. Write a test program that prompts the user
     * to enter a string and displays the sorted string
     */

    /** Main method */
	public static void main5(final String[] args) {
		final Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a string: ");
		final String string = input.nextLine();

		
		System.out.println(sort(string));
	}

    public static char[] sort(final String s) {
		final char[] str = new char[s.length()]; 

		
		for (int i = 0; i < str.length; i++)
			str[i] = s.charAt(i); 

	
		for (int i = 0; i < str.length - 1; i++) {
			char min = str[i];
			int minIndex = i;

			for (int j = i + 1; j < str.length; j++) {
				if (min > str[j]) {
					min = str[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				str[minIndex] = str[i];
				str[i] =  min;
			}
		}
		return str;
	}
}
 