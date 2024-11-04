import java.util.Random;
import java.util.Scanner;

/* 1: Rock
 * 2: Paper
   3: Scisssor*/

public class RockPaperScissor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        byte totalRounds=3;
        int compchoice,personchoice;
        byte comp_score=0, person_score=0;
        for (int i=0;i<totalRounds;i++){
            compchoice = ran.nextInt(3)+1; //Computer's Move
            // System.out.println("Computer's move decided: "+compchoice); // just to check random integer generation is correct

            System.out.print("1.Rock 2.Paper 3.Scissor\nEnter your choice: ");
            personchoice=sc.nextInt(); //Person's Move
            if(personchoice>3 || personchoice<1){
                System.out.println("Enter valid integer choice.");
                i--;
            }
            
            if(compchoice==personchoice){
                i-=1;
                System.out.println("Point Tied!");
            }

            else if(compchoice==1 && personchoice==2){
                person_score+=1;
                System.out.println("You win this round\n");
            }
            else if(compchoice==2 && personchoice==1){
                comp_score+=1;
                System.out.println("Computer won this round\n");
            }

            else if(compchoice==1 && personchoice==3){
                comp_score+=1;
                System.out.println("Computer won this round\n");
            }
            else if(compchoice==3 && personchoice==1){
                person_score+=1;
                System.out.println("You won this round\n");
            }

            else if(compchoice==3 && personchoice==2){
                comp_score+=1;
                System.out.println("Computer won this round\n");
            }
            else if(compchoice==2 && personchoice==3){
                person_score+=1;
                System.out.println("You won this round\n");
            }

        }
        sc.close();
        if(comp_score>person_score){
            System.out.println("*** Computer Wins ****");
        }
        else{
            System.out.println("*** You win ***");
        }

    }
}