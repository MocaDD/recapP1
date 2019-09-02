public class Application {

    public static void main(String[] args) {

        Furniture f = new Furniture() {
        };
        Chair c1 = new Chair();
        Table t1 = new Table();
        PercentageRatio r = new PercentageRatio();

        System.out.println("The result for the Chair is: " + r.calculatePercentageRatio(c1));
        System.out.println("The result for the Furniture is: " + r.calculatePercentageRatio(f));
        System.out.println("The result for the Table is: " + r.calculatePercentageRatio(t1));
        System.out.println("The result for the Price is: " + r.calculatePercentageRatio(new Price()));
    }
}