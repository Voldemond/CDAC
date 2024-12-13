#include <iostream>
#include <string.h>
using namespace std;

class Test
{
public:
	int Num1;
	int Num2;
	Test():Num1(100),Num2(200)		//Constructor Member Initializer List
	{
		//this->Num1=0;
		//this->Num2=0;
	}
	Test(int Data)
	{
		this->Num1=Data;
		this->Num2=Data;
	}
	Test(int ,int );

	void PrintData()
	{
		cout<<"Num1:	"<<this->Num1<<"    Num2:	"<<this->Num2<<endl;
	}
};

Test::Test(int Num1, int Num2):Num1(Num1),Num2(Num2)
{

}
int main()
{
	Test t1;		//Parameterless cons will be called
	t1.PrintData();

	Test t2(300,400);	//cons with two-parameter will be called
	t2.PrintData();
	return 0;
}
