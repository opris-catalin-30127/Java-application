package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {

        FireAlarm fireAlarm = new FireAlarm();

        fireAlarm.FireSenzor(true);

        fireAlarm.isActive();

        fireAlarm.setActive(true);
    }
}
