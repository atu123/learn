package cc.atu123.learn.algorithms.sort;

/**
 * The type Selection sort.
 */
public class SelectionSort extends SortBase {
    public static void main(String[] args) {
        int [] array = {8,2,5,3,4,6,7,1,9,0};
        print("原数组：",array);
        sort(array);
        print("排序后：",array);
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            System.out.println(min+"\t"+i);
            swap(array,min,i);
            print("排序后：",array);
        }
    }
}
