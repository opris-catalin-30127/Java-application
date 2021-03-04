package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SensorsCluster {
    private List<Sensor> sensors = new ArrayList<>();

    public SensorsCluster(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public SensorsCluster() {
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    /**
     * This method should add sensor
     *
     * @param sensorType represent the type of sensor
     * @param sensorId   represent the id of sensor
     * @return an instance to the newly created Sensor object or null if a sensor with given id already exists
     */
    public Sensor addSensor(SENSOR_TYPE sensorType, String sensorId) {
        for (Sensor sensor1 : this.sensors) {
            if (sensor1.getId().equals(sensorId)) {
                return null;
            }
        }
        Sensor sensor1 = new Sensor(sensorType, sensorId);
        this.sensors.add(sensor1);
        return sensor1;
    }

    /**
     * This method should search for sensor by sensorId and use the sensor addSensorReading() to add a new value
     *
     * @param sensorId represent the id of the sensor
     * @param value    represent the value of sensor
     * @param dateTime is date and time when sensor is reading
     * @return return false if sensor cannot be found
     */
    public boolean writeSensorReading(String sensorId, double value, LocalDateTime dateTime) {
        for (Sensor sensor : this.sensors) {
            if (Objects.equals(sensor.getId(), sensorId)) {
                SensorReading sensorReading = new SensorReading(dateTime, value);
                sensor.addSensorReading(sensorReading);
                return true;
            }
        }
        return false;


    }

    /**
     * This method should get sensor by reference id
     *
     * @param sensorId is the id sensor to reference
     * @return the sensors or null if the id not found
     */
    public Sensor getSensorById(String sensorId) {
        for (int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i).getId().equals(sensorId)) {
                return sensors.get(i);
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "SensorsCluster{" +
                "sensors=" + sensors +
                '}';
    }
}