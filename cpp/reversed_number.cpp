#include <bits/stdc++.h>
using namespace std;

// reverse a number, and find the difference of the absolute value
// between the original number and the reversed number.
// if the absolute value mod a given number k equals to zero
// it's a beautiful day.
int beautifulDays(int i, int j, int k) {

    int remainder;
    int reversedNum;
    int ans = 0;
    int temp = i;

    while (temp <= j) {
        reversedNum = 0;

        // reverse a number
        while (temp != 0) {
            remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp = temp / 10;
        }
        if (abs(i - reversedNum) % k == 0) {
            ans++;
        }
        i++;
        temp = i;
    }

    return ans;
}

int main() {
    int result = beautifulDays(20, 23, 6);
    cout << "result is " << result;

}
