public enum MainMenu {
    OPTION_1("1.Recharge"), OPTION_2("2.Caller_Tune"), OPTION_3("3.DTH"), OPTION_4("4.New Offers"),
    OPTION_5("9-Back"), OPTION_6("0.Exit");

    private final String text;

    MainMenu(final String text) {
        this.text = text;
    }


    public String toString() {
        return text;
    }
}
