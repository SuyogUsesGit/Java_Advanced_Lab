package day2.assignment18;

public class Animal {
    private String name;

    public static void main(String[] args) {
        PetAnimal cat = new Cat("Blue");
        cat.beFriendly();
        cat.playWithHumans();

        PetAnimal dog = new Dog("Spike");
        dog.beFriendly();
        dog.playWithHumans();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
