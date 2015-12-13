/**
 * Created by Пользователь on 13.12.2015.
 */
public class AverageAndMax {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 12, 9, 7, 11,};
        float average = 0.F;
        int max = Integer.MIN_VALUE;

        for (int i=0; i < array.length; i++){
            average += array[i];
        }
        average = average/array.length;
        System.out.println(average);

        for (int i=0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }
}
