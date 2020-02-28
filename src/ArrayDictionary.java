public class ArrayDictionary implements Dictionary{
    private int capacity;
    private int count;
    private KVEntry[] entries;

    public ArrayDictionary(int capacity){
        this.capacity = capacity;
        entries = new KVEntry[capacity];
    }

    public int hashFunction(int key){
        return key%capacity;
    }

    @Override
    public boolean isEmpty(){
        return count==0;
    }

    public int getCount() {
        return count;
    }

    public boolean add(int key, int value){
        int hashedKey = hashFunction(key);

        //if there's not entry
        if(entries[hashedKey] == null){
            if(count == capacity){
                return false;
            }
            entries[hashedKey] = new KVEntry(key, value);
            count++;
            return true;
        }

        KVEntry ptr = entries[hashedKey];
        KVEntry pNewNode = null;
        while(ptr != null){
            if(ptr.key == key){
                ptr.value = value;
                return true;
            }
            pNewNode = ptr;
            ptr = ptr.next;
        }

        pNewNode.next = new KVEntry(key,value);
        return true;
    }
}
