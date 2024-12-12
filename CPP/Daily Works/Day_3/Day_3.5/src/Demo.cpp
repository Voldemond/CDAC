#include<cstdio>
//Procedure Oriented Approach
//Global Structure
	struct Student		//Student is the Name of The Structure
	{
		int RollNo;		//Data Member of Structure
		char Name[30];	//Data Member of Structure
		float Fees;		//Data Member of Structure
		int Age;		//Data Member of Structure
	};
	//Global Method
	void GetData(Student *ptrStudent)	//Called Method
	{
		printf("Enter RollNo :		");
		scanf("%d",&ptrStudent->RollNo);
		printf("Enter Name :		");
		scanf("%s",ptrStudent->Name);
		printf("Enter Fees :		");
		scanf("%f",&ptrStudent->Fees);
		printf("Enter Age :		");
		scanf("%d",&ptrStudent->Age);
	}
	//Global Method
	void ShowData(Student *ptrStudent)		//Called Method
	{
		printf("RollNo :		%d\n",ptrStudent->RollNo);
		printf("Name :		%s\n",ptrStudent->Name);
		printf("RollNo :		%f\n",ptrStudent->Fees);
		printf("RollNo :		%d\n",ptrStudent->Age);
	}

int main()		//Calling Method
{


	printf("Hello World");
	struct Student S;		//Object of the Structure

	GetData(&S);		//Passing address of Student S to global method SetData
	ShowData(&S);
	return 0;
}
