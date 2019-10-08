package tv;

public class Televisor {
    String display = "Wyłączony";


    public void turnOn(){
        display = "Włączony";
    }

    public void  turnOff(){
        display = "Wyłączony";
    }

    public void showStatus(){
        System.out.println(display);
    }
}
