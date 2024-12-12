#include <cstdio>
static int Num1=200;
int main()
{
	int Num1=100;
	printf("Local Num1:	%d\n",Num1);		//100
	//extern static int Num1;		//NOT OK
	printf("Global Num1:	%d\n",::Num1);	//200
	return 0;
}
