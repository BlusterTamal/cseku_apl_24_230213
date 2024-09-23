#include <bits/stdc++.h>
using namespace std;

// Definition of the Node class
class Node 
{
public:
    int value; // Value of the node
    Node *next; // Pointer to the next node

    // Constructor to initialize the node with a value
    Node(int value) 
    {
        this->value = value;
        this->next = NULL;
    }
};

// Function to insert a new node at the end of the linked list
void insertAtTail(Node *&head, int value) 
{
    Node *newNode = new Node(value); // Create a new node with the given value
    if (head == NULL) 
    {
        head = newNode; // If the list is empty, set the new node as the head
        return;
    }

    Node *current = head; // Start from the head of the list
    while (current->next != NULL) 
    {
        current = current->next; // Traverse to the end of the list
    }
    current->next = newNode; // Link the last node to the new node
}

// Function to print the linked list
void printLinkedList(Node *head) 
{
    cout << endl;
    cout << "Your Linked List: ";
    Node *current = head; // Start from the head of the list
    
    while (current != NULL)
    {
        cout << current->value << " "; // Print the value of the current node
        current = current->next; // Move to the next node
    }
    cout << endl << endl;
}

int main() 
{
    int value;
    Node *head = NULL; // Initialize the head of the list to NULL
    while (true) 
    {
        cin >> value; // Read a value from user
        if (value == -1)
        {
            break; // If the value is -1 exit the loop
        }
        insertAtTail(head, value); // Insert the value at the end of the list
    }
    printLinkedList(head); // Print the linked list
    return 0;
}
