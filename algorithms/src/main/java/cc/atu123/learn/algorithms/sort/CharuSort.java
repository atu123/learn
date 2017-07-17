package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class CharuSort {
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int now = array[i];
            int point = i;
            while (point>0&&now<array[point-1]){
                array[point] = array[point-1];
                point--;
            }
            array[point] = now;
        }
    }

    /**
     * Print.
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
}
