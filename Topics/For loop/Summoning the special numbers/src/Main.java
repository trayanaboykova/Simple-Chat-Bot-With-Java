class LandOfNumbers {
    public int summonSpecialNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            sum += i;
        }
        return sum;
    }
} // we have a class called Land of Numbers(just a class, not public), that has a public int method that summons special numbers (n) and it does a for-loop starting from the first which is 1, iterating until it reaches the special number times 2 (included), and it increments by 2, not by one, then the sum is calculated by adding increment each time and then it returns the sum.
