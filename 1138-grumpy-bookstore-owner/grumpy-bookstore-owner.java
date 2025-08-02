class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int window = 0;
        int maxWindow = 0;
        int left = 0;

        for(int right=0;right<customers.length;right++){
            if(grumpy[right] == 0){
                satisfied += customers[right];
            }
            else{
                window += customers[right];
            }

            if(right-left+1 > minutes){
                if(grumpy[left] == 1){
                    window -= customers[left];
                }
                left++;
            }

            
            maxWindow = Math.max(maxWindow, window);
        }

        return satisfied+maxWindow;
    }
}