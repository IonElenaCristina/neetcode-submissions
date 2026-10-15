class MyHashSet {
    List<Integer> keys;

    public MyHashSet() {
        this.keys = new ArrayList<>();
    }

    public void add(int key) {
        if(!this.keys.contains(key)){
            this.keys.add(key);
        }
       
    }

    public void remove(int key) {
      
        this.keys.remove(Integer.valueOf(key));
        
    }

    public boolean contains(int key) {
        return this.keys.contains(key);
    }
}
