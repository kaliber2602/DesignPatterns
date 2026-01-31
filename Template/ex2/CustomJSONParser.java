public class CustomJSONParser extends DataParser {
    @Override
    protected String[] splitData(String rawData) {
        String content = rawData.substring(1, rawData.length() - 1);
        String[] parts = content.split(":");
        return parts;
    }
}