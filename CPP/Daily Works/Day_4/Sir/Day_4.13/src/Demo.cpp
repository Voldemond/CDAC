#include <iostream>
#include <vector>
#include "../MyHeaderFiles/Student"
using namespace std;

int main()
{

	Student S1;

	Student Arr[90];
	vector<Student> myvec;

	int choice=0;

	do
	{
		cout<<"-----------------Student Management Application"<<endl;
			cout<<"Press 1 to Add Student"<<endl;
			cout<<"Press 2 to View All Student"<<endl;
			cout<<"Press 3 to Update Student"<<endl;
			cout<<"Press 4 to Delete Student"<<endl;
			cout<<"Press 5 to Exit"<<endl;
			cout<<"-----------------------------------------------"<<endl;
			cout<<"Enter Your Choice:	";
			cin>>choice;

			switch (choice) {
				case 1:
					S1.AddRecord();
					break;
				case 2:
					S1.PrintRecord();
					break;
				case 5:
					cout<<"Exiting the Program...bye bye"<<endl;
					break;
				default:
					cout<<"Invalid Input"<<endl;
					break;
			}
	}
	while(choice!=5);



	return 0;
}

