import java.util.Scanner;
public class P3 {
    public static String evaluate(String expression) {

        // Print expression
        System.out.println(expression);

        // Declare variables for operands, operator, result, and return value
        // op1 = operands1
        // op2 = operands2
        String returnString = "";
        double op1 =0, op2=0, result=0;
        String operator ="";
        

        // Create Scanner object to parse expression
        Scanner input = new Scanner (expression);

        // Use Scanner to read operands and operator
        if (input.hasNext()){
            op1 = input.nextDouble();}
        if (input.hasNext()){
            operator = input.next();}
        if (input.hasNext()){
            op2 = input.nextDouble();}
        if (input.hasNext()){
            result = input.nextDouble();}

        input.close();


        // Compute a numerical result for the expression
        // inget kalau pangkat "^" pakainya Math.pow

        switch (operator) {
            case "+" : result = op1 + op2; break;
            case "*" : result = op1 * op2; break;
            case "/" : result = op1 / op2; break;
            case "^" : result = Math.pow(op1,op2); break;
            case "-" : result = op1 - op2; break;
            case "%" : result = op1 % op2; break;
            default:
                System.out.println("done");

        }

        // Convert numerical result to string
        returnString = Double.toString(result);


        // Return result
        return returnString;
    }
}