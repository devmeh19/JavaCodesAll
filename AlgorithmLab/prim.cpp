#include<bits/stdc++.h>
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
      vector<int> key(n, INT_MAX); // Initialize key vector with INT_MAX
    vector<bool> mst(n, false); // Initialize mst vector with false
    vector<int> p(n, -1); // Initialize p vector with -1
    int n1= n;
    int v=n;
   
    key[0]=0;
    for(int i=0;i<v;i++)
    {
        int mini=INT_MAX;
        int uu;
        for(int i=0;i<v;i++)
        {
            if(mst[i]==false&&key[i]<mini)
            {
                mini=key[i];
                uu=i;
            }
        }
        mst[uu]=true;
        for(auto it:adj[uu])
        {
            int aa=it.f;
            int bb=it.s;
            if(mst[aa]==false&&bb<key[aa])
            {
                key[aa]=bb;
                p[aa]=uu;
            }
        }
    }
        for(int i=0;i<n1;i++)
    {
        cout<<p[i]<<endl;
    }
    }
    
