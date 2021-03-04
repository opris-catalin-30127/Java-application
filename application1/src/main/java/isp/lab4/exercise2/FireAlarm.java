package isp.lab4.exercise2;


public class FireAlarm {
    private static FireAlarm fireAlarm;
    private boolean active;

    /**
     * This overloaded constructor should set the status of the fire senzor
     *
     * @param active represent the status
     */
    public void FireSenzor(boolean active) {
        System.out.println("The fire senzor is active.");
        this.active = active;
    }

    /**
     * This method should get the status and will be returned
     *
     * @return the status of fire sensor
     */
    public boolean getFireSenzor() {
        return this.active;
    }

    /**
     * This method should get the status and will be returned
     *
     * @return the status of fire alarm
     */
    public boolean isActive() {
        System.out.println("The fire alarm is active.");
        return active;
    }

    /**
     * This method should set the status of fire alarm
     *
     * @param active represent the status of fire alarm
     */
    public void setActive(boolean active) {
        System.out.println("The fire alarm set to be active: " + active);
        this.active = active;
    }

    /**
     * This method should return active (the status) as a string
     *
     * @return the status of fire alarm
     */
    @Override
    public String toString() {
        return "FireAlarm{ " +
                "active=" + active +
                " }";
    }

}
