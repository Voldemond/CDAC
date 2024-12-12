#include <cstdio>
int main()
{
	extern int Var1;
	printf("Global Var1:	%d\n",Var1);
	return 0;
}
int main1()
{
	//int Num1=90;
	extern int Num1;		//Here extern will look for Num1 which is declared globally or externally
	//printf("%d\n",Num1);		//Local Variable
	printf("Global Num1:	%d\n",Num1);
	Num1=200;
	printf("Global Num1:	%d\n",Num1);
	return 0;
}
int Num1=100;
