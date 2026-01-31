public class UserPost extends PostModerator {

    @Override
    protected void checkBannedWords(String content) {
        if (content.toLowerCase().contains("quảng cáo")) {
            throw new RuntimeException("Bai viet chua tu cam!");
        }
    }

    @Override
    protected String checkLength(String content) {
        if (content.length() > 50) {
            return content.substring(0, 50) + "...";
        }
        return content;
    }
}
