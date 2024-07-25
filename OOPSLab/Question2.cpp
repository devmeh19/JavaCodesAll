//Name- Dev Mehrotra
//Scholar Id - 2212181
//Cs 212 OOPS
//Question 2
#include <iostream>
using namespace std;

class bankaccount{
    private:
        string name;
        int accnumber;
        string typeofaccount;
        double balance;
    public:
        bankaccount(){}
        bankaccount(string naam,int accnum,string type,double bal){
            name=naam;
            accnumber=accnum;
            typeofaccount=type;
            balance=bal;
        }
        void deposit(double amount){
            balance+=amount;
            cout<<amount<<" added to Balance, now  current balance: "<<balance<<"\n";
        }
        void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                cout<<amount<<" removed, now current balance: "<<balance<<"\n";
            }
            else cout<<"Insufficient Balance";
        }
        void display(){
 cout<<"NAME- "<<name<<endl<<"Acc No. "<<accnumber<<endl<<"Balance-"<<balance<<endl;
        }
        int accountnum() {
            int a=accnumber;
            return a;
        }
};

int main()
{
    bankaccount acc[10];
    int x=2;
    for(int i=0;i<x;i++){
        string name;
        int accnum;
        string type;
        double bal;
        cout<<"Enter name of customer "<<i+1<<": ";cin>>name;
        cout<<"Enter account number of customer "<<i+1<<": ";cin>>accnum;
        cout<<"Enter type of customer account"<<i+1<<": ";cin>>type;
        cout<<"Enter balance of customer account"<<i+1<<": ";cin>>bal;
        acc[i]=bankaccount(name,accnum,type,bal);
    }
    
    while(1){
        int n;
  cout<<"PRESS -1 TO END PROGRAM\nPRESS 1 TO DEPOSIT\nPRESS 2 TO WITHDRAW\nPRESS 3 TO DISPLAY\n";
        cin>>n;
        cout<<"\n";
        if(n==-1) break;
        else if(n==1){
            int m;cout<<"Enter account number for depositing: ";cin>>m;cout<<"\n";
            int val=0;cout<<"Enter value to add: ";cin>>val;cout<<"\n";
            for(int i=0;i<x;i++){
                int number=acc[i].accountnum();
                if(number==m){
                    acc[i].deposit(val);
                }
            }
        }
        else if(n==2){
            int m;cout<<"ENTER acc  no for withdrawal: ";cin>>m;cout<<"\n";
            int val=0;cout<<"ENTER value to be removed : ";cin>>val;cout<<"\n";
            for(int i=0;i<x;i++){
                int number=acc[i].accountnum();
                if(number==m){
                    acc[i].withdraw(val);
                }
            }
        }
        else if(n==3){
            int m;cout<<"Enter account number : ";cin>>m;cout<<"\n";
            for(int i=0;i<x;i++){
                int number=acc[i].accountnum();
                if(number==m){
                    acc[i].display();
                }
            }
        }
        else {
            cout<<"INVALID OPERATOR\n";
        }
    }
    return 0;
}