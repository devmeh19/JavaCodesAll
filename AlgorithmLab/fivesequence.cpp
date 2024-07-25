#include <iostream>
#include <vector>

using namespace std;

// Function to merge two sorted vectors into one sorted vector
vector<int> mergeSortedVectors(const vector<int>& v1, const vector<int>& v2) {
    vector<int> merged;
    int i = 0, j = 0;

    while (i < v1.size() && j < v2.size()) {
        if (v1[i] < v2[j]) {
            merged.push_back(v1[i]);
            i++;
        } else {
            merged.push_back(v2[j]);
            j++;
        }
    }

    // Add remaining elements from v1
    while (i < v1.size()) {
        merged.push_back(v1[i]);
        i++;
    }

    // Add remaining elements from v2
    while (j < v2.size()) {
        merged.push_back(v2[j]);
        j++;
    }

    return merged;
}

// Function to merge five sorted sequences into a single sorted sequence
vector<int> mergeFiveSortedSequences(const vector<vector<int>>& sequences) {
    if (sequences.size() == 0) {
        return vector<int>();
    }

    // Merge the first two sequences
    vector<int> mergedSequence = mergeSortedVectors(sequences[0], sequences[1]);

    // Merge the remaining sequences with the merged sequence
    for (int i = 2; i < sequences.size(); i++) {
        mergedSequence = mergeSortedVectors(mergedSequence, sequences[i]);
    }

    return mergedSequence;
}

int main() {
    // Example: Five sorted sequences
    vector<vector<int>> sequences = {
        {1, 3, 5, 7, 9},
        {2, 4, 6, 8, 10},
        {11, 13, 15, 17, 19},
        {12, 14, 16, 18, 20},
        {21, 23, 25, 27, 29}
    };

    // Merge the sequences
    vector<int> mergedSequence = mergeFiveSortedSequences(sequences);

    // Print the merged sequence
    cout << "Merged sequence: ";
    for (int num : mergedSequence) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
