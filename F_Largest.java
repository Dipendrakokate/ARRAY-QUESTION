class F_Largest
{
    public static void main(String[] args) {

        int Marks[]={2,3,4,33,94,53,34,55};

        
        for(int i=0;i<Marks.length-1;i++)
        {
            for(int j=1;j<Marks.length-1;j++)
            {
                if(Marks[j]>Marks[i])
                {
                    int temp = Marks[i];
                    Marks[i]=Marks[j];
                    Marks[j]=temp;
                }
            }
    
        }

        for(int i=0;i<Marks.length;i++)
        {
            System.out.print(Marks[i] + " ");
        }
    }
}