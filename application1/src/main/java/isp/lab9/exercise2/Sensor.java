package isp.lab9.exercise2;

import java.text.DecimalFormat;
import java.util.Random;

public class Sensor extends Observable {
    private SENSOR_TYPE sensorType;

    public Sensor(SENSOR_TYPE sensorType) {
        this.sensorType = sensorType;
    }

    double readValue() {

        Random r = new Random();
        double v = r.nextDouble() * 500;
        DecimalFormat df = new DecimalFormat("###.##");
        double valueSensor = Double.parseDouble(df.format(v));

        return valueSensor;
    }


    void readSensor() {
        System.out.println("Sensor has been read!");
        this.changeState(sensorType, readValue());
    }

}
