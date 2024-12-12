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
	using namespace na;
	using namespace nb;
	printf("Num1:	%d\n",Num1);
	printf("Num2:	%d\n",Num2);
	printf("Num3:	%d\n",Num3);
	printf("Num4:	%d\n",Num4);
	return 0;
}

