package isp.lab4.exercise5;


public class Controler {

    private TemperatureSensor temperatureSensors[];


    private FireAlarm fireAlarm;

    /**
     * This method should check temperature and if temperature is > 50 for at least one sensor
     * will set fireAlarm sensor true and print a message "Fire alarm started" or
     * "Fire alarm not started" based on verification results
     */
    public void ControlStep() {
        boolean isValid = false;

        for (int i = 0; i < temperatureSensors.length; i++) {
            if (temperatureSensors[i].getValue() > 50) {
                isValid = true;
            } else {

                isValid = false;
                break;
            }
        }

        if (isValid == true) {
            fireAlarm.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            fireAlarm.setActive(false);
            System.out.println("Fire alarm not started");
        }

    }

    /**
     * This oveloaded constructor should sets the temperature sensor and fire alarm of controler
     *
     * @param temperatureSensors represent the temperature sensors
     * @param fireAlarm          represent the fire alarm
     */
    public Controler(TemperatureSensor temperatureSensors[], FireAlarm fireAlarm) {
        this.temperatureSensors = temperatureSensors;
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
    public TemperatureSensor[] getTemperatureSensors() {
        return temperatureSensors;
    }


}
