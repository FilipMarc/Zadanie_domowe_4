package tv;

public class Televisor {
    String tvSwitch = "Wyłączony";


    public void turnOn(){
        tvSwitch = "Włączony";
    }

    public void  turnOff(){
        tvSwitch = "Wyłączony";
    }

    public void showStatus(){
        System.out.println(tvSwitch);
    }
}
