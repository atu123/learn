package cc.atu123.learn.patterns.iterator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 11:26
 */
public class MyIterator<E> implements Iterator<E> {
    public Collection<E> collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }
    public E previous() {
        if(pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    public E next() {
        if(hasNext()){
            pos++;
        }
        return collection.get(pos);
    }

    public boolean hasNext() {
        if(collection.size()>pos+1){
            return true;
        }
        return false;
    }

    public E first() {
        pos = 0;
        return collection.get(pos);
    }
}
