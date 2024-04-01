
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UseR
 */
public class BacaInput {
    public static void main(String[] args) {
        String name = "";
        boolean gameOver =true;
        int score = 11;
        int highScore=10;
          
        Scanner reader =new Scanner(System.in);
        if(gameOver && score > highScore){
             System.out.print("please input your name = ");
             name=reader.next();
        }
        System.out.println("Thank You "+name+", ");
    }
}
