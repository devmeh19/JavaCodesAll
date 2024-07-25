#include<bits/stdc++.h>
using namespace std;
mt19937_64 rng(chrono::steady_clock::now().time_since_epoch().count());
class Scientific_calculator{
    private:   string op;
        map<string,int>id;
    public:
        Scientific_calculator(){
            id["power"]=1;
            id["sin"]=2;
            id["square"]=3;
            id["cos"]=4;
            id["tan"]=5;
            id["log"]=6;
            id["baselog"]=7;   }
        void init(){
            cout<<"Enter the operation that you want to perform\n";
            cin>>op;
            transform(op.begin(),op.end(),op.begin(),[](char c){return tolower(c);});
            operate();  }
        void operate(){
            float x,y;
            switch(id[op]){
                case 1:
                    cout<<"Enter the two operands :\n";
                    cin>>x>>y;
                    cout<<Power(x,y)<<endl;
                    break;
                case 2:
                    cout<<"Enter the operand :\n";
                    cin>>x;
                    cout<<Sin(x)<<endl;
                    break;
                case 3:
                    cout<<"Enter the operand :\n";
                    cin>>x;
                    cout<<Square(x)<<endl;
                    break;
                case 4:
                    cout<<"Enter the operand :\n";
                    cin>>x;
                    cout<<Cos(x)<<endl;
                    break;
                case 5:
                    cout<<"Enter the operand :\n";
                    cin>>x;
                    cout<<Tan(x)<<endl;
                    break;
                case 6:
                    cout<<"Enter the operand :\n";
                    cin>>x;
                    cout<<Log(x)<<endl;
                    break;
                case 7:
                    cout<<"Enter the two operands :\n";
                    cin>>x>>y;
                    cout<<BaseLog(x,y)<<endl;
                    break;
                default:
                    cout<<"Operation unavailable\n";
            }
        }
        float Power(float x,float y){
            float z=pow(x,y);
            return z;
        }
        float Sin(float x){
            float z=sin(x);
            return z;
        }
        float Square(float x){
            float z=x*x;
            return z;
        }
        float Cos(float x){
            float z=cos(x);
            return z;
        }
        float Tan(float x){
            float z=tan(x);
            return z;
        }
        float Log(float x){
            float z=log(x);
            return z;
        }
        float BaseLog(float base, float x){
            float z=log(x)/log(base);
            return z;
        }
};
int main(){
    Scientific_calculator calc;
    calc.init();
    return 0;
}