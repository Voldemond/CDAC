#include <iostream>
using namespace std;

class Demo1
{
public:
	int Num1;
	int Num2;

	Demo1()
	{
		this->Num1=0;
		this->Num2=0;
	}
	Demo1(int Num1, int Num2)
	{
		this->Num1=Num1;
		this->Num2=Num2;
	}
	void ShowData()
	{
		cout<<"Num1:	"<<this->Num1<<endl;
		cout<<"Num2:	"<<this->Num2<<endl;
	}
};
class Demo2: public Demo1
{
public:
	int Num3;
	int Num4;

	Demo2()
	{
		this->Num1=0;
		this->Num2=0;
		this->Num3=0;
		this->Num4=0;
	}
	Demo2(int Num1, int Num2, int Num3, int Num4)
	{
		this->Num1=Num1;
		this->Num2=Num2;
		this->Num3=Num3;
		this->Num4=Num4;
	}
	void ShowData()
	{
		cout<<"Num1:	"<<this->Num1<<endl;
		cout<<"Num2:	"<<this->Num2<<endl;
		cout<<"Num3:	"<<this->Num3<<endl;
		cout<<"Num4:	"<<this->Num4<<endl;
	}
};
int main()
{
	Demo1 d1;				//It will call parameterless cons of class Demo1

	Demo2 d2(10,20,30,40);	//It will call parameterized cons of class Demo2

	d1=d2;					//Here d2 will be sliced of and only those data member will be copied which are there in base class

	d1.ShowData();

}
