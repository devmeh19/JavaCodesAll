#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class MaxHeap {
private:
    vector<int> heap;

    // Helper functions to get parent and child indices
    int parent(int i) { return (i - 1) / 2; }
    int leftChild(int i) { return 2 * i + 1; }
    int rightChild(int i) { return 2 * i + 2; }

    // Helper function to heapify up
    void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(heap[i], heap[parent(i)]);
            i = parent(i);
        }
    }

    // Helper function to heapify down
    void heapifyDown(int i, int n) {
        int maxIndex = i;
        int l = leftChild(i);
        int r = rightChild(i);

        if (l < n && heap[l] > heap[maxIndex]) {
            maxIndex = l;
        }
        if (r < n && heap[r] > heap[maxIndex]) {
            maxIndex = r;
        }

        if (i != maxIndex) {
            swap(heap[i], heap[maxIndex]);
            heapifyDown(maxIndex, n);
        }
    }

public:
    // Function to insert a new element into the heap
    void insert(int key) {
        heap.push_back(key);
        int index = heap.size() - 1;
        heapifyUp(index);
    }

    // Function to delete the maximum element from the heap
    void deleteMax() {
        if (heap.empty()) {
            cout << "Heap is empty!" << endl;
            return;
        }
        swap(heap[0], heap.back());
        heap.pop_back();
        heapifyDown(0, heap.size());
    }

    // Function to perform heap sort
    void heapSort() {
        int n = heap.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyDown(i, n);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(heap[0], heap[i]);
            heapifyDown(0, i);
        }
    }

    // Function to print the heap
    void printHeap() {
        for (int i = 0; i < heap.size(); i++) {
            cout << heap[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    MaxHeap maxHeap;

    // Insert elements into the heap
    maxHeap.insert(10);
    maxHeap.insert(5);
    maxHeap.insert(20);
    maxHeap.insert(3);
    maxHeap.insert(8);

    cout << "Heap after insertions: ";
    maxHeap.printHeap();

    // Delete the maximum element
    maxHeap.deleteMax();
    cout << "Heap after deletion: ";
    maxHeap.printHeap();

    // Perform heap sort
    maxHeap.heapSort();
    cout << "Heap after heap sort: ";
    maxHeap.printHeap();

    return 0;
}
