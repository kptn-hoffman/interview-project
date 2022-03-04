package references;

public class ReferenceExample {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setColor(Color.blue);
        Rectangle r2 = r1;
        r2.setColor(Color.red);

        System.out.println("r1 = " + r1.getColor());
        System.out.println("r2 = " + r2.getColor());
    }

}
