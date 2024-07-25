#include <iostream>
#include <vector>

using namespace std;

// Function to add two matrices
vector<vector<int>> add(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    vector<vector<int>> result(n, vector<int>(n));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            result[i][j] = A[i][j] + B[i][j];
        }
    }
    return result;
}

// Function to subtract two matrices
vector<vector<int>> subtract(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();
    vector<vector<int>> result(n, vector<int>(n));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            result[i][j] = A[i][j] - B[i][j];
        }
    }
    return result;
}

// Function to perform Strassen's algorithm for matrix multiplication
vector<vector<int>> strassen(const vector<vector<int>>& A, const vector<vector<int>>& B) {
    int n = A.size();

    // Base case: If the matrix is 1x1
    if (n == 1) {
        vector<vector<int>> C(1, vector<int>(1));
        C[0][0] = A[0][0] * B[0][0];
        return C;
    }

    // Divide matrices into submatrices
    int mid = n / 2;
    vector<vector<int>> A11(mid, vector<int>(mid)), A12(mid, vector<int>(mid)), A21(mid, vector<int>(mid)), A22(mid, vector<int>(mid));
    vector<vector<int>> B11(mid, vector<int>(mid)), B12(mid, vector<int>(mid)), B21(mid, vector<int>(mid)), B22(mid, vector<int>(mid));

    for (int i = 0; i < mid; i++) {
        for (int j = 0; j < mid; j++) {
            A11[i][j] = A[i][j];
            A12[i][j] = A[i][j + mid];
            A21[i][j] = A[i + mid][j];
            A22[i][j] = A[i + mid][j + mid];

            B11[i][j] = B[i][j];
            B12[i][j] = B[i][j + mid];
            B21[i][j] = B[i + mid][j];
            B22[i][j] = B[i + mid][j + mid];
        }
    }

    // Recursive calls to calculate the Strassen submatrices
    vector<vector<int>> P1 = strassen(add(A11, A22), add(B11, B22));
    vector<vector<int>> P2 = strassen(add(A21, A22), B11);
    vector<vector<int>> P3 = strassen(A11, subtract(B12, B22));
    vector<vector<int>> P4 = strassen(A22, subtract(B21, B11));
    vector<vector<int>> P5 = strassen(add(A11, A12), B22);
    vector<vector<int>> P6 = strassen(subtract(A21, A11), add(B11, B12));
    vector<vector<int>> P7 = strassen(subtract(A12, A22), add(B21, B22));

    // Calculate the result submatrices
    vector<vector<int>> C11 = add(subtract(add(P1, P4), P5), P7);
    vector<vector<int>> C12 = add(P3, P5);
    vector<vector<int>> C21 = add(P2, P4);
    vector<vector<int>> C22 = add(subtract(add(P1, P3), P2), P6);

    // Combine the result submatrices into a single matrix
    vector<vector<int>> C(n, vector<int>(n));
    for (int i = 0; i < mid; i++) {
        for (int j = 0; j < mid; j++) {
            C[i][j] = C11[i][j];
            C[i][j + mid] = C12[i][j];
            C[i + mid][j] = C21[i][j];
            C[i + mid][j + mid] = C22[i][j];
        }
    }

    return C;
}

// Function to print a matrix
void printMatrix(const vector<vector<int>>& matrix) {
    for (const auto& row : matrix) {
        for (int num : row) {
            cout << num << " ";
        }
        cout << endl;
    }
}

int main() {
    vector<vector<int>> A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    vector<vector<int>> B = {{17, 18, 19, 20}, {21, 22, 23, 24}, {25, 26, 27, 28}, {29, 30, 31, 32}};

    cout << "Matrix A:" << endl;
    printMatrix(A);
    cout << endl;

    cout << "Matrix B:" << endl;
    printMatrix(B);
    cout << endl;

    vector<vector<int>> C = strassen(A, B);

    cout << "Resultant Matrix C:" << endl;
    printMatrix(C);

    return 0;
}
