package main;
class PrimeYN
{
    private int enteredNumber,i;
    private boolean isprime;
        public PrimeYN(int num)
        {
            isprime=true;
            this.enteredNumber=num;
        }
        public int getEnteredNumber()
        {
            return enteredNumber;
        }
        public void setEnteredNumber(int enteredNumber)
        {
            this.enteredNumber=enteredNumber;
        }
        public String judgeNum()
        {
            if(enteredNumber%2==0 || enteredNumber<=1)
            {
                return "No, it is not a prime number";
            }
            if(enteredNumber==2)
            {
                return "Yes, it is a prime number.";
            }
            for(i=2;i<=enteredNumber;i++)
            {
                if(enteredNumber%i==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime)
            {
                return "No, it is not a prime number";
            }
            else
            {
                return "Yes, it is a prime number.";
            }
        }
}