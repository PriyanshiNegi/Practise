/*This problem is called "Minimum Cost for Climbing Stairs"
basically what happens is you are given an array called cost[] which contains the values for the amount of money that you would need to nump from that stair to the other
now you can either take 1 stair in a jump or 2 stairs in one jump and can even start from either the 0th stair or 1th stair .The main aim is to reduce the cost needed to
jump to the top of the stairs.

Example : cost[]={10,15,20}
so here if I jump on the 1st stair (15 value) and then skip 20 and jump to the top then I will only have to spend 15.
Output : 15 */

Scenario 1: Here we consider that we can change the values for the array elements, so we take the 3 rd element and keep comapring it to the previous two elements and 
updating the values till the end is reached.
        
public int minCostClimbingStairs(int[] cost)
{
        for (int i = 2; i < cost.length; i++) 
        {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }



Scenario 2: Here we consider that the value of the elements of the array cannot be updated, just take two additional variables to store the values for the array elements.

public int minCostClimbingStairs(int[] cost)
{
        int prev = 0, prevprev = 0, current = 0;
        for(int i = 2; i <= cost.length; i++)
        {
            current = Math.min(cost[i-1]+prev, cost[i-2]+prevprev);
            prevprev = prev;
            prev = current;
        }
        return current;
    }
