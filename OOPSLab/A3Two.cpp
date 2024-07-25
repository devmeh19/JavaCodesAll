#include <iostream>
#include <string>
using namespace std;
class Student {
private:
 string name; string className;
 int rollNumber; int marks;
public:
 Student(const string& studentName, const string& studentClass,
  int studentRollNumber, int studentMarks)
 : name(studentName), className(studentClass), 
 rollNumber(studentRollNumber), marks(studentMarks) {}
    char calculateGrade() const {
        if (marks >= 90)   return 'A';
        else if (marks >= 80)  return 'B';
        else if (marks >= 70)  return 'C';
        else if (marks >= 60)  return 'D';
        else  return 'F';   }
    void displayInfo() const {
        cout << "Name: " << name << endl;
        cout << "Class: " << className << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << calculateGrade() << endl;  } };
int main() { string name, className;
    int rollNumber, marks;
    cout << "Enter student's name: ";
    getline(cin, name);
    cout << "Enter student's class: ";
    getline(cin, className);
    cout << "Enter student's roll number: ";
    cin >> rollNumber;
    cout << "Enter student's marks: "; cin >> marks;
    Student student(name, className, rollNumber, marks);
    student.displayInfo();
    return 0;
}