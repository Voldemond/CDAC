#include<cstdio>
using namespace std;

int main()
{
	typedef unsigned int SizeofVar;
	int Num1=100;
	printf("%d\n", Num1);
	SizeofVar size=sizeof(Num1);
	printf("Size of Num1:%d\n",size);

	size_t S=sizeof(Num1);
	printf("Size of Var by using size_t typedef: %d\n",S);
	return 0;
}

int main3()
{
	typedef int Malkeet;
	Malkeet Num1=100;

	printf("Value of Num1:%d\n",Num1);
	return 0;
}
int main2()
{
	int Num1=100;
	printf("%d\n", Num1);
	unsigned int size=sizeof(Num1);
	printf("Size of Num1:%d\n",size);
	return 0;
}
int main1()
{
	int Num1=100;

	printf("Hello C++\n");
	printf("%d\n", Num1);

	printf("%d\n",sizeof(int));		//4 Byte
	printf("Size of Num1: %d\n",sizeof(Num1));	//4 Byte
	printf("Address of Num1: %p\n",&Num1);
	return 0;
}
