public class FeeStrategyFactory {
    public static FeeStrategy getFeeStrategy(Vehicle vehicle) {
        switch (vehicle) {
            case CAR -> {
                return new CarFee();
            }
            case MOTORBIKE -> {
                return new MotorbikeFee();
            }
            case BICYCLE -> {
                return new BicycleFee();
            }
            default -> throw new IllegalArgumentException("Unsupported vehicle type");
        }
    }
}