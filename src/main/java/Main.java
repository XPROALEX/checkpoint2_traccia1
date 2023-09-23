import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 10, 10);
        System.out.println(alex.toString());
        HashSet<Eatable> foods = new HashSet<>();
        foods.add(new Apple(true));
        foods.add(new Yogurt());
        foods.add(new Apple());
        HashMap<String, Drinkable> drinks = new HashMap<>();
        drinks.put("coca", new Cola());
        drinks.put("Yogurt", new Yogurt());
        alex.haveLunch(foods, drinks.values());

        System.out.println(alex.toString());
    }
}
