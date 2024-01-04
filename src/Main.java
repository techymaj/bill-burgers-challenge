public class Main {
    public static void main(String[] args) {
        OrderMeal regular = new OrderMeal();
        regular.addExtraToppings("Chilli", "Eggs");
        regular.printTotal();
        System.out.println(regular);
        System.out.println("*".repeat(100));
        OrderMeal meal = new OrderMeal(
                new Burger("Hawaiian",12000),
                new Drink("Dew",500),
                new SideItem("Fries",3000)
        );
        meal.addExtraToppings("Cheese","Eggs", "Chilli");
        meal.printTotal();
        System.out.println(meal);
        System.out.println("*".repeat(100));
        OrderMeal deluxe = new OrderMeal(
                new DeluxeBurger("Deluxe"),
                new Drink("Sprite", 500),
                new SideItem("Fries",6000)
        );
        deluxe.addExtraToppings("Chilli","Eggs","Onions","tomatoes","Curry");
        deluxe.printTotal();
        System.out.println(deluxe);
    }
}
