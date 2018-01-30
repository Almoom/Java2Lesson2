package JavaCore;

public class Main {

    public static void main(String[] args) {
	    Object[][] arr = {{"aa", "bb", "cc", "dd"},{"1", "2", "3", "4"},{null, null, null, null},{'g', 'f', 1, 2}};
	    accordance(arr);

    }

    public static void accordance (Object[][] arr){
        int x = arr.length;
        int y = arr[x-1].length;
        if (x != 4 || y != 4) throw new MyArraySizeException();



    }
}
