package cc.atu123.learn.patterns.iterator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 9:56
 */
public interface Collection<E> {
    public Iterator iterator();
    public int size();
    public E get(int i);
    public boolean add(E e);
}
