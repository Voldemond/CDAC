#include<cstdio>  //C style Header File
using namespace std;
int main()
{

	const int Num1=100;		//OK
	//const int Num2;		//NOT OK
	printf("Value of Num1:%d\n",Num1);

	//Num1=450;		//NOT OK
	printf("Value of Num1:%d\n",Num1);

	return 0;
}

