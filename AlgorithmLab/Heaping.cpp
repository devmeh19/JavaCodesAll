#include <iostream>
#include <vector>
#include <ctime>
#include <cstdlib>

using namespace std;

class DaryHeap {
private:
    vector<int> heap;
    int d; 
    int parent(int i) { return (i - 1) / d; }
    int child(int i, int k) { return d * i + k + 1; }
    void heapifyUp(int i) {
        while (i > 0 && heap[i] > heap[parent(i)]) {
            swap(heap[i], heap[parent(i)]);
            i = parent(i);
        }
    }

    void heapifyDown(int i) {
        int maxIndex = i;
        for (int k = 0; k < d; ++k) {
            int childIndex = child(i, k);
            if (childIndex < heap.size() && heap[childIndex] > heap[maxIndex]) {
                maxIndex = childIndex;
            }
        }
        if (maxIndex != i) {
            swap(heap[i], heap[maxIndex]);
            heapifyDown(maxIndex);
        }
    }

public:
    DaryHeap(int _d) : d(_d) {}
    void insert(int key) {
        heap.push_back(key);
        heapifyUp(heap.size() - 1);
    }
    int extractMax() {
        if (heap.empty()) {
            cout << "Heap is empty!\n";
            return -1;
        }
        int maxElement = heap[0];
        heap[0] = heap.back();
        heap.pop_back();
        heapifyDown(0);
        return maxElement;
    }

    void increaseKey(int i, int newKey) {
        if (newKey < heap[i]) {
            cout << "New key is smaller than current key!\n";
            return;
        }
        heap[i] = newKey;
        heapifyUp(i);
    }
    void printHeap() {
        cout << "Heap: ";
        for (int i = 0; i < heap.size(); ++i) {
            cout << heap[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    srand(time(0)); 
    DaryHeap maxHeap(3); 
    cout << "Inserting random numbers into the heap:\n";
    for (int i = 0; i < 10; ++i) {
        int randomNum = rand() % 100;
        maxHeap.insert(randomNum);
        cout << "Inserted: " << randomNum << endl;
    }
    maxHeap.printHeap();
    cout << "Extracted max: " << maxHeap.extractMax() << endl;
    maxHeap.printHeap();
    maxHeap.increaseKey(1, 80);
    maxHeap.printHeap();

    return 0;
}
