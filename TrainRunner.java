package lesson3_4.train;

public class TrainRunner {

    public static int findLength(Train train){
        int lenght = 1;
        //int currentPosition = 1;
        train.lightOn();

        while (train.isLightOn()){

            for (int i = 0; i < lenght+1; i++) {
                train.turnLeft();
                //currentPosition++;
            }
            train.lightOff();

            for (int i = 0; i < lenght + 1; i++) {
                train.turnRight();
                //currentPosition--;
            }

            //lenght+= (train.isLightOn())?1:0;
            lenght++;
        }

        return lenght;
    }


    public static void main(String[] args) {
        ListOfWagons listOfWagons = new ListOfWagons(50);
        //listOfWagons.output();
        Train train = listOfWagons;

        System.out.println(train.isLength(findLength(train)));


    }
}
