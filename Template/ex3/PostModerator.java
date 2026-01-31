public abstract class PostModerator {

    public final void publishPost(String content) {
        content = cleanContent(content);
        checkBannedWords(content);

        if (shouldCheckLength()) {
            content = checkLength(content);
        }

        saveToDatabase(content);
    }

    protected String cleanContent(String content) {
        return content.trim();
    }

    protected abstract void checkBannedWords(String content);

    protected String checkLength(String content) {
        return content;
    }

    protected boolean shouldCheckLength() {
        return true;
    }

    protected void saveToDatabase(String content) {
        System.out.println("Da luu bai viet: " + content);
    }
}
