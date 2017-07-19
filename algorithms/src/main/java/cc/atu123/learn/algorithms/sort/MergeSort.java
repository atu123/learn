package cc.atu123.learn.algorithms.sort;

/**
 * Created by lichongwang on 2017/7/17.
 */
public class MergeSort extends SortBase {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0};
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
    public static void sort(int [] array,int begin,int end){
        if(begin>=end){
            return;
        }
        int cuter = (begin+end)/2;
        System.out.println("cuter: "+cuter);
        sort(array,begin,cuter);
        sort(array,cuter+1,end);
        merge(array, begin ,cuter, end);
    }

    /**
     * Merge.
     *
     * @param array the array
     * @param begin the begin
     * @param cuter the cuter
     * @param end   the end
     */
    public static void merge(int [] array, int begin, int cuter, int end){
        int[] tmp = array.clone();
        int pointer1 = begin;
        int pointer2 = cuter+1;
        for (int i = begin;i<=end;i++){
            if(pointer1<=cuter && pointer2<=end){
                if (tmp[pointer1] <= tmp[pointer2]) {
                    array[i] = tmp[pointer1++];
                }else{
                    array[i] = tmp[pointer2++];
                }
            }else if(pointer1<=cuter){
                array[i] = tmp[pointer1++];
            }else if(pointer2<=cuter){
                array[i] = tmp[pointer2++];
            }
        }
    }

}
