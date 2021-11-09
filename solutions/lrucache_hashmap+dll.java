class LRUCache{
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode next;
        DLinkedNode prev;
    }

    public void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public void moveToHead(DLinkedNode node){
        removeNode(node);
        addNode(node);
    }

    public DLinkedNode popTail(){
        DLinkedNode reesult = node.prev;
        removeNode(result);
        return result;
    }

    
    private Map<Integer, DLinkedNode> cache = new HashMap();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();

        head.next = tail;
        tail.prev = head;
    }


    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value){
        DLinkedNode node = cache.get(key);
        if(node == null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);

            size++;

            if(size > capacity){
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
                size--;
            } 
        }
        else{
            node.value = value;
            moveToHead(node);
        }
    }
}
