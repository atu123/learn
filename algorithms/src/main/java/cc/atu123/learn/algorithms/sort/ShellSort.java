package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/18.
 */
public class ShellSort extends SortBase{
    public static void main(String[] args) {
        int [] array = {4,2,4,6,78,3,23,65,54,2,43,645};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int[] array){
        int arrayLength = array.length;
        int step = array.length/2;
        while (step>0){
            for (int group = 0; group < step; group++) {
                for (int index = group+step; index < arrayLength; index = index+step) {
                    if(array[index]<array[index-step]){
                        int target = array[index];
                        int point = index-step;
                        while (point>=group&&array[point]>target){
                            array[point+step] = array[point];
                            point-=step;
                        }
                        array[point+step] = target;
                    }
                }
            }
            step = step/2;
        }
    }

}
