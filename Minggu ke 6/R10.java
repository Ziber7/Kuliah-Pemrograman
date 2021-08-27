// Naufal Jundi Abyan
// 19537141013
// Teknologi Informasi(I.1)
// R10

import java.util.Scanner;
public class R10 {    

    public static double CircleArea(double radius) {
        double CircleArea = 22.0/7.0 * radius * radius;
        return CircleArea;
    }
    public static double CircleAreadua(double radius) {
        radius = 2.0;
        double CircleAreadua = 22.0/7.0 * radius * radius;
        return CircleAreadua;
    }
    public static double sphereVolume(double radius) {
        double sphereVolume = (4.0/3.0) * (22.0/7.0) * radius * radius* radius;
        return sphereVolume;
    }
    public static int Round(double value) {
        double Round = Math.floor(value + 0.5);
        return (int)Round;
    }
    static void convertOpposite(StringBuffer str) 
    { 
       int ln = str.length(); 
       // Conversion using predefined methods 
       for (int i=0; i<ln; i++) 
       { 
           Character kata2 = str.charAt(i); 
           if (Character.isLowerCase(kata2)) 
               str.replace(i, i+1, Character.toUpperCase(kata2)+""); 
           else
               str.replace(i, i+1, Character.toLowerCase(kata2)+""); 
       }
    } 

    public static void main(String[] args) {
    System.out.println(CircleArea(12.0));
    System.out.println(CircleAreadua(2.0));
    System.out.println(sphereVolume(2.0));
    System.out.println(Round(1.0));
    StringBuffer str = new StringBuffer("NauFal"); 
    convertOpposite(str);
    System.out.println(str);
    }
}


/*
452.57142857142856
12.571428571428571
33.52380952380952
1
nAUfAL
*/