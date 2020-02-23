package definition;

import adt.LinkedListADTInterface;

import java.util.Iterator;

public class LinkedListDef<E> implements LinkedListADTInterface<E>, Iterable<E> {
    public int size = 0;
    private Node<Person> head = null;


    private Node<Person> getNode(int index) {
        Node<Person> response = head;

        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }


    private void addFirst(Person item) {
        head = new Node<Person>(item, head);
        size++;
    }


    @Override
    public void add(Person item) {

    }

    @Override
    public int search(Person item) {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private E getData() {

            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}
