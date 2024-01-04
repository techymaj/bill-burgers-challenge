public class Burger {
    private String type;
    private double price;
    private boolean extras;
    private String extraOne;
    private String extraTwo;
    private String extraThree;
    private String extraFour;
    private String extraFive;
    private boolean isDeluxe;

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public boolean isDeluxe() {
        return isDeluxe;
    }

    public void setDeluxe(boolean deluxe) {
        isDeluxe = deluxe;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    public String getExtraOne() {
        return extraOne;
    }

    public void setExtraOne(String extraOne) {
        this.extraOne = extraOne;
        if (!this.isDeluxe) {
            this.price += 500;
        }
    }

    public String getExtraTwo() {
        return extraTwo;
    }

    public void setExtraTwo(String extraTwo) {
        this.extraTwo = extraTwo;
        if (!this.isDeluxe) {
            this.price += 500;
        }
    }

    public String getExtraThree() {
        return extraThree;
    }

    public void setExtraThree(String extraThree) {
        this.extraThree = extraThree;
        if (!this.isDeluxe) {
            this.price += 500;
        }
    }

    public String getExtraFour() {
        return extraFour;
    }

    public void setExtraFour(String extraFour) {
        this.extraFour = extraFour;
    }

    public String getExtraFive() {
        return extraFive;
    }

    public void setExtraFive(String extraFive) {
        this.extraFive = extraFive;
    }

    public void addExtras(String one) {
        setExtras(true);
        setExtraOne(one);
    }

    public void addExtras(String one, String two) {
        setExtras(true);
        setExtraOne(one);
        setExtraTwo(two);
    }

    public void addExtras(String one, String two, String three) {
        setExtras(true);
        setExtraOne(one);
        setExtraTwo(two);
        setExtraThree(three);
    }

    public void addExtras(String one, String two, String three, String four) {
        setExtras(true);
        setExtraOne(one);
        setExtraTwo(two);
        setExtraThree(three);
    }

    public void addExtras(String one, String two, String three, String four, String five) {
        setExtras(true);
        setExtraOne(one);
        setExtraTwo(two);
        setExtraThree(three);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", extras=" + extras +
                ", extraOne='" + extraOne + '\'' +
                ", extraTwo='" + extraTwo + '\'' +
                ", extraThree='" + extraThree + '\'' +
                '}';
    }
}
