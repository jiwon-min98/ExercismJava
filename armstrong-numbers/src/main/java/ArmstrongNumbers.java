class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String[] numberArray = Integer.toString(numberToCheck).split("");
        int exp = numberArray.length;
        int sum = 0;
        for (String item : numberArray) {
            sum += Math.pow(Integer.parseInt(item), exp);
        }
        return (sum == numberToCheck);

        

    }

}
