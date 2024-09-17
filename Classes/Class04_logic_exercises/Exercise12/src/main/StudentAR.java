package main;
public class StudentAR
{
    public int grade1,grade2;
    public float average;
        public StudentAR(int num1,int num2)
        {
            this.grade1=num1;
            this.grade2=num2;
        }
        public int getGrade1()
        {
            return grade1;
        }
        public void setGrade1(int grade1) 
        {
            this.grade1=grade1;
        }
        public int getGrade2()
        {
            return grade2;
        }
        public void setGrade2(int grade2)
        {
            this.grade2=grade2;
        }
        public void calculateAverage()
        {
            average=(grade1*2+grade2*3)/5;
        }
        public String evaluateStudent()
        {
            if(average<6)
            {
                return "Student Failed";
            }
            else
            {
                return "Student Passed";
            }
        }       
}