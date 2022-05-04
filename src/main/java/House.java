import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class House extends Building{
    //
    //Data Members
    //
    public ArrayList<Room>rooms;
    public int sqFt;

    //
    //Constructors
    //
    House (){

    }
    House (int width, int height, int price, int color){
        this.width = width;
        this.height = height;
        this.price  = price;
        this.color = color;
        this.rooms = new ArrayList<Room>();

    }

    //
    //Accessors
    //

    //
    //Methods
    //
    public ArrayList roomNum(int numRooms){
        ArrayList roomNums = new ArrayList(numRooms);
        return roomNums;
    }
    public ArrayList buildRoom(ArrayList<Integer> roomNums){
        Random rand = new Random();

        for (int i = 0; i < roomNums.size(); i++){
            var roomsBuild = new Room(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
            rooms.add(roomsBuild);

        }
        return rooms;
    }
    @Override
    public String toString(){
        if (rooms.isEmpty()){
            return "N/A";
        }
        else{
            int sqFT = width * height;
            this.sqFt = sqFT;
            return "Your house is " + sqFt + ". \n It has " + rooms.size() + " rooms. ";
        }
    }



//    public ArrayList buildHouse(){
//        ArrayList buildHouse = new ArrayList();
//        System.out.println("Please enter the width you'd like your house to be: ");
//        Scanner scanner = new Scanner(System.in);
//        var width = scanner.nextInt();
//        this.width = width;
//        buildHouse.add(width);
//        System.out.println("Please enter the height you'd like your house to be: ");
//        var height = scanner.nextInt();
//        this.height = height;
//        buildHouse.add(height);
//        System.out.println("Please enter your max price: ");
//        var price = scanner.nextInt();
//        this.price = price;
//        buildHouse.add(price);
//        System.out.println("Please choose a color: \n 1.) Blue \n 2.) Green \n 3.) White");
//        var color = scanner.nextInt();
//        this.color = color;
//        buildHouse.add(color);
//        return buildHouse;
//    }
}
