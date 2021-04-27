/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
        
        // TODO code application logic here
             String name="Mohammed";
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        name=in.nextLine();
        System.out.println("Hi "+name+"! Nice to meet you!");
        System.out.println("How old are you?");
        int fav = in.nextInt();
        System.out.println("You are "+fav+" years old?");
        System.out.println("You look much younger!");
        String colour=in.nextLine();
System.out.println("Ok, goodbye!");
         
        
        in.close()
    }
    
    }
    
        
        
        
    }
    
}
