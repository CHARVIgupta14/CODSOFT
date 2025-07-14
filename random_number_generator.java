import java.util.Random;
import java.util.Scanner;
class  game  {
     int score=0,r=1;
   public void play(){
    
    
Random rand= new Random();
    int number = rand.nextInt(100)+1;
    System.out.println("The computer has chosen a number between 1 and 100.");
System.out.println("You have 5 chances to guess it!\n");
 for(int i=0;i<5;i++){
        int n;
Scanner s=new Scanner(System.in);
System.out.println(" Enter your guess!");
n =s.nextInt();
if(number==n){
    System.out.println("you guessed it right!");
    score++;


    break;
}
else if (n<number){
    System.out.println("Oops! The number is greater than " + n + ".\n");

}
else if (n>number){
    System.out.println("Oops! The number is smaller than " + n + ".\n");

}}
System.out.println("The number was "+number);
rounds();}
public void rounds(){
System.out.println("Do you want to play again? Enter 'Y' for yes or 'N' for no:");

Scanner s2=new Scanner(System.in);
char c= s2.next().charAt(0);
if (c=='Y'||c=='y'){

   r++;
   play();
   
   }
else{
    System.out.println("you  scored "+score+"point(s) in "+r+" round(s)");


    System.out.println("Thank you for playing!");
}

    }}
public class random_number_generator{
    public static void main(String[] args) {
    game p=new game();
    p.play();
    
}}
