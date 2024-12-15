#include <iostream>
using namespace std;

class Shape		//Abstract Class
{
public:
	double Area;
	virtual void CalculateArea()=0;
	void PrintArea()
	{
		cout<<"Area is:		"<<this->Area<<endl;
	}
};
class Rectangle: public Shape
{
public:
	double Length;
	double Breadth;
	Rectangle(double Length, double Breadth)
	{
		this->Breadth=Breadth;
		this->Length=Length;
	}
	void CalculateArea()
	{
		this->Area=this->Length*this->Breadth;
	}
};
class Circle: public Shape
{
public:
	double Radious;
	Circle(double Radious)
	{
		this->Radious=Radious;
	}
	void CalculateArea()
	{
		this->Area=3.14*this->Radious*this->Radious;
	}
};
int main()
{
	Rectangle r1(233.78, 345.89);
	Shape *ptr=&r1;
	ptr->CalculateArea();
	ptr->PrintArea();

	Circle c1(100.89);		//Statically Allocated Memory

	ptr=new Circle(234.90);	//Dynamically Allocated Memory

	ptr->CalculateArea();
	ptr->PrintArea();

	ptr=&c1;

	delete ptr;

}
