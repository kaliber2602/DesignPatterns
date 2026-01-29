public class BicycleFee implements FeeStrategy {
    private static final double BICYCLE_FEE_RATE = 2000; // 2% fee for bicycles

    @Override
    public double calculateFee(int hours) {
        return hours * BICYCLE_FEE_RATE;
    }
}