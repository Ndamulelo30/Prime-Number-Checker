/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumberchecker;

/**
 *
 * @author Sanele
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number if its prime: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPrime(number)){
        System.out.println(number + " is a prime number.");
      } else {
        System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime (int number){
        if (number <=1){
            return false;
        }
        if (number <=3){
            return true;
        }
        return true;
    }
}
