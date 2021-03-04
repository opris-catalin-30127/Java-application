package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
        temperatureSensors[0] = new TemperatureSensor(51, "Milano");

        temperatureSensors[1] = new TemperatureSensor(52, "Amsterdam");

        temperatureSensors[2] = new TemperatureSensor(111, "Viena");

        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = Controler.getInstance(temperatureSensors, fireAlarm);

        controler.ControlStep();
    }
}
