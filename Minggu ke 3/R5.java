import java.util.Scanner;
public class R5 {
    public static void main(String[] args){// boolean
        // Bolean Variables
        boolean boolean0 = true;
        boolean boolean1 = false;
        System.out.println("boolean0 is " + boolean0);
        System.out.println("boolean1 is " + boolean1);

        // Camparison Operators
        boolean equals = (11 == 33);
        boolean notequals = (22 != 44);
        boolean greaterthan = (15 > 25);
        boolean lessthan = (-11 < 13);
        System.out.println("(11 == 33) is " + equals);
        System.out.println("(22 != 44) is " + notequals);
        System.out.println("(15 > 25) is " + greaterthan);
        System.out.println("(-11 < 13) is "+ lessthan);

        // Conditional Statements11
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int integer0 = keyboard.nextInt();
        System.out.print("Enter Second integer: ");
        int integer1 = keyboard.nextInt();
        if (integer0 > integer1)
                System.out.println("First integer is larger than the second integer");
        else if (integer0 < integer1) 
                System.out.println("Second integer is larger than the first integer");
        else 
            System.out.println("Both integer are equal");

        // Switch Statements
        System.out.print("Enter a state: ");
        String state = keyboard.next();
        keyboard.close();
        switch (state) {
                case "Alabama": case "Florida" : System.out.println("Southern state"); break;
                case "Colorado": case "Utah" : System.out.println("Westren state"); break;
                case "Michigan": case "Wisconsin" : System.out.println("Northen state"); break;
                case "Delaware": case "Maine" : System.out.println("Eastern state"); break;
                default : System.out.println("Not sure where that is, must be in the Midwest!"); break;
        


    }
        }}


          







  




   
    






