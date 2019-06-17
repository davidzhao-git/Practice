#include <iostream>
using namespace std;

struct Test {
	
	int n = 10;
	float f = 21.22;
};

int main() {
	
	int integer_value = 5;
	float float_value = 8.3;
	Test testObj; 

	void *ptr;
	ptr = &integer_value;
	int *int_ptr = static_cast<int*>(ptr);
	cout << "deference... int value is " << *int_ptr << endl;
	
	ptr = &float_value;
	float *float_ptr = static_cast<float*>(ptr);
	cout << "deference... float value is " << *float_ptr << endl;
	
	ptr = &testObj;
	Test *test_ptr = static_cast<Test*>(ptr);
	cout << "deference... int in object " << (*test_ptr).n << endl;
	cout << "deference... float in object " << (*test_ptr).f << endl;
	
    
	return 0;
}