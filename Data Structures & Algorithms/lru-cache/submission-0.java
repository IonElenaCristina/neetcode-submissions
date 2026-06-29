class Node{
     int key;
     int value;
     Node prev;
     Node next;
     Node(int key, int value){
        this.key=key;
        this.value = value;
        this.prev=null;
        this.next = null;
     }
}

class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.capacity= capacity;
        this.cache = new HashMap<>();
        this.left= new Node(0,0);
        this.right= new Node(0,0);
// La inițializare se creează o listă goală cu doar cele două noduri dummy legate între ele:
// left <———————> right
        this.left.next=this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

//     left <-> [vechi] <-> ... <-> [nou] <-> right
//  ↑                              ↑         ↑
// dummy                      insert aici   dummy
// (LRU end)                 (most recent)
    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;

    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
       if(cache.containsKey(key)){
         remove(cache.get(key));
       } 
       Node node = new Node (key,value);
       cache.put(key,node);
       insert(node);

       if(cache.size()>capacity){
        Node lru = this.left.next;
        remove(lru);
        cache.remove(lru.key);
       }
    }
}
