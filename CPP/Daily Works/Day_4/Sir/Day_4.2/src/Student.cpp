#include <cstdio>
#include "../MyHeaderFile/Student.h"

void Student::GetData()			//Member Function Definition
	{
		printf("Enter Roll No:		");
		fflush(stdout);
		scanf("%d", &RollNo);
		printf("Enter Name:		");
		fflush(stdout);
		scanf("%s", Name);
	}
void Student:: ShowData()
{
		printf("Roll No:	%d\n",RollNo);
		printf("Name:	%s\n",Name);
}
