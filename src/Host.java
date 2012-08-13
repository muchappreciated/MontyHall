/**
 * Created by IntelliJ IDEA.
 * User: Steve
 * Date: 01/12/11
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public class Host {
    int chosenDoor;
    int winningDoor;

    Host(int chosenDoorIn, int winningDoorIn) {
        chosenDoor = chosenDoorIn;
        winningDoor = winningDoorIn;
    }

    public int getDoorToOpen() {
        int doorToOpen = 0;
        for (int i = 0; i < 3; i++) {
            if (i != chosenDoor && i != winningDoor) {
                doorToOpen = i;
            }
        }
        return doorToOpen;
    }


}
