#include <iostream>
using namespace std;
class Circle {
private:
    double radius;
public:
    Circle(double r) : radius(r) {}
    double getRadius() const {
        return radius;
    }
    double calculateArea() const {
        return 3.14159 * radius * radius;
    }
    double calculateCircumference() const {
        return 2 * 3.14159 * radius;
    }};
int main() {
    double radius;
    cout << "Enter the radius of the circle: ";
    cin >> radius;
    Circle circle(radius);
    cout << "Circle information:" << endl;
    cout << "Radius: " << circle.getRadius() << endl;
    cout << "Area: " << circle.calculateArea() << endl;
    cout << "Circumference: " << circle.calculateCircumference() << endl;
    return 0;
}