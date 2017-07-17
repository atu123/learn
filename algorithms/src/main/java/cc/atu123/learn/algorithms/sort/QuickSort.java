package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class QuickSort extends SortBase{
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0};
        print("原数组：",array);
        sort(array,1,array.length-1);
        print("排序后：",array);
    }

    public static void sort(int[] array,int begin, int end){
        int tmp = array[0];
        int point1 = begin;
        int point2 = end;
        int t;
        while (point1<=point2){
            while (array[point1]<=tmp&&point1<=point2){
                //array[point1-1]
                point1++;
            }
            while (array[point2]>=tmp){
                point2--;
            }
            if(point1<point2){
                t = array [point1];
                array[point1] = array [point2];
                array[point2] = t;
            }
        }

    }
}
