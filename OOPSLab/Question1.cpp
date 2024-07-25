#include <iostream>
using namespace std;
class mul
{
    public:
    double power(double m)
    {
        int n=2;
        double res = 1;
        while(n > 0)
        {
            if (n & 1)
             res = res * m;
            m = m * m;
            n >>= 1;
        }
        return res;
    }
    double power(double m, int n)
    {
        double res = 1;
        while(n > 0)
        {
            if (n & 1)
                res = res * m;
            m = m * m;
            n >>= 1;
        }
        return res;
    }
};
int main()
{
    mul A;
    double base;
    int exponent;
    cout << "Enter the base";
    cin >> base;
    cout << "\n";
    cout << "Enter the exponent";
    cin >> exponent;
    cout << "\n";
    cout<<" Default value of Exponent:\n"<<A.power(base)<<endl;
    cout<<"User given value:\n"<<A.power(base,exponent)<<endl;
    return 0;
}