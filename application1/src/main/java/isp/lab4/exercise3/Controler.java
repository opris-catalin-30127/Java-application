package isp.lab4.exercise3;


public class Controler {
    private static Controler controler;


    /**
     * The aggregation relation.
     */

    private TemperatureSensor temperatureSensor;

    private FireAlarm fireAlarm;

    public static Controler getInstance(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        if (controler == null) {
            controler = new Controler(temperatureSensor, fireAlarm);
        }

        return controler;
    }

    /**
     * This method should check temperature and if temperature is > 50 for all sensors will
     * set fireAlarm sensor true and print a message "Fire alarm started" or
     * "Fire alarm not started" based on verification results
     */
    public void ControlStep() {
        if (temperatureSensor.getValue() > 50) {
            System.out.println("Fire alarm started");
            fireAlarm.setActive(true);
        } else {
            System.out.println("Fire alarm not started");
        }

    }

    /**
     * This overloaded constructor should sets the temperature sensor and fire alarm of controler
     *
     * @param temperatureSensor represent the temperature sensor
     * @param fireAlarm         represent the fire alarm
     */
    public Controler(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireAlarm = fireAlarm;
    }

    /**
     * This method should get the fire alarm and will be returned
     *
     * @return the fire alarm of controler
     */
    public FireAlarm getFireAlarm() {
        return fireAlarm;
    }

    /**
     * This method should get the temperature sensor and will be returned
     *
     * @return the temperature sensor of controler
     */
    public TemperatureSensor getTemperatureSensor() {
        return temperatureSensor;
    }
}

