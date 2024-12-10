#include<cstdio>  //C style Header File
using namespace std;
int main()
{
	int *ptrNum const;  //Invalid Declaration
	return 0;
}
int main2()
{
	int Num1=100;		//Num1 is non-constant local variable
	const int Num2=200;

	//int *const ptrNum=&Num1;	//ptrNum is constant local pointer variable which is ready to store address of non-constant integer variable

	int *const ptrNum=&Num2;	//NOT OK, ptrNum is constant pointer variable which is ready to take address of non-constant integer variable only

	printf("Address of Num2:%p\n",&Num2);
	printf("Address of Num2:%p\n",ptrNum);


	return 0;
}

int main1()
{
	int Num1=100;		//Num1 is non-constant local variable
	int Num2=200;
	int *const ptrNum=&Num1;	//ptrNum is constant local pointer variable which is ready to store address of non-constant integer variable

	//ptrNum=&Num2;	//NOT OK, becouse ptrNum is constant pointer variable to whom address can be assigned only once

	printf("Address of Num1:%p\n",&Num1);
	printf("Address of Num1:%p\n",ptrNum);


	return 0;
}
