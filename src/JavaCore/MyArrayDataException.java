package JavaCore;

public class MyArrayDataException extends RuntimeException {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyArrayDataException(int x, int y) {
        super("Сбой в ячейке " + x + " " + y);
    }
}
