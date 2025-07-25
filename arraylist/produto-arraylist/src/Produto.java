public class Produto {
    private String name;
    private double price;
    private int amount;

    public Produto(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " Preço: " + this.price + " Quantidade: " + this.amount;
    }
}
