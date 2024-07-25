#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int m;
    cin>>n;
    cin>>m;
    vector<int> adj[n+1];
    vector<int> ans;
    for(int i=0;i<m;i++)
    {
        int u;
        int v;
        cin>>u;
        cin>>v;
        adj[u].push_back(v);
    }
    queue<int> q;
    int vis[n]={0};
    vis[0]=1;
    q.push(0);
    while(!q.empty())
{
int node=q.front();
q.pop();
ans.push_back(node);
for(auto it: adj[node])
{
    if(!vis[it])
    {
        vis[it]=1;
        q.push(it);
    }
}
}
for(int i=0;i<ans.size();i++)
{
    cout<<ans[i]<<endl;
}
}