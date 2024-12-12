#include <cstdio>

namespace na
{
int Num1=100;
//Class
//Method
//Structure
//Main Method not allowed
}
namespace nb
{
int Num1=200;
}
int Num1=50;
int main()
{

	int Num1=30;
	printf("Num1:	%d\n",na::Num1);
	printf("Num1:	%d\n",nb::Num1);
	printf("Num1:	%d\n",Num1);
	printf("Num1:	%d\n",::Num1);
	return 0;
}

