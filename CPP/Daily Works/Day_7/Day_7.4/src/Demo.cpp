#include <iostream>
using namespace std;

template<typename T>
T Add(T Num1, T Num2)
{
	return Num1+Num2;
}

int main()
{
	int Num1=100;
	int Num2=200;

	int Res=Add(Num1,Num2);
	cout<<"Sum of Two int is :	"<<Res<<endl;

	float Resf=Add(100.50f, 200.56f);
	cout<<"Sum of Two Float is :	"<<Resf<<endl;


	cout<<"Sum of Two Double is :	"<<Add(345.90,789.90)<<endl;

}
