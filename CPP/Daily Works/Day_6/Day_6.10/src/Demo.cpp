#include <iostream>
using namespace std;


class A
{
public:
	int Num1;
};

class B: virtual public A
{

};
class C: virtual public A
{

};


class D: public B, public C
{
public:
	void ShowData()
	{
		cout<<"Num1 :"<<this->B::Num1<<endl;
		cout<<"Num1 :"<<this->C::Num1<<endl;
	}
};



int main()
{

	D d;
	d.B::Num1=100;
	d.C::Num1=200;
	d.ShowData();
	return 0;
}
