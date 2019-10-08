package tv;

public class Televisor {
    String onOff;

    public Televisor(String onOff) {
        this.onOff = onOff;
    }

    public void turnOn(){
        onOff = "Włączony";
    }

    public void  turnOff(){
        onOff = "Wyłączony";
    }

    public void showStatus(){
        System.out.println(onOff);
    }
}
