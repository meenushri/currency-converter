public class CurrencyConverter {

    static final double USD_TO_INR = 83.0;
    static final double EUR_TO_INR = 90.0;

    public double inrToUsd(double amount) {
        return amount / USD_TO_INR;
    }

    public double inrToEur(double amount) {
        return amount / EUR_TO_INR;
    }

    public double usdToInr(double amount) {
        return amount * USD_TO_INR;
    }

    public double eurToInr(double amount) {
        return amount * EUR_TO_INR;
    }

    public double usdToEur(double amount) {
        return (amount * USD_TO_INR) / EUR_TO_INR;
    }

    public double eurToUsd(double amount) {
        return (amount * EUR_TO_INR) / USD_TO_INR;
    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        System.out.println("100 INR to USD: " + cc.inrToUsd(100));
        System.out.println("1 USD to INR: " + cc.usdToInr(1));
        System.out.println("100 INR to EUR: " + cc.inrToEur(100));
        System.out.println("1 EUR to INR: " + cc.eurToInr(1));
        System.out.println("1 USD to EUR: " + cc.usdToEur(1));
        System.out.println("1 EUR to USD: " + cc.eurToUsd(1));
    }
}