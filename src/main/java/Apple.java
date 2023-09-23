public class Apple implements Eatable {
    private boolean isPoisoned;

    public Apple(boolean isPoisoned) {
        this.isPoisoned = isPoisoned;
    }

    public Apple() {
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
