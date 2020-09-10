/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        System.out.println("Привет.");
        System.out.println("Поиграем, если ты укажишь диапазон игры.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("min = ");
        int min = scanner.nextInt();
        System.out.print("max = ");
        int max = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Программа задумала число от "
                +min+" до "+max+", угадай:");
        Random random = new Random();
        int attempt = 0;
        do {            
            int myNumber = random.nextInt(max - min + 1)+min;
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                if(attempt > 1){
                    System.out.println("Ты проиграл! Было задумано: " 
                        + myNumber);
                    break;
                }else{
                    System.out.println("Попробуй еще раз: ");
                }
                attempt++;
            }
        } while (true);
    }
}
