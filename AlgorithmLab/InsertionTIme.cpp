#include <iostream>
#include <vector>
#include <chrono> // for timing

using namespace std;
using namespace std::chrono;

// Function to perform insertion sort
void insertionSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

int main() {
    // Test cases
    vector<vector<int>> testCases = {
        {5, 2, 4, 6, 1, 3},  // Random
        {1, 2, 3, 4, 5, 6},  // Sorted
        {6, 5, 4, 3, 2, 1},  // Reverse sorted
        {5, 1, 2, 3, 4, 6},  // Almost sorted
        {3, 1, 4, 1, 5, 9}   // Random
    };

    // Perform insertion sort on each test case and measure running time
    for (int i = 0; i < testCases.size(); ++i) {
        vector<int> testCase = testCases[i];
        
        cout << "Test Case " << i + 1 << ": ";
        for (int num : testCase) {
            cout << num << " ";
        }
        cout << endl;

        // Measure running time
        auto start = high_resolution_clock::now();
        insertionSort(testCase);
        auto stop = high_resolution_clock::now();
        auto duration = duration_cast<microseconds>(stop - start);
        
        cout << "Sorted Array: ";
        for (int num : testCase) {
            cout << num << " ";
        }
        cout << endl;
        
        cout << "Running time: " << duration.count() << " microseconds" << endl;
        cout << endl;
    }

    return 0;
}
