package main;
public class FindEvenSum
{
    private int []num;
    private int sum=0,i;
        public FindEvenSum(int []vInteger)
        {
            this.num=vInteger;
        } 
        public int [] getNum()
        {
            return num;
        }
        public void setNum(int[] num)
        {    
            this.num=num;
        }        
        public int sumEven()
        {
            for(i=0;i<5;i++)
            {
                if(num[i]%2!=0)
                {
                    sum+=num[i];
                }             
            }
            return sum;
        }
}