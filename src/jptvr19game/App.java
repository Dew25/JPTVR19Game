/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        System.out.println("Привет.");
        System.out.println("Программа задумала число, угадай:");
        int myNumber = 2;
        Scanner scanner = new Scanner(System.in);
        int gamerNumber = scanner.nextInt();
        if(myNumber == gamerNumber){
            System.out.println("Ты выиграл!");
        }else{
            System.out.println("Ты проиграл! Было задумано: " + myNumber);
        }
    }
}
