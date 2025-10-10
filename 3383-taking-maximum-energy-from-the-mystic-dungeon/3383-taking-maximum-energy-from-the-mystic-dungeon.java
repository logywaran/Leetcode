class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;

        // Compute from end to start, reuse energy array to store max sum starting at i
        for (int i = n - 1; i >= 0; i--) {
            if (i + k < n) {
                energy[i] += energy[i + k]; // accumulate sum
            }
            maxEnergy = Math.max(maxEnergy, energy[i]);
        }

        return maxEnergy;
    }
}
