#include <iostream>
#include <vector>
#include <climits>
using namespace std;

// Function to multiply two matrices
vector<vector<int>> matrixMultiply(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    int m = B[0].size();
    int p = A[0].size();
    vector<vector<int>> C(n, vector<int>(m, 0));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < p; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    return C;
}

// Function to divide a matrix into four submatrices
void divideMatrix(const vector<vector<int>>& M, vector<vector<int>>& A, vector<vector<int>>& B, vector<vector<int>>& C, vector<vector<int>>& D) {
    int n = M.size();
    int half = n / 2;
    for (int i = 0; i < half; i++) {
        for (int j = 0; j < half; j++) {
            A[i][j] = M[i][j];
            B[i][j] = M[i][j + half];
            C[i][j] = M[i + half][j];
            D[i][j] = M[i + half][j + half];
        }
    }
}

// Function to add two matrices
vector<vector<int>> add(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    int m = A[0].size();
    vector<vector<int>> C(n, vector<int>(m, 0));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    return C;
}

// Function to subtract two matrices
vector<vector<int>> subtract(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    int m = A[0].size();
    vector<vector<int>> C(n, vector<int>(m, 0));

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            C[i][j] = A[i][j] - B[i][j];
        }
    }
    return C;
}

// Function to perform matrix multiplication using divide and conquer
vector<vector<int>> matrixChainMultiply(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    if (n == 1) {
        vector<vector<int>> C(1, vector<int>(1, 0));
        C[0][0] = A[0][0] * B[0][0];
        return C;
    }

    vector<vector<int>> A11(n / 2, vector<int>(n / 2));
    vector<vector<int>> A12(n / 2, vector<int>(n / 2));
    vector<vector<int>> A21(n / 2, vector<int>(n / 2));
    vector<vector<int>> A22(n / 2, vector<int>(n / 2));
    vector<vector<int>> B11(n / 2, vector<int>(n / 2));
    vector<vector<int>> B12(n / 2, vector<int>(n / 2));
    vector<vector<int>> B21(n / 2, vector<int>(n / 2));
    vector<vector<int>> B22(n / 2, vector<int>(n / 2));

    divideMatrix(A, A11, A12, A21, A22);
    divideMatrix(B, B11, B12, B21, B22);

    vector<vector<int>> P1 = matrixChainMultiply(add(A11, A22), add(B11, B22));
    vector<vector<int>> P2 = matrixChainMultiply(add(A21, A22), B11);
    vector<vector<int>> P3 = matrixChainMultiply(A11, subtract(B12, B22));
    vector<vector<int>> P4 = matrixChainMultiply(A22, subtract(B21, B11));
    vector<vector<int>> P5 = matrixChainMultiply(add(A11, A12), B22);
    vector<vector<int>> P6 = matrixChainMultiply(subtract(A21, A11), add(B11, B12));
    vector<vector<int>> P7 = matrixChainMultiply(subtract(A12, A22), add(B21, B22));

    vector<vector<int>> C11 = subtract(add(add(P1, P4), P5), P7);
    vector<vector<int>> C12 = add(P3, P5);
    vector<vector<int>> C21 = add(P2, P4);
    vector<vector<int>> C22 = subtract(add(P1, P3), add(P2, P6));

    vector<vector<int>> C(n, vector<int>(n, 0));

    for (int i = 0; i < n / 2; i++) {
        for (int j = 0; j < n / 2; j++) {
            C[i][j] = C11[i][j];
            C[i][j + n / 2] = C12[i][j];
            C[i + n / 2][j] = C21[i][j];
            C[i + n / 2][j + n / 2] = C22[i][j];
        }
    }

    return C;
}

int main() {
    vector<vector<int>> A = {{1, 2}, {3, 4}};
    vector<vector<int>> B = {{5, 6}, {7, 8}};

    vector<vector<int>> C = matrixChainMultiply(A, B);

    cout << "Resultant Matrix:" << endl;
    for (int i = 0; i < C.size(); i++) {
        for (int j = 0; j < C[i].size(); j++) {
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
