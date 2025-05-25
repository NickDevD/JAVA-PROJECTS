public class Product {
    private int id;
    private String name;
    private double value;

    public Product(int id, String name, double value){
        this.id = id;
        this.name = name;
        this.value = value;
    }
    public Product(){

    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
