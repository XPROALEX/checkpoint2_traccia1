import java.util.Collection;

public class Person {
    private String name;
    private int hunger;
    private int thirst;

    public Person(String name, int hunger, int thirst) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void drink(Drinkable beverage) {
        beverage.onDrink(this);
    }

    public void eat(Eatable food) {
        if (food.isPoisoned()) {
            throw new RuntimeException("This food is poisoned.");
        }
        food.onEat(this);
    }

    public void haveLunch(Collection<Eatable> foods, Collection<Drinkable> drinks) {
        for (Eatable food : foods) {
            eat(food);
        }
        for (Drinkable beverage : drinks) {
            drink(beverage);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}


