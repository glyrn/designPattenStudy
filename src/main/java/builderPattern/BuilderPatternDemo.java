package builderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareMeal();
        System.out.println("vegMeal");
        System.out.println();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNV();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
