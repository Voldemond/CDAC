#include <iostream>
#include <cstdio>
namespace na
{
int Num1=100;
void Method1()
{
	printf("Am Method1 under na\n");
}
namespace nb		//Nested Namespace
{
int Num2=200;
void Method1()
{
	printf("Am Method1 under nb\n");
}
}
}

int main()
{

	printf("Num1:	%d\n",na::Num1);
	printf("Num2:	%d\n",na::nb::Num2);
	na::nb::Method1();
	return 0;
}

