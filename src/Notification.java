import java.time.LocalDateTime;

public class Notification {


    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Junk";





    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        printText();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }
    public void transport(){throw new NoTransportException();
    }
    public void showStatus(){
        System.out.println(status);
    }
    protected void printText(){
        System.out.println("Some Text");
    }


}







