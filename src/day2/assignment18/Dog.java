package day2.assignment18;

public class Dog extends Animal implements PetAnimal {
    public Dog(String name) {
        this.setName(name);
    }

    @Override
    public void beFriendly() {
        System.out.println(this.getName() + " is being friendly");
    }

    @Override
    public void playWithHumans() {
        System.out.println(this.getName() + " is playing with you");
    }
}
