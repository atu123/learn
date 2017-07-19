package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0,23,21,2,1,7,65,34,98};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int now = array[i];
            int point = i-1;
            while (point>=0&&now<array[point]){
                array[point+1] = array[point];
                point--;
            }
            array[point+1] = now;
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
