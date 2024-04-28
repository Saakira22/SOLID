public class UserService {
    
    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(User user, String message) {
        notificationService.sendNotification(user, message);
    }

}