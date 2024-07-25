#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pip;
void display(vector<int> &arr)
{
    cout << "NODE"
         << "-->"
         << "MIN COST" << endl;
    for (int i = 0; i < arr.size(); i++)
    {
        cout << char(i + 65) << "   -->  " << arr[i] << endl;
    }
}
vector<int> dijkstra(int n, vector<vector<int>> adj[], int source)
{
    vector<int> dist(n, 1e9);
    priority_queue<pip, vector<pip>, greater<pip>> pq;

    dist[source] = 0;
    pq.push({0, source});
    while (pq.size() > 0)
    {
        int dis = pq.top().first;
        int node = pq.top().second;
        pq.pop();

        cout << "After processing Node " << char(node + 65) << endl;
        for (auto &it : adj[node])
        {
            int edgeweight = it[1];
            int adjnode = it[0];
            cout << "The predecessor of " << char(adjnode + 65) << " is " << char(node + 65) << endl;
            if (dis + edgeweight < dist[adjnode])
            {
                dist[adjnode] = dis + edgeweight;
                pq.push({dist[adjnode], adjnode});
            }
        }
        display(dist);
        cout << endl;
    }
    return dist;
}
int main()
{
    int n = 7;
    int source = 2;
    vector<vector<int>> adj[n];
    adj[0].push_back({4, 6});
    adj[0].push_back({5, 10});
    adj[0].push_back({3, 4});
    adj[1].push_back({0, 2});
    adj[1].push_back({3, 3});
    adj[2].push_back({0, 8});
    adj[2].push_back({1, 1});
    adj[3].push_back({5, 8});
    adj[4].push_back({5, 7});
    adj[6].push_back({5, 6});

    vector<int> dij = dijkstra(n, adj, source);
}