#include <bits/stdc++.h>
using namespace std;

// Definition of the Node class
class Node 
{
public:
    int value; // Value of the node
    Node *next; // Pointer to the next node
    Node *prev; // Pointer to the previous node

    // Constructor to initialize the node with a value
    Node(int value) 
    {
        this->value = value;
        this->next = NULL;
        this->prev = NULL;
    }
};

// Function to print the doubly linked list
void printDoublyLinkedList(Node *head) 
{
    Node *current = head; // Start from the head of the list
    while (current != NULL) 
    {
        cout << current->value << " "; // Print the value of the current node
        current = current->next; // Move to the next node
    }
    cout << endl;
}

// Function to insert a new node at the end of the doubly linked list
void insertAtTail(Node *&head, Node *&tail, int value) 
{
    Node *newNode = new Node(value); // Create a new node with the given value
    if (tail == NULL) 
    {
        head = newNode; // If the list is empty, set the new node as the head and tail
        tail = newNode;
        return;
    }
    tail->next = newNode; // Link the last node to the new node
    newNode->prev = tail; // Link the new node back to the last node
    tail = newNode; // Update the tail to the new node
}

int main() {
    Node *head = NULL; // Initialize the head of the list to NULL
    Node *tail = NULL; // Initialize the tail of the list to NULL
    int value;

    while (true) 
    {
        cin >> value; // Read a value from  user
        if (value == -1)
            {
                break;
            }         
        insertAtTail(head, tail, value); // Insert the value at the end of the list
    }
    printDoublyLinkedList(head); // Print the doubly linked list
    return 0;
}
