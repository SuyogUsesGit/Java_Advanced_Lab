package day4.assignment33;

public class StringMock {
    String capacity;

    public StringMock() {
    }

    public StringMock(String capacity) {
        this.capacity = capacity;
    }

    @Deprecated
    public static int search(String string, char searchItem) {
        char[] charArray = string.toCharArray();
        for(int i=0; i<charArray.length; i++) if(charArray[i] == searchItem) return i;
        return -1;
    }
}

class TestStringMock {
    public static void main(String[] args) {
        StringMock stringMock = new StringMock();
        String message = "What's in the name";

        System.out.println(stringMock.search(message, 'p'));
    }
}
