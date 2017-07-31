package cc.atu123.learn.algorithms.sort;

/**
 * Created by atu on 2017/7/27.
 */
public class CountingSort extends SortBase{
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0,3,3,3,1,0};
        print("原数组：",array);
        print("排序后：",sort(array));
    }

    public static int[] sort(int[] array){
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

        //计算每个元素的个数
        for (int i = 0; i < array.length; i++) {
            count[array[i]] += 1;
        }

        //根据已计算的数目，前面元素的数目相加，计算位置
        for (int i = 1; i < k; i++) {
            count[i] += count[i-1];
        }

        int [] result = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {//倒序，值相同的元素保留原来顺序
            result[count[array[i]]-1] = array[i];
            count[array[i]]--;
        }
        return result;
    }
}
