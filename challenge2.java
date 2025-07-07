class variables
{
    void showInterest() {
        double amount;
        double interest; //percentage

        amount = 1200.00;
        System.out.println("amount:" + amount);

        interest = 3.0;
        System.out.println("after 2 years:" + amount);
    }
    public static void main (String[]args)
    {
        (new variables()).showInterest();
    }

}