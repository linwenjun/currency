package cn.wenjun.learning;

public class Franc extends Currency{
    private static double EXCHANGE_RATE = 0.5;

    public Franc(int amount) {
        super(amount);
    }

    @Override
    public double getExchangeRate() {
        return EXCHANGE_RATE;
    }
}
