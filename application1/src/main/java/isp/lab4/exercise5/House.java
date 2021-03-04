package isp.lab4.exercise5;


public class House {
    private static House house;

    /**
     * The aggregation relation.
     */
    private Controler controler;

    /**
     * This overloaded constructor should set the controler of the house
     * This controler contain the temperature sensor and the fire alarm
     *
     * @param controler represent the controler of the house
     */
    public House(Controler controler) {
        this.controler = controler;
    }

    public static House getInstance(Controler controler) {
        if (house == null) {
            house = new House(controler);
        }

        return house;
    }

    /**
     * This method should get the controler and will be returned
     *
     * @return the controler of house
     */
    public Controler getControler() {
        return controler;
    }
}



