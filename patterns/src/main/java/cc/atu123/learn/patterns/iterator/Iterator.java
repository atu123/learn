package cc.atu123.learn.patterns.iterator;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/20
 * Time: 9:55
 */
public interface Iterator<E> {
    public E previous();
    public E next();
    public boolean hasNext();
    public E first();
}
