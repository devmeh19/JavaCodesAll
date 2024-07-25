#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cout<<"Enter Element"<<endl;
    cin>>n;
    n=n+10;
    cout<<n;
    vector<int> a;
    int sum=0;
    for(int i=0;i<4;i++)
    {
        int m;
        cin>>m;
        a.push_back(m);
        sum+=m;
    }
    cout<<sum;
}