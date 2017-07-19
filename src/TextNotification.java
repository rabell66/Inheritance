public class TextNotification extends Notification{

    private String recipient;
    private String smsProvider;

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printText();




    }

    @Override
    public void transport() {
        System.out.println(recipient+smsProvider+this.getSubject()+this.getBody());;
    }
}
