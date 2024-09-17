package main;
class Factorial
{
    private int i,result,input;
        public Factorial(int num)
        {
            this.input=num;
            result=1;
        }
        public int getEntrada()
        {
            return input;
        }

        public void setinput(int input)
        {
            this.input=input;
        }
        public int calculateFactorial()
        {
            if(input<0)
            {
                System.out.println("The factorial is not defined to negative numbers.");
                return 0;
            }
            for(i=input;i>0;i--)
            {
                result*=i;
            }
            return result;
        }
}