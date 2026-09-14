package Leetcode;

import java.util.HashMap;

public class LFU_Cache {
    //stores the key value pair
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    //stores DLL for each freq
    class DLL {
        Node head;
        Node tail;

        public DLL() {
            head = new Node(-1, -1);
            tail = new Node(-1, -1);

            head.next = tail;
            tail.prev = head;
        }

        public void addNode(Node newNode) {
            Node temp = head.next;
            newNode.next = temp;
            newNode.prev = head;
            head.next = newNode;
            temp.prev = newNode;
        }

        public void deleteNode(Node delNode) {
            Node delPrev = delNode.prev;
            Node delNext = delNode.next;
            delPrev.next = delNext;
            delNext.prev = delPrev;
        }

        public boolean isEmpty() {
            return head.next == tail;
        }
    }

    //stores the freq of key
    HashMap<Integer, Integer> freq = new HashMap<>();
    //key will be a freq and it will store all the keys that are having freq as key
    HashMap<Integer, DLL> map = new HashMap<>();
    HashMap<Integer, Node> exactNode = new HashMap<>();
    int cap;
    int minFreq;

    public LFU_Cache(int capacity) {
        cap = capacity;
        minFreq = 0;
    }

    public int get(int key) {
        if (!freq.containsKey(key))
            return -1;
        else {
            // int f = freq.get(key);
            // DLL temp = map.get(f);
            // Node currNode = exactNode.get(key);
            // int value = currNode.val;
            // temp.deleteNode(currNode);
            // if (f == minFreq && temp.isEmpty()) {
            //     minFreq++;
            // }
            // int newF = f + 1;
            // freq.put(key, newF);
            // if (!map.containsKey(newF)) {
            //     map.put(newF, new DLL());
            // }
            // DLL newDll = map.get(newF);
            // Node newNode = new Node(key, value);
            // newDll.addNode(newNode);
            // exactNode.put(key, newNode);
            // return value;
            return updateFreq(key);
        }
    }

    public void put(int key, int value) {
        if (freq.containsKey(key)) {
            Node currNode = exactNode.get(key);
            currNode.val = value;
            updateFreq(key);
            return;
        }
        if (freq.size() == cap) {
            DLL temp = map.get(minFreq);
            Node currNode = temp.tail.prev;
            temp.deleteNode(currNode);
            freq.remove(currNode.key);
            exactNode.remove(currNode.key);
        }
        minFreq = 1;
        freq.put(key, 1);
        if (!map.containsKey(1)) {
            map.put(1, new DLL());
        }
        DLL temp = map.get(1);
        Node newNode = new Node(key, value);
        temp.addNode(newNode);
        exactNode.put(key, newNode);

    }

    public int updateFreq(int key) {
        int f = freq.get(key);
        DLL temp = map.get(f);
        Node currNode = exactNode.get(key);
        int value = currNode.val;
        temp.deleteNode(currNode);

        if (f == minFreq && temp.isEmpty()) {
            minFreq++;
        }

        int newF = f + 1;
        freq.put(key, newF);
        if (!map.containsKey(newF)) {
            map.put(newF, new DLL());
        }
        DLL newDll = map.get(newF);
        newDll.addNode(currNode); 
        exactNode.put(key, currNode);
        return value;
    }
    public static void main(String[] args) {
        LFU_Cache obj=new LFU_Cache(2);
        obj.put(1,1);
        obj.put(2,2);
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

