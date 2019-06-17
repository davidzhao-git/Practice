#include<bits/stdc++.h>
#include<map>
using namespace std;

int migratoryBirds(vector<int> arr) {

    int typeID1 = 0;
    int typeID2 = 0;
    int typeID3 = 0;
    int typeID4 = 0;
    int typeID5 = 0;

    int i = 0;
    while (i < arr.size()) {
        int temp = arr[i];
        switch(temp) {
            case 1:
                typeID1++;
                break;
            case 2:
                typeID2++;
                break;
            case 3:
                typeID3++;
                break;
            case 4:
                typeID4++;
                break;
            case 5:
                typeID5++;
                break;
        }
        i++;
    }
    /* cout << typeID1 << endl;
    cout << typeID2 << endl;
    cout << typeID3 << endl;
    cout << typeID4 << endl;
    cout << typeID5 << endl;
    */

    map<int, int> the_map;
    the_map[1] = typeID1;
    the_map[2] = typeID2;
    the_map[3] = typeID3;
    the_map[4] = typeID4;
    the_map[5] = typeID5;

    int max = 0;
    int index;
    for (int j = 1; j <= the_map.size(); j++) {
        if (the_map[j] > max) {
            max = the_map[j];
            index = j;
        }
    }
    return index;

}

int main() {

    vector<int> arr;
    arr.push_back(1);
    arr.push_back(4);
    arr.push_back(4);
    arr.push_back(4);
    arr.push_back(5);
    arr.push_back(3);

    cout << "Result " << migratoryBirds(arr);
}
