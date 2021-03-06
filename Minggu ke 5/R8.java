//Naufal Jundi Abyan
//19537141019
//Teknologi Informasi (Kelas i1)

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class R8 {

    public static void main(String[] args) {

        // Declare variables
        int int0=0, int1=0;
        double real0=0.0, real1=0.0;
        char char0=' ', char1=' ', char2=' ';
        String string0="", string1="", string2="";
        
        try {

            // Open input stream
            Scanner scan = new Scanner(new File("data.txt"));

            // Read contents
            string0 = scan.nextLine();
            string1 = scan.nextLine();
            string2 = scan.nextLine();
            char0 = scan.next().charAt(0);
            char1 = scan.next().charAt(0);
            char2 = scan.next().charAt(0);
            int0 = scan.nextInt();
            int1 = scan.nextInt();
            real0 = scan.nextDouble();
            real1 = scan.nextDouble();

            // Close input stream
            scan.close();

        } catch (IOException e) {
            System.out.println("Cannot read file: data.txt");
            System.exit(0);
        }
        
        // PUT CODE HERE!
        System.out.println((int0 * 17) + (int1 * 7)); 
        System.out.println((real0 - real1)/4.321);
        System.out.printf("%.6f %n", (Math.pow(real1 , 5)));
        System.out.println(string0.charAt(3) + "," + string1.charAt(2) + "," + string2.charAt(string2.length() -1));
        char character = string1.charAt(0);
        int ascii = (int) character;
        System.out.println(string1.length() + string1.charAt(0));
        System.out.println(char0 + char1 + char2);
        System.out.println(string2.equals("Hello World!"));
        if (string1.charAt(0) >= 'A'&& string1.charAt(0) <='Z') {
            System.out.println("Starts with uppercase letter.");
        }
        else if (string1.charAt(0) >= 'A'&& string1.charAt(0) <='Z') {
            System.out.println("Starts with uppercase letter.");
        }
        else
            System.out.println("Does not start with a letter.");
      //  charsatu = char.getNumericValue(char1);
        switch (char1) {
            case '$': case '@' : case  '#' : System.out.println("Special Character."); break;
            case '2': case '4' : case  '6' : case '8' : System.out.println("Even Digit"); break;
            case '1': case '3' : case  '5' : case '9' : System.out.println("Odd Digit"); break;
            case 'a': case 'i' : case  'u' : case 'e' : case  'o' : System.out.println("Special Character."); break;
            default : System.out.println("Unknown character");
}
}
}

//Output
/*
4425
3.4427215922240224
2.861382
a,#,!
43
178
true
Does not start with a letter.
Unknown character
*/