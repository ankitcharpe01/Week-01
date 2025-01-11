public class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        double discountPercentage = 10;
        double discount = (fee * (1/discountPercentage));
        double discountedFee = fee - discount ;
        System.out.println(" The discount amount is INR" + " " + discount + " " + "and final discounted fee is INR" + " " + discountedFee);

    }
}