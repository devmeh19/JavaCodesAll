#include<bits/stdc++.h>
using namespace std;
mt19937_64 rng(chrono::steady_clock::now().time_since_epoch().count());
class Rock_Paper_Scissors{
  private: string computer_move,user_move;
    vector<string>moves;
    map<string,int>ord;
  public:
    Rock_Paper_Scissors(){
      moves={
        "rock",
        "scissors",
        "paper"   };
      for(int i=0;i<3;i++)ord[moves[i]]=i; }
    void play(){
      cout<<"How many games do you want to play?\n";  int t;cin>>t;
      for(int i=0;i<t;i++)game();  }
    void game(){
      userOption();computerOption(); int won=winner();
      cout<<"You chose : "<<user_move<<endl;
      cout<<"Computer chose : "<<computer_move<<endl;
      if(won==-2)cout<<"You lost because you played an illegal move!!!\n";
      else if(~won)cout<<"You "<<(won?"Won!!!\n":"Lost!!!\n");
      else cout<<"It was a draw!!!\n";
    }
    void userOption(){
      cout<<"Enter your move :\n";cin>>user_move;
  transform(user_move.begin(),user_move.end(),user_move.begin(),[](char c){return tolower(c);}); }
    void computerOption(){
      int compChoice=uniform_int_distribution<int>(0,2)(rng);
      computer_move=moves[compChoice];}
    int winner(){
      if(!ord.count(user_move))return -2;
      int user=ord[user_move],comp=ord[computer_move];
      if(user==comp)return -1;  return (user+1)%3==comp;}};
int main(){
  Rock_Paper_Scissors game; game.play();  return 0;}