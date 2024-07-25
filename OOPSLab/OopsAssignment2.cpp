#include <iostream>
#include <vector>
using namespace std;
int findLargestSquare(vector<vector<int>> const &mat)
{

    if (mat.size() == 0) {
        return 0;
    }
    int M = mat.size();
    int N = mat[0].size();
    int lookup[M][N];
    int max = 0;
    for (int i = 0; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
            lookup[i][j] = mat[i][j];
            if (i && j && mat[i][j])
            {
                lookup[i][j] = min (min (lookup[i][j - 1], lookup[i - 1][j]),
                                        lookup[i - 1][j - 1]) + 1;
            }
            if (max < lookup[i][j]) {
                max = lookup[i][j];
            }
        }
    }
    return max;
}
int main()
{
    int n,m;
    cout<<"Enter row size and col size:";
    cin>>n>>m;
  vector<vector<int>>mat(n,vector<int>(m));
    cout<<"Enter elements of mat"<<endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin>>mat[i][j];
        }
        
    }
    cout << "The size of the largest square submatrix of 1's is " <<
            findLargestSquare(mat);
    return 0;
}