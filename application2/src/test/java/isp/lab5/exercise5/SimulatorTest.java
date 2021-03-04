package isp.lab5.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimulatorTest {
    @Test
    public void TestSimulate() {
        Herbivorous[] herbivorous = new Herbivorous[5];
        Carnivorous[] carnivorous = new Carnivorous[5];
        carnivorous[0] = (Carnivorous) new Lion(51);
        carnivorous[1] = (Carnivorous) new Tiger(23);
        carnivorous[2] = (Carnivorous) new Tiger(34);
        carnivorous[3] = (Carnivorous) new Lion(18);
        carnivorous[4] = (Carnivorous) new Tiger(94);
        herbivorous[0] = (Herbivorous) new Dear(21);
        herbivorous[1] = (Herbivorous) new Elk(67);
        herbivorous[2] = (Herbivorous) new Dear(89);
        herbivorous[3] = (Herbivorous) new Elk(11);
        herbivorous[4] = (Herbivorous) new Dear(26);
        Jungle jungle = new Jungle(herbivorous, carnivorous);
        Simulator simulator = new Simulator(jungle);
        simulator.simulate();
        assertNull("There are no herbivorous in the jungle", jungle.getHerbivorous()[0]);
        assertNotNull("There are carnivorous in the jungle", jungle.getCarnivorous()[0]);
    }

    @Test
    public void TestSimulateOnDraw() {
        Simulator simulator = new Simulator();
        Herbivorous herbivorous = (Herbivorous) new Dear(100);
        Carnivorous carnivorous = (Carnivorous) new Lion(100);
        simulator.changeFirstCarnivorousAnimal(carnivorous);
        simulator.changeFirstHerbivorousAnimal(herbivorous);
        simulator.simulate();
        assertTrue("It's a draw!", simulator.getJungle().getCarnivorous()[0].getChancesToHuntSuccessfully() == simulator.getJungle().getHerbivorous()[0].getChancesToRunSuccessfully());
    }
}
