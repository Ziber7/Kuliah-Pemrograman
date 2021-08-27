//Naufal Jundi Abyan
//19537141019
//Teknologi Informasi (Kelas i1)

import java.util.*;
import java.io.*;


    public class soal5 {
        public static void main(String[] args) throws Exception{
        float[] floats = {2.0f, 2.1f , 2.2f , 2.3f , 2.4f , 2.5f, 2.6f , 2.7f , 2.8f , 2.9f ,};
        PrintWriter out = new PrintWriter(new File("Soal6.txt"));
        out.print("Array float = ");
        for (float a : floats) {
            out.printf("%f ", a);
        }
        out.close();

    }} 

