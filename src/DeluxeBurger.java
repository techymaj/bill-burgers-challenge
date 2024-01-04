public class DeluxeBurger extends Burger {
    private String extraFour;
    private String extraFive;
    private Drink fixedDrink;
    private SideItem fixedSideItem;

    public DeluxeBurger(String type) {
        super(type, 21000);
        super.setDeluxe(true);
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

    public Drink getFixedDrink() {
        return fixedDrink;
    }

    public void setFixedDrink(Drink fixedDrink) {
        this.fixedDrink = fixedDrink;
    }

    public SideItem getFixedSideItem() {
        return fixedSideItem;
    }

    public void setFixedSideItem(SideItem fixedSideItem) {
        this.fixedSideItem = fixedSideItem;
    }

    @Override
    public void addExtras(String one) {
        super.addExtras(one);
    }

    @Override
    public void addExtras(String one, String two) {
        super.addExtras(one, two);
    }

    @Override
    public void addExtras(String one, String two, String three) {
        super.addExtras(one, two, three);
    }

    public void addExtras(String one, String two, String three, String four) {
        super.addExtras(one, two, three);
        setExtraFour(four);
    }

    public void addExtras(String one, String two, String three, String four, String five) {
        super.addExtras(one, two, three);
        setExtraFour(four);
        setExtraFive(five);
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "extraFour='" + extraFour + '\'' +
                ", extraFive='" + extraFive + '\'' +
                "} " + super.toString();
    }
}
