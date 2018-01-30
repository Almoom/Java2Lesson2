package JavaCore;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Неверный размер массива");
    }
}
