#include<cstdio>
#include<cstdlib>
//Object Oriented Approach
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

int main()
{
	Student Arr[100]; 	//Here arr is array of objects of Student structure

	for(int i=0;i<5;i++)
	{
		Arr[i].SetData();
	}
	for(int i=0;i<5;i++)
	{
		Arr[i].ShowData();
	}
	return 0;
}


int main1()
{
	Student s1;		//Here s1 is object of structure Student which is statically defined
	s1.SetData();
	s1.ShowData();

	Student *ptrStudent=(Student*)malloc(sizeof(Student));		//Here object of the structure student will gets memory dynamically

	ptrStudent->SetData();
	ptrStudent->ShowData();

	free(ptrStudent);


	return 0;
}
