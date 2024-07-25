//Name- Dev Mehrotra
//Scholar Id - 2212181
//Cs 212 OOPS
#include <iostream>
using namespace std;
class DB; 

class DM
{
private:
    double meters;
    double centimeters;
public:
    DM() : meters(0), centimeters(0) {}

    friend void readValues(DM &);

    friend void addAndDisplay(DM &, DB &, bool);

    void display()
    {
        cout <<"Till now "<<meters<< " meters " <<"and "<< centimeters <<
         " centimeters (sum of all meters, centimeters, feet and inches till now in meter and centimeter format)\n";
    }
};
class DB
{
private:
    double feet;
    double inches;
public:
    DB() : feet(0), inches(0) {}
    friend void readValues(DB &);
    friend void addAndDisplay(DM &, DB &, bool);
    void display()
    {
        cout <<"Till now "<< feet << " feet " <<"and "<< inches <<
         " inches (sum of all meters, centimeters, feet and inches till now in feet and inch format)\n";
    }
};
void readValues(DM &obj)
{
    cout << "Enter meters: ";
    cin >> obj.meters;
    cout << "Enter centimeters: ";
    cin >> obj.centimeters;
}
void readValues(DB &obj)
{
    cout << "Enter feet: ";
    cin >> obj.feet;
    cout << "Enter inches: ";
    cin >> obj.inches;
}
void addAndDisplay(DM &dmObj, DB &dbObj, bool resultIsDM)
{
    double totalCentimeters = dmObj.meters * 100 + dmObj.centimeters + (dbObj.feet * 30.48 + dbObj.inches * 2.54);
    double totalInches = dbObj.feet * 12 + dbObj.inches + (dmObj.meters * 39.37 + dmObj.centimeters * 0.393701);
    dmObj.meters = totalCentimeters / 100;
    dmObj.centimeters = totalCentimeters;
    dbObj.feet = totalInches / 12;
    dbObj.inches = totalInches;
    if (resultIsDM)
    {
        dmObj.display();
    }
    else
    {
        dbObj.display();
    }
}
int main()
{
    DM dmObject;
    DB dbObject;
    while (1)
    {  int t;
        cout << "Enter -1 to end program\n1 to enter data in meters and centimeters\n2 to enter data in feet and inches\n3 to display in meters and centimeters\n4 to display in feet and inches\n";
        cin >> t;
        if (t == -1)
            break;
        else if (t == 1)
        {
            readValues(dmObject);
        }
        else if (t == 2)
        {
            readValues(dbObject);
        }
        else if (t == 3)
        {
            addAndDisplay(dmObject, dbObject, true);
        }
        else if (t == 4)
        {
            addAndDisplay(dmObject, dbObject, false);
        }
        else
        {
            cout << "INVALID OPERATOR\n";
        }
    }
    return 0;
}
