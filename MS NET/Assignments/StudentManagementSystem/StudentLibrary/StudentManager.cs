using System;
using System.Collections.Generic;

namespace StudentLibrary
{
    public class StudentManager
    {
        private List<Student> students = new List<Student>();

        // Add a student using named and positional parameters
        public void AddStudent(int rollNumber, string name, double marks, bool useIndividualMarks = false, double subject1 = 0, double subject2 = 0, double subject3 = 0)
        {
            var student = new Student { RollNumber = rollNumber, Name = name };

            if (useIndividualMarks)
            {
                student.CalculateGrade(subject1, subject2, subject3);
            }
            else
            {
                student.CalculateGrade(marks);
            }

            students.Add(student);
        }

        // List all students
        public List<Student> GetAllStudents()
        {
            return students;
        }
    }
}
