import OOP.Minerals.Minerals;
import OOP.Minerals.Ruby;
import OOP.Minerals.Sapphire;
import OOP.Rocks.Granit;

import java.awt.*;

public class main {

    public static void main(String[] args) {
        Minerals mineral = new Minerals("Gold","Yellow", 15);
        System.out.println(mineral);

        Minerals mineral1 = mineral.raise();
        System.out.println(mineral);
        System.out.println(mineral1);
        mineral.throwStone();

        Ruby ruby = new Ruby("Dragon eye","Red",6,8);
        System.out.println(ruby);
        ruby.light();

        Sapphire sapphire = new Sapphire("Midnight star","Dark blue",6,8);
        System.out.println(sapphire);
        sapphire.light();

        Granit granit = new Granit("Smoky","Black", "Brown","Grainy","Middle");
        System.out.println(granit);
        granit.slice();
        granit.polish();
        granit.throwStone();

    }
}