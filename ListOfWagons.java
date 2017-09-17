package lesson3_4.train;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListOfWagons implements Train{
    private List<Wagon> wagons = new LinkedList<>();
    private int currentPosition;

    public ListOfWagons(int sizeOfList){
        if (sizeOfList<3)
            throw new IllegalArgumentException("Size of train must be >3, but actually is "+sizeOfList);
        Random random = new Random(46);
        for (int i = 0; i < sizeOfList; i++) {
            wagons.add(new Wagon(random.nextBoolean()));
        }
    }

    public ListOfWagons(){
            this(3 + new Random(10).nextInt());
        }

    public void turnLeft(){
        currentPosition = (currentPosition>0)?--currentPosition:wagons.size()-1;
    }
    public void turnRight(){
        currentPosition = (currentPosition<wagons.size()-1)?++currentPosition:0;
    }

    public void lightOn(){
        wagons.get(currentPosition).lightOn();
    }
    public void lightOff(){
        wagons.get(currentPosition).lightOff();
    }
    public boolean isLightOn(){
        return wagons.get(currentPosition).isLightOn();
    }

    public boolean isLength(int expectedLength){
        return expectedLength==wagons.size();
    }

    public void output(){

        for (int i = 0; i <wagons.size() +10; i++) {
            System.out.println(wagons.get(currentPosition).isLightOn()+"  "+currentPosition);
            turnRight();
        }
    }

}
