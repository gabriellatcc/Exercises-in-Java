package main;
class NewSalary
{
    private double currentSalary;
    private double newSalary;
        public NewSalary(int currentSalary)
        {
            this.currentSalary=currentSalary;
        } 
        public double getCurrentSalary()
        {
            return currentSalary;
        }
        public void setCurrentSalary(double currentSalary)
        {
            this.currentSalary=currentSalary;
        }
        public double getNewSalary()
        {
            return this.newSalary;
        }
        public void setNewSalary()
        {
            this.newSalary=newSalary;
        }
        public double calculateIncrease()
        {
            this.newSalary=this.currentSalary*1.25;
            return this.newSalary;
        }
}