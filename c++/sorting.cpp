#include <stdio.h>
#include <iostream>
using namespace std;

int desc_compare(int x, int y) {
    if (x > y) {
        return -1;
    }
    return 1;
}

int asc_compare(int x, int y) {
    if (x > y) {
        return 1;
    }
    return -1;
}

void bubbleSort(int *arr, int n, int (*compare)(int x, int y)) {
    int temp;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-1; j++) {
            if (compare(arr[j], arr[j+1]) > 0) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

/*
A void pointer (void *) is a pointer that has no associated data type it.
The pointer can hold address of any type and can be type casted to any type.
*/

int compare_quickSort(const void *x, const void *y) {
    return (*((int *)x)) - (*((int *)y));
    // return (*((int *)y)) - (*((int *)y));
}

int main() {
    int arr[] = {50, 2, 20, 30, 2, 1, 76};
    bubbleSort(arr, 7, desc_compare);
    
    
    cout << "Descending Order: ";
    for (int i = 0; i < 7; i++) {
        cout << arr[i] << " ";
    }
    
    cout << endl << "Ascending Order: ";
    bubbleSort(arr, 7, asc_compare);
    for (int i = 0; i < 7; i++) {
        cout << arr[i] << " ";
    }
    
    cout << endl << "Quick Sort: ";
    qsort(arr, 7, sizeof(int), compare_quickSort);
    for (int i = 0; i < 7; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    return 0;
}
