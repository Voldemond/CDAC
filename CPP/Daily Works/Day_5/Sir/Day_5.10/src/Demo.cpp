#include <iostream>
#include <string.h>
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
	Test(int Data)
	{
		this->Num1=Data;
		this->Num2=Data;
	}
	Test(int Num1, int Num2)
	{
		this->Num1=Num1;
		this->Num2=Num2;
	}

	void PrintData()
	{
		cout<<"Num1:	"<<this->Num1<<"    Num2:	"<<this->Num2<<endl;
	}
};


int main()
{
	Test t1;		//Parameterless cons will be called;
	Test t2(10);	//Constructor with one parameter will be called

	Test t3=100;	//Test t3(100);Constructor with one parameter will be called

	//Test t4=40,50;	//Compilation Error

	Test t4=(40,50);	//

	Test (100,500);		//Constructor with two parameter will be called

	Test t5{100,300};	//here t5 object is being initialized with initializer list
	t5.PrintData();
	t4.PrintData();
	t3.PrintData();
	return 0;
}
