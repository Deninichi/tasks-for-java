import java.util.Arrays;

/**
 * Created by Пользователь on 13.12.2015.
 */
public class CoupArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 7, 12, 6};

        for (int i=0; i < array.length/2; i++){
            int tmp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length-1 - i] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
