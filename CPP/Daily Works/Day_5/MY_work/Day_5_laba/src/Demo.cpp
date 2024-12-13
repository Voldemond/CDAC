#include <iostream>
#include <string>
using namespace std;

class Student {
private: // Data Hiding
    int RollNo; // Data Member
    string Name;

public:
    // Default constructor
    Student() {
        this->Name = "No Name";
        this->RollNo = 1234;
    }

    // Parameterized constructor
    Student(int RollNo, string Name) {
        this->Name = Name;
        this->RollNo = RollNo;
    }

    // Method to add record
    void AddRecord() {
        cout << "Enter Roll No: " << endl;
        cin >> this->RollNo;
        cout << "Enter Name: " << endl;
        cin >> this->Name;
    }

    // Method to print record
    void PrintRecord() {
        cout << "Roll No: " << this->RollNo << " Name: " << this->Name << endl;
    }

    // Getter and setter for Name
    string getName() {
        return this->Name;
    }

    void setName(string Name) {
        this->Name = Name;
    }

    // Getter and setter for Roll No
    int getRollNo() {
        return this->RollNo;
    }

    void setRollNo(int RollNo) {
        this->RollNo = RollNo;
    }
};

int main() {
    Student sarr[3]; // Array of Student objects

    // Adding data in three objects
    for (Student &s : sarr) { // Use reference to modify original objects
        s.AddRecord();
    }

    // Print data of three objects
    for (Student &s : sarr) { // Use reference to access original objects
        s.PrintRecord();
    }

    return 0;
}
