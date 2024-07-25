#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
struct Edge {
    int src, dest, weight;
};
struct DisjointSet {
    int parent, rank;
};
int find(vector<DisjointSet>& ds, int i) {
    if (ds[i].parent != i)
        ds[i].parent = find(ds, ds[i].parent);
    return ds[i].parent;
}

void Union(vector<DisjointSet>& ds, int x, int y) {
    int xroot = find(ds, x);
    int yroot = find(ds, y);

    if (ds[xroot].rank < ds[yroot].rank)
        ds[xroot].parent = yroot;
    else if (ds[xroot].rank > ds[yroot].rank)
        ds[yroot].parent = xroot;
    else {
        ds[yroot].parent = xroot;
        ds[xroot].rank++;
    }
}

// Comparator function to sort edges by weight
bool compare(Edge a, Edge b) {
    return a.weight < b.weight;
}
void kruskalMST(vector<Edge>& edges, int V) {
    sort(edges.begin(), edges.end(), compare);

    vector<Edge> result;
    vector<DisjointSet> ds(V);
    for (int i = 0; i < V; i++) {
        ds[i].parent = i;
        ds[i].rank = 0;
    }

    for (Edge edge : edges) {
        int x = find(ds, edge.src);
        int y = find(ds, edge.dest);

        if (x != y) {
            result.push_back(edge);
            Union(ds, x, y);
        }
    }
    cout << "Minimum Spanning Tree:" << endl;
    for (Edge edge : result) {
        cout << edge.src << " -- " << edge.dest << " == " << edge.weight << endl;
    }
}
int main() {
    int V, E;
    cout << "Enter the number of vertices and edges: ";
    cin >> V >> E;
    vector<Edge> edges(E);
    cout << "Enter source, destination, and weight of each edge:" << endl;
    for (int i = 0; i < E; i++) {
        cin >> edges[i].src >> edges[i].dest >> edges[i].weight;
    }
    kruskalMST(edges, V);
    return 0;
}
