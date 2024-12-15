#include <iostream>
using namespace std;

class Person 	//Pure Abstract Class
{
public:
	string Name;
	int Age;
	string Address;
	char BGroup;

	virtual void GetData()=0;		//Pure Virtual Function
	virtual void ShowData()=0;

};
class Student:public Person
{
public:
	int RollNo;
	string CourseName;
	float Fees;
	void GetData()
	{
		cout<<"Enter Name:"<<endl;
		cin>>this->Name;
	}
	void ShowData()
	{

	}
};

class Employee: public Person
{
public:
	int EmpId;
	string DeptName;
	float Salary;
	string Designation;
	string ProjectName;
	void GetData()
	{
		cout<<"Enter Name:"<<endl;
		cin>>this->Name;
	}
	void ShowData()
	{

	}
};

int main()
{
	Student s;
	Person *ptr=&s;

}
