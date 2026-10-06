class LRUCache {
  private class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }
private int capacity;
    private Node head, tail;
    private int size;

    public LRUCache(int capacity) {
           this.capacity = capacity;
        this.size = 0;
        head = null;
        tail = null;
    }
      private void addToHead(Node node) {
        node.prev = null;
        node.next = head;
        if (head != null)
            head.prev = node;
        head = node;
        if (tail == null)
            tail = head;
    }
      private Node findNode(int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.key == key)
                return curr;
            curr = curr.next;
        }
        return null;
    }
    
    public int get(int key) {
         Node node = findNode(key);
        if (node == null) return -1;
        remove(node);
        addToHead(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */