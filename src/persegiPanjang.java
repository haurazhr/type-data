
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UseR
 */
public class persegiPanjang {
    public static void main(String[] args) {
        double panjang, lebar, luas ;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("masukkan panjang =");
        panjang = reader.nextDouble();
        System.out.print("masukkan lebar =");
         lebar = reader.nextDouble();
         luas = panjang * lebar;
          System.out.println("luas = "+luas);
    }
    
}
