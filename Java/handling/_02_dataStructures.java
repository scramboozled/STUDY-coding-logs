package handling;

import java.util.*; 

public class _02_dataStructures {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // 2. HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 20);
        System.out.println("HashMap: " + map);

        // 3. HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored
        System.out.println("HashSet: " + set);

        // 4. Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println("Pop from Stack: " + stack.pop());

        // 5. Queue (LinkedList implementation)
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Remove from Queue: " + queue.remove());

        // 6. Dictionary (using Hashtable)
        Dictionary<String, String> dict = new Hashtable<>();
        dict.put("A", "Apple");
        dict.put("B", "Banana");
        System.out.println("Dictionary: " + dict);

        // 7. Graph (Adjacency List using HashMap)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4)));
        graph.put(3, new ArrayList<>(Arrays.asList(4, 5)));
        graph.put(4, new ArrayList<>());
        graph.put(5, new ArrayList<>());

        System.out.println("Graph (Adjacency List):");
        for (int node : graph.keySet()) {
            System.out.println(node + " -> " + graph.get(node));
        }
    }
}
