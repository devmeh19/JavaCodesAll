#include <iostream>
#include <vector>
#include <climits>

using namespace std;

// Function to print the optimal placement of parentheses
void printParentheses(int i, int j, int n, vector<vector<int>>& bracket, char& name) {
    // Base case: if there's only one matrix left
    if (i == j) {
        cout << name++;
        return;
    }

    cout << "(";

    // Recursively print the parentheses for sub-expression [i, bracket[i][j]]
    printParentheses(i, bracket[i][j], n, bracket, name);

    // Recursively print the parentheses for sub-expression [bracket[i][j]+1, j]
    printParentheses(bracket[i][j] + 1, j, n, bracket, name);

    cout << ")";
}

// Function to perform matrix chain multiplication and print optimal placement of parentheses
void matrixChainOrder(int p[], int n) {
    // m[i][j] will store the minimum number of scalar multiplications needed to compute A[i]A[i+1]...A[j]
    // bracket[i][j] will store the value of k that achieved the minimum number of multiplications
    vector<vector<int>> m(n, vector<int>(n));
    vector<vector<int>> bracket(n, vector<int>(n));

    // Initialize m[i][i] as 0 (cost of multiplying one matrix)
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

    // Print the optimal placement of parentheses
    char name = 'A';
    cout << "Optimal Parenthesization: ";
    printParentheses(1, n - 1, n, bracket, name);
    cout << endl;
}

int main() {
    int arr[] = {10, 20, 30, 40, 30}; // Example matrix chain dimensions
    int n = sizeof(arr) / sizeof(arr[0]);

    matrixChainOrder(arr, n);

    return 0;
}
