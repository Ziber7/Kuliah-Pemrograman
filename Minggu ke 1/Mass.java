//NAMA            : Naufal Jundi Abyan
//NIM             : 19537141019
//SOAL            : Pre-Test MK Praktik Struktur Data Semester Gasal 2020/2021
//JUDUL PROGRAM   : Mencari Nilai Tertinggi dan Terendah pada Array.
import java.util.Arrays;
import java.util.Scanner;

public class NilaiMinMax {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
 

        System.out.println("Main Menu");
        System.out.println("1.Input");
        System.out.println("2.Lihat Nilai");
        System.out.println("3.Cari Nilai Max");
        System.out.println("4.Cari Nilai Min");
        System.out.println("5.Keluar Program");

        System.out.println("Pilih Menu ");

        final int menu = s.nextInt();
        switch (menu) {
            case 1 : case1();
                break;
            case 2 : case2();
                break;
            case 3 : case3();
                break;
            case 4 : case4();
                break;
            case 5 : case5();
                break;
        }
    }

    private static void case1() {
        float[] arr = new float[20];
        int index = 0;
        index++;
        final Scanner s = new Scanner(System.in);
        System.out.println("Silahkan Input Nilai");
        arr[index] = s.nextFloat();
        String nilai = Arrays.toString(arr);
        return nilai;
        main(null);
 
    }
    private static void case2() {
        System.out.println("Nilai yg telah diinput");

        System.out.println(nilai);
        main(null);
    }
    public static void case3() {
        System.out.println("Nilai maksimum adalah" + max);

        float max = Arrays.stream(arr).max().getAsFloat();

        main(null);
    }
    public static void case4() {
        System.out.println("Nilai maksimum adalah" + min);

        float min = Arrays.stream(arr).min().getAsFloat();
        main(null);
        
    }
    public static void case5() {
        System.out.println("Keluar program");
        System.exit(0);
    }

}