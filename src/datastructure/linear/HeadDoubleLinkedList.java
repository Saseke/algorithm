package datastructure.linear;

/**
 * @author Yoke
 * @date 18-5-31 上午8:41
 */
public class HeadDoubleLinkedList<E> {

    private DNode header;

    private int size;

    public HeadDoubleLinkedList() {
        this.header = new DNode();
        this.header.prior = this.header;
        this.header.next = this.header;
    }

    /**
     * 得到指定索引的节点
     */
    public DNode getNode(int index) {
        validateIndex(index);
        DNode dNode = header;
        for (int i = 0; i < index; i++) {
            dNode = header.next;
        }
        return dNode;
    }

    /**
     * 得到某个索引处的数据
     */
    public E get(int index) {
        validateIndex(index);
        DNode dNode = getNode(index);
        return dNode.e;
    }

    /**
     * 添加节点
     */
    public boolean add(E e) {
        if (this.size == 0) {
            header.e = e;
        } else {
            DNode last = getNode(this.size - 1);
            DNode addNode = new DNode(e);
            last.next = addNode;
            addNode.prior = last;
            addNode.next = this.header;
        }
        size++;
        return true;
    }


    public boolean delete(int index) {
        validateIndex(index);
        if (index == 0) {
            this.header = this.header.next;
            this.header.prior = this.header;
        } else if (index == size - 1) {
            DNode newLast = getNode(index).prior;
            newLast.next = this.header;
        } else {
            DNode prior = getNode(index - 1);
            DNode next = getNode(index + 1);
            prior.next = next;
            next.prior = prior;
        }
        size--;
        return true;
    }


    public int size() {
        return this.size;
    }


    /**
     * 判断索引是否在合理范围之内
     */
    private void validateIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("数组越界:" + index);
        }
    }


    private class DNode {
        private E e;
        DNode prior;
        DNode next;

        DNode(E e) {
            this.e = e;
        }

        public DNode(E e, DNode prior, DNode next) {
            this.e = e;
            this.prior = prior;
            this.next = next;
        }

        DNode() {
        }
    }
}
