/**
 * Created by IntelliJ IDEA.
 * User: Steve
 * Date: 01/12/11
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        final int runs = 100;
        int stickWins = 0;
        int switchWins = 0;

        for(int i = 0; i <= runs; i++){
            if(Game.GamerStick())
            {
                stickWins++;
            }
            if(Game.GamerSwitch()){
                switchWins++;
            }
        }

        System.out.println("Total Stick Wins: " + stickWins);
        System.out.println("Total Switch Wins: " + switchWins);


    }
}
