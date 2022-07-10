/*This problem is called "Minimum Cost for Climbing Stairs"
basically what happens is you are given an array called cost[] which contains the values for the amount of money that you would need to nump from that stair to the other
now you can either take 1 stair in a jump or 2 stairs in one jump and can even start from either the 0th stair or 1th stair .The main aim is to reduce the cost needed to
jump to the top of the stairs.

Example : cost[]={10,15,20}
so here if I jump on the 1st stair (15 value) and then skip 20 and jump to the top then I will only have to spend 15.
Output : 15 */


public int minCostClimbingStairs(int[] cost) {
        int prev = 0, prevprev = 0, current = 0;
        for(int i = 2; i <= cost.length; i++) {
            current = Math.min(cost[i-1]+prev, cost[i-2]+prevprev);
            prevprev = prev;
            prev = current;
        }
        return current;
    }
