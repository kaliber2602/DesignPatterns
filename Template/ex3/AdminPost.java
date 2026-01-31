public class AdminPost extends PostModerator {

    @Override
    protected void checkBannedWords(String content) {
    }

    @Override
    protected boolean shouldCheckLength() {
        return false; 
    }
}
