package workwithgraphs;

import java.util.HashMap;
import java.util.Map;

public class GraphsTheory {
    public static void main(String[] args) {
        Map<String, String[]> graph = new HashMap<>();
        graph.put("you", new String[]{"alice", "bob", "clarie"});
        graph.put("bob", new String[] {"anuj", "peggy"});
        graph.put("alice", new String[]{"peggy"});
        graph.put("clarie", new String[]{"tom", "jonny"});
        graph.put("anuj", new String[]{});
        graph.put("peggy", new String[]{});
        graph.put("thom", new String[]{});
        graph.put("jonny", new String[]{});
    }
}
