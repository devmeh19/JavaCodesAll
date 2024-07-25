#include <iostream>
#include <vector>
#include <climits>
using namespace std;

// Function to print optimal parenthesization
void printParenthesis(int i, int j, int n, vector<vector<int>>& bracket, char& name) {
    // Base case: If there is only one matrix in the chain
    if (i == j) {
        cout << name++;
        return;
    }

    cout << "(";

    // Recursively put brackets around subexpression from i to bracket[i][j]
    printParenthesis(i, bracket[i][j], n, bracket, name);

    // Recursively put brackets around subexpression from bracket[i][j]+1 to j
    printParenthesis(bracket[i][j] + 1, j, n, bracket, name);

    cout << ")";
}

// Function to find the optimal order of matrix multiplication and print the result
void matrixChainOrder(int p[], int n) {
    // Create a 2D array to store the minimum number of multiplications needed
    vector<vector<int>> m(n, vector<int>(n));
    vector<vector<int>> bracket(n, vector<int>(n));

    // Cost is 0 when multiplying one matrix
    for (int i = 1; i < n; i++)
        m[i][i] = 0;

    // L is chain length
    for (int L = 2; L < n; L++) {
        for (int i = 1; i < n - L + 1; i++) {
            int j = i + L - 1;
            m[i][j] = INT_MAX;
            for (int k = i; k <= j - 1; k++) {
                int cost = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                if (cost < m[i][j]) {
                    m[i][j] = cost;
                    bracket[i][j] = k;
                }
            }
        }
    }

    // Print the result
    char name = 'A';
    cout << "Optimal Parenthesization is: ";
    printParenthesis(1, n - 1, n, bracket, name);
    cout << endl;
}

int main() {
    int arr[] = { 10, 30, 5, 60 };
    int n = sizeof(arr) / sizeof(arr[0]);

    matrixChainOrder(arr, n);

    return 0;
}
