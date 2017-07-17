package cc.atu123.learn.algorithms.recursion;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/6/8
 * Time: 15:34
 */
public class FilterService{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 5, 6, 0, 2, 0, 1, 4};
        int []result =  FilterArrayByFilter(array, new NotZeroFilter());
        print("result ",result);
    }


    /**
     * Filter array by filter int [ ].
     *
     * @param arr the arr
     * @param f   the f
     * @return the int [ ]
     */
    static int [] FilterArrayByFilter(int[] arr, Filter f){
        if (arr.length==1) {
            if(f.test(arr[0]))
                return arr;
            else
                return null;
        }else {
            int cutor = arr.length / 2-1;
            int[] tmp1 = FilterArrayByFilter(subArray(arr,0,cutor), f);
            int[] tmp2 = FilterArrayByFilter(subArray(arr,cutor+1,arr.length-1), f);
            return concatArray(tmp1,tmp2);
        }
    }

    /**
     * The type Not zero filter.
     */
    static class NotZeroFilter implements Filter{
        public boolean test(int i) {
            if(i>0){
                return true;
            }
            return false;
        }
    }

    /**
     * The interface Filter.
     */
    interface Filter {
        boolean test(int i);
    }

    public static void print(String title,int [] array){
        System.out.println(title);
        for (int integer : array) {
            System.out.print(integer+"\t");
        }
        System.out.println();
    }

    static int[] concatArray(int[] a, int[] b) {
        int[] c;
        if(a==null&&b==null){
            return null;
        }else if(b==null){
            return a;
        }else if(a==null){
            return b;
        }else{
            c = new int[a.length+b.length];
            System.arraycopy(a, 0, c, 0, a.length);
            System.arraycopy(b, 0, c, a.length, b.length);
            return c;
        }
    }

    static int[] subArray(int[] a, int begin, int end) {
        int[] c= new int[end-begin+1];
        System.arraycopy(a, begin, c, 0,c.length);
        return c;
    }
}

