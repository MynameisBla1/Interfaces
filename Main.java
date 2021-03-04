public class Main {

    public static void main(String[] args) {
        ITelephone alaadinsPhone;

        alaadinsPhone = new WorkPhone(123456);
        alaadinsPhone.powerOn();
        alaadinsPhone.callPhone(123456);
        alaadinsPhone.answer();

    }
}
