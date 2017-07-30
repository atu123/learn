package cc.atu123.learn.algorithms.sort;

/**
 * Created by atu on 2017/7/27.
 */
public class CountingSort extends SortBase{
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0,3,3,3,1,0};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max)
                max = array[i];
            if(array[i]<min)
                min = array[i];
        }
        //计数数组大小
        int k = max-min+1;
        int [] count = new int[k];

        for (int i = 0; i < array.length; i++) {
            int point = 0;

        }
    }

}
