public class Ticket {
    private final Vehicle vehicle;
    private final int hoursParked;
    private final FeeStrategy feeStrategy;

    public Ticket(Vehicle vehicle, int hoursParked) {
        this.vehicle = vehicle;
        this.hoursParked = hoursParked;
        this.feeStrategy = FeeStrategyFactory.getFeeStrategy(vehicle);
    }

    public double calculateTotalFee() {
        return feeStrategy.calculateFee(hoursParked);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getHoursParked() {
        return hoursParked;
    }
}