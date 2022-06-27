public enum CallerTune {
    OPTION_1("1.Late Night Talking-Harry Styles"), OPTION_2("2.Kill My Mind-Louis Tomnlinson"), OPTION_3("3.VIBEZ-Zayn"),
    OPTION_4("4.What Makes You Beautiful-One Direction"), OPTION_5("9.Back"), OPTION_6("0-Exit");

    private final String text;

    CallerTune(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
