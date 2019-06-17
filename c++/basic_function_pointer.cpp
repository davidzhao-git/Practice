#include <iostream>
using namespace std;

void printHello() {
    cout << "Hello World! \n";
}

void getHello(void (*funcHello)()) {
    funcHello();
}

int getNum(int x) {
    return x;
}

char getChar(char y) {
    return y;
}

int main(int argc, const char * argv[]) {
    
    // declare a pointer
    void (*ptr)() = printHello;
    (*ptr)();
    
    int (*ptrNum)(int) = getNum;
    cout << (*ptrNum)(6) << "\n";
    // cout << ptrNum(6) << "\n"; - It's the same as above
    
    char (*ptrChar)(char) = getChar;
    cout << ptrChar('H') << endl;
    
    getHello(printHello);   // printHello - callback function
    
    return 0;
    
}
