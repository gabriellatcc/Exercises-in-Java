package main;
class Prime1toN
{
    private int i,j,n;
    private String answer = "";
        public Prime1toN(int num)
        {
            this.n=num;
        }
        public int getN()
        {
            return n;
        }
        public void setN(int n)
        {
            this.n=n;
        }
        public String printPrimes()
        {
            for(i=2;i<=n;i++)
            {
                boolean isprime=true;
                for(j=2;j<=Math.sqrt(i);j++)
                {
                    if(i%j==0)
                    {
                        isprime=false;
                        break;
                    }
                }
                if(isprime)
                {
                    answer+=i+" ";
                }
            }
            return answer.trim();
        }
}