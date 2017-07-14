package cc.atu123.learn.algorithms.recursion;

import java.util.Arrays;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/6/8
 * Time: 15:34
 */
public class FilterService{
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 5, 6, 0, 2, 0, 1, 4};
        System.out.println(Arrays.toString(array));
        System.out.println("\nfilter result:");
        System.out.println(Arrays.toString( FilterArrayByFilter(array, new NotZeroFilter())));
    }
    static int[] FilterArrayByFilter(int[] arr, Filter f){
        //Arrays.stream();
        for (int i : arr) {
            
        }
        return FilterArrayByFilter(arr,f);
    }
    static class NotZeroFilter implements Filter{
        public boolean test(int i) {
            if(i>0){
                return true;
            }

            return false;
        }
    }
    interface Filter {
        boolean test(int i);
    }
}

