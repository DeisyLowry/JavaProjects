package org.example.LRUCache;

import java.util.HashMap;

class Entry {
    int key, value;
    Entry left, right;

    public Entry(int key, int value){
        this.key = key;
        this.value = value;
        left = null;
        right = null;
    }
}
public class LRUCache {

    int capacity;
    Entry start, end;
    HashMap<Integer, Entry> hashMap;

    public LRUCache(int capacity){
        this.capacity = capacity;
        hashMap = new HashMap<Integer, Entry>(capacity);
    }

    public int get(int key){
        if(hashMap.containsKey(key)){
            Entry entry = hashMap.get(key);
            removeNode(entry);
            addToTop(entry);
            return entry.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            Entry entry = hashMap.get(key);
            removeNode(entry);
            addToTop(entry);

        } else {
            Entry newNode = new Entry(key, value);
            if(hashMap.size() >= capacity)
            {
                hashMap.remove(end.key);
                removeNode(end);
                addToTop(newNode);
            }
            else {
                addToTop(newNode);
            }
            hashMap.put(key, newNode);
        }
    }

    public void removeNode(Entry node){
        if(node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }
        if(node.right != null) {
            node.right.left = node.left;
        } else {
            end = node.left;
        }

    }
    public void addToTop(Entry node){
        node.right = start;
        node.left = null;
        if(start != null)
            start.left = node;
            start = node;
            if(end == null)
                end= start;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        System.out.println("Hello World");
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));



    }

}
