class Solution {
    class CharFrequency {
        char letter;
        int value;
        public CharFrequency(char letter, int value) {
            this.letter = letter;
            this.value = value;
        }
        public char getLetter() {
            return letter;
        }
        public int getValue() {
            return value;
        }
        public void incrementValue() {
                value++;
        }
}
    public String frequencySort(String s) {
        List<CharFrequency> frequencyList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            boolean found = false;
            for (CharFrequency pair : frequencyList) {
                if (pair.getLetter() == c) {
                    pair.incrementValue();
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                frequencyList.add(new CharFrequency(c, 1));
            }
        }
        
        Collections.sort(frequencyList, new Comparator<CharFrequency>() {
            @Override
            public int compare(CharFrequency o1, CharFrequency o2) {
                return Integer.compare(o2.getValue(), o1.getValue()); 
            }
        });
       
        String result = "";
        for (CharFrequency pair : frequencyList) {
            for(int i = 1 ; i <= pair.getValue(); i++){
                result = result+pair.getLetter();
                
            }
            
        }
        
        return result;
    }
}