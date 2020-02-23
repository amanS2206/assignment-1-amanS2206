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

    private void addAfter(Node<Person> node, Person item) {
        node.next = new Node<>(item, node.next);
        size++;
    }

    public void add(int index, Person item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node<Person> temp = getNode(index - 1);
            addAfter(temp, item);
        }
    }


    @Override
    public void add(Person item) {
        add(size, item);
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
