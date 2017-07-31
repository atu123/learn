package cc.atu123.learn.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Bucket sort.
 */
public class BucketSort extends SortBase{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0,3,3,3,1,0};
        print("原数组：",array);
        sort(array,10);
        print("排序后：",array);
    }

    /**
     * Sort.
     *
     * @param array      the array
     * @param bucketsNum the buckets num
     */
    public static void sort(int[] array, int bucketsNum){
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max)
                max = array[i];
            if(array[i]<min)
                min = array[i];
        }
        
        List<List<Integer>> bucketList = new ArrayList<List<Integer>>();
        for (int i = 0 ; i < bucketsNum; i++) {
            bucketList.add(new ArrayList<Integer>());
        }
        for (int i : array) {
            bucketList.get(i/bucketsNum).add(i);
        }
        int index = 0;
        for (List<Integer> integers : bucketList) {
            if(integers.size()>0){
                //插入排序对桶内排序
                insertSort(integers);
                //结果回写至原数组
                for (Integer integer : integers) {
                    array[index++] = integer;
                }
            }
        }
    }

    private static void insertSort(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            int point = i;
            int target = list.get(i);
            while(point>0&&target<list.get(point-1)){
                list.set(point,list.get(point-1));
                point--;
            }
            list.set(point,target);
        }
    }
}
