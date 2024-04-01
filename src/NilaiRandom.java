
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UseR
 */
public class NilaiRandom {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arisan keluar hari ini "+Math.random());
        double x = 10.73;
        int y =(int)x;
        System.out.println("nilai y"+y);
        double luasLingkaran, r;
        Scanner read = new Scanner(System.in);
        System.out.println("masukkan jari jari =");
        r = read.nextDouble();
        luasLingkaran = Math.PI*r*r;
        System.out.println("luas lingkaran adalah"+luasLingkaran);
        double answer = Math.sqrt(625);
        System.out.println("Akar 625 = "+ answer);
    }
    
}
