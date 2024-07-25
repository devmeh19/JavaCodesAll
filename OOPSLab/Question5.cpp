#include<bits/stdc++.h>
using namespace std;
mt19937_64 rng(chrono::steady_clock::now().time_since_epoch().count());
class HangMan{
    private:   int n,attempts,limit;
string word,guess;
    public:    HangMan(){   n=uniform_int_distribution<int>(3,5)(rng);  
         word="";      for(int i=0;i<n;i++){
                char x=uniform_int_distribution<int>(0,25)(rng)+'a';
                word+=x;   word+=" ";  }
            attempts=0;limit=7; }
        void play(){
            int i=0;
            guess="";
            for(int i=0;i<n;i++)guess+="_ ";
            cout<<"Let's start the game!!!\n";
            while(true){
                cout<<guess<<"\n\n";
                char c;cin>>c;
                int res=check(c);
                if(!res){
                    attempts++;
                    display_hangman();
                    if(attempts==limit){
                        cout<<"You got hanged!!!\n";
                        return;
                    }
                }else if(res==2)break;          }
            cout<<"\nYou Guessed right ! The word was : "<<word<<endl;  }
        int check(char c){
            bool flag=true;  bool found=false;
            for(int i=0;i<n;i++){
                if(word[i<<1]==c)found=true,guess[i<<1]=c;
                flag&=guess[i<<1]!='_';     }
            if(flag)return 2;
            return found; }
        void display_hangman(){  cout<<"You have "<<limit-attempts<<" attempts left\n";
            vector<string>hangman={
                "                                                                    ___________\n",
                "                                                                   |         |\n",
                "                                                                   |         O\n",
                "                                                                   |        /|\\\n",
                "                                                                   |        / \\\n",
                "                                                                   |\n",
                "                                                                   |______________\n"
            };
            switch(attempts){
                case 1:
                    for(int i=0;i<1;i++)cout<<hangman[i];
                    break;
                case 2:
                    for(int i=0;i<2;i++)cout<<hangman[i];
                    break;
                case 3:
                    for(int i=0;i<3;i++)cout<<hangman[i];
                    break;
                case 4:
                    for(int i=0;i<4;i++)cout<<hangman[i];
                    break;
                case 5:
                    for(int i=0;i<5;i++)cout<<hangman[i];
                    break;
                case 6:
                    for(int i=0;i<6;i++)cout<<hangman[i];
                    break;
                case 7:
                    for(int i=0;i<7;i++)cout<<hangman[i];
                    break;}}};
int main(){
    HangMan game;   game.play();}