// RewardValue.java
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Getter method for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for milesValue
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method: miles to cash at a rate of 0.0035
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    // Conversion method: cash to miles at a rate of 0.0035
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}
