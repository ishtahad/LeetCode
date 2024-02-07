class Solution {
    class CharFrequency {
        char letter;
        int value;

        public CharFrequency(char letter, int value) {
            this.letter = letter;
            this.value = value;
        }

        // Optional: Getter methods for character and integer
        public char getLetter() {
            return letter;
        }

        public int getValue() {
            return value;
        }
        // Method to increment frequency
        public void incrementValue() {
                value++;
        }
}
    public String frequencySort(String s) {
         
       
        
        // Create a list to store CharFrequency objects
        List<CharFrequency> frequencyList = new ArrayList<>();

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            // Check if the character already exists in the frequency list
            boolean found = false;
            for (CharFrequency pair : frequencyList) {
                if (pair.getLetter() == c) {
                    // Increment the frequency if the character is found
                    pair.incrementValue();
                    found = true;
                    break;
                }
            }
            // If the character is not found, add it to the frequency list
            if (!found) {
                frequencyList.add(new CharFrequency(c, 1));
            }
        }

        // Sort the frequency list by frequency
        Collections.sort(frequencyList, new Comparator<CharFrequency>() {
            @Override
            public int compare(CharFrequency o1, CharFrequency o2) {
                return Integer.compare(o2.getValue(), o1.getValue()); // Sort in descending order
            }
        });
        // Display the frequency list
        String result = "";
        for (CharFrequency pair : frequencyList) {
            for(int i = 1 ; i <= pair.getValue(); i++){
                result = result+pair.getLetter();
                //System.out.print(result);
            }
            
        }
        
        return result;
    }
}