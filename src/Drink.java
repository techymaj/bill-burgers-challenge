public class Drink {
    private String type;
    private int size;
    private double price;

    public Drink(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double priceForSize(int size) {
        switch (size) {
            case 350:
                this.price = 1000;
                break;
            case 500:
                this.price = 2000;
                break;
            case 1000:
                this.price = 5000;
                break;
        }
        return this.price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
