package isp.lab4.exercise5;

public class TemperatureSensor {

    private int value;

    private String location;

    /**
     * This defauld constructor should initialize the value 0 and the location null
     */
    public TemperatureSensor() {
        this.value = 0;
        this.location = null;
    }

    /**
     * This overloaded constructor should sets type and location
     *
     * @param type     represent the value of temperature sensor
     * @param location represent the location of temperature sensor
     */
    public TemperatureSensor(int type, String location) {
        this.value = type;
        this.location = location;
    }

    /**
     * This method should get the value and will be returned
     *
     * @return the value of type temperature sensor
     */
    public int getValue() {
        return this.value;
    }

    /**
     * This method should get the location and will be returned
     *
     * @return the location of type temperature sensor
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * This method should return the value and the location of temperature sensor
     * as a string
     *
     * @return value and location of temperature sensor
     */
    @Override
    public String toString() {
        return "TemperatureSensor{"
                + " value=" + value
                + " ,location=" + location
                + " }";
    }
}
