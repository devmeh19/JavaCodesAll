#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void dfs(int node, const vector<vector<int>>& adj_list, vector<int>& heights, vector<bool>& visited) {
    visited[node] = true;
    int max_height = 0;
    for (int neighbor : adj_list[node]) {
        if (!visited[neighbor]) {
            dfs(neighbor, adj_list, heights, visited);
            max_height = max(max_height, heights[neighbor]);
        }
    }
    heights[node] = 1 + max_height;
}
int findMaxHeight(const vector<vector<int>>& adj_list) {
    int n = adj_list.size();
    vector<int> heights(n, 0); 
    vector<bool> visited(n, false);
    for (int i = 0; i < n; ++i) {
        if (!visited[i]) {
            dfs(i, adj_list, heights, visited);
        }
    }
    return *max_element(heights.begin(), heights.end());
}

int main() {
    vector<vector<int>> adj_list = {
        {1, 2},    
        {3, 4},     
        {},         
        {5, 6},    
        {},         
        {},         
        {7},        
        {}          
    };

    int maxHeight = findMaxHeight(adj_list);
    cout << "Maximum height of the tree: " << maxHeight << endl;

    return 0;
}
