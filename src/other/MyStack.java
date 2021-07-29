package other;

import java.util.ArrayList;
import java.util.List;


public class MyStack<T> {
    private final List<T> list = new ArrayList<>();

    public void add (T obj) {
        list.add(obj);
    }

    public T remote() {
        T result = list.get(list.size() -1);
        list.remove(list.get(list.size() -1));
        return result;
    }
}
