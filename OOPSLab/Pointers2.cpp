// Name - Dev Mehrotra
// Scholar ID-2212181
// Question 2
#include <iostream>
#include<bits/stdc++.h>
#include <cstring>
using namespace std;
void reverseString(char *str) {
    int len = strlen(str);
    char *s = str;
    char *e = str + len - 1;
    while (s < e) {
        char temp = *s;
        *s = *e;
        *e = temp;
        s++;
        e--;
    }
}

int main() {
    const int maxlen = 1000;
    char str[maxlen];
    cout << "Enter a string"<<endl;
    cin>>str;
    reverseString(str);
    cout<<"Reversed string"<<endl<<str<<endl;
    return 0;
}