package cn.wenjun.learning;

public abstract class Currency {
    protected double amount;

    public double getAmount() {
        return amount;
    }

    public Currency(double amount) {
        this.amount = amount;
    }

    public double getDollarAmount() {
        return amount * this.getExchangeRate();
    }

    public abstract double getExchangeRate();

    public <T extends Currency> Dollar add(T money) {
        return new Dollar(money.getDollarAmount() + this.getDollarAmount());
    }
}
