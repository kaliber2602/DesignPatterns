
import java.util.Random;

public class AerialBombardmentStrategy implements AbilityStrategy{
    private final Random random =new Random();
    @Override
    public void executeAbility(String targetName){
        System.out.println("Goi ho tro khong quan, may bay dang tiep can " + targetName + "...");
        boolean hit = random.nextBoolean();
        
        if(hit){
            System.out.println(
                "BOOM! " + targetName + " bi trung ten lua. Sat thuong dien rong."
            );
        } else {
            System.out.println(
                "Ten lua truot muc tieu do gio lon."
            );
        }
    }
}