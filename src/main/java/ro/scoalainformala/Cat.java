package ro.scoalainformala;

public class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + getName() + "', age=" + getAge() + ", furColor='" + furColor + "'}";
    }
}

