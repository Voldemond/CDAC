#include <cstdio>

namespace na
{
int Num1=100;
int Num2=300;
}
namespace nb
{
int Num3=200;
int Num4=400;
}
int main()
{
	printf("Num1:	%d\n",na::Num1);
	printf("Num2:	%d\n",na::Num2);
	printf("Num3:	%d\n",nb::Num3);
	printf("Num3:	%d\n",nb::Num3);
	return 0;
}

