import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket(Vehicle.BICYCLE, 3));
        tickets.add(new Ticket(Vehicle.MOTORBIKE, 2));
        tickets.add(new Ticket(Vehicle.CAR, 5));
        tickets.add(new Ticket(Vehicle.MOTORBIKE, 4));

        int totalRevenue = 0;

        for (Ticket ticket : tickets) {
            double fee = ticket.calculateTotalFee();
            System.out.println(
                "Xe: " + ticket.getVehicle() + " | So gio: " + ticket.getHoursParked() + " hours" +
                " | Phi: " + fee + " VND"
            );
            totalRevenue += fee;
        }

        System.out.println("---------------------------");
        System.out.println("Total fee: " + totalRevenue + " VNĐ");
    }
}
