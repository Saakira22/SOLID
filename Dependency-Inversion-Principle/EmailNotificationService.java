public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending email notification to " + user.getEmail() + ": " + message);
    }
    
}