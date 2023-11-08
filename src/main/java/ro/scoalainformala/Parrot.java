package ro.scoalainformala;

public class Parrot extends Animal {
    private String featherColor;

    public Parrot(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Squawk!");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Parrot{" + "name='" + getName() + "', age=" + getAge() + ", featherColor='" + featherColor + "'}";
    }
}

