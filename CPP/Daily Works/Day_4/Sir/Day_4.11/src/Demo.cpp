#include <iostream>
#include <cstdio>
namespace na
{
int Num1=100;
void Method1()
{
	printf("Am Method1 under na\n");
}
}
namespace nb
{
int Num2=200;
void Method1()
{
	printf("Am Method1 under nb\n");
}
}
int main()
{
	using namespace na;
	using namespace nb;
	na::Method1();
	return 0;
}
int main1()
{

	printf("Num1:	%d\n",na::Num1);
	printf("Num2:	%d\n",nb::Num2);
	na::Method1();
	nb::Method1();
	return 0;
}

