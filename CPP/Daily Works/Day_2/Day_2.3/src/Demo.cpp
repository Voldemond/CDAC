#include<cstdio>  //C style Header File
using namespace std;
int X=90;
int Y;
int main()
{
	int Num1;	//Declaration + Definition
	printf("Value of Num1:%d\n",Num1);
	printf("Size of Num1:%d\n",sizeof(Num1));
	printf("Address of Num1:%p\n",&Num1);

	int Num2=90;	//Declaration + Definition + Initialization
	Num2=100;		//We can do assignment multiple time
	Num2=89;

	return 0;
}
void Add(int x, int y)
{
	int z=x+y;
}
