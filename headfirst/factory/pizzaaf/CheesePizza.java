package headfirst.factory.pizzaaf;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory2 ingredientFactory;
 
    public CheesePizza(PizzaIngredientFactory2 ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}