#include <iostream>
#include <queue>
#include <vector>

using namespace std;

// Function to find the minimum cost of connecting ropes
int minCostOfConnectingRopes(vector<int>& ropes) {
    // Initialize a priority queue (min-heap)
    priority_queue<int, vector<int>, greater<int>> minHeap;

    // Add all ropes to the min-heap
    for (int rope : ropes) {
        minHeap.push(rope);
    }

    int totalCost = 0;

    // Combine ropes until there's only one rope left
    while (minHeap.size() > 1) {
        // Extract the two shortest ropes from the min-heap
        int first = minHeap.top();
        minHeap.pop();
        int second = minHeap.top();
        minHeap.pop();

        // Combine the two ropes
        int combined = first + second;

        // Add the cost of combining to the total cost
        totalCost += combined;

        // Add the combined rope back to the min-heap
        minHeap.push(combined);
    }

    return totalCost;
}

int main() {
    // Example test case
    vector<int> ropes = {4, 3, 2, 6};
    cout << "Minimum cost of connecting ropes: " << minCostOfConnectingRopes(ropes) << endl;

    return 0;
}
