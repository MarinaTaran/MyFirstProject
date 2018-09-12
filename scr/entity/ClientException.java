package entity;

public class ClientException extends  Exception {
   public String myMessage;

    public ClientException(String myMessage) {
        this.myMessage = myMessage;
    }
}
