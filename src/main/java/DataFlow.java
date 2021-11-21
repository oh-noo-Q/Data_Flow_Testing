public class DataFlow {

    public static double check_ticket(int amount) {
        double discount = 0.1;
        if(amount > 3)
            discount = discount + 0.5;
        else if (amount > 1)
            amount = amount -1;
        else return -1;
        return 50 * amount * (1-discount);
    }
}
