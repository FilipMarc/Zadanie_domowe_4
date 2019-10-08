package tv;

public class Televisor {
    String tvTurnedOnOff = "Wyłączony";


    public void turnOn(){
        tvTurnedOnOff = "Włączony";
    }

    public void  turnOff(){
        tvTurnedOnOff = "Wyłączony";
    }

    public void showStatus(){
        System.out.println(tvTurnedOnOff);
    }
}
