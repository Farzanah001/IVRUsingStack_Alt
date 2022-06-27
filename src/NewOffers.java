public enum NewOffers {
    OPTION_1("1.265=UL call+1GB/D,28D"), OPTION_2("2.479=UL call+1.5GB/D,56D"),
    OPTION_3("3.299=UL call+1.5GB/D28D"), OPTION_4("4.549=UL call+25GB/D,56D"),
    OPTION_5("9.Back"),
    OPTION_6("0.Exit");

    private final String text;

    NewOffers(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}
