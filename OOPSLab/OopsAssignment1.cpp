#include <iostream>
#include <string>
using namespace std;
string removeAdjacentDuplicates(const string& inputString) {
    if (inputString.empty())
        return inputString;
    string result;
    size_t currentIndex = 0;
    while (currentIndex < inputString.size()) {
        size_t nextIndex = currentIndex + 1;
        while (nextIndex < inputString.size() && inputString[nextIndex] == inputString[currentIndex])
            ++nextIndex;
        if (nextIndex - currentIndex == 1) {
            result += inputString[currentIndex];
            ++currentIndex;
        } else {
          
            currentIndex = nextIndex;
        }
    }
    if (result.size() < inputString.size()) {
        return removeAdjacentDuplicates(result);
    } else {
        return result;
    }
}
int main() {
    string input;
    cout << "Enter a string: ";
    getline(cin, input);

    string result = removeAdjacentDuplicates(input);
    cout << "New String " << result << endl;
    return 0;
}
