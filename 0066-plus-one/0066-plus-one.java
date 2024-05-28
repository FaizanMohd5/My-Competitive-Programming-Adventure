class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;

        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  // No carry, return the modified array
            }
            digits[i] = 0;  // Carry, set current digit to 0
        }

        // If we're here, it means there was a carry in the most significant digit
        int[] result = new int[size + 1];
        result[0] = 1;
        
        //In java, int[] is a reference type and reference type variable's members are initialized 
        //with zeroes. So we can return the array without hesitation.
        return result;
    }
}