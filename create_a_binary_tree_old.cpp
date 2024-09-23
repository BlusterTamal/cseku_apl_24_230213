#include <bits/stdc++.h>
using namespace std;

class Node 
{
public:
    int val;
    Node *left;
    Node *right;

    Node(int val) 
    {
        this->val = val;
        this->left = NULL;
        this->right = NULL;
    }
};

Node* create_binary_tree() 
{
    int val;
    cout << "Enter value for root node: ";
    cin >> val;
    Node *root = new Node(val);

    queue<Node*> q;
    q.push(root);

    while (!q.empty()) 
    {
        Node *temp = q.front();
        q.pop();

        cout << "Enter left child of " << temp->val << " (-1 for no child): ";
        cin >> val;
        if (val != -1) 
        {
            temp->left = new Node(val);
            q.push(temp->left);
        }

        cout << "Enter right child of " << temp->val << " (-1 for no child): ";
        cin >> val;
        if (val != -1) 
        {
            temp->right = new Node(val);
            q.push(temp->right);
        }
    }

    return root;
}

int main() 
{
    Node *root = create_binary_tree();
    return 0;
}
