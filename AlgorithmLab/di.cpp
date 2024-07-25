#include<bits/stdc++.h>
#include<queue>
using namespace std;
class pair1{
    public:
    int f;
    int s;
    pair1(int a,int b)
    {
        f=a;
        s=b;
    }
     bool operator>(const pair1& other) const {
        return (s > other.s) || (s == other.s && f > other.f);
    }
};
int main()
{
    int n;
    int m;
    cin>>n;
    cin>>m;
    vector<pair1> adj[n+1];
    vector<int> ans;
    for(int i=0;i<m;i++)
    {
        int u;
        int v;
        int w;
        cin>>u;
        cin>>v;
        cin>>w;
        adj[u].push_back(pair1(v,w));
         adj[v].push_back(pair1(u,w));
    }
    priority_queue<pair1, vector<pair1>, greater<pair1>> pq;

    int dist[n+1];
    for(int i=0;i<n+1;i++)
    {
        dist[i]=INT_MAX;
    }
    dist[0]=0;
    pq.push(pair1(0,0));
    while(!pq.empty())
    {
        pair1 node=pq.top();
        int aa=node.f;
        int bb=node.s;
        pq.pop();
        for(auto it:adj[aa])
        {
          int v1=it.f;
          int w1=it.s;
          if(dist[aa]+w1<dist[v1])
          {
            dist[v1]=dist[aa]+w1;
            pq.push(pair1(v1,dist[v1]));
          }
          
        }
    }
    for (int i = 0; i <n+1 ; i++)
    {
        cout << dist[i] << " ";
    }

}