#include<cstdio>  //C style Header File
using namespace std;
void Add(int, int);	//Function Prototype
int main()
{
	int Num1=100;
	printf("Value of Num1:%d\n",Num1);
	printf("Address of Num1:%p\n",&Num1);
	Add(100,200);	//Here 100 and 200 are arguments
	return 0;
}

void Add(int x, int y)	//Here X and Y are Parameters
{
	int res=x+y;
	printf("The Sum of X and Y:%d\n",res);
}
