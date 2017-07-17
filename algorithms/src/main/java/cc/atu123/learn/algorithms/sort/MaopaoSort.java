package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class MaopaoSort extends SortBase{
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
