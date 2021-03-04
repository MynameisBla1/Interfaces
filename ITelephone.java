/*This is the interface class, it lets us know that for a Telephone
we require a set number o methods to be implemented. The methods are NOT
defined below. Instead, we define them within a regular class
We use the implements keyword to utilize this interface. See:WorkPhone class

 */

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
