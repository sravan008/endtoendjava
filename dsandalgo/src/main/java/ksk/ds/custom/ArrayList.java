package ksk.ds.custom;

// size
// insert
// remove
// Search
// Lookup

public class ArrayList<E> {

    private static final int INITIAL_CAPACITY = 5;
    private Object data[];
    private int index;
    private int size;


    public ArrayList() {
        this.data = new Object[INITIAL_CAPACITY];
        this.size = INITIAL_CAPACITY;
    }


    public void add(Object obj) {
        if (this.index == this.size - 1) {
            increaseCapacity();
        }
        data[this.index] = obj;
        this.index++;
    }

    private void increaseCapacity() {
        this.size = this.size + INITIAL_CAPACITY;
        Object[] newData = new Object[this.size];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        this.data = newData;
    }

    public void remove(int item) {
        if (item > this.index - 1) {
            throw new ArrayIndexOutOfBoundsException("Check the index number again");
        }
        for (int x = item; x < this.data.length; x++) {
            data[x] = data[x + 1];
        }
        this.index--;
    }

    public Object get(int i) {
        if (i > this.index - 1) {
            throw new ArrayIndexOutOfBoundsException("check the index");
        }
        return this.data[i];
    }

    public static void main(String[] args) {

        ArrayList[] arrayLists = new ArrayList[12];
    }


}