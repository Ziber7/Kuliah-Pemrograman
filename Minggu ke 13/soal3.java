//Naufal Jundi Abyan
//19537141019
//Teknologi Informasi (Kelas i1)


import java.util.Scanner;
    public class soal3 {
        public static void main(String[] args){

            Scanner input = new Scanner (System.in);

            System.out.println("Masukkan Angka Integer (ends kalo 0) : ");
    
            String s = input.nextLine();
            String s1 = s;
    
            Scanner BanyakInt = new Scanner(s);
            int ArrayLength = 0;
            while (BanyakInt.hasNextInt()){
                if (BanyakInt.nextInt() == 0)
                    break;
                ArrayLength++;
            }
    
            int[] array = new int[ArrayLength];
    
            int i = 0;
            Scanner scanInt = new Scanner(s1);
            while (scanInt.hasNextInt()){
                int int1 = scanInt.nextInt();
                if (int1 == 0) {
                    break;
                }
                else {
                    array[i] = int1;
                    i++;
                }
            }
    
            System.out.println("Angka Hasil Input dalam Inch : ");
            for (int a : array) {
                System.out.printf("%.2f ", a * 39.37);
           }
        }
    }    

    
    
