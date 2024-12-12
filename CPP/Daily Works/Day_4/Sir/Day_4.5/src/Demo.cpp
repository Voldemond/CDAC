#include <cstdio>
static int Num3=400;	//File Scope
int Num1=200;		//Program Scope
int main()
{
	int Num2=100;	//Function Scope

	for(int i=0;i<5;i++)	//Block Scope
	{

	}
	return 0;
}
int Add(int X, int Y)	//X and Y having Function Prototype Scope
{
	//TODO
}
