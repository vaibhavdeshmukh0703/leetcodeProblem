public class DistributeSallary {
    public static int distributeSallry(int n) {
        // 5 --> 1=1 2=2
        int numberOfPeople = 0;
        int distributedAmount = 0;
        for (int i = 1; i <= n; i++) {
            if ((distributedAmount + i) <= n) {
                distributedAmount = distributedAmount + i;
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
