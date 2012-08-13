import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Steve
 * Date: 01/12/11
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class Doors {

    door d1 = new door();
    door d2 = new door();
    door d3 = new door();
    int i;

    Doors(){
        Random r = new Random();
        i = r.nextInt(3);
        switch (i){
            case 0: d1.value = true;
            break;
            case 1: d2.value = true;
            break;
            case 2: d3.value = true;
            break;
        }
    }

    public int getWinningDoor(){
         return i;
    }

    public boolean getDoor(int i){
        switch (i){
            case 0: return d1.value;
            case 1: return d2.value;
            case 2: return d3.value;
        }

        return false;
    }
}

class door
{
    protected boolean value = false;
    door(){}
}
