package other;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T>{

    private final List<T> list = new ArrayList<>();

    public void add (T obj) {
        list.add(obj);
    }

    public T remote() {
        T result = list.get(0);
        list.remove(list.get(0));
        return result;
    }
}
