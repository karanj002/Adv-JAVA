package Interface;

public interface PizzaSimpleInt {
    public String getName();

    public double getPrice();

    class PizzaSimple implements PizzaSimpleInt {
        public String name;
        public double price;

        public PizzaSimple(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
