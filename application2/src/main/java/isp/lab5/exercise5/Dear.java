package isp.lab5.exercise5;

import java.util.Random;

public class Dear extends Animal implements Herbivorous {

    private int chanceToRunSuccessfully;
    private String name;

    public Dear(int chanceToRunSuccessfully) {
        this.chanceToRunSuccessfully = chanceToRunSuccessfully;
        this.eat();
        Random random = new Random();
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    public Dear() {
        this.eat();
        super.species = "herbivorous";
        Random random = new Random();
        this.chanceToRunSuccessfully = random.nextInt(101);
        super.age = random.nextInt(20);
        this.name = "" + random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Dear{" +
                "chanceToRunSuccessfully=" + chanceToRunSuccessfully +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }

    @Override
    void eat() {
        System.out.println("The deer eating herb...");
    }

    @Override
    public void runSuccessfully() {
        System.out.println("Deer '" + this.name + "' run successfully at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public void runFailed() {
        System.out.println("Deer '" + this.name + "' run failed at age " + this.age + " with a chance of " + this.chanceToRunSuccessfully + "%");
    }

    @Override
    public int getChancesToRunSuccessfully() {
        return this.chanceToRunSuccessfully;
    }
}
