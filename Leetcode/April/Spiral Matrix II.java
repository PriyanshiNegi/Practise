class Solution 
{
    public int[][] generateMatrix(int n)
    {
        int arr[][]=new int[n][n]; // the array that is needed to be returned
        if(n==1) // requirement given in the question                      
            arr[0][0]=1;
      
        else
        {
           int counter=1;// serves as the value from 1 to n^2
          /* basically for a spiral matrix we in total will have to perform 4 steps in general
          
          1-Move from Left to Right (keeping top i.e. row constant)
          2-Move from Top to Bottom (keeping right i.e. column constant)
          3-Move from Right to Left (keeping bottom i.e. row constant)
          4-Move from Bottom to Right (keeping left i.e. column constant)
          
          */
          
           int top=0,bottom=n-1,left=0,right=n-1;
            
            while(top<=bottom && left<=right)
            {
                for(int i=left;i<=right;i++ ) //Move from Left to Right
                {
                    arr[top][i]=counter++;
                } 
                top++;
                    for(int i=top;i<=bottom;i++) //Move from Top to Bottom
                    {
                        arr[i][right]=counter++;
                    }  
                     right--;
                        for(int i=right;i>=left;i--) //Move from Right to Left 
                        {
                            arr[bottom][i]=counter++;
                        } 
                         bottom--;
                            for(int i=bottom;i>=top;i--) //Move from Bottom to Right
                            {
                                arr[i][left]=counter++;
                            }
                           left++;
            }
           }
        return arr;// returning the answer
        }
    }
