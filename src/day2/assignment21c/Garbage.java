package day2.assignment21c;

public class Garbage {
    String garbageLocation;
    Garbage garbage;

    public static void main(String[] args) {
        Garbage garbage1 = new Garbage();

        garbage1.garbage = new Garbage();
        garbage1.garbageLocation = "Mysore";
        garbage1.garbage.garbageLocation = "Hootagalli";
        garbage1.garbage.garbage = garbage1;
        garbage1.garbage.garbage = null; // Line 1
        garbage1.garbage = null;        // Line 2
        garbage1 = null;                // Line 3
    }
}
