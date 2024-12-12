#include "../MyHeaderFiles/Student"
#include <iostream>
using namespace std;
void Student:: AddRecord()
	{
		cout<<"Enter Roll No:	"<<endl;
		cin>>RollNo;
		cout<<"Enter Name:	"<<endl;
		cin>>Name;
	}
	void Student:: PrintRecord()
	{
		cout<<"Roll No:		"<<RollNo<<"  Name:		"<<Name<<endl;
	}
