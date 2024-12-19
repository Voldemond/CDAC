#include <iostream>
#include <typeinfo>
using namespace std;
class Test
{
public:
	int Num1;
	int Num2;
	Test()
	{
		this->Num1=0;
		this->Num2=0;
	}
	Test(int Num1, int Num2)
	{
		this->Num1=Num1;
		this->Num2=Num2;
	}
	virtual void Method1()
	{

	}
	void Display()
	{
		cout<<"Num1:	"<<this->Num1<<endl;
		cout<<"Num2:	"<<this->Num2<<endl;
	}
	/*const Test *const this*/
	void ShowData()const
	{
		cout<<"Num1:	"<<this->Num1<<endl;
		cout<<"Num2:	"<<this->Num2<<endl;

		Test *const ptr=(Test *const)this;		//C Style
		Test *const pt=const_cast<Test *const>(this);
		pt->Display();
	}
};
class TestTwo:public Test
{
public:
	void Method1()
	{
		cout<<"Am Method1 of Test2"<<endl;
	}
};
int main()
{
	Test *ptr=new TestTwo();		//Up-casting

	cout<<"Type of ptr:	"<<typeid(ptr).name()<<endl;

	const type_info &t=typeid(*ptr);
	cout<<"Type of object to which ptr is pointing:	"<<t.name()<<endl;


	return 0;
}
int main2()
{
	const Test t1(100,200);
	t1.ShowData();			//const object can only call const member function
	//t1.Display();			//const object can not call non-member function
	return 0;
}
int main1()
{
	Test *ptr=new Test(10,30);

	//int *pt=(int*)ptr;		//C Style Conversion

	int *pt=reinterpret_cast<int*>(ptr);

	*pt=500;
	pt=pt+1;
	*pt=600;
	ptr->Display();
	return 0;
}
