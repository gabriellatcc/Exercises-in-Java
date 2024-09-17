package main;
class MultiplicationTable1toN
{
    private int i,j,number;
    private final String []answer;
        public MultiplicationTable1toN(int num)
        {
            this.number=num;
            answer= new String [num*num];
        }
        public int getNumber()
        {
            return number;
        }
        public void setNumber(int numeroAserTabuado)
        {
            this.number=numeroAserTabuado;
        }
        public String doMultiplicationTable()
        {
            int [][] result=new int[number][number];
            int index=0;
            for(i=0;i<number;i++)
            {
                for(j=0;j<number;j++)
                {
                    result[i][j] = (i + 1) * (j + 1);
                    answer[index] = (i + 1) + " * " + (j + 1) + " = " + result[i][j];
                    index++;
                }
            }
            return String.join("\n", answer);
        }
}