#include <iostream>
using namespace std;

class Test
{
private:
	int Num1;
	int Num2;
public:
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

	Test& operator=(Test &ref)
	{
		this->Num1=ref.Num1;
		this->Num2=ref.Num2;

		return (*this);
	}

	//friend ostream& operator<<(ostream &cout, Test &ref);
	//friend istream& operator>>(istream &cin, Test &ref);
	friend ostream& operator<<(ostream &cout, Test &ref)
	{
		cout<<"Num1:	"<<ref.Num1<<endl;
		cout<<"Num1:	"<<ref.Num2<<endl;
		return cout;
	}
	friend istream& operator>>(istream &cin, Test &ref)
	{
		cout<<"Enter Num1:	";
		cin>>ref.Num1;
		cout<<"Enter Num2:	";
		cin>>ref.Num2;
		return cin;
	}
};

int main()
{
	Test t1(10,20);				//Parameterized cons
	Test t2;					//Parameterless cons
	Test t3=t1;					//Copy Constructor: Shallow Copy, Initialization
	t2=t1;						//t2.operator=(&t2, t1): Shallow Copy

	//cout<<t2;

	Test t4;


	t4=t3=t1;					//t4.operator=(&t4,(t3.operator=(&t3,t1))
	cout<<t4;
}
int main1()
{
	Test t1;
	cin>>t1;
	cout<<t1;		//cout.operator<<(cout, t1)
}
