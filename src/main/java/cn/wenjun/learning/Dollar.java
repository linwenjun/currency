package cn.wenjun.learning;

public class Dollar extends Currency {
    private static double EXCHANGE_RATE = 1;

    public Dollar(double amount) {
        super(amount);
    }

    @Override
    public double getExchangeRate() {
        return EXCHANGE_RATE;
    }

}
