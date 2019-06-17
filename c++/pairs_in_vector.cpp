#include<bits/stdc++.h>
using namespace std;

int main() {

    vector<pair<int, int>> vect;
    int arr1[] = {10, 20, 3, 100};
    int arr2[] = {5, 1, 11, 22};
    int n = sizeof(arr1)/sizeof(arr1[0]);

    for (int i = 0; i < n; i++) {
        vect.push_back(make_pair(arr1[i], arr2[i]));
    }

    for (int j = 0; j < n; j++) {
        cout << vect[j].first << " " << vect[j].second << endl;
    }
}
