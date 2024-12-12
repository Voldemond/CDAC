#include <iostream>
#include <string.h>
using namespace std;

class Student
{
public:
	int RollNo;
	char Name[30];
	void AddRecord();
	void PrintRecord();
	void SetRecord(int RollNo, char Name[30])
	{
		this->RollNo=RollNo;
		//this->Name=Name;
		strcpy(this->Name, Name);
	}
};

void Student:: AddRecord(/*const Student *this*/)
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
int main()
{

	Student S1;
	Student S2;
	S1.AddRecord();			//S1.AddRecord(&S1);
	S1.PrintRecord();		//S1.PrintRecord(&S1);

	S2.SetRecord(102, "Mahesh");
	S2.PrintRecord();

	return 0;
}

