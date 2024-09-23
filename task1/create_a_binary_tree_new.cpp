#include <bits/stdc++.h>
using namespace std;

// Definition of the Node class
class Node 
{
public:
    int value;
    Node *left; // Pointer to the left child
    Node *right; // Pointer to the right child

    // Constructor to initialize the node with a value
    Node(int value) 
    {
        this->value = value;
        this->left = NULL;
        this->right = NULL;
    }
};

// Function to create a binary tree from user input
Node* createBinaryTree() 
{
    int value;
    cout << "Enter value for root node: ";
    cin >> value;
    Node *root = new Node(value); // Create the root node

    queue<Node*> nq;
    nq.push(root); // Push the root node to the queue

    while (!nq.empty()) 
    {
        Node *currentnode = nq.front(); // Get the front node from the queue
        nq.pop(); // Remove the front node from the queue

        // Input and create the left child
        cout << "Enter left child of " << currentnode->value << " (-1 for no child): ";
        cin >> value;
        if (value != -1) 
        {
            currentnode->left = new Node(value); // Create and link the left child
            nq.push(currentnode->left); // Push the left child to the queue
        }

        // Input and create the right child
        cout << "Enter right child of " << currentnode->value << " (-1 for no child): ";
        cin >> value;
        if (value != -1) 
        {
            currentnode->right = new Node(value); // Create and link the right child
            nq.push(currentnode->right); // Push the right child to the queue
        }
    }

    return root; // Return the root of the created tree
}

int main() 
{
    Node *root = createBinaryTree(); // Create the tree from user input

    // The tree is now created

    return 0;
}
