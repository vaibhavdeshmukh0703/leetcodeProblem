public class DistributeSallary {
    public static int distributeSallry(int NoOfDollers) {
        // 5 --> 1=1 2=2
        int numberOfPeople = 0;
        int distributedAmount = 0;
        for (int counter = 1; counter <= NoOfDollers; counter++) {
            if ((distributedAmount + counter) <= NoOfDollers) {
                distributedAmount = distributedAmount + counter;
                numberOfPeople++;
            }
        }
        return numberOfPeople;
    }

    public static void main(String[] args) {
        int result = distributeSallry(10);
        System.out.println("Numbber Of People to Distribute is--->" + result);
    }
}
