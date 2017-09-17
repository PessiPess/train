package lesson3_4.train;

public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}
