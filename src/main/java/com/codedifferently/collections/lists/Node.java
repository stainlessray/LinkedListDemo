package com.codedifferently.collections.lists;

public class Node<E> {

    private E value;
    private Node<E> next;


    public Node(E value) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Boolean hasNext() {
        /*if (next != null) {
            return true;
        }*/
        return (next != null);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
