package datastructure.linear;

/**
 * 线性表存储:
 * 优点：不用给元素之间的逻辑关系新添加额外的存储空间，可以快速的得到表中的某个数据O(1)
 * 缺点：插入和删除元素需要操作大量的元素,O(n)
 */
public class ArrayList<E> {
    private Object[] data = null;
    private int current;
    private int capacity;
    // 初始容量
    private static final int DEFAULT_CAPACITY = 10;

    ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    private ArrayList(int initSize) {
        if (initSize < 0) {
            throw new RuntimeException("数组大小错误" + initSize);
        } else {
            this.data = new Object[initSize];
            this.current = 0;
            this.capacity = initSize;
        }
    }

    public E get(int var1) {
        return (E) this.data[var1];
    }

    private void ensureCapacity(int cur) {
        if (cur == capacity) {
            this.capacity = this.capacity + 10;
            Object[] newData = new Object[capacity];
            System.arraycopy(data, 0, newData, 0, cur);
            this.data = newData;
        }
    }

    /**
     * 添加元素
     */
    void add(E e) {
        ensureCapacity(current);
        this.data[current] = e;
        current++;
    }

    /**
     * 验证下表是否合法
     */
    private void validateIndex(int index) {
        if (index < 0 || index > current)
            throw new IndexOutOfBoundsException("数组越界" + index);
    }

    /**
     * 指定插入元素的位置
     */
    public boolean addInsert(int index, E e) {
        ensureCapacity(current + 1);
        validateIndex(index);
        System.arraycopy(data, index + 1, data, index + 1 + 1, current - index);
        data[index] = e;
        return true;
    }

    /**
     * 删除指定下标的元素
     */
    public boolean deleteElement(int index) {
        validateIndex(index);
        System.arraycopy(data, index + 1, data, index, current - index);
        current--;
        return true;
    }

    /**
     * 返回队列的大小
     */
    public int size() {
        return this.current;
    }

    /**
     * 更改指定下标元素的数据e
     */
    public boolean set(int index, E e) {
        validateIndex(index);
        this.data[index] = e;
        return true;
    }

}
