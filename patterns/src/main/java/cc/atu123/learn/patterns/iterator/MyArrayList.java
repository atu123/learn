package cc.atu123.learn.patterns.iterator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 10:45
 */
public class MyArrayList<E>  implements Collection<E>{
    E [] elementData;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {"A","B","C","D","E"};
    public MyArrayList(){
        this.elementData = (E[]) DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public Iterator iterator() {
        return new MyIterator(this);
    }

    public int size() {
        return elementData.length;
    }

    public E get(int i) {
        return elementData[i];
    }

    public boolean add(E e) {
        //elementData.
        return false;
    }
}
