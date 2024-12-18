#include <iostream>
#include <typeinfo>
#include <bits/stdc++.h>
#include <vector>
#include <list>
using namespace std;


class Student {
public:
	int RollNo;
	string Name;
	Student() {
		this->RollNo = 0;
		this->Name = "";
	}
	Student(int RollNo, string Name) {
		this->RollNo = RollNo;
		this->Name =Name;
	}


	friend ostream& operator<<(ostream &cout, Student &stu)
	{
		cout<<"Roll No:   "<<stu.RollNo<<" Name:   "<<stu.Name<<endl;
		return cout;
	}
};
bool CompByRollNo(Student &s, Student s1)
	{
		return s.RollNo<s1.RollNo;
	}
bool CompByName(Student &s, Student s1)
	{
		return s.Name<s1.Name;
	}
int main()
{
	vector<Student> vs;
	Student s1(101,"Malkeet");
	vs.push_back(s1);
	vs.push_back(Student(104,"Dipesh"));
	vs.push_back(Student(102,"Ritesh"));
	vs.push_back(Student(105,"Parthavi"));
	vs.push_back(Student(103,"Varun"));

	for(auto it=vs.begin();it!=vs.end();it++)
	{
		cout<<*it;
	}

	cout<<"--------------After Sort By Roll No---------------------"<<endl;
	sort(vs.begin(), vs.end(), CompByRollNo);

	for(auto it=vs.begin();it!=vs.end();it++)
		{
			cout<<*it;
		}
	cout<<"--------------After Sort By Name---------------------"<<endl;
		sort(vs.begin(), vs.end(), CompByName);

		for(auto it=vs.begin();it!=vs.end();it++)
			{
				cout<<*it;
			}

	return 0;
}


//Comparator
bool SortIntInDecOrder(int num1, int num2) {
	//return num1<num2;			//Ascending order
	return num1 > num2;
}
int main3() {

	//vector<int> vi;				//vector<> is dynamic array
	vector<int> vi = { 100, 2, 30, 4, 50, 6 };//Aggregate Type: can be initialized using initializer list

	cout << "---------Print Using for-each Loop----------" << endl;

	for (auto it = vi.begin(); it != vi.end(); it++) {
		cout << *it << "\t";
	}
	cout << endl;

	sort(vi.begin(), vi.end(), SortIntInDecOrder);

	cout << "---------Print Using for-each Loop----------" << endl;
	for (int &ref : vi) {
		cout << ref << "\t";
	}
	cout << endl;
	int deleteNum = 50;
	for (auto i = vi.begin(); i != vi.end(); i++) {
		if ((*i) == deleteNum) {
			vi.erase(i);
			break;
		}
	}
	cout << "---------Print Using for-each Loop----------" << endl;
	for (int &ref : vi) {
		cout << ref << "\t";
	}
	return 0;
}
int main2() {

	//vector<int> vi;				//vector<> is dynamic array
	vector<int> vi = { 100, 2, 30, 4, 50, 6 };//Aggregate Type: can be initialized using initializer list

	cout << "---------Print Using for-each Loop----------" << endl;
	for (int &ref : vi) {
		cout << ref << "\t";
	}
	cout << endl;
	cout << "---------Print Using for-each Loop----------" << endl;

	vector<int>::iterator it;//Declaration of Iterator which will work for vector of int

	for (it = vi.begin(); it != vi.end(); it++) {
		cout << *it << "\t";
	}
	cout << endl;

	sort(vi.begin(), vi.end());

	cout << "---------Print Using for-each Loop----------" << endl;
	for (int &ref : vi) {
		cout << ref << "\t";
	}

	return 0;
}

int main1() {

	//int Num1; 	//Single
	//int Arr[];	//Array
	//Struct, Class, Uniion
	//Student S[90];		//ArrayOfObject
	vector<int> vi;			//vector<> is dynamic array
	list<int> li;			//list<> is doubly linked-list
	return 0;
}

