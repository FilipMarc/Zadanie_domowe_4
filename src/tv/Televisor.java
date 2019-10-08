package tv;

public class Televisor {
    String switchh = "Wyłączony";


    public void turnOn(){
        switchh = "Włączony";
    }

    public void  turnOff(){
        switchh = "Wyłączony";
    }

    public void showStatus(){
        System.out.println(switchh);
    }
}
