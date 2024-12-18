#include <iostream>
using namespace std;

class Test {
	int Num1;
	int Num2;
public:
	virtual void Method1() {
		cout << "Am Method1 of Test" << endl;
	}
	virtual void Method2() {
		cout << "Am Method2 of Test" << endl;
	}
	void Method3() {
		cout << "Am Method3 of Test" << endl;
	}
	virtual void Method4() {
		cout << "Am Method4 of Test" << endl;
	}
	virtual void Method5() {
		cout << "Am Method5 of Test" << endl;
	}

};
class TestDrived: public Test {
public:
	void Method1() {
		cout << "Am Method1 of TestDervied" << endl;
	}
	void Method2() {
		cout << "Am Method2 of TestDerived" << endl;
	}
	void Method4() {
		cout << "Am Method5 of TestDerived" << endl;
	}
	void Method5() {
			cout << "Am Method5 of TestDerived" << endl;
		}
};
int main() {
	TestDrived *ptr = new TestDrived();
	ptr->Method1();		//Late Binding
	ptr->Method2();		//Early Binding
	return 0;
}
int main4() {
	Test *ptr = new TestDrived();  //Upcasting
	ptr->Method1();	//if the call is with ref/pointer and method is virtual: Late Binding
	ptr->Method2();		//Early Binding
	return 0;
}
int main3() {
	Test *ptr = new TestDrived();  //Upcasting
	ptr->Method1();	//if the call is with ref/pointer and method is not virtual: Early Binding
	ptr->Method2();		//Early Binding
	return 0;
}
int main2() {
	Test *ptr = new Test();
	ptr->Method1();	//if the call is with ref/pointer and method is not virtual: Early Binding
	ptr->Method2();		//Early Binding
	return 0;
}
int main1() {
	Test t1;
	t1.Method1();		//Early Binding
	t1.Method2();		//Early Binding
	return 0;
}
