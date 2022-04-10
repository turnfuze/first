package OOP;

import OOP.Rocks.Rock;

public interface Stoneable {
    float indexLossesMinerals = 0.87f;
    float indexLossesRocks = 0.84f;
    float indexLossesOre = 0.54f;

    void melting(Rock rock);
}
