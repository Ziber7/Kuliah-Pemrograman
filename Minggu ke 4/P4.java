//Naufal Jundi Abyan
//19537141019
//Teknologi Informasi (Kelas i1)

import java.util.Scanner;
    public class P4 {
        public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Double salary, interestincome, capitalgains;
        int Exemptions;
        Double totalincome , adjustedincome , statetax , totaltax;


        System.out.print("Salary:");
        salary = keyboard.nextDouble();

        System.out.print("Exemptions:");
        Exemptions = keyboard.nextInt();

        System.out.print("Interest:");
        interestincome = keyboard.nextDouble();

        System.out.print("Gains:");
        capitalgains = keyboard.nextDouble();

        totalincome = (salary + interestincome + capitalgains - 5000);
        System.out.print("Total Income: $" + totalincome);
        

        if (Exemptions > 6) Exemptions = 6;


        System.out.println("");
        adjustedincome = (totalincome - (Exemptions*1500));
        System.out.print("Adjusted Income: $" + adjustedincome);
        totaltax = adjustedincome;
        if (adjustedincome < 20000) {
            totaltax = 0.00;
        }
        else if (20000 <= adjustedincome && adjustedincome < 35000) {
            totaltax = (0.13* 15000);
        } 
        else if (35000 <= adjustedincome && adjustedincome < 50000) {
            totaltax = (0.13 * (35000 - 20000) + (0.23 * (50000-35000)));
        }
        else if (adjustedincome >= 50000) {
            totaltax = (0.13 * (35000 - 20000) + (0.23 * (50000-35000) + (0.28 * (adjustedincome - 50000))));
        }
        System.out.println("");
        System.out.printf("Total tax: $ %.2f %n" , totaltax );
        
        statetax = (adjustedincome * 6.5/100);
        System.out.printf("State tax : $ %.2f %n" , statetax );
        keyboard.close();

//Contoh hasil Output
//Salary:92768.54
//Exemptions:8
//Interest:1234.50
//Gains:4400.99
//Total Income: $93404.03
//Adjusted Income: $84404.03
//Total tax: $ 15033.13
//State tax : $ 5486.26

    }} 