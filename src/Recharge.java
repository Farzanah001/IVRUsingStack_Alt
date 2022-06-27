public enum Recharge {
    OPTION_1("1.Recharge through Airtel Payments Bank Account"), OPTION_2("2.Coupon Recharge"), OPTION_3("9.Back"),
    OPTION_4("0.Exit");

    private final String text;

    Recharge(final String text) {

        this.text = text;
    }

    public String toString() {

        return text;
    }
}
