public class main {
    main();
    main1();
    main2();
    main3();
    main4();
    main5();
    main6();
    main7();

    public static void main (String [] args){
    float f = 9F;
    int i = 9;
    double pi = 3.14;
    i = (int) pi;
    pi = (double) i;
    System.out.println("i: " + i);
    System.out.println("pi: " + pi);
    }
    public static void main1 (String [] args){
    int i0 = 1;
    int i1 = 3;
    System.out.println("i0/i1: " + io/i1);
    double result0 = io/i1;
    System.out.println("double i0/i1: " + result0);

    double d0 = 1.0;
    double d1 = 3.0;
    System.out.println("d0/d1: " + d0/d1);
    int result1 = (int) (d0/d1);
    System.out.println("int d0/d1: " + result1);
    }

    public static void main2 (String [] args){
    int i = 3;
    if (i++ == 3)
        System.out.println("i : " + i);
    if (++i == 5)
        System.out.println("i : " + i);
    System.out.println(i % 3);

    // using print
    name = "Naufal";
    age = 19;
    date = "19 desember";

    assignment = "gak tau";
    gpa = "what the";
    first = "pertama";
    


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


    public static void main3 (String [] args){
    Scanner reader = new Scanner (System.in);
    
    d = reader.nextDouble();

    i = reader.nextInt();
    
    reader.close();
    }

    public static void main4 (String [] args){
    // the parenthesis are optional
    b = (i1 == i2);

    if (i >= 0 && i <= 100)
        System.out.println("between 0 and 100");

    char a ;
    char c;
    if (c == 'a' || c == 'c')  
        System.out.println("char is a or c");
    
    }

    public static void main5 (String [] args){
    switch (i) {
        case 0: System.out.println("zero"); break;
        case 1: System.out.println("one"); break;
        case 2: System.out.println("two"); break;
        default: System.out.println("less than zero or greater than two");
    }

        }

    public static void main6 (String [] args){
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

    public static void main7 (String [] args){
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
























    
