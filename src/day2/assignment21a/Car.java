package day2.assignment21a;

public class Car {
    Tyre tyre;
    String name;

    public static void main(String[] args) {
        Car carMain = new Car();
        carMain.setFeatures(carMain);
    }

    void setFeatures(Car car) {
        Tyre tyre = new Tyre();
        car.setName("Swift");
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Tyre {

}