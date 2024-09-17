package main;
class AverageEObetween1toN
{
    public int i,n,even,odd;
    public double averageE,averageO,sumE,sumO;
        public AverageEObetween1toN(int num)
        {
            this.n=num;
        }
        public int getN()
        {
            return n;
        }
        public void setN(int n)
        {
            this.n = n;
        }
        public double judgeSumEven()
        {
            for(i=1;i<=n;i++)
            {
                if(i%2!=0){
                    sumE+=i;
                    even++;
                }
            }
            if(odd>0)
            {
                averageE=sumE/even;
            }
            return averageE;
        }
        public double judgeSumOdd()
        {
            for(i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    sumO+=i;
                    odd++;
                }
            }
            if(odd>0)
            {
                averageO=sumO/odd;
            }
            return averageO;
        }
}