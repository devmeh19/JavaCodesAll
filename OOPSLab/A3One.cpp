#include <iostream>
#include <vector>
#include <climits>
using namespace std;
class CoinChangeSolver {
private:vector<int> coins;
public:
CoinChangeSolver(const vector<int>& coinsList) 
    : coins(coinsList) {}
    int solve(int target) {
       return minCoins(target); }
private: int minCoins(int amount) {
        if (amount == 0)
            return 0;
        int result = INT_MAX;
        for (int coin : coins) {
            if (amount >= coin) {
     int subResult = minCoins(amount - coin);
    if (subResult != INT_MAX && subResult + 1 < result)
           result = subResult + 1;
     }} return result;
    }};
int main() {
    vector<int> coins;
    int numCoins;
    cout << "Enter the number of coin denominations: ";
    cin >> numCoins;
    cout << "Enter the coin denominations: ";
    for (int i = 0; i < numCoins; ++i) {
 int coin;  cin >> coin;
 coins.push_back(coin);} int target;
    cout << "Enter the target amount: ";
    cin >> target;
    CoinChangeSolver solver(coins);
    cout << solver.solve(target) << endl;
    return 0;
}