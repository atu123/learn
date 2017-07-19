package cc.atu123.learn.algorithms.sort;

/**
 * 基数排序
 * Created by lichongwang on 2017/7/18.
 */
public class RadixSort extends SortBase {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int [] array = {405,1000,67,5,34,21,54,6,21,3,67,5565565,32};
        print("原数组：",array);
        sortLSD(array);
        print("LSD 排序后：",array);
        sortMSD(array,0,array.length-1,getMSDFirstRadix(array));
        print("MSC 排序后：",array);
    }

    /**
     * Sort lsd.
     *
     * @param array the array
     */
    public static void sortLSD(int[] array){
        if(array.length<2){
            return;
        }
        int lagest = array[0];
        for (int i = 1; i < array.length; i++) {//取数组内最大数
            if(array[i]>lagest)
                lagest = array[i];
        }
        int radix = 1;//初始化基数为1，代表个位
        while(lagest>=radix) {
            int[][] buckets = new int[10][array.length];
            int[] bucketCounts = new int[10]; //桶内计数器数组
            for (int i = 0; i < array.length; i++) {//分桶
                int bucketIndex = array[i]/radix % 10;
                buckets[bucketIndex][bucketCounts[bucketIndex]] = array[i];
                bucketCounts[bucketIndex] += 1;
            }

            int arrayPoint = 0;
            for (int i = 0; i < bucketCounts.length; i++) {//遍历各个桶，回归数组
                if (bucketCounts[i]==0) {//桶内计数器为零，则该桶无数据，continue
                    continue;
                }
                for (int j = 0; j < bucketCounts[i]; j++){
                    array[arrayPoint++] = buckets[i][j];
                }
            }
            radix *= 10;//基数进位
        }
    }

    /**
     * Sort msd.
     *
     * @param array the array
     * @param begin the begin
     * @param end   the end
     * @param radix the radix
     */
    public static void sortMSD(int[] array, int begin, int end, int radix){
        if(radix<1){
            return;
        }
        int[][] buckets = new int[10][end-begin+1];
        int[] bucketCounts = new int[10]; //桶内计数器数组
        for (int i = begin; i <= end; i++) {//分桶
            int bucketIndex = array[i]/radix % 10;
            buckets[bucketIndex][bucketCounts[bucketIndex]] = array[i];
            bucketCounts[bucketIndex] += 1;
        }
        radix = radix/10;
        int arrayPoint = begin;
        for (int i = 0; i < bucketCounts.length; i++) {//遍历各个桶，回归数组
            if (bucketCounts[i]==0) {//桶内计数器为零，则该桶无数据，continue
                continue;
            }
            for (int j = 0; j < bucketCounts[i]; j++){
                array[arrayPoint++] = buckets[i][j];
            }
        }
        int arrayPoint2 = begin;
        for (int i = 0; i < bucketCounts.length; i++) {//遍历各个桶，每个不为空的桶递归继续排序
            if (bucketCounts[i]==0) {//桶内计数器为零，则该桶无数据，continue
                continue;
            }
            int beginPoint = arrayPoint2;
            for (int j = 0; j < bucketCounts[i]; j++){
                arrayPoint2++;
            }

            sortMSD(array,beginPoint,arrayPoint2-1,radix);
        }
    }

    /**
     * Get msd first radix int.
     *
     * @param array the array
     * @return the int
     */
    static int getMSDFirstRadix(int []array){
        int lagest = array[0];
        for (int i = 1; i < array.length; i++) {//取数组内最大数
            if(array[i]>lagest)
                lagest = array[i];
        }
        int radix = 1;
        while (lagest>radix){
            radix *= 10;
        }
        return radix;
    }
}
