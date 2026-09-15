package Heap;

public class RealHeapMin {
private int []array;
private int size;

public RealHeapMin() {
	array = new int[10];
}
public void insert(int patientSeverity) {
    if (size == array.length) {
        System.out.println("Hospital Full! No more patients allowed.");
        return;
    }
		array[size]=patientSeverity;
		size++;
		heapifyup(size - 1);
	}
private void heapifyup(int index) {
	while(index > 0 && array[index] < array[parent(index)]) {
		swap(index);
		index = parent(index);
	}
	// TODO Auto-generated method stub
	
}

private void swap(int index) {
	// TODO Auto-generated method stub
	int temp = array[parent(index)];
	array[parent(index)]= array[index];
	array[index] = temp;
}
public void delete() {
	if(size==0) {
		System.out.println("No patient to treat");
		return;
	}
	System.out.println("Treating patient with severity");
	array[0]= array[size - 1];
	size--;
	heapifyDown(0);
}
private void heapifyDown(int index) {
	// TODO Auto-generated method stub
	 int smallest = index;
     int left = leftchlid(index);
     int right = rightchild(index);
     
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
private int rightchild(int i) {
	// TODO Auto-generated method stub
	  return 2 * i + 2;
}
private int leftchlid(int i) {
	// TODO Auto-generated method stub
	  return 2 * i + 1;
}
private int parent(int i) {
	// TODO Auto-generated method stub
	 return (i - 1) / 2;
}
public void display() {
	System.out.println("Current Patient Queue (Min Severity First):");
	for(int i =0;i<size;i++) {
		System.out.print(array[i]+ " ");
	}
	System.out.println();
}
}

