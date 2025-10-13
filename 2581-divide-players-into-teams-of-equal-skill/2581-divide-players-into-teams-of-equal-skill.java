class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0;
        int n = skill.length-1;
        int left = 0;
        int right = n;
        
        Arrays.sort(skill);
        int target = skill[left]+skill[right];
        while(left<right){
            if(skill[left] + skill[right] == target){
                sum +=(long) (skill[left] * skill[right]);
            }
            else{
                return -1;
            }
            left++;
            right--;
        }
        return sum ;
    }
}