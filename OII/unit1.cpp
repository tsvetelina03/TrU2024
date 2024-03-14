
#include <iostream>
using namespace std;

struct Node {
    string data;
    Node* next;
};

Node* newNode(string data)
{
    Node* new_node = new Node;
    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}

Node* insertEnd(Node* head, string data)
{
    if (head == NULL)
        return newNode(data);
    else
        head->next = insertEnd(head->next, data);
    return head;
}

void traverse(Node* head)
{
    if (head == NULL)
        return;
    cout << head->data << " ";
    traverse(head->next);
}

int main()
{
    Node* head = NULL;
    head = insertEnd(head, "Plovdiv");
    head = insertEnd(head, "Stara Zagora");
    head = insertEnd(head, "Kazanluk");
    head = insertEnd(head, "Karlovo");
    head = insertEnd(head, "Kalofer");
    traverse(head);
}

