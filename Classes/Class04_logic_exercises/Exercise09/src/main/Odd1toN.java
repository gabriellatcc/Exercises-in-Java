package main;
class Odd1toN
{
    private String answer=" ";
    private int erenteredNum,i;
        public Odd1toN(int num)
        {
            this.erenteredNum=num;
        }
        public int getErenteredNum()
        {
            return erenteredNum;
        }
        public void setErenteredNum(int erenteredNum)
        {
            this.erenteredNum=erenteredNum;
        }
        public String judgeOdd()
        {
            for(i=1;i<=erenteredNum;i++)
            {
                if(i%2==0)
                {
                    answer+=i+" ";
                }
            }
            return answer.trim();
        }
}