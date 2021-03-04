package isp.lab4.exercise5;


public class Exercise5 {
    public static void main(String[] args) {
        TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];

        temperatureSensors[0] = new TemperatureSensor(55, "Milano");
        temperatureSensors[1] = new TemperatureSensor(52, "Amsterdam");
        temperatureSensors[2] = new TemperatureSensor(111, "Viena");

        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = new Controler(temperatureSensors, fireAlarm);

        House house = House.getInstance(controler);
        house.getControler().ControlStep();
    }

}
