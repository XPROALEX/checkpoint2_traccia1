public class Yogurt implements Eatable, Drinkable {
    private boolean isPoisoned;
    @Override
    public void onDrink(Person person) {
        person.setThirst(person.getThirst() - 1);
    }

    @Override
    public void onEat(Person person) {
        person.setHunger(person.getHunger() - 1);
    }

    @Override
    public boolean isPoisoned() {
        return isPoisoned;
    }
}
