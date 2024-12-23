namespace StudentLibrary
{
    public class Student
    {
        public string Name { get; set; }
        public int RollNumber { get; set; }
        public double Marks { get; private set; }
        public string Grade { get; private set; }

        public void CalculateGrade(double marks)
        {
            Marks = marks;
            Grade = AssignGrade(marks);
        }

        public void CalculateGrade(double subject1, double subject2, double subject3)
        {
            Marks = subject1 + subject2 + subject3;
            Grade = AssignGrade(Marks);
        }

        // Private method to assign grade based on marks
        private string AssignGrade(double marks, double passMark = 40.0, double distinctionMark = 75.0)
        {
            if (marks >= distinctionMark) return "A";
            if (marks >= passMark) return "B";
            return "C";
        }

        public override string ToString()
        {
            return $"Roll Number: {RollNumber}, Name: {Name}, Marks: {Marks:F2}, Grade: {Grade}";
        }
    }
}
