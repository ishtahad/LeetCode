class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < digits.length ; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0 ; j < digits.length; j++) {
                if (i != j) {
                    for (int k = 0 ; k < digits.length; k++) {
                        if (j!=k && i!=k) {
                            if (digits[k]%2 == 0) {
                                if (list.contains(digits[i]*100 + digits[j]*10 + digits[k])) {
                                    continue;
                                }
                                list.add(digits[i]*100 + digits[j]*10 + digits[k]);
                                System.out.println(digits[i] +""+ digits[j] +""+ digits[k]);
                                count++;
                            }

                        }
                    }
                }
            }
        }

        return count;
    }
}