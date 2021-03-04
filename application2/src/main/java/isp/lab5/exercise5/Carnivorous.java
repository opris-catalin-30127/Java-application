package isp.lab5.exercise5;

interface Carnivorous {
    /**
     * This method should prints a message with animal who successfully
     * hunt and his chances
     */
    void huntSuccessfully();

    /**
     * This method should prints a message with animal who failed
     * hunt and his chances
     */
    void huntFailed();

    /**
     * This method should get the chances of carnivorous to hunt successfully
     *
     * @return the chances to hunt
     */
    int getChancesToHuntSuccessfully();
}
