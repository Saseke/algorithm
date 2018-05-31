package datastructure.linear;

/**
 * 单链表
 * @author Yoke
 * @date 18-5-30 上午8:32
 */
public class LinkedList<E> {

    private Node header;
    private int size = 0;

    public LinkedList() {
        this.header = new Node();
    }

    /**
     * 得到指定位置的节点
     */
    private Node getNode(int index) {
        validateIndex(index);
        Node node = header;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    /**
     * 得到指定位置节点的元素
     */

    public E get(int index) {
        Node node = getNode(index);
        return node.e;
    }


    /**
     * 添加元素节点
     */
    public boolean insert(E e) {
        if (this.size == 0) {
            header = new Node(e);
        } else {
            Node node = getNode(this.size - 1);
            node.next = new Node(e);
        }
        this.size++;
        return true;
    }


    /**
     * 在指定位置添加元素
     */
    public boolean insert(int index, E e) {
        validateIndex(index);
        if (index + 1 == size) {
            insert(e);
            return true;
        } else {
            Node pre = getNode(index);
            Node next = getNode(index + 1);
            Node node = new Node(e);
            pre.next = node;
            node.next = next;
            return true;
        }
    }

    /**
     * 删除某个节点
     */
    public boolean deleteNode(int index) {
        validateIndex(index);
        Node node = getNode(index);
        if (index == 0) {
            this.header = getNode(index + 1);
            this.size--;
            return true;
        }
        Node pre = getNode(index - 1);
        if (node.next == null) {
            pre.next = null;
        } else {
            pre.next = getNode(index + 1);
        }
        this.size--;
        return true;
    }

    /**
     * 设置某个索引的值
     */
    public boolean set(int index, E e) {
        validateIndex(index);
        Node node = getNode(index);
        node.e = e;
        return true;
    }


    /**
     * 得到链表的大小
     */
    public int size() {
        return this.size;
    }

    /**
     * 判断数组是否满足条件
     */
    private void validateIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("数组越界:" + index);
        }
    }

    private class Node {
        private E e;
        Node next;

        Node() {
        }

        Node(E e) {
            this.e = e;
        }
    }
}
