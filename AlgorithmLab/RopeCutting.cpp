#include <iostream>
#include <vector>
using namespace std;
int maxPrice(int n, vector<int>& price) {
    vector<int> dp(n + 1, 0);
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            dp[i] = max(dp[i], price[j - 1] + dp[i - j]);
        }
    }

    return dp[n];
}

int main() {
    int n = 8; 
    vector<int> price = {1, 5, 8, 9, 10, 17, 17, 20}; 
    int result = maxPrice(n, price);
    cout << "Maximum price by cutting the rod: " << result << endl;
    return 0;
}
