package dice1;

import java.util.ArrayList;

public class GameEngine {
    ArrayList<Player>arr;
    Dice dice;
    public GameEngine(ArrayList<Player>list){
        arr = list;
        dice = new Dice();
    }

    public void playRound(){
        int highestOp = 0;
        Player winPlayer = null;
        for(Player p : arr){
            int n = dice.roll();
            System.out.println(p.showName() + " rolled: " + n);
            if(n > highestOp){
                highestOp = n;
                winPlayer = p;
            }else if(n == highestOp){
                winPlayer = null;

            }
        }
        if(winPlayer != null){
            System.err.println("The player who won this round is " + winPlayer.showName()+", the output we got is "+highestOp);
            winPlayer.incrementWin();
        }
        else {
        System.out.println("This round is a tie!"); 
    }
    }
    public void showResults(){
        for(Player P : arr){
            System.out.println(P.showName()+" have won "+P.showWins()+" rounds");
        }
    }
}
