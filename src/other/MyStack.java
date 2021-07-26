package other;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<Object> list = new ArrayList<>();

    public void add (Object obj) {
        list.add(obj);
    }

    public Object remote() {
        Object result = list.get(list.size() -1);
        list.remove(list.get(list.size() -1));
        return result;
    }
}
