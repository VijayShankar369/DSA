class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] leftArray = new int[len];
        int[] rightArray = new int[len];

        Arrays.fill(leftArray, Integer.MAX_VALUE);
        Arrays.fill(rightArray, Integer.MAX_VALUE);

        int flag = Integer.MAX_VALUE;

        for(int i=0;i<len;i++){
            if(s.charAt(i) == c){
                flag = 0;
                rightArray[i] = flag;
            }else{
                if(flag != Integer.MAX_VALUE){
                    flag++;
                    rightArray[i] = flag;
                }
            }
        }

        flag = Integer.MAX_VALUE;

        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == c){
                flag = 0;
                leftArray[i] = flag;
            } else{
                if(flag != Integer.MAX_VALUE){
                    flag++;
                    leftArray[i] = flag;
                } 
            }
        }

        int[] ans = new int[len];

        for(int i=0;i<len;i++){
            ans[i] = Math.min(rightArray[i], leftArray[i]);
        }

        return ans;



    } 
}