#include <bits/stdc++.h>
using namespace std;

/*
// start = 0;
// end = size of the array; 
int partition(int arr[], int start, int end) {
    
    int pivot = arr[start];
    int b = start;      // b is the boundary 
    
    for (int i = start + 1; i <= end; i++) {
        if (arr[i] < pivot) {
            b++;
            swap(arr[b], arr[i]);
        }
    }
    swap(arr[b], arr[start]);
    return b;
}

void quicksort(int arr[], int start, int end) {
    if (start >= end) {
        return;
    }
    int pivot_index = partition(arr, start, end);
    quicksort(arr, start, pivot_index-1);
    quicksort(arr, pivot_index+1, end);
}

int k_select(int arr[], int start, int end, int k) {
    
    if (start > end) {
        cout << "please check your input " << endl;
        exit(1);
    }
    int p_index = partition(arr, start, end);
    
    if (p_index = k) {
        return arr[p_index];
    }
    else if (p_index < k) {
        return k_select(arr, p_index+1, end, k-p_index);
    }
    else {
        return k_select(arr, start, p_index-1, k);
    }
    
}


int main() {
    
    int arr[] = {7, -21, 3, 4, 1, -20, 6};
    int size = sizeof(arr) / sizeof(arr[0]);
    // cout << "the size is " << size << endl;
    
    int median_index = (size) / 2;
    
    // quicksort(arr, 0, size);
    
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    int select_value = k_select(arr, 0, size-1, 3);
    
    cout << "the selected value = " << select_value << endl;
    
    quicksort(arr, 0, size-1);
    
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}
*/

// CPP program for implementation of QuickSelect 
#include <bits/stdc++.h> 
using namespace std; 
  
// Standard partition process of QuickSort(). 
// It considers the last element as pivot 
// and moves all smaller element to left of 
// it and greater elements to right 
/* int partition(int arr[], int l, int r) 
{ 
    int x = arr[r], i = l; 
    
    for (int j = l; j <= r - 1; j++) { 
        if (arr[j] <= x) { 
            swap(arr[i], arr[j]); 
            i++; 
        } 
    } 
    swap(arr[i], arr[r]); 
    return i; 
    
}
*/
int partition(int arr[], int start, int end) { 
    
    int pivot = arr[start];
    int b = start-1;
    
    for (int i = start+1; i <= end; i++) {
        if (arr[i] < pivot) {
            b++;
            swap(arr[i], arr[b]);
        }
    }
    swap(arr[b], arr[start]);
    return b;
    
} 
  
// This function returns k'th smallest  
// element in arr[l..r] using QuickSort  
// based method.  ASSUMPTION: ALL ELEMENTS 
// IN ARR[] ARE DISTINCT 
int kthSmallest(int arr[], int l, int r, int k) 
{ 
    // If k is smaller than number of  
    // elements in array 
    if (k > 0 && k <= r - l + 1) { 
  
        // Partition the array around last  
        // element and get position of pivot  
        // element in sorted array 
        int index = partition(arr, l, r); 
  
        // If position is same as k 
        if (index - l == k - 1) 
            return arr[index]; 
  
        // If position is more, recur  
        // for left subarray 
        if (index - l > k - 1)  
            return kthSmallest(arr, l, index - 1, k); 
  
        // Else recur for right subarray 
        return kthSmallest(arr, index + 1, r,  
                            k - index + l - 1); 
    } 
  
    // If k is more than number of  
    // elements in array 
    return INT_MAX; 
} 
  
// Driver program to test above methods 
int main() 
{ 
    int arr[] = { 10, 4, 5, 8, 6, 11, 26 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    int k = 2; 
    cout << "K-th smallest element is " 
        << kthSmallest(arr, 0, n - 1, k); 
    return 0; 
} 
