package lesson3_4.train;

public class TrainRunner {

    public static int findLength(Train train){
        int length = 1;
        train.lightOn();

        while (train.isLightOn()){

            for (int i = 0; i < length+1; i++) {
                train.turnLeft();
            }
            train.lightOff();

            for (int i = 0; i < length + 1; i++) {
                train.turnRight();
            }

            length++;
        }

        return length;
    }


    public static void main(String[] args) {
        ListOfWagons listOfWagons = new ListOfWagons(50);
        System.out.println("Hell train : ");
        listOfWagons.output();

        Train train = listOfWagons;

        System.out.println("Is your answer correct : "+train.isLength(findLength(train)));


    }
}
