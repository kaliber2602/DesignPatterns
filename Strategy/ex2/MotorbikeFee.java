public class MotorbikeFee implements FeeStrategy {
    private static final double MOTORBIKE_FEE_RATE = 5000; 

    @Override
    public double calculateFee(int hours) {
        return hours * MOTORBIKE_FEE_RATE;
    }
}