public class OrderMeal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double totalSum;

    public OrderMeal() {
        this.burger = new Burger("Regular", 9000);
        this.drink = new Drink("Coke", 350);
        this.sideItem = new SideItem("Fries", 3000);
    }

    public OrderMeal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void addExtraToppings(String one) {
        this.burger.addExtras(one);
    }

    public void addExtraToppings(String one, String two) {
        this.burger.addExtras(one, two);
    }

    public void addExtraToppings(String one, String two, String three) {
        this.burger.addExtras(one, two, three);
    }

    public void addExtraToppings(String one, String two, String three, String four) {
        this.burger.addExtras(one, two, three, four);
    }

    public void addExtraToppings(String one, String two, String three, String four, String five) {
        this.burger.addExtras(one, two, three, four, five);
    }

    public void printTotal() {
        double drinkPrice = 0;
        double sideItem = 0;
        double burgerPrice = this.burger.getPrice();
        if (!this.burger.getType().equals("Deluxe")) {
            drinkPrice = this.drink.priceForSize(this.drink.getSize());
            sideItem = this.sideItem.getPrice();
        }
        totalSum = burgerPrice + drinkPrice + sideItem;
        System.out.println("Total = UGX " + totalSum);
    }

    @Override
    public String toString() {
        return "OrderMeal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                ", totalSum=" + totalSum +
                '}';
    }
}
