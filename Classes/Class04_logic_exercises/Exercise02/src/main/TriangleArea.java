package main;
class TriangleArea
{
    private double base,height,area;
        public TriangleArea(double num1,double num2)
        {
            this.base=num1;
            this.height=num2;
        }
        public double getBase()
        {
            return base;
        }
        public void setBase()
        {
            this.base=base;
        }
        public double getHeight()
        {
            return height;
        }
        public void setHeight()
        {
            this.height=height;
        }
        public void calculateArea()
        {
            area=(base*height)/2;
        }
        public void printArea()
        {
            System.out.println("The triangle with base "+base+" and height "+height+" has an area of "+area+".\n");
        }   
}
