public enum DthRecharge {
    OPTION_1("1.Airtel DTH HD Plan Rs.251=49Channels+30D"), OPTION_2("2.Airtel DTH ₹ 285 Pack = 68 Channels+30D"),
    OPTION_3("3.Airtel DTH ₹ 252 Pack = 78 Channels+30D"), OPTION_4("9.Back"), OPTION_5("9.Exit");

    private final String text;

    DthRecharge(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
