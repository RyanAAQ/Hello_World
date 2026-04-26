public class BackToSender {

    public static int calculateriderwage(int deliveries) {
    int pay = 5000;
    int amount = 0;

    if (deliveries < 50) {
    amount = 160;

}   else if (deliveries <= 59) {
    amount = 200;

}   else if (deliveries <= 69) {
    amount = 250;

}   else {
    amount = 500;
}

    return (deliveries * amount) + pay;
    }
}

