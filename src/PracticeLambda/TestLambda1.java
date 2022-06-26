package PracticeLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("使用匿名类的方式，筛选出 hp>100 && damange<50的英雄");

        HeroChecker checker = new HeroChecker() {
            @Override
            public boolean test(Hero h) {
                return h.hp > 100 && h.damage < 50;
            }
        };

        filter(heros, checker);

        System.out.println("使用Lambda的方式，筛选出 hp>100 && damange<50的英雄");

        filter(heros, h -> h.hp > 100 && h.damage < 50);

        filter(heros, TestLambda1::testHero);

        heros
                .stream()
                .distinct()
                .forEach(System.out::println);

    }

    private static void filter(List<Hero> heros, HeroChecker checker) {
        for (Hero hero : heros) {
            if (checker.test(hero)) {
                System.out.println(hero);
            }
        }
    }

    private static boolean testHero(Hero h) {
        return h.hp>100 && h.damage<50;
    }

}
