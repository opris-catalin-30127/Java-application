package isp.lab4.exercise1;

public class TemperatureSensor {
    //atribute
    //constructori
    //metode
    private static TemperatureSensor temperature;

    private int value;

    private String location;

    /**
     * This default constructor should initialize the value 0 and the location null
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
     * This method should transform the class in a singleton
     *
     * @param type     is the value of temperature sensor
     * @param location is the location of temperature sensor
     * @return the temperature
     */
    public static TemperatureSensor getInstance(int type, String location) {
        if (temperature == null) {
            temperature = new TemperatureSensor(type, location);
        }

        return temperature;
    }

    /**
     * This method should get the value and will be returned
     *
     * @return the value of type temperature sensor
     */
    public int getValue() {
        System.out.println("Value of type temperature sensor= " + value);
        return this.value;
    }

    /**
     * This method should get the location and will be returned
     *
     * @return the location of type temperature sensor
     */
    public String getLocation() {
        System.out.println("Temperature sensor location= " + location);
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
