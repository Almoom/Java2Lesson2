package JavaCore;

public class Main {

    public static void main(String[] args) {
	    Object[][] arr = {{1, 1, 1, 1},{1 , 1, 1, 1},{1, 1, 1, 1},{1, 1, 1, 'k'}};
	    accordance(arr);

    }

    public static void accordance (Object[][] arr){
        int x = arr.length;
        int y = arr[x-1].length;
        if (x != 4 || y != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].toString().matches("[^0-9]")) sum += (int)arr[i][j];
                else throw new MyArrayDataException(i, j);
            }
        }
        System.out.println(sum);




    }
}
