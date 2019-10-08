package tv;

public class TelevisorTest {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("Wyłączony");
        televisor.showStatus();

        System.out.println("Turn on tv");
        televisor.turnOn();

        televisor.showStatus();

        System.out.println("Turn off tv");
        televisor.turnOff();

        televisor.showStatus();
    }
}
