class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int uc = 1, i;
        for (i = 1; i < candyType.length; i++){
            if (candyType[i] != candyType[i - 1]){
                uc++;
            }
        }
        return(Math.min(candyType.length/2, uc));
        
    }
}
