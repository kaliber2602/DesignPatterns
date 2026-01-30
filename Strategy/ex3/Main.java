public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("=== Lan 1: dich o xa ===");
        hero.decideStrategy(200, 1);
        hero.attack("Enemy Alpha");

        System.out.println("\n=== Lan 2: dich dong ===");
        hero.decideStrategy(50, 10);
        hero.attack("Enemy Squad");

        System.out.println("\n=== Lan 3: dich o xa (random) ===");
        hero.decideStrategy(300, 2);
        hero.attack("Enemy Sniper");

        System.out.println("\n=== Lan 4: Khong kich lai (random) ===");
        hero.decideStrategy(80, 8);
        hero.attack("Enemy Base");
    }
}
