class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = -1;
        int gasLength = gas.length;
        if(gasLength == 1){
            if(gas[0] == cost[0] ){
                return 0;
            }
        }
        for(int i = 0 ; i< gasLength; i++){
            if(gas[i] == cost[i] ){
                continue;
            }
            if(gas[i] >= cost[i]){
                int currentStep = i + 1;
                int startingStep = i;
                if(startingStep == gasLength - 1){
                    currentStep = 0;
                    if(startingStep == currentStep){
                        return i;
                    }
                }
                int costOfJumpToNextStep = gas[startingStep] - cost[startingStep];
                while(startingStep != currentStep){
                   
                    costOfJumpToNextStep = costOfJumpToNextStep + gas[currentStep] - cost[currentStep];
                    if(costOfJumpToNextStep >= 0){
                        if(currentStep == gasLength -1){
                            currentStep = 0;
                        }else{
                            currentStep++;
                        }

                        if(startingStep == currentStep){
                            return i;
                        }
                        //currentStep++;
                    }else{
                        break;
                    }
                }

            }
        }

        return result;
    }
}