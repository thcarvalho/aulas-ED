public class Product {
    private int ID;
    private String name;
    private double value;
    private int quantity;

    //Alocando endereços de memória através do construtor
    public Product(String name, double value, int quantity) {
        this.ID = 0;
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
