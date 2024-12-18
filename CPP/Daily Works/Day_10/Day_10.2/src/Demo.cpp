#include <iostream>
using namespace std;

class Array
{
private:
	int Size;
	int *ptr;
public:
	Array()
	{
		this->Size=0;
		this->ptr=nullptr;
	}
	Array(int Size)
	{
		this->Size=Size;
		this->ptr=new int[this->Size];
	}
	~Array()
	{
		if(this->ptr!=nullptr)
		{
			delete[] ptr;
		}
		ptr=nullptr;
	}
	void operator=(Array &ref)
	{
		this->Size=ref.Size;

		this->~Array();			//Calling Destructor

		this->ptr=new int[this->Size];	//Deep Copy
		for(int i=0;i<this->Size;i++)
		{
			this->ptr[i]=ref.ptr[i];
		}
	}
	int& operator[](int X)
	{
		return this->ptr[X];
	}
	friend istream& operator>>(istream &cin, Array &ref)
	{
		for(int i=0;i<ref.Size;i++)
		{
			cout<<"Enter Element:	";
			cin>>ref.ptr[i];
		}
		cout<<endl;
		return cin;
	}
	friend ostream& operator<<(ostream &cout, Array &ref)
	{
		for(int i=0;i<ref.Size;i++)
		{
			cout<<ref.ptr[i]<<"\t";
		}
		cout<<endl;
		return cout;
	}

};
int main()
{
	Array a1(3);
	cin>>a1;

	a1[2]=300;

	int element=a1[1];			//a1.operator[](int x);
	cout<<"Element:"<<element<<endl;

	cout<<a1;
	return 0;
}
int main2()
{
	Array a1(3);
	cin>>a1;
	Array a2(2);
	cin>>a2;

	a2=a1;			//a2.operator=(&a2, a1): Deep Copy

	cout<<a1;
	cout<<"------------------------------------"<<endl;
	cout<<a2;
	return 0;
}

int main1()
{
	Array a1(3);

	cin>>a1;
	cout<<a1;
	return 0;
}
