#include<cstdio>  //C style Header File
using namespace std;

int main()
{
	int Num1=90;
	int *ptrNum1;

	int* ptr;	//OK
	int * ptr1;	//OK
	//int ptr*;  //Not OK

	ptrNum1=&Num1;

	printf("%d\n",Num1);	//90
	printf("%p\n",&Num1);	//Address of Num1
	printf("%p\n",ptrNum1);		//Value of ptrNum1 which is actually address of Num1
	printf("%p\n",&ptrNum1);	//Address of ptrNum1 variable
	printf("%d\n",*ptrNum1);	//90, value at the memory whose address is stored inside ptrNum1 (Dereferencing)

	return 0;
}

int main1()
{
	//Num1 is a variable of type int
	int Num1=60;  //Every defined variable has a memory address
	printf("Value of Num1:%d\n",Num1);
	printf("Address of Num1:%p\n",&Num1);
	printf("Size of Num1:%d\n",sizeof(Num1));

	int *ptr;	//ptr is pointer variable of type int

	ptr=&Num1;  //Assignment of the address of Num1 to the pointer variable ptr

	printf("Value of ptr:%p\n",ptr);
	printf("Address of ptr:%p\n",&ptr);
	printf("Size of ptr:%d\n",sizeof(ptr));

	printf("Value of Num1 using ptr variable:%d\n",*ptr);  //Dereferencing

	*ptr=100; //Dereferencing
	printf("Value of Num1:%d\n",Num1);


	return 0;
}
