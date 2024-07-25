#include <iostream>
using namespace std;
class Demo {
private:int value;
public:
    Demo() : value(0) {}
    Demo(int val) : value(val) {}
    int getValue() const  {
     return value;
    }
    void display() const {
        cout << "Value: " << value << endl; }
    void display(int x) const
     {
        cout << "Value: " << x << endl; }
    Demo operator+(const Demo& other) const {
        return Demo(this->value + other.value); }
    Demo operator-(const Demo& other) const {
        return Demo(this->value - other.value); }
    bool operator==(const Demo& other) const {
        return this->value == other.value; }
    bool operator!=(const Demo& other) const {
        return !(*this == other);}};
int main() {
    Demo obj1(5);  Demo obj2(3);
    obj1.display(); // Calls void display() const
    obj1.display(10); // Calls void display(int x) const
    Demo sum = obj1 + obj2; // Calls Demo operator
    Demo diff = obj1 - obj2; // Calls Demo operator
    cout << "Sum: " << sum.getValue() << endl;
    cout << "Difference: " << diff.getValue() << endl;
    if (obj1 == obj2) // Calls bool operator==(const Demo& other) 
        cout << "obj1 is equal to obj2" << endl;
    else
        cout << "obj1 is not equal to obj2" << endl;
    if (obj1 != obj2) // Calls bool operator!=(const Demo& other) 
        cout << "obj1 is not equal to obj2" << endl;
    else    cout << "obj1 is equal to obj2" << endl;
    return 0;
}