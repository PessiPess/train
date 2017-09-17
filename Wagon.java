package lesson3_4.train;

public class Wagon {
    private boolean light = false;

    public Wagon(boolean light){
        this.light = light;
    }

    public void lightOn(){
        light=true;
    }

    public void lightOff(){
        light=false;
    }

    public boolean isLightOn(){
        return light;
    }
}
