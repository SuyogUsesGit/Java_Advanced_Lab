package day2.assignment18;

public class Cat extends Animal implements PetAnimal {
    public Cat(String name) {
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
