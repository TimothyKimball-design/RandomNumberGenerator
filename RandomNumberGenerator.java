/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timothykimball4;

import java.util.Scanner;

/**
 *
 * @author Eon
 */
public class RandomNumberGenerator {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int random_numb = 1;
    int guessed_num = 0;
    int counter = 0;
    
    while(!(random_numb==guessed_num)){
        
        random_numb = (int)(Math.random()*101);
        guessed_num = input.nextInt();
        
        counter += 1;
    }
    
    System.out.println("Number of guesses is " + counter);
    }
}
