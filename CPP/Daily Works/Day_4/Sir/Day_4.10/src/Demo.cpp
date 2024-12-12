#include <iostream>
#include <cstdio>
namespace na
{
int Num1=100;
}
namespace na
{
//int Num1=300;		//NOT OK
int Num2=200;
}
int main()
{

	printf("Num1:	%d\n",na::Num1);
	printf("Num2:	%d\n",na::Num2);
	return 0;
}

