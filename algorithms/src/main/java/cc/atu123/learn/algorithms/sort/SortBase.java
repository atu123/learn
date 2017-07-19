package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class SortBase {
    /**
     * Print.
     *
     * @param title the title
     * @param array the array
     */
    public static void print(String title,int [] array){
        System.out.println(title);
        for (int integer : array) {
            System.out.print(integer+"\t");
        }
        System.out.println();
    }

    public static void swap(int[] array,int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = array[index1];
    }
}
