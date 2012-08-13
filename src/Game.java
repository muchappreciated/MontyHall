import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Steve
 * Date: 01/12/11
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    //Initialise Doors
    //Choose a door
    //Get Host to open door

     public static boolean GamerStick(){
         boolean winner;
         Doors doors = new Doors();

         Random r = new Random();
         int chosenDoor = r.nextInt(3);
         Host h = new Host(chosenDoor, doors.getWinningDoor());
         //h.getDoorToOpen();
         winner = doors.getDoor(chosenDoor);
         return winner;
     }

    public static boolean GamerSwitch(){
        boolean winner;
        int switchedDoor = 0;
        Doors doors = new Doors();

        Random r = new Random();
        int chosenDoor = r.nextInt(3);
        Host h = new Host(chosenDoor, doors.getWinningDoor());
        int hostOpened = h.getDoorToOpen();

        for(int i = 0; i < 3; i++){
            if(i != hostOpened && i != chosenDoor)
            {
                 switchedDoor = i;
            }
        }

         winner = doors.getDoor(switchedDoor);
         return winner;
    }
}
