public class SMSNotificationService implements NotificationService {

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending SMS notification to " + user.getPhoneNumber() + ": " + message);
    }
}