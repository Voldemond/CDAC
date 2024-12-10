#include<cstdio>  //C style Header File
using namespace std;
int main()
{
	int *ptr=NULL;		//While declaring a pointer variable if you assign NULL value to it, then the pointer is know as Null-Pointer
	printf("Value of ptr:%p\n",ptr);		//Value of ptr is always a address of the memory
	printf("Address of ptr:%p\n",&ptr);

	return 0;
}
int main1()
{

	int *ptr;	//Un-inialized pointer variable is known as wild-pointer, becouse it will pointing to a any memory address

	printf("Value of ptr:%p\n",ptr);		//Value of ptr is always a address of the memory
	printf("Address of ptr:%p\n",&ptr);

	//printf("Value by using ptr:%d\n",*ptr);

	return 0;
}
