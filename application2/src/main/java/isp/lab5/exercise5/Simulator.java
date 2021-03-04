package isp.lab5.exercise5;

import java.util.Random;

public class Simulator {
    private Jungle jungle;

    public Jungle getJungle() {
        return jungle;
    }

    public Simulator() {
        this.addAnimals();
    }

    public Simulator(Jungle jungle) {
        this.jungle = jungle;
    }

    /**
     * This method should take random a herbivore and a carnivore from the jungle and will simulate
     * a "fight" until there are only herbivores or only carnivores or is a draw.
     * After each duel the looser will be removed from jungle. In the end print a message
     * with the winners if is not a draw
     */
    public void simulate() {
        Random random = new Random();

        int randomHerbivorous, randomCarnivorous;

        int nrOfCarnivorous = this.jungle.getCarnivorous().length;
        int nrOfHerbivorous = this.jungle.getHerbivorous().length;
        while (true) {

            if (nrOfHerbivorous == 0) {
                System.out.println("Carnivorous wins!");
                break;
            } else if (nrOfCarnivorous == 0) {
                System.out.println("Herbivorous wins!");
                break;
            }
            randomCarnivorous = random.nextInt(nrOfCarnivorous);
            randomHerbivorous = random.nextInt(nrOfHerbivorous);

            Herbivorous herbivorous = this.jungle.getHerbivorous()[randomHerbivorous];
            Carnivorous carnivorous = this.jungle.getCarnivorous()[randomCarnivorous];

            System.out.println(carnivorous.toString() + "and " + herbivorous.toString());
            if (herbivorous.getChancesToRunSuccessfully() > carnivorous.getChancesToHuntSuccessfully()) {

                herbivorous.runSuccessfully();
                carnivorous.huntFailed();

                this.jungle.removeAnimalFromCarnivorous(randomCarnivorous);
                nrOfCarnivorous--;
            } else if (herbivorous.getChancesToRunSuccessfully() < carnivorous.getChancesToHuntSuccessfully()) {
                herbivorous.runFailed();
                carnivorous.huntSuccessfully();

                this.jungle.removeAnimalFromHerbivorous(randomHerbivorous);
                nrOfHerbivorous--;
            } else if (nrOfCarnivorous == nrOfHerbivorous && herbivorous.getChancesToRunSuccessfully() == carnivorous.getChancesToHuntSuccessfully()) {
                System.out.println("It's a draw because carnivores have their best participant equal in chances with the best participant from herbivores");
                break;
            }
        }
    }

    /**
     * This method should create the Jungle which contains
     * 20 herbivores(random nr of Elk/Dear) and 20 carnivores(random nr of Lion/Tiger)
     */
    public void addAnimals() {
        Random random = new Random();
        boolean elk = random.nextBoolean();
        Herbivorous[] herbivorous = new Herbivorous[20];
        Carnivorous[] carnivorous = new Carnivorous[20];
        for (int i = 0; i < 20; i++) {
            if (elk) {
                Elk elk1 = new Elk();
                herbivorous[i] = elk1;
            } else {
                Dear dear = new Dear();
                herbivorous[i] = dear;
            }
            elk = random.nextBoolean();
        }

        boolean lion = random.nextBoolean();
        for (int i = 0; i < 20; i++) {
            if (lion) {
                carnivorous[i] = new Lion();
            } else {
                carnivorous[i] = new Tiger();
            }
            lion = random.nextBoolean();
        }
        this.jungle = new Jungle(herbivorous, carnivorous);
    }

    public void changeFirstHerbivorousAnimal(Herbivorous herbivorous) {
        this.jungle.getHerbivorous()[0] = herbivorous;
    }

    public void changeFirstCarnivorousAnimal(Carnivorous carnivorous) {
        this.jungle.getCarnivorous()[0] = carnivorous;
    }
}
