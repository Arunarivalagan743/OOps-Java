package Genrics;
class CustomArrayList {

    private int[] data;   // internal array to store elements
    private int size;     // number of elements present

    // default constructor
    public CustomArrayList() {
        data = new int[5];   // initial capacity
        size = 0;
    }

    // add element at the end
    public void add(int value) {
        // if array is full, grow it
        if (size == data.length) {
            resize();
        }
        data[size] = value;
        size++;
    }

    // get element by index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    // remove element by index
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int removed = data[index];

        // shift elements left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return removed;
    }

    // returns current size
    public int size() {
        return size;
    }

    // increase array size
    private void resize() {
        int[] newData = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }
}
