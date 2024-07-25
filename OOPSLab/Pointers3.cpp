// Name - Dev Mehrotra
// Scholar ID-2212181
// Question 3

#include <iostream>
#include<bits/stdc++.h>
using namespace std;
class B {
public:
    virtual void display() {
    cout<<"Base class display is called"<<endl;
    }
};

class D : public B {
public:
    void display() override {
    cout<<"Derived class display is called"<<endl;
    }
};
int main() {
    B* bptr;
    D dobj;
    bptr = &dobj;
    bptr->display(); 
    return 0;
}


// When a pointer to a base class is used to point to an object
// of derived class,the function(virtual) gets overidden. This is called runtime 
// polymorphism. The function that gets called is decided dynamically at runtime based 
// on the actual type of the object that is being pointed to. 
