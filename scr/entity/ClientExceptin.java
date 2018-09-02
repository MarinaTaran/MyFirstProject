package entity;

public class ClientExceptin extends  Exception {
   public String myMessage;

    public ClientExceptin(String myMessage) {
        this.myMessage = myMessage;
    }
}
