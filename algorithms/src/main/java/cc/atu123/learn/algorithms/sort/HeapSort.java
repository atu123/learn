package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/19.
 */
public class HeapSort extends SortBase {
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0,3,3,3,1,0};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int[] array){
        int length = array.length;
        //init heap
        for (int i = (length-1)>>1; i >=0 ; i--) {
            maxHeapify(array, i, length);
        }

        //root 节点交换至最后，继续对剩余数据进行堆化，然后取出root节点放置尾部
        //swap(array, 0 ,length - 1 );
        for (int i = length; i > 0; i--) {
            swap(array, 0 ,i - 1 );
            maxHeapify(array, 0, i-1);
        }
    }

    public static void maxHeapify(int[] array, int index , int length){
        int leftIndex = (index<<1)+1;
        int rightIndex = leftIndex+1;
        int min = leftIndex;
        if (leftIndex>length-1){
            return;
        }
        if(rightIndex<length && array[rightIndex] > array[min]){
            min = rightIndex;
        }
        if(array[min] > array[index]){
            swap(array, index, min);
            maxHeapify(array, min, length);
        }
    }
}
