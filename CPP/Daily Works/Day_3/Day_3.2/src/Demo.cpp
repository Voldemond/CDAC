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
printf("Enter RollNo :		");
Student S;		//Object of the Structure

printf("Enter RollNo :		");
scanf("%d",&S.RollNo);
printf("Enter Name :		");
scanf("%s",S.Name);
printf("Enter Fees :		");
scanf("%f",&S.Fees);
printf("Enter Age :		");
scanf("%d",&S.Age);

printf("RollNo :		%d\n",S.RollNo);
printf("Name :		%s\n",S.Name);
printf("RollNo :		%f\n",S.Fees);
printf("RollNo :		%d\n",S.Age);

	return 0;
}
//Student s2;
