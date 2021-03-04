package isp.lab9.exercise2;

import static isp.lab9.exercise2.SENSOR_TYPE.*;

public class Main {
    public static void main(String[] args) {

        SensorController sensorController=new SensorController();

        Sensor sensorTemperature= new Sensor(TEMPERATURE);
        sensorTemperature.register(sensorController);
        sensorTemperature.readSensor();

        Sensor sensorHumidity=new Sensor(HUMIDITY);
        sensorHumidity.register(sensorController);
        sensorHumidity.readSensor();

        Sensor sensorPressure=new Sensor(PRESSURE);
        sensorPressure.register(sensorController);
        sensorPressure.readSensor();


    }
}
