#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Partition function to partition the array around a pivot
int partition(vector<int>& arr, int low, int high) {
    int pivot = arr[high]; // choose the last element as pivot
    int i = low - 1; // Index of smaller element

    for (int j = low; j <= high - 1; j++) {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++; // increment index of smaller element
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return i + 1; // return the index of pivot
}

// Function to find the ith smallest element using QuickSelect
int quickSelect(vector<int>& arr, int low, int high, int k) {
    if (k > 0 && k <= high - low + 1) {
        // Partition the array around a random pivot
        int pos = partition(arr, low, high);

        // If pivot itself is the ith smallest element
        if (pos - low == k - 1) {
            return arr[pos];
        }
        // If ith smallest element is in the left partition
        if (pos - low > k - 1) {
            return quickSelect(arr, low, pos - 1, k);
        }
        // If ith smallest element is in the right partition
        return quickSelect(arr, pos + 1, high, k - pos + low - 1);
    }
    // If k is out of range
    return INT_MAX;
}

// Function to find the ith smallest element
int findIthSmallest(vector<int>& arr, int k) {
    return quickSelect(arr, 0, arr.size() - 1, k);
}

int main() {
    vector<int> arr = {12, 3, 5, 7, 4, 19, 26};
    int k = 3; // find the 3rd smallest element
    cout << "The " << k << "rd smallest element is: " << findIthSmallest(arr, k) << endl;
    return 0;
}

