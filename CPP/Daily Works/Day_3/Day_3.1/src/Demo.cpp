#include<cstdio>
using namespace std;
int main()
{

	const int Num1=100;
	const int *ptrNum1=&Num1;

	//*ptrNum1=300;	//NOT OK

	printf("Value of Num1:%d\n",Num1);		//100
	printf("Value of Num1 using Dref:%d\n",*ptrNum1);	//100

	int *ptrNum2=(int*)&Num1;
	*ptrNum2=400;	//OK
	printf("Value of Num1:%d\n",Num1);		//100
	printf("Value of Num1 using Dref:%d\n",*ptrNum2);	//400   //Un-Expected Behavior

	return 0;
}
int main1()
{
	int Num1=100;	//Num1 is non-constant method local variable

	int *ptrNum=&Num1;	//ptrNum is non-constant local pointer variable

	*ptrNum=200;	//OK

	printf("Value of Num1:%d\n",Num1);		//200
	printf("Value of Num1 using Dref:%d\n",*ptrNum);	//200


	const int *ptrNum2=&Num1;	//Num1 is read-only variable for ptrNum2
	//*ptrNum2=400;	//NOT OK

	printf("Value of Num1:%d\n",Num1);		//200
	printf("Value of Num1 using Dref:%d\n",*ptrNum2);	//200

	return 0;
}
