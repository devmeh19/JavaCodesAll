#include <iostream>
using namespace std;
class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};
class SinglyLinkedList {
private:

public:
  Node* start;
    SinglyLinkedList() {
        start = nullptr;
    }
    ~SinglyLinkedList() {
        Node* current = start;
        while (current != nullptr) {
            Node* nextNode = current->next;
            delete current;
            current = nextNode;
        }
    }
    void display() {
        Node* currentNode = start;
        while (currentNode != nullptr) {
            cout << currentNode->data << " ";
            currentNode = currentNode->next;
        }
        cout << endl;
    }
    void displayReverse(Node* node) {
        if (node == nullptr)
            return;
        displayReverse(node->next);
        cout << node->data << " ";
    }
    int countNodes() {
        int count = 0;
        Node* currentNode = start;
        while (currentNode != nullptr) {
            count++;
            currentNode = currentNode->next;
        }
        return count;
    }
    void insertNode(int val, int position) {
        Node* newNode = new Node(val);
        if (position == 1 || start == nullptr) {
            newNode->next = start;
            start = newNode;
        } else {
            Node* currentNode = start;
            for (int i = 1; i < position - 1 && currentNode != nullptr; i++) {
                currentNode = currentNode->next;
            }
            if (currentNode != nullptr) {
                newNode->next = currentNode->next;
                currentNode->next = newNode;
            } else {
                cout << "Invalid position. Node not inserted." << endl;
            }
        }
    }
    void deleteNode(int position) {
        if (position == 1 && start != nullptr) {
            Node* temp = start;
            start = start->next;
            delete temp;
        } else {
            Node* currentNode = start;
            for (int i = 1; i < position - 1 && currentNode != nullptr; i++) {
                currentNode = currentNode->next;
            }
            if (currentNode != nullptr && currentNode->next != nullptr) {
                Node* temp = currentNode->next;
                currentNode->next = currentNode->next->next;
                delete temp;
            } else {
                cout << "Invalid position. Node not deleted." << endl;
            }
        }
    }
};

void displayMenu() {
    cout << "Menu:" << endl;
    cout << "1. Display the list" << endl;
    cout << "2. Display the list in reverse order" << endl;
    cout << "3. Count the number of nodes" << endl;
    cout << "4. Insert a new node at a given position" << endl;
    cout << "5. Delete a node from a given position" << endl;
    cout << "6. Exit" << endl;
}

int main() {
    SinglyLinkedList list;
    int choice;

    do {
        displayMenu();
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "List: ";
                list.display();
                break;
            case 2:
                cout << "List in reverse order: ";
                list.displayReverse(list.start);
                cout << endl;
                break;
            case 3:
                cout << "Number of nodes: " << list.countNodes() << endl;
                break;
            case 4:
                int val, pos;
                cout << "Enter value to insert: ";
                cin >> val;
                cout << "Enter position to insert: ";
                cin >> pos;
                list.insertNode(val, pos);
                break;
            case 5:
                int delPos;
                cout << "Enter position to delete: ";
                cin >> delPos;
                list.deleteNode(delPos);
                break;
            case 6:
                cout << "Exiting program..." << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }

        cout << endl;

    } while (choice != 6);

    return 0;
}
