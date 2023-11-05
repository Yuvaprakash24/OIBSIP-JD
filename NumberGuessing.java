import java.util.*;
public class NumberGuessing{
    public static void main(String args[]){
        System.out.println("Guess The Number Game Starts now");
        Random r=new Random();
        int r_num=r.nextInt(100);
        System.out.println("A Random number has been selected between 1 to 100.");
        int chances=20;
        System.out.println("You have 20 chances.\nNow Start Guessing The Number:");
        Scanner takeinp=new Scanner(System.in);
        int take=1;
        while(take!=0 && chances>0){
            System.out.print("Guess the Number:");
            int choice=takeinp.nextInt();
            if(choice==r_num){
                System.out.println("Congratulations!!!You have guessed the Correct Number!");
                System.out.println("Your Score is: "+chances*5);
                System.out.println("\n\n...Do you want to continue the Game...");
                System.out.print("Enter Y for 1(Contiunes the Game) or N for 0(Exits the Games):");
                take=takeinp.nextInt();
                if(take==1){
                    chances=20;
                    r_num=r.nextInt(100);
                    System.out.println("A Random number has been selected between 1 to 100.");
                    System.out.println("You have 20 chances.\nNow Start Guessing The Number:");
                }
                else{
                    break;
                }
            }
            else if(choice<r_num){
                System.out.println("It's Smaller Number then the Number!Choose a Bigger Number");
                chances--;
            }
            else if(choice>r_num){
                System.out.println("It's Bigger Number then the Number!Choose a Smaller Number");
                chances--;
            }
        }
        System.out.println("Thank You for Playing the Game!!!");
        takeinp.close();
    }
}