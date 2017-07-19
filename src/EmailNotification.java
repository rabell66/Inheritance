public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
     }




    public void setStatus(String status){
        this.status = status;

    }


    @Override
    public void printText() {
        System.out.println("Some more text");

    }

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;


    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(recipient + smtpProvider + getSubject() + getBody());

    }

}
