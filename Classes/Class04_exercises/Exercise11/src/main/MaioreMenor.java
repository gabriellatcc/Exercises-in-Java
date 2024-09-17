package main;
class LSnumber
{
    private int[] informedNumbers;
    private int i, largest, smallest;
    public LSnumber(int[] num)
    {
        this.informedNumbers = num;
    }
    public int[] getInformedNumbers()
    {
        return informedNumbers;
    }
    public void setInformedNumbers(int[] informedNumbers)
    {
        this.informedNumbers = informedNumbers;
    }
    public String checkHierarchy()
    {
        if (informedNumbers.length == 0)
        {
           return "No values were informed.";
        }
        largest = informedNumbers[0];
        smallest = informedNumbers[0];
        for(i=1;i<informedNumbers.length;i++)
        {
            if(informedNumbers[i]>largest)
            {
                largest=informedNumbers[i];
            }
            if(informedNumbers[i]<smallest)
            {
                smallest=informedNumbers[i];
            }
        }
        return "Largest: "+largest+"\n"+"Smallest: "+smallest;
    }
}