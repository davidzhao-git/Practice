#include <bits/stdc++.h>
using namespace std;

class SinglyLinkedListNode {
    public:
        int data;
        SinglyLinkedListNode *next;

        SinglyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = nullptr;
        }
};

SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {

    if (head == nullptr) {
        return head;
    }

    SinglyLinkedListNode *temp = new SinglyLinkedListNode(data);
    SinglyLinkedListNode *front = head;

    while (front->next != nullptr) {
        front = front->next;
    }
    front->next = temp;

    return head;
}

SinglyLinkedListNode* insertNodeAtHead(SinglyLinkedListNode* llist, int data) {

    if (llist == nullptr) {
        return llist;
    }

    SinglyLinkedListNode *temp = new SinglyLinkedListNode(data);
    temp->next = llist;
    llist = temp;

    return llist;
}

int main() {
    SinglyLinkedListNode *node = new SinglyLinkedListNode(10);
    node = insertNodeAtHead(node, 20);
    node = insertNodeAtHead(node, 4);
    node = insertNodeAtTail(node, 77);
    node = insertNodeAtTail(node, 63);

    while (node != nullptr) {
        cout << node->data << endl;
        node = node->next;
    }
}
