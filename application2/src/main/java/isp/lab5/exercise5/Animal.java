package isp.lab5.exercise5;

public abstract class Animal {
    String species;

    int age;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * This method should prints a message with the meal of each animal
     */
    abstract void eat();
}
