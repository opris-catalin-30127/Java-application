package isp.lab6.exercise1;

import java.time.LocalDateTime;

import static isp.lab6.exercise1.SENSOR_TYPE.*;
import static java.time.LocalDateTime.*;

public class Exercise1 {

    public static void main(String[] args) {

        SensorsCluster sensorsCluster = new SensorsCluster();

        //add some sensor
        sensorsCluster.addSensor(TEMPERATURE, "1");
        sensorsCluster.addSensor(HUMIDITY, "2");
        sensorsCluster.addSensor(PRESSURE, "3");

        System.out.println(sensorsCluster);

        Sensor sensor1 = sensorsCluster.getSensorById("1");
        LocalDateTime localDateTime1 = of(2010, 1, 2, 13, 30, 11);
        LocalDateTime localDateTime2 = of(2011, 2, 3, 14, 40, 12);
        LocalDateTime localDateTime3 = of(2012, 3, 4, 15, 50, 13);
        SensorReading sensorReading1 = new SensorReading(localDateTime1, 98);
        SensorReading sensorReading2 = new SensorReading(localDateTime2, 87);
        SensorReading sensorReading3 = new SensorReading(localDateTime3, 76);
        sensor1.addSensorReading(sensorReading1);
        sensor1.addSensorReading(sensorReading2);
        sensor1.addSensorReading(sensorReading3);

        Sensor sensor2 = sensorsCluster.getSensorById("2");
        LocalDateTime localDateTime4 = of(2013, 4, 5, 16, 41, 30);
        LocalDateTime localDateTime5 = of(2014, 5, 6, 17, 42, 40);
        LocalDateTime localDateTime6 = of(2015, 6, 7, 18, 43, 50);
        SensorReading sensorReading4 = new SensorReading(localDateTime4, 99);
        SensorReading sensorReading5 = new SensorReading(localDateTime5, 89);
        SensorReading sensorReading6 = new SensorReading(localDateTime6, 79);
        sensor2.addSensorReading(sensorReading4);
        sensor2.addSensorReading(sensorReading5);
        sensor2.addSensorReading(sensorReading6);

        Sensor sensor3 = sensorsCluster.getSensorById("3");
        LocalDateTime localDateTime7 = of(2016, 10, 10, 19, 31, 51);
        LocalDateTime localDateTime8 = of(2017, 11, 20, 20, 32, 52);
        LocalDateTime localDateTime9 = of(2018, 12, 30, 21, 33, 53);
        SensorReading sensorReading7 = new SensorReading(localDateTime7, 100);
        SensorReading sensorReading8 = new SensorReading(localDateTime8, 90);
        SensorReading sensorReading9 = new SensorReading(localDateTime9, 80);
        sensor3.addSensorReading(sensorReading7);
        sensor3.addSensorReading(sensorReading8);
        sensor3.addSensorReading(sensorReading9);


        //display the this sensor
        System.out.println(sensor1);
        System.out.println(sensor2);
        System.out.println(sensor3);


        //add reading for sensor 1
        LocalDateTime localDateTime10 = of(2016, 10, 10, 19, 31, 51);
        sensorsCluster.writeSensorReading("1", 20, localDateTime10);
        System.out.println("The sensor1= " + sensor1);


    }
}