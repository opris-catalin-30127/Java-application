package isp.lab5.exercise5;

interface Herbivorous {
    /**
     * This method should prints a message with animal who successfully
     * run and his chances
     */
    void runSuccessfully();

    /**
     * This method should prints a message with animal who failed
     * run and his chances
     */
    void runFailed();

    /**
     * This method should get the chances of herbivorous to run successfully
     *
     * @return the chances to run
     */
    int getChancesToRunSuccessfully();

}
