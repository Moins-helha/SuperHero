package be.arlioz.exempleJavadoc;

/**
 * La classe SuperHero représente un super-héros.
 *
 * @author Captain America
 * @see be.arlioz.exempleJavadoc
 */
public class SuperHero {
    /**
     * Le nom du super-héros.
     */
    private String heroName;

    /**
     * Le niveau de santé du super-héros.
     */
    private int health;

    /**
     * Constructeur de SuperHero
     * @param heroName nom du héro
     * @param health santé du héro
     */
    public SuperHero(String heroName, int health) {
        this.heroName = heroName;
        this.health = health;
    }

    /**
     * Calcule la santé restante du héros après une attaque.
     *
     * @param incomingDamage Montant des dégâts entrants
     * @return Santé restante du héros après l'attaque
     * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
     */
    public int calculateHealth(int incomingDamage) {
        this.health-= incomingDamage;
        if (this.health < 0) {this.health = 0;}
        return this.health;
    }
    /**
     * Affiche les attributs de héro sous forme de texte.
     *
     */
    @Override
    public String toString() {
        return "SuperHero{" +
                "Nom='" + heroName + '\'' +
                ", Santé=" + health +
                '}';
    }

    /**
     * Renvoie la santé du héro.
     *
     * @return La santé du héro.
     */
    public int getHealth() {
        return health;
    }
}
