package isp.lab5.exercise5;

public class Jungle {
    private Herbivorous[] herbivorous;
    private Carnivorous[] carnivorous;

    public Jungle() {
    }

    public Herbivorous[] getHerbivorous() {
        return herbivorous;
    }

    public Carnivorous[] getCarnivorous() {
        return carnivorous;
    }

    public Jungle(Herbivorous[] herbivorous, Carnivorous[] carnivorous) {
        this.herbivorous = herbivorous;
        this.carnivorous = carnivorous;
    }

    /**
     * This method should remove an animal from the herbivorous
     *
     * @param index an index who represent the position of the animal
     *              which will be remove
     */
    public void removeAnimalFromHerbivorous(int index) {

        int length = this.herbivorous.length;
        this.herbivorous[index] = null;
        if (length - 1 - index >= 0)
            System.arraycopy(this.herbivorous, index + 1, this.herbivorous, index, length - 1 - index);
        this.herbivorous[length - 1] = null;
    }

    /**
     * This method should remove an animal from carnivorous
     *
     * @param index an index who represent the position of the animal
     *              which will be remove
     */
    public void removeAnimalFromCarnivorous(int index) {

        int length = this.carnivorous.length;
        this.carnivorous[index] = null;
        if (length - 1 - index >= 0)
            System.arraycopy(this.carnivorous, index + 1, this.carnivorous, index, length - 1 - index);
        this.carnivorous[length - 1] = null;
    }
}
