#include<cstdio>
#include<cstdlib>
//Object Oriented Approach
class Student
{
public:
	int RollNo;		//Data Member/Field/Property of class
	char Name[30];	//Data Member of class
	float Fees;		//Data Member of class

	void SetData()	//Member Function/Method/Procedure
	{
		printf("Enter RollNo : 	");
		fflush(stdout);
		scanf("%d",&RollNo);
		printf("Enter Name : 	");
		fflush(stdout);
		scanf("%s",Name);
		printf("Enter Fees : 	");
		fflush(stdout);
		scanf("%f",&Fees);
	}

	void ShowData()
	{
		printf("Roll No:	%d\n",RollNo);
		printf("Name:	%s\n",Name);
		printf("Fees:	%f\n",Fees);
	}

};

int main()
{
	class Student s1;		//Here s1 is the object of the class Student
	s1.SetData();
	s1.ShowData();

	Student s2; 		//Ref
	return 0;
}


