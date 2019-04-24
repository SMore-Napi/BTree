package tree;

public interface ITree<T> {
    public boolean add(T value);

    public T remove(T value);

    public boolean contains(T value);

    public int size();
}