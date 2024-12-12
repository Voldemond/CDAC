#include<cstdio>

struct Student
{

	int RollNo;		//Data Member/Field/Property of structure
	char Name[30];	//Data Member of structure
	float Fees;		//Data Member of structure

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
struct Employee
{
	int EmpId;
	char Name[30];
	void Show()
	{
		printf("Am Show of Employee");
	}
}emp1, emp2, emp3;	//Here emp1, emp2, emp3 will be the objects of structure Employee

typedef struct Fruit
{
	char Name[30];
	void Show()
	{
		printf("Am Show of Fruit");
	}
}fruit_t;			//Here fruit_t is typedef for structure Fruit


int main()
{
	emp1.EmpId=101;		//OK

	Fruit f1;		//OK

	fruit_t f2;		//OK

	emp1.Show();	//Message Passing
	f2.Show();
	return 0;
}


int main2()
{
	Student s1;		//Here s1 is object of structure Student

	struct Student s2;	//OK

	typedef Student student_t;	//Here student_t is the typedef of struct Student

	student_t s3;		//OK, s3 is object of structure Student

	return 0;
}

int main1()
{
	Student s1;		//Here s1 is object of structure Student
	s1.SetData();
	s1.ShowData();

	return 0;
}
