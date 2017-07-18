package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class QuickSort extends SortBase{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int [] array = {4,2,4,6,78,3,23,65,54,2,43,645};
        print("原数组：",array);
        sort(array,0,array.length-1);
        print("排序后：",array);
    }

    /**
     * Sort.
     *
     * @param array the array
     * @param begin the begin
     * @param end   the end
     */
    public static void sort(int[] array,int begin, int end){
        if(begin>=end){
            return;
        }
        int base = array[begin];
        int point1 = begin;
        int point2 = end;
        while (point1<point2){
            while (point1<point2  && array[point2]>base){
                point2--;
            }
            while (point1<point2 && array[point1]<=base){
                point1++;
            }
            if(point1<point2){
                swapVal(array,point1,point2);
            }
        }
        swapVal(array, begin, point2);
        sort(array, begin, point2 - 1);
        sort(array, point2+1, end);
    }

    /**
     * Swap val.
     *
     * @param array the array
     * @param a     the a
     * @param b     the b
     */
    public static void swapVal(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
