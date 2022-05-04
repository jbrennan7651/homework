import java.util.ArrayList;

public class Room {
    //
    //Data
    private int width;
    private int height;
    private int length;
    public int numWindows;
    private ArrayList rooms = new ArrayList();


    //
    //Constructor
    //
    Room (){

    }
    Room(int width, int height, int length, int numWindows){
        this.width = width;
        this.height = height;
        this.length = length;
        this.numWindows = numWindows;
        rooms.add(width,1);
        rooms.add(height,2);
        rooms.add(length,3);
        rooms.add(numWindows,4);
    }
}
