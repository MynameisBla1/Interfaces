//This class implements all the methods within ITelephone (the interface)
public class WorkPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
//This is a constructor so that we can instantiate an object of type WorkPhone
    public WorkPhone(int myNumber) {
        this.myNumber = myNumber;
    }
//These are all the implemented methods that we are required to have as per the interface.
//The interface is essentially a contract.
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
