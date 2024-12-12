#include <iostream>
#include <string.h>
using namespace std;

class Student		//Empty Class
{

};


int main()
{
	Student S1;

	cout<<"Address of S1:	"<<&S1<<endl;
	cout<<"Size of S1:	"<<sizeof(S1);
	return 0;
}

