public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Sending push notification to " + user.getUserID() + ": " + message);
    }
}