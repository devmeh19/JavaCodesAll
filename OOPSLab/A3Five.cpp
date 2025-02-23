#include <iostream>
#include <cmath>
using namespace std;
class Shape {
public:
    virtual double calculateArea() const = 0;
    virtual double calculatePerimeter() const = 0;
    virtual ~Shape() {} // Virtual destructor
};
class Circle : public Shape {
private: double radius;
public:
    Circle(double r) : radius(r) {}
    double calculateArea() const override {
        return M_PI * radius * radius;
    }
    double calculatePerimeter() const override {
        return 2 * M_PI * radius;}};
class Rectangle : public Shape {
private:
    double length;
    double width;
public:
    Rectangle(double l, double w) : length(l), width(w) {}
    double calculateArea() const override {
        return length * width; }
    double calculatePerimeter() const override {
        return 2 * (length + width);}};
class Triangle : public Shape {
private:
    double side1, side2, side3;
public:
    Triangle(double s1, double s2, double s3) : side1(s1), side2(s2), side3(s3) {}
    double calculateArea() const override {
        // Heron's formula for area of triangle given three sides
        double s = (side1 + side2 + side3) / 2;
        return sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    double calculatePerimeter() const override {
        return side1 + side2 + side3;
    }};
int main() {
    double radius, length, width, side1, side2, side3;
    cout << "Enter the radius of the circle: ";
    cin >> radius;
    Circle circle(radius);
    cout << "Circle:" << endl;
    cout << "Area: " << circle.calculateArea() << endl;
    cout << "Perimeter: " << circle.calculatePerimeter() << endl;
    cout << "\nEnter the length and width of the rectangle: ";
    cin >> length >> width;
    Rectangle rectangle(length, width);
    cout << "\nRectangle:" << endl;
    cout << "Area: " << rectangle.calculateArea() << endl;
    cout << "Perimeter: " << rectangle.calculatePerimeter() << endl;
    cout << "\nEnter the lengths of the sides of the triangle: ";
    cin >> side1 >> side2 >> side3;
    Triangle triangle(side1, side2, side3);
    cout << "\nTriangle:" << endl;
    cout << "Area: " << triangle.calculateArea() << endl;
    cout << "Perimeter: " << triangle.calculatePerimeter() << endl;
    return 0;
}