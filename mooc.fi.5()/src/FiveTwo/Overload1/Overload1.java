package FiveTwo.Overload1;

public class Overload1 {

    public static void main(String[] args) {

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

    }

}
