public class Main {
    public static void main(String[] args) {
        
        User user1 = new User("user1@example.com", "+123456789", "ID01");
        User user2 = new User("user2@example.com", "+987654321", "ID02");

        new UserService(new EmailNotificationService())
                .sendNotification(user1, "New course material available");

        new UserService(new SMSNotificationService())
                .sendNotification(user2, "Upcoming quiz reminder");

        new UserService(new PushNotificationService())
                .sendNotification(user1, "New announcement from instructor");
    }
}
