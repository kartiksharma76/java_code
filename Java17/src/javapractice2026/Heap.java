package javapractice2026;

public class Heap {

    private int[] array;
    private int size;

    /*
     * ALGORITHM : CONSTRUCTOR
     * 1. Heap ka array initialize karo
     * 2. Initial size = 0
     */
    public Heap() {
        array = new int[10];
        size = 0;
    }

    /*
     * ALGORITHM : INSERT (Min Heap)
     * 1. Agar heap full ho to return
     * 2. Data ko last index pe insert karo
     * 3. size increase karo
     * 4. Heap property maintain karne ke liye heapifyUp call karo
     */
    public void insert(int data) {
        if (size == array.length) {
            System.out.println("Heap Overflow");
            return;
        }

        array[size] = data;
        size++;
        heapifyUp(size - 1);
    }

    /*
     * ALGORITHM : HEAPIFY UP
     * 1. Jab tak index > 0 ho
     * 2. Agar current element parent se chhota ho
     * 3. Swap karo
     * 4. Index ko parent bana do
     */
    public void heapifyUp(int index) {
        while (index > 0 && array[index] < array[parent(index)]) {
            swap(index);
            index = parent(index);
        }
    }

    /*
     * ALGORITHM : SWAP
     * 1. Parent aur current index ke element ko swap karo
     */
    public void swap(int index) {
        int temp = array[parent(index)];
        array[parent(index)] = array[index];
        array[index] = temp;
    }

    /*
     * ALGORITHM : DELETE (Root element delete)
     * 1. Root element ko last element se replace karo
     * 2. size decrease karo
     * 3. Heap property ke liye heapifyDown call karo
     */
    public void delete() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return;
        }

        array[0] = array[size - 1];
        size--;
        heapifyDown(0);
    }

    /*
     * ALGORITHM : HEAPIFY DOWN
     * 1. Smallest element ka index find karo
     * 2. Left aur right child compare karo
     * 3. Agar parent smallest nahi hai to swap karo
     * 4. Recursively heapifyDown call karo
     */
    public void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && array[left] < array[smallest]) {
            smallest = left;
        }

        if (right < size && array[right] < array[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            int temp = array[index];
            array[index] = array[smallest];
            array[smallest] = temp;
            heapifyDown(smallest);
        }
    }

    /*
     * ALGORITHM : LEFT CHILD
     * left child = 2*i + 1
     */
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    /*
     * ALGORITHM : RIGHT CHILD
     * right child = 2*i + 2
     */
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    /*
     * ALGORITHM : PARENT
     * parent = (i - 1) / 2
     */
    private int parent(int i) {
        return (i - 1) / 2;
    }

    /*
     * ALGORITHM : DISPLAY
     * 1. Heap ke saare elements print karo
     */
    public void display() {
        System.out.println("Heap elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
