/*
Nama	: Naufal Jundi Abyan
NIM 	: 19537141019
Kelas	: I.1
*/

//no 1
double d = 3.0/11
System.out.println("%.3f\n", d);

//no 2
Scanner keys = new Scanner(System.in);

//no 3
System.out.println("Enter num1: ");
int num1 = keys.nextInt();

//no 4
System.out.println("Enter num2: ")
double num2 = keys.nextDouble();

//no 5
System.out.print(num1 + "" + num2);

//no 6
System.out.println("Enter String word");
String word = keys.next();

//no 7
System.out.println(word.substring(1, 4));

//no 8
System.out.print("Enter String line; ");
String line = keys.nextLine();

//no 9
keys.close();

//no 10
System.out.println(s.substring(0, 11));
//Error in this line because s.length() = 10, 0-9

//no 11
int year = 2000;
if (year == 1970)
System.out.println("history is cool");
else if (year == 1980)
System.out.println("Era of Hippies");
else if (year == 1990)
System.out.println("Cassette Tapes!");
else if (year == 2000)
System.out.println("IPhone's begin their take over...");
else if (year == 2010)
System.out.println("US wished Queen Elizabeth II happy birthday on the wrong day,
good start to the decade...");
else
System.out.println("Huh, I’m not sure what to say");

//no 12
switch(year) {
    case 1970 : System.out.println("history is cool"); break;
    case 1980 : System.out.println("Era of Hippies"); break;
    case 1990 : System.out.println("Cassette Tapes!"); break;
    case 2000 : System.out.println("IPhone's begin their take over..."); break;
    case 2010 : System.out.println("US wished Queen Elizabeth II happy birthday on the
    wrong day, good start to the decade..."); break;
    default : System.out.println("Huh, I’m not sure what to say");
    }

//no 13
String s1 = "Roses are red, violets are blue,...";
a. Roses are red, violets are blue,...
b. ar

//no 14
for (int i = 3; i <= 8;i++) {
    a. System.out.print(i + ", ");
    }
    System.out.println(" ");

//no 15
int i = 3;
while (i <= 8) {
a. System.out.print(i + ", ");
b. i++;
}
System.out.println(" ");

//no 16
i = 3;
do {
a. System.out.print(i + ", ");
b. i++;
} while (i <= 8);
System.out.println(" ");

//no 17
for (int j = 3; j <= 50; j += 3) {
    a. System.out.print(j + ";");
    }
    System.out.println(" ");

//no 18
for (int j = 0; j < s.length();j++) {
    a. System.out.println(s.charAt(j));
    }

//no 19
for (int j = s.length() - 1; j >= 0;j--) {
    System.out.print(s.charAt(j));
    }
    System.out.println(" ");