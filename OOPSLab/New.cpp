#include<iostream>
#include<string>
using namespace std;
class Book
{
    private:
    string title;
    string author;
    int year;
    public: 
    Book(const string& t, const string& a, int y) : title(t), author(a), year(y) {}
    ~Book()
    {
        cout<<"The Book\""<<title<<"\"is destroyed."<<endl;
    }
     string getTitle() const { 
        return title; 
        }
    string getAuthor() const {
         return author; 
         }
    int getYear() const { 
        return year; 
        }
};
int main()
{
    Book One("Dev Mehrotra","Legend",2004);
       cout << "Title of the book  " << One.getTitle() << endl;
  cout << "Author of the book " << One.getAuthor() <<endl;
    cout << "Year of the book " << One.getYear() << endl;
    return 0;

}