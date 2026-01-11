/*
Justin Ho
1-18-2025
Birthday Guessing Game
1120 Section 1
 */
//Class import
import java.util.Scanner;


public class BDay {

    //Method for the guessing game
    public static void main(String[] args){

        int s;
        int day=0;
        Scanner scan= new Scanner(System.in);//Scanner to take input

        //Prints game instructions
        System.out.println("This is the birthday guessing game");
        System.out.println("Five cards will appear one by one and each time");
        System.out.println("Type 0 if your day of birth doesn't appear");
        System.out.println("Type 1 if it does appear");

        //Prints the card, recieves the input, and calculates day
        System.out.println("__Card 0__");
        System.out.println(" 1  3  5  7 ");
        System.out.println(" 9 11 13 15 ");
        System.out.println("17 19 21 23 ");
        System.out.println("25 27 29 31 ");
        //takes user input and stores it
        s=scan.nextInt();
        //compares input and adds the appropriate value to calculate the birthday
        if(s==1){
            day+=1;
        }else{
            day+=0;
        }

        System.out.println("__Card 1__");
        System.out.println(" 2  3  6  7 ");
        System.out.println("10 11 14 15 ");
        System.out.println("18 19 22 23 ");
        System.out.println("26 27 30 31 ");
        //takes user input and stores it
        s=scan.nextInt();
        //compares input and adds the appropriate value to calculate the birthday
        if(s==1){
            day+=2;
        }else{
            day+=0;
        }

        System.out.println("__Card 2__");
        System.out.println(" 4  5  6  7 ");
        System.out.println("12 13 14 15 ");
        System.out.println("20 21 22 23 ");
        System.out.println("28 29 30 31 ");
        //takes user input and stores it
        s=scan.nextInt();
        //compares input and adds the appropriate value to calculate the birthday
        if(s==1){
            day+=4;
        }else{
            day+=0;
        }

        System.out.println("__Card 3__");
        System.out.println(" 8  9 10 11 ");
        System.out.println("12 13 14 15 ");
        System.out.println("24 25 26 27 ");
        System.out.println("28 29 30 31 ");
        //takes user input and stores it
        s=scan.nextInt();
        //compares input and adds the appropriate value to calculate the birthday
        if(s==1){
            day+=8;
        }else{
            day+=0;
        }

        System.out.println("__Card 4__");
        System.out.println("16 17 18 19 ");
        System.out.println("20 21 22 23 ");
        System.out.println("24 25 26 27 ");
        System.out.println("28 29 30 31 ");
        //takes user input and stores it
        s=scan.nextInt();
        //compares input and adds the appropriate value to calculate the birthday
        if(s==1){
            day+=16;
        }else{
            day+=0;
        }
        //Prints the birthday
        System.out.println("You birthday day is: "+day);
    }




}
