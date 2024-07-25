#include <iostream>
#include <vector>
#include <algorithm>
#include <ctime>
#include <cstdlib>
using namespace std;

int mergeSequences(const vector<int>& seq1, const vector<int>& seq2) {
    int comparisons = 0;
    int i = 0, j = 0;
    while (i < seq1.size() && j < seq2.size()) {
        if (seq1[i] <= seq2[j]) {
            i++;
        } else {
            j++;
        }
        comparisons++; 
    }
    comparisons += (seq1.size() - i) + (seq2.size() - j); 
    return comparisons;
}

int main() {

    vector<int> sequenceLengths = {20, 24, 30, 35, 50};

    int totalComparisons = 0;
    for (int i = 0; i < sequenceLengths.size() - 1; i++) {

        vector<int> seq1;
        for (int j = 0; j < sequenceLengths[i]; j++) {
            seq1.push_back(rand());
        }
        sort(seq1.begin(), seq1.end()); 

        vector<int> seq2;
        for (int j = 0; j < sequenceLengths[i + 1]; j++) {
            seq2.push_back(rand());
        }
        sort(seq2.begin(), seq2.end()); 


        int comparisons = mergeSequences(seq1, seq2);
        totalComparisons += comparisons;
        cout << "Merge (" << sequenceLengths[i] << ", " << sequenceLengths[i + 1] << ") - Comparisons: " << comparisons - 1 << endl;
    }

    cout << "Total number of comparisons: " << totalComparisons << endl;

    return 0;
}