public class test{
    public static void main(String[]args){
        MobileUser mu; //refrence varriable
        mu = new rahim() {
            @Override
            public void SendMessage() {
                // Implement the abstract method for this instance.
            }
        };
        mu.SendMessage();

    }
}