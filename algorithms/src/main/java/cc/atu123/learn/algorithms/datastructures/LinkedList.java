package cc.atu123.learn.algorithms.datastructures;

public class LinkedList<E> {
    public void add(E element){

    }

    public void addFirst(E element){

    }

    private class Node<E>{
        E item;
        Node<E> pre;
        Node<E> next;
        Node(Node<E> pre,Node<E> next,E item){
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
}
