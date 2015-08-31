package algo;

/**
 * Created by Kalvin on 8/19/2015.
 */
public class HashTable {
    private String[] storage;

    public HashTable(int size){
        this.storage = new String[size];
    }

    public void add(String input){
        storage[calculateHash(input)] = input;
    }
    public int calculateHash(String input){
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = hash * 31 + input.charAt(i);

        }
        return Math.abs(hash) % storage.length;
    }
}
