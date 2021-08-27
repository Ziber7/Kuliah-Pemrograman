/*
Nama	: Naufal Jundi Abyan
NIM 	: 19537141019
Kelas	: I.1
*/

import java.util.Scanner;
public class sessionpdf {

    public static void main (String [] args){
     System.out.println("============practice1=============");
     main0();
     System.out.println("============practice2=============");
     main1();
     System.out.println("============practice3=============");
     main2();
     System.out.println("============practice4=============");
     main3();
     System.out.println("============practice5=============");
     main4();
     System.out.println("============practice6=============");
     main5();
     System.out.println("============practice7=============");
     main6();
     System.out.println("============practice8=============");
     main7();
    }
    public static void main0 (){
    float f = 9F;
    int i = 9;
    double pi = 3.14;
    i = (int) pi;
    pi = (double) i;
    System.out.println("i: " + i);
    System.out.println("pi: " + pi);
    }

    public static void main1 (){
    int i0 = 1;
    int i1 = 3;
    System.out.println("i0/i1: " + i0/i1);
    double result0 = i0/i1;
    System.out.println("double i0/i1: " + result0);

    double d0 = 1.0;
    double d1 = 3.0;
    System.out.println("d0/d1: " + d0/d1);
    int result1 = (int) (d0/d1);
    System.out.println("int d0/d1: " + result1);
    }

    public static void main2 (){
    int i = 3;
    if (i++ == 3)
        System.out.println("i : " + i);
    if (++i == 5)
        System.out.println("i : " + i);
    System.out.println(i % 3);

    // using print
    String name = "Naufal";
    String age = "19";
    String date = "19 desember";

    String assignment = "gak tau";
    String gpa = "what the";
    String first = "pertama";
    
    System.out.print(name + "\n");
    System.out.print(assignment + "\n");
    System.out.print(date + "\n");
    // OR
    System.out.println("Age: " + age + ", Name: " + first + ", GPA; " + gpa);

    // using println
    System.out.println(name);
    System.out.println(assignment);
    System.out.println(date);
    }


    public static void main3 (){
    Scanner reader = new Scanner (System.in);
    int i;
    double d;
    
    d = reader.nextDouble();

    i = reader.nextInt();
    
    reader.close();
    }

    public static void main4 (){
    // the parenthesis are optional
    int i2 = 1;
    int i1 = 1;
    boolean b;
    b = (i1 == i2);
    int i = 2;
    if ( i >= 0 && i <= 100)
        System.out.println("between 0 and 100");

    char a = 'c';
    char c = 'a';
    if (c == 'a' || c == 'c')  
        System.out.println("char is a or c");
    
    }

    public static void main5 (){
     int i = 1;
    switch (i) {
        case 0: System.out.println("zero"); break;
        case 1: System.out.println("one"); break;
        case 2: System.out.println("two"); break;
        default: System.out.println("less than zero or greater than two");
    }

        }

    public static void main6 (){
    double d = 3.2;
    if (d < 3.5)
         System.out.println("less than 3.5");
    else if (d < 3.3)
         System.out.println("less than 3.3");
    else if (d <= 3)
         System.out.println("less than or greater than 3");
    else
         System.out.println("greater than or equal to 3.5");
    }

    public static void main7 (){
    double d = 3.2;
    if (d < 3.5)
         System.out.println("less than 3.5");
    if (d < 3.3)
         System.out.println("less than 3.3");
    if (d <= 3)
         System.out.println("less than or greater than 3");
    else
         System.out.println("greater than or equal to 3.5");
    }
        
    }

/*
============practice1=============
i: 3
pi: 3.0
============practice2=============
i0/i1: 0
double i0/i1: 0.0
d0/d1: 0.3333333333333333
int d0/d1: 0
============practice3=============
i : 4
i : 5
2
Naufal
gak tau
19 desember
Age: 19, Name: pertama, GPA; what the
Naufal
gak tau
19 desember
============practice4=============
1
1
============practice5=============
between 0 and 100
char is a or c
============practice6=============
one
============practice7=============
less than 3.5
============practice8=============
less than 3.5
less than 3.3
greater than or equal to 3.5
*/























    
