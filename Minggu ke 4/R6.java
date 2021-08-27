//Naufal Jundi Abyan
//19537141019
//Teknologi Informasi (Kelas i1)

import java.util.Scanner;
    public class R6{
        public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        
        //Print Expression
        String myString0 = "Java";
        String myString1 = "Programming";
        String myString2 = "Language";

        //Declare Variable for operands, operator, result, and return value
        System.out.println(myString0 + " is a " + myString1 + "" + myString2 + ".");
        System.out.println("The lenght of the myString1 is: " + myString1.length());
        System.out.println("The lenght of the myString2 is: " + myString2.length());
        System.out.println(myString0.charAt(0) + "" +  myString1.charAt(0) + "" + myString2.charAt(3));
        System.out.println(myString0.indexOf('a'));
        System.out.println(myString2.toUpperCase());
        System.out.println(myString1.substring(3));
        String myString3 = new String("Whatever!");
        String myString4 = new String("Whatever!");
        System.out.println(myString3 == myString4);
        System.out.println(myString3.equals(myString4));

        char c0 = '^' , c1 = 'G' , c2 = '7';
        System.out.println(c0 + ";" +  c1 + ";" + c2);
        int i0 = c0, i1 = c1 , i2 = c2;
        System.out.println(i0 + "," + i1 + "," + i2);

        keyboard.close();
    }}

/*
Java is a ProgrammingLanguage.
The lenght of the myString1 is: 11
The lenght of the myString2 is: 8
JPg
1
LANGUAGE
gramming
false
true
^;G;7
94,71,55
*/