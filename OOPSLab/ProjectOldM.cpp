#include <bits/stdc++.h>
using namespace std;

class Node{
public:
    int room_capacity = 1;
    int fill_room = 0;
    char name[3][10];
    Node *next;
    Node *previous;
};

class hostel{
    Node *head[3];
    Node *created_node;
public:
    hostel()
    {
        for (int i = 0; i < 3; i++)
            head[i] = NULL;
    }
    void create();
    void book(int);
    void cancel(int);
    void display();
    void search(string);

};

void hostel :: create(){
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 9; j++)
        {
            Node *newnode = new Node;
            newnode->next = NULL;
            newnode->previous = NULL;
            if (head[i] == NULL)
            {
                head[i] = newnode;
                newnode -> room_capacity = 1;
            }
            else
            {
                Node *created_node = head[i];
                while (created_node -> next != NULL)
                {
                    created_node = created_node -> next;
                }
                if (j == 3 || j == 5 || j == 7)
                {
                    created_node -> room_capacity = 3;
                }
                if (j == 2 || j == 4 || j == 6 || j == 8)
                {
                    created_node -> room_capacity = 2;
                }
                created_node -> next = newnode;
                newnode -> previous = created_node;
            }
        }
    }
}

void hostel :: book(int people){
    int floor, room;
    cout << "Enter the floor number: ";
    cin >> floor;
    if (floor <= 0 || floor >= 4){
        cout << "Invalid floor number : " << floor << endl;
    }
    else{
        created_node = head[floor - 1];
        cout << "Enter the room number: ";
        cin >> room;
        if (room <= 0 || room > 10){
            cout << "Invalid room number: " << room << endl;
        }
        else{
            int i = 1;
            while (i < room){
                created_node = created_node -> next;
                i++;
            }
            if (created_node -> room_capacity >= people){
                cout << "Room is Available! You can Apply for the Room!" << endl;
                int count = 0;
                while(created_node -> fill_room - 1 <= created_node -> room_capacity){
                    cout << "Enter Name - " << created_node -> fill_room + 1 << ": ";
                    cin >> created_node -> name[created_node -> fill_room];
                    count++;
                    created_node -> fill_room++;
                    if(count >= people){
                        break;
                    }
                }
                created_node -> room_capacity = created_node -> room_capacity - people;
            }
            else{
                cout << "Room of Your Choice is Currently Not Available" << endl;
            }
        }
    }
}
void hostel :: cancel(int check){
    char namecheck[10];
    int flag = 0;
    int room, i = 1;
    if (check <= 0 || check >= 4)
    {
        cout << "Invalid Floor No.: " << check << endl;
    }
    else
    {
        cout << "Enter Room Number: ";
        cin >> room;
        if (room <= 0 || room >= 10)
        {
            cout << "Invalid Room number: " << room << endl;
        }
        else
        {
            cout << "Enter the name to be deleted: ";
            cin >> namecheck;
            string ncheck = namecheck;
            search(ncheck);
            created_node = head[check - 1];
            while (i < room)
            {
                created_node = created_node -> next;
                i++;
            }
            i = 0;
            while (i < 3)
            {
                if (!strcmp(namecheck, created_node -> name[i]))
                {
                    
                    flag = 1;
                    break;
                    i = 0;
                    
                }
                else
                    i++;
            }
            if (flag == 1 && created_node -> fill_room != 0)
            {
                cout << "Record deleted : " << created_node -> name[i] << endl;
                created_node -> name[i][0] = 'A';
                created_node -> name[i][1] = '\0';
                created_node -> fill_room--;
                created_node -> room_capacity++;
            }
            else
                cout << "\nRecord Not Avaiable" << endl;
        }
    }
}
void hostel :: display(){
    int j = 0, k = 0, l = 0;
    for (int i = 0; i < 60; i++){
        cout << "--";
    }
    cout << endl;
    for (int i = 1; i < 4; i++){
        cout << " Floor number : " << i << " \t\t\t";
    }
    cout << endl;
    for (int i = 0; i < 60; i++){
        cout << "--";
    }
    created_node = head[j];
    Node *secondfloor_node = head[j + 1];
    Node *thirdfloor_node = head[j + 2];
    cout << endl;
    while (created_node != NULL){
        if (created_node->fill_room != created_node->room_capacity && created_node->room_capacity != 0){
            j++;
            cout << " Room no: " << j;
            cout << ":-- Vacant Room --: " << created_node -> room_capacity;
        }
        else{
            j++;
            cout << " Room no: " << j;
            cout << " Already Booked by: ";
            for (int i = 0; i < created_node->fill_room; i++) {
                cout << created_node->name[i];
                if (i != created_node->fill_room - 1) {
                    cout << ", ";
                }
            }
        }
        if (secondfloor_node->fill_room != secondfloor_node->room_capacity && secondfloor_node->room_capacity != 0){
            k++;
            cout << "\t Room no: " << k;
            cout << ":-- Vacant Room --: "<< secondfloor_node->room_capacity;
        }
        else{
            k++;
            cout << "\t Room no: " << k;
            cout << "\t Already Booked by: ";
            for (int i = 0; i < secondfloor_node->fill_room; i++) {
                cout << secondfloor_node->name[i];
                if (i != secondfloor_node->fill_room - 1) {
                    cout << ", ";
                }
            }
        }
        if(thirdfloor_node->fill_room != thirdfloor_node->room_capacity && thirdfloor_node->room_capacity != 0){
            l++;
            cout << "\t Room no: " << l;
            cout << ":-- Vacant Room --: "<< thirdfloor_node->room_capacity << "| ";
        }
        else{
            l++;
            cout << " Room no: " << l;
            cout << "\t Already Booked by: ";
            for (int i = 0; i < thirdfloor_node->fill_room; i++) {
                cout << thirdfloor_node->name[i];
                if (i != thirdfloor_node->fill_room - 1) {
                    cout << ", ";
                }
            }
        }
        cout << " " << endl;
        cout << endl;
        created_node = created_node->next;
        secondfloor_node = secondfloor_node->next;
        thirdfloor_node = thirdfloor_node->next;
    }
    for (int i = 0; i < 60; i++){
        cout << "--";
    }
    cout << endl;
}
void hostel::search(string key) {
    bool found = false;
    int floor_number = -1;
    int room_number = -1;
    
    for (int i = 0; i < 3; ++i) {
        Node *current_node = head[i];
        int room_count = 1;
        
        while (current_node != nullptr) {
            for (int j = 0; j < current_node->fill_room; ++j) {
                if (strcmp(current_node->name[j], key.c_str()) == 0) {
                    found = true;
                    floor_number = i + 1;
                    room_number = room_count;
                    break;
                }
            }
            current_node = current_node->next;
            ++room_count;
        }
    }
    
    if (found) {
        cout << "Name found at: \nRoom no " << room_number << "\nFloor no. " << floor_number << endl;
    } else {
        cout << "Name not found." << endl;
    }
}

int main(){
    hostel management;
    int choice, floorcheck;
    char ch;
    string namecheck;
    management.create();
    do{
        cout << "1. Display Current Status of Rooms" << endl;
        cout << "2. Book a Room for 1 person." << endl;
        cout << "3. Book a Room for 2 person." << endl;
        cout << "4. Book a Room for 3 person." << endl;
        cout << "5. Cancel a Room" << endl;
        cout << "6. Search a Name" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice){
            case 1:
                management.display();
                break;
            case 2:
                management.book(1);
                break;
            case 3:
                management.book(2);
                break;
            case 4:
                management.book(3);
                break;
            case 5:
                cout << "Enter Floor no.: ";
                cin >> floorcheck;
                management.cancel(floorcheck);
                break;
            case 6:
                cout << "Enter name: ";
                cin >> namecheck;
                management.search(namecheck);
                break;
            default:
                cout << "Invalid Choice" << endl;
        }
        cout << "Do You want to Continue (Y/N): ";
        cin >> ch;
        cout << endl;
    }while(ch == 'Y' || ch == 'y');
    return 0;
}