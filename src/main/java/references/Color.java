package references;

public enum Color {
    red("RED"),
    blue("BLUE");

    public final String label;

    private Color(String label) {
        this.label = label;
    }
}
