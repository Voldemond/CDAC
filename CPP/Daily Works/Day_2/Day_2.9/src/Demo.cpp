#include<cstdio>  //C style Header File
using namespace std;
int main()
{
	const int Num1=890;		//OK

	const int *const ptrNum=&Num1;	//Here ptrNum is constant pointer variable which is ready to store the address of constant integer variable

	//ptrNum=&Num1;	//NOT OK

	printf("Value of Num1 using Dereferencing:%d\n",*ptrNum);

	return 0;
}
