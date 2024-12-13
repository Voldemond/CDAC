#include <iostream>
#include <string.h>
using namespace std;
class Student
{
private:			//Data Hiding
	int RollNo;		//Data Member
	string Name;

public:


	Student()
	{
		this->Name="No Name";
		this->RollNo=1234;
	}
	Student(int RollNo, string Name)
	{
		this->Name=Name;
		this->RollNo=RollNo;
	}
	void AddRecord(/*Student *const this*/)
	{
		cout<<"Enter Roll No:	"<<endl;
		cin>>this->RollNo;
		cout<<"Enter Name:	"<<endl;
		cin>>this->Name;
	}
	void PrintRecord(/*Student *const this*/)
	{
		cout<<"Roll No:	"<<this->RollNo<<" Name:	"<<this->Name<<endl;
	}

	string getName(/*Student *const this*/){
		return this->Name;
	}

	void setName(/*Student *const this*/string Name) {
		this->Name = Name;
	}

	int getRollNo(/*Student *const this*/) {
		return this->RollNo;
	}

	void setRollNo(/*Student *const this*/int RollNo) {
		this->RollNo = RollNo;
	}
};
struct Employee
{
	int EmpId;
	string Name;
	void PrintRecord()
	{
		cout<<"EmpId:	"<<this->EmpId<<" Name:	"<<this->Name<<endl;
	}
};
int main()
{
Student sarr[3];	//sarr is array of the objects of Student class

sarr[0].setName("Malkeet");
sarr[0].setRollNo(100);

//sarr[0].PrintRecord();

for(Student s:sarr)
{
	s.PrintRecord();
}

}
int main1()
{
	//Aggregate Type (Array, Structure, Union), Aggregate Initialization, Initializer List
	int Num1=90;
	int Num2=100;
	int Arr[10]={10,20,30,40};		//Valid, OK :Aggregate Initialization
	Employee emp={101,"Malkeet"};
	emp.PrintRecord();		//emp.PrintRecord(&emp);
	return 0;
}
