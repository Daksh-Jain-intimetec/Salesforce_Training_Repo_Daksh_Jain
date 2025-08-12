package Salesforce_Training_Repo_Daksh_Jain.WEEK1.DAY2;
import java.util.*;
class Hero{
    String sword = "sword";
    public void fightRule(int diff){
        System.out.println("You get " + sword + "...");
        System.out.println("you have "  + diff + " days to train yourself...");
        System.out.println("You Lose, Better luck Next Time");
    }
    public void fightRule(int diff, boolean advantage){
        System.out.println("Your weapon is " + sword + "...");
        System.out.println("you have "  + diff + " days to train yourself...");
        System.out.println("Congratulations you gain " + diff + " level points.");
    }
}
class SuperHero extends Hero{
    String FlameThrower = "flameThrower";
    public void fightRule(int diff, boolean advantage){
        System.out.println("your weapon is " + sword + " and " + FlameThrower + "...");
        System.out.println("Ready to Fight...");
        System.out.println("Congratulations you gain " + diff + " level points.");
    }
}
public class CodeDPA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Level ");
        int level = sc.nextInt();
        System.out.println("Enter level you Want to Fight");
        int levelnext = sc.nextInt();
        int diff = levelnext - level;
        if(diff<0){
            diff = diff*-1;
        }
        if(level<10){
            Hero fighter = new Hero();
            if(diff<=4){
                fighter.fightRule(diff,true);
            }else{
                fighter.fightRule(diff);
            }
        } else if(level>10){
            Hero fighter = new SuperHero();
            if(level>levelnext){
                fighter.fightRule(diff,true);
            }else if(diff<=8 && levelnext>level){
                fighter.fightRule(diff,true);
            }else if(diff>8 && levelnext>level){
                fighter.fightRule(diff);
            }
        }
        sc.close();
    }
}
