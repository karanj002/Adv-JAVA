package Interface;

public class PizzaSimple extends SimplePizzaint {
    private double price;
    private String name;

    public PizzaSimple(String name, double price) {
        super(price, name);
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}