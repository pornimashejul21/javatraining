// In a new role-playing fantasy game players must design their character by picking a point value 
// for each of three characteristics: 
// • Strength, from 1 to 10
// • Health, from 1 to 10
// • Luck, from 1 to 10
// Write a program that asks for a name for the character and asks for the point value of for each of 
// the three characteristics. However, the total points must be less than 15. If the total exceeds 15, 
// then 5 points are assigned to each characteristic 
// Welcome to Yertle's Quest
// Enter the name of your character:
// Chortle
// Enter strength (1-10):
// 8
// Enter health (1-10):
// 4
// Enter luck (1-10):
// 6
// You have to give your character too many points! Default values have been 
// assigned:
// Chortle, strength: 5, health: 5, luck: 5
// (This user interface could get much more complicated. You might want to implement some of 
// your own ideas.)
// 

import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character : ");
        String name = sc.next();
        System.out.println("Enter strength (1-10): ");
        int strength = sc.nextInt();
        System.out.println("Enter health (1-10): ");
        int health = sc.nextInt();
        System.out.println("Enter luck (1-10): ");
        int luck = sc.nextInt();
        if(strength+health+luck > 15){
            System.out.println("You given too many points to your character! Default values have been assigned: ");
            strength=health=luck = 5;
            System.out.println("Name : "+name + ", Strength :  " + strength + ", Health : "+health + ", Luck : "+ luck);
        }else{
            System.out.println("Your character points are : ");
            System.out.println("Name : "+name + ", Strength :  " + strength + ", Health : "+health + ", Luck : "+ luck);
        }
    }
}