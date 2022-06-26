package practiceFanXing;

import java.util.ArrayList;

public class TestGeneric {

    public static void iterate(ArrayList<Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }

    public static void iterateAP(ArrayList<APHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }

    public static void iterateAD(ArrayList<ADHero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }

    public static void iterateAll(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }

    }

    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        iterate(hs);
        iterateAP(aphs);
        iterateAD(adhs);

        iterateAll(hs);
        iterateAll(aphs);
        iterateAll(adhs);
    }
}
