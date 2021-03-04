package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(56, "Atena");

        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = Controler.getInstance(temperatureSensor, fireAlarm);

        controler.ControlStep();
    }
}
