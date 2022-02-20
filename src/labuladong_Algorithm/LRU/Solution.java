package labuladong_Algorithm.LRU;

import java.util.HashMap;
import java.util.LinkedHashMap;

class LRUCache {
    public class Node {
        public int key, value;
        public Node next, prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public class DoubleList {
        private Node head, tail;
        private int size;

        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addLast(Node x) {
            x.prev = tail.prev;
            x.next = tail;
            tail.prev = x;
            size ++;
        }

        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size --;
        }

        public Node removeFirst() {
            if (head.next == tail) return null;
            Node first = head.next;
            remove(first);
            return first;
        }

        public int size() {
            return size;
        }
    }

    private HashMap<Integer, Node> map;
    private DoubleList cache;
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        makeRecently(key);
        return map.get(key).value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key, value);
            return;
        }
        if (cap == cache.size()) {
            // 删除最久未使用的
            removeLeastRecently();
        }
        addRecently(key, value);
    }

    // 将某个key提升为最近使用的
    private void makeRecently(int key) {
        Node x = map.get(key);
        cache.remove(x);
        cache.addLast(x);
    }

    private void addRecently(int key, int val) {
        Node x = new Node(key, val);
        cache.addLast(x);
        map.put(key, x);
    }
    private void deleteKey(int key) {
        Node x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }

    private void removeLeastRecently() {
        Node deleteNode = cache.removeFirst();
        int deleteKey = deleteNode.key;
        map.remove(deleteKey);
    }

}
class LRUCache_1 {
    private int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    public LRUCache_1(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        int value = cache.get(key);
        cache.remove(key);
        cache.put(key, value);
        return value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            cache.put(key, value);
            return;
        }
        if (cache.size() >= this.cap) {
            int oldestKey = cache.keySet().iterator().next(); // 第一个节点 最久未使用
            cache.remove(oldestKey);
        }
        cache.put(key, value);
    }
}
