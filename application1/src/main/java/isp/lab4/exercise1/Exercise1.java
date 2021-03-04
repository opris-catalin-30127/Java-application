package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect

        TemperatureSensor temperatureSensor = TemperatureSensor.getInstance(51, "Bucharest");

        temperatureSensor.getValue();

        temperatureSensor.getLocation();
    }
}

