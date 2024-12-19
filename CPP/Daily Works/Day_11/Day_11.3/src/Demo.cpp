#include <iostream>
#include <vector>
#include <map>
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
class Address
{
public:
	string City;
	string Country;
	Address()
	{
		this->City="";
		this->Country="";
	}
};
bool SortByEmpId(Employee &o1, Employee &o2)
{
	return o1.EmpId<o2.EmpId;
}
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


int main2()
{
	map<int,string> map1;

	//map1.insert(1, "Malkeet");
	map1.insert(pair<int,string>(1,"Malkeet"));
	map1.insert(pair<int,string>(2,"Saket"));
	map1.insert(pair<int,string>(3,"Johnson"));

	//Insert record by using [] operator

	map1[4]="Varun";
	map1[5]="Suraj";




		int key=2;

		auto it=map1.find(key);

		if(it!=map1.end())
		{
			cout<<"Record Found"<<endl;
			cout<<"Key:	"<<it->first<<" Value :	"<<it->second<<endl;
		}
		cout<<"------------------------------"<<endl;
		map<int,string>::iterator it2=map1.begin();
			while(it2!=map1.end())
			{
				cout<<"Key:	"<<it2->first<<" Value :	"<<it2->second<<endl;
				it2++;
			}

	return 0;
}
int main1()
{
	//map<K,V> map1;		//Decalartion

	map<int,string> map1;

	//map1.insert(1, "Malkeet");
	map1.insert(pair<int,string>(1,"Malkeet"));
	map1.insert(pair<int,string>(2,"Saket"));
	map1.insert(pair<int,string>(3,"Johnson"));

	map<int,string>::iterator it=map1.begin();

	for(it=map1.begin();it!=map1.end();it++)
	{
		cout<<"Key:	"<<it->first<<" Value :	"<<it->second<<endl;
	}

	for(auto &it:map1)
	{
		cout<<"Key:	"<<it.first<<" Value :	"<<it.second<<endl;
	}
	map<int,string>::iterator it2=map1.begin();
	while(it2!=map1.end())
	{
		cout<<"Key:	"<<it2->first<<" Value :	"<<it2->second<<endl;
		it2++;
	}

	int key=2;

	//auto it=map1.find(key);

	if(it!=map1.end())
	{
		cout<<"Record Found"<<endl;
		cout<<"Key:	"<<it2->first<<" Value :	"<<it2->second<<endl;
	}


	return 0;
}

