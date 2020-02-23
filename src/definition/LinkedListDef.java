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


    private Person removeFirst() {
        Person response = null;
        Node<Person> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    private Person removeAfter(Node<Person> node) {
        Person response = null;
        Node<Person> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
            size--;
            response = temp.getData();
        }
        return response;
    }


    public Person remove(int index) {
        Person response = null;

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();
        } else {
            Node<Person> previousNode = getNode(index - 1);
            response = removeAfter(previousNode);
        }
        return response;
    }

    @Override
    public void remove() {
        remove(size);
    }

    public void remove(Person ob) {
        int ind = search(ob);
        remove(ind);
    }

    private int getindex(Node<Person> node) {
        int index = 0;
        Node<Person> nod = head;
        for (int i = 0; i < size; i++) {
            if (node.getData() == nod.getData()) {
                break;
            } else {
                nod = nod.getNext();
                index++;
            }
        }

        return index;
    }



    @Override
    public int search(Person item) {
        int response = -1;

        for (int i = 0; i < size; i++) {

            Person data = this.getNode(i).getData();

            if (item.equals(data)) {
                response = i;
                break;
            }
        }
        return response;
    }

    @Override
    public void print() {

    }

    private void swap(Node<E> firstNode, Node<E> secondNode) {
        Node<E> temp = firstNode;
        firstNode = secondNode;
        secondNode = temp;
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
