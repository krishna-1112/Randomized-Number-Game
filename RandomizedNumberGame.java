import  java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static void main(String[] args){

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int attempts=10;
        int chances=1;
        int Score;
        int Randnum=rand.nextInt(100)+1;
        while(attempts>0){

            System.out.println("Enter the Number ( 1-100) : ");
            int Userguess= sc.nextInt();
            if(Userguess==Randnum){
                System.out.println("You are Correct");
                break;
            } else if (Userguess<Randnum) {
                System.out.println("The number is lesser. Guess a higher number");

            }
            else{
                System.out.println("The number is higher. Guess a lower number");
            }
            attempts-=1;
            chances+=1;

        }
        System.out.println("Random Number is : "+ Randnum);
        //System.out.println("You Lost !");
        System.out.println("Attempts taken: "+chances);
        if(attempts<1){
            System.out.println("You lost !");
        }

    }


}