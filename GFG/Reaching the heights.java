/*This problem is an interesting one ,

Input : arr[]={2,3,4,5}
Output : {5,2,4,3}

We have an elevator that moves up when at the odd index and down when at the even index. The given array gives the number of floor it moves, we have to reach the 
heighest floor. We should not reach the ground floor if stepped in and if such a case is not possible then print "not possible".
  
 Need to arrange/sort the array such that the elevator reaches the max floor at the end.*/
  
  
  public list reachthemaxfloor(int n, int arr[])
{
  ArrayList<Integer> list= new ArrayList<Integer>();// creating a list to store the values in the new order
  Arrays.sort(arr); //sorting cause as per our logic it must first be sorted then arranged in the order max1,min1,max2,min2.....
    
  int i=0;//counter
  int j=n-1;//counter
  int sum=0;//to keep a check on the not possible scenarios and the repeating numbers
  
  while(i<j)
  {
    sum=sum+arr[j]-arr[i];//add and sub to see the resultant meaning if they are equal or not
    if(sum<=0)
    {
     list.clear(); // as per GFG it will return Not Possible only when the size of the list is 1 and the element in it "-1", thus the logic for this block
     list.add(-1);
     return list;//return meaning the not possible scenario
    }
    list.add(arr[j]);// else keep adding the elements in the logic order
    list.add(arr[i]);
   i++;
   j--;
 }
  if(i==j)// if the number of elements is odd then there will come a case where i==j and we will need to deal with this separately as else we may add it twice
  {
    sum=sum+arr[i];
    list.add(arr[i]);
  }
  return list;// return the list
}
  

  
