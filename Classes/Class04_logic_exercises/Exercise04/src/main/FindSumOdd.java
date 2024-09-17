package main;
class FindSumOdd
{
    private int []num;
    public int sum=0,i;
        public FindSumOdd(int [] nEntered)
        {
            this.num=nEntered;
        }
        public int[] getNum()
        {
            return num;
        }
        public void setNum(int[] num)
        {
            this.num=num;
        }
        public int sumOdd()
        {
            for(i=0;i<5;i++)
            {
                if(num[i]%2==0)
                {
                    sum+=num[i];
                }
            }
            return sum;
        }
}
