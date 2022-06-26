package practiceFanXing;

public class APHero extends Hero{

    public String name;
    public float hp;
    public int damage;

    public APHero() {
        super();
    }

    public APHero(String name) {
        super(name);
    }

    public APHero(String name, float hp, int damage) {
        super(name, hp, damage);
    }
}
