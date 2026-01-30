import java.util.Random;

public class SniperHeadshotStrategy implements AbilityStrategy {

    private final Random random = new Random();

    @Override
    public void executeAbility(String targetName) {
        System.out.println(
            "Dang nin tho, tinh toan suc gio va khoang cach toi " + targetName + "..."
        );

        int accuracy = random.nextInt(100) + 1; 

        if (accuracy > 90) {
            System.out.println(
                "HEADSHOT! Sat thương chi mang (Critical Hit)."
            );
        } else if (accuracy > 50) {
            System.out.println(
                "Trung vai. Sat thuong binh thuong."
            );
        } else {
            System.out.println(
                "Vien dan suot qua tai. Ke dich da phat hien vi tri!"
            );
        }
    }
}
