#include <iostream>
using namespace std;

class Demo
{
public:
	virtual void Show()
	{
		cout<<"Am Show of Demo"<<endl;
	}
};
class Demo1: public Demo
{
public:
	void Show()
	{
		//this->Demo::Show();
		cout<<"Am Show of Demo1"<<endl;
	}
};

int main()
{
	Demo1 obj;

	obj.Show();
	return 0;
}

int main1()
{
	Demo1 obj;

	obj.Show();				//Early Binding
	Demo1 *ptr=&obj;		//ptr is of Derived class and Object is also of Derived class

	ptr->Show();			//Early Binding
	Demo *pt=&obj;			//Up-casting

	pt->Show();				//Early Binding in case of Show is non-virtual in base class, Late Binding in case of Show is virtual in Base class
	return 0;
}
