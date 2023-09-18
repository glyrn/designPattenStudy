package builderPattern;

public class VegBurger extends Burger{

    @Override
    public float price() {
        return 25f;
    }

    @Override
    public String name() {
        return "vegBurger";
    }
}
