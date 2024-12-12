#include<cstdio>
using namespace std;
int main()
{
//Local Structure
struct Student		//Student is the Name of The Structure
{
	int RollNo;		//Data Member of Structure
	char Name[30];	//Data Member of Structure
	float Fees;		//Data Member of Structure
	int Age;		//Data Member of Structure
};


Student S;		//Object of the Structure

Student *ptrStudent=NULL;	//Null-Pointer variable of type student

ptrStudent=&S;		//Here we assign address of Student object to the Student pointer variable

printf("Enter RollNo :		");
scanf("%d",&ptrStudent->RollNo);
printf("Enter Name :		");
scanf("%s",ptrStudent->Name);
printf("Enter Fees :		");
scanf("%f",&ptrStudent->Fees);
printf("Enter Age :		");
scanf("%d",&ptrStudent->Age);

printf("RollNo :		%d\n",ptrStudent->RollNo);
printf("Name :		%s\n",ptrStudent->Name);
printf("RollNo :		%f\n",ptrStudent->Fees);
printf("RollNo :		%d\n",ptrStudent->Age);

	return 0;
}
//Student s2;
