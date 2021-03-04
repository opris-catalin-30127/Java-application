package isp.lab4.exercise5;

public class FireAlarm {
    private boolean active;

    /**
     * This overloaded constructor should set the status of the fire senzor
     *
     * @param active represent the status
     */
    public void FireSenzor(boolean active) {
        this.active = active;
    }

    /**
     * This method should get the status and will be returned
     *
     * @return the status of fire alarm
     */
    public boolean isActive() {
        return active;
    }

    /**
     * This method should set the status of fire alarm
     *
     * @param active represent the status of fire alarm
     */
    public void setActive(boolean active) {
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
