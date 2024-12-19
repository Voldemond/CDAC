#include <iostream>
#include <thread>
#include <typeinfo>
using namespace std;

//Callable Function accepting on Parameter
void MyFun(int X)
{
	for(int i=0;i<X;i++)
	{
		cout<<i<<endl;
	}
}
int main()
{
	//thread th1(callableItem,parameter);
	//thread th1;		//Thread

	thread th(MyFun,5);
	return 0;
}
