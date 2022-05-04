import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Please choose a color between 1 and 3
        House house = new House(1000,100,50000,3);
        house.roomNum(5);


        System.out.println(house);
    }


}
