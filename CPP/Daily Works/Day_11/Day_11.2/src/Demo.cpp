#include <iostream>
#include <vector>
#include <algorithm>
#include <typeinfo>
using namespace std;

class Employee
{
public:
	int EmpId;
	string Name;
	float Salary;
	int Age;
	string Dept;
	string Designation;
public:
	Employee()
	{

	}
	Employee(int EmpId, string Name, float Salary, int Age, string Dept, string Designation)
	{
		this->EmpId=EmpId;
		this->Name=Name;
		this->Salary=Salary;
		this->Age=Age;
		this->Dept=Dept;
		this->Designation=Designation;
	}

	friend ostream& operator<<(ostream &cout, Employee &ref)
	{
		cout<<"EmpId:   "<<ref.EmpId<<" Name:   "<<ref.Name<<" Salary:   "<<ref.Salary<<" Age:   "<<ref.Age<<" Dept:   "<<ref.Dept<<" Designation:   "<<ref.Designation<<endl;
		return cout;
	}
	bool operator<(Employee &ref)	//Overloading < operator to define natural sorting order on the base of Age
	{
		return this->Age<ref.Age;
	}
	friend bool SortByEmpId(Employee &o1, Employee &o2);
};
bool SortByEmpId(Employee &o1, Employee &o2)
{
	return o1.EmpId<o2.EmpId;
}
/* We can create comparator by using Global Function, Lambda, Natural Order in class, struct, Class
struct SortByDept
{
	bool operator<(Employee &o2)
	{
		return this->Dept<o2.Dept;
	}
};
*/
class EmployeeManager
{
	vector<Employee> vemp;
public:
	EmployeeManager()
	{
		vemp.push_back(Employee(1001, "Malkeet", 167890.90f,34,"Education","Module Lead"));
		vemp.push_back(Employee(1005, "Zeenat", 1890.90f,23,"Admin","Manager"));
		vemp.push_back(Employee(1003, "Abhisek", 890.90f,27,"Zeology","Clerk"));
		vemp.push_back(Employee(1004, "Sajan", 67890.90f,56,"Science","Sceintist"));
		vemp.push_back(Employee(1002, "Balram", 87890.90f,21,"ECGC","SPE"));
	}

	void PrintAllEmployee()
	{
		for(auto it=vemp.begin();it!=vemp.end();it++)
		{
			cout<<*it;
		}
	}
	void SortEmployeeByEmpId()
	{
		//sort(vemp.begin(),vemp.end(),SortByEmpId);

		sort(vemp.begin(),vemp.end(),[](Employee &o1, Employee &o2){return o1.EmpId<o2.EmpId;});


		for(auto it=vemp.begin();it!=vemp.end();it++)
		{
			cout<<*it;
		}
	}
	void SortEmployeeByName()
		{
			//sort(vemp.begin(),vemp.end(),SortByEmpId);

			sort(vemp.begin(),vemp.end(),[](Employee &o1, Employee &o2){return o1.Name<o2.Name;});


			for(auto it=vemp.begin();it!=vemp.end();it++)
			{
				cout<<*it;
			}
		}
	void SortEmployeeByAge()
			{
				sort(vemp.begin(),vemp.end());
				for(auto it=vemp.begin();it!=vemp.end();it++)
				{
					cout<<*it;
				}
			}
};
int main()
{
	EmployeeManager man;
	man.PrintAllEmployee();
	cout<<"--------------Sorted By EmpId---------------------"<<endl;
	man.SortEmployeeByEmpId();
	cout<<"--------------Sorted By EmpName---------------------"<<endl;
	man.SortEmployeeByName();
	cout<<"--------------Sorted By EmpAge---------------------"<<endl;
	man.SortEmployeeByAge();
	return 0;
}

