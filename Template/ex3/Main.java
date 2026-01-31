public class Main {
    public static void main(String[] args) {

        PostModerator userPost = new UserPost();
        PostModerator adminPost = new AdminPost();

        String longUserContent =
            "Day la bai viet cua nguoi dung voi noi dung rat dai va co chua tu quang cao de kiem tra chuc nang kiem tra tu cam va cat ngan.";

        String longAdminContent =
            "Day la bai viet cua admin voi noi dung rat dai nhung khong bi gioi han do la admin.";

        System.out.println("=== USER POST ===");
        try {
            userPost.publishPost(longUserContent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== ADMIN POST ===");
        adminPost.publishPost(longAdminContent);
    }
}
