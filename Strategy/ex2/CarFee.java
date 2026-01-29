public class CarFee implements FeeStrategy {
    private static final double CAR_FEE_RATE = 10000; // 10% fee for cars

    @Override
    public double calculateFee(int hours) {
        return hours * CAR_FEE_RATE;
    }
}