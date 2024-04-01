package be.arlioz.exempleJavadoc;
import be.arlioz.exempleJavadoc.SuperHero;

/**
 * La classe principale de l'exemple SuperHero.
 *
 * @author Le Prof
 */
public class Main {
    /**
     * Class main du petit projet
     * @param args les arguments passés au lancement
     */
    public static void main(String[] args) {
        SuperHero wondermoi = new SuperHero("Prof",1000);
        System.out.println(wondermoi);
        wondermoi.calculateHealth(100);
        System.out.println(wondermoi);
    }
}