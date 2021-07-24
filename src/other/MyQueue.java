package other;

import java.util.ArrayList;
import java.util.List;

public class MyQueue{
    private final List<Object> list = new ArrayList<>();

    private void add (Object obj) {
        list.add(obj);
    }

    private Object remote() {
        Object result = list.get(0);
        list.remove(list.get(0));
        return result;
    }
}
