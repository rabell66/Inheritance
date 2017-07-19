




public class Main {

    public static void main(String[] args) {


       EmailNotification emailnotification = new EmailNotification("Subject: Nigerian Prince --", " You can earn 1 million Dollars ",
               "  Marshall  ","Verizon  ");

        TextNotification textNotification = new  TextNotification("Subject: Nigerian Prince --"," You can earn 1 million Dollars ",
                "  Joe  ", "Sprint  ");

        emailnotification.setStatus("Not Junk");

        textNotification.transport();

        emailnotification.transport();

        textNotification.showStatus();

        emailnotification.showStatus();

        emailnotification.printText();

        Object emailNotificationClone = emailnotification.clone();

        boolean x = emailnotification.equals(emailNotificationClone);

        System.out.println(emailnotification);
        System.out.println(emailNotificationClone);
        System.out.println(x);



    }

}
