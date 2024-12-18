#include <iostream>
#include <typeinfo>
using namespace std;

class Test {
	int Num1;
	int Num2;
public:
	virtual void Method1() {			//Polymorphic Class
		cout << "Am Method1 of Test" << endl;
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
int main()
{
	Test *ptr=new TestDrived();
	const type_info &t=typeid(*ptr);

	cout<<"Type of ptr:	"<<t.name()<<endl;

	return 0;
}
int main3() {

	Test *ptr=new TestDrived();
	TestDrived *pt=new TestDrived();

	const type_info &t=typeid(pt);

	cout<<"Type of pt:	"<<t.name()<<endl;


	return 0;
}
int main2() {

	int Num1;

	const type_info &type=typeid(Num1);


	cout<<"Type of Num1:	"<<type.name()<<endl;


	return 0;
}
int main1() {
	Test t1;
	size_t t1Size=sizeof(t1);

	cout<<"Size of t1 Object:	"<<t1Size<<endl;


	return 0;
}

