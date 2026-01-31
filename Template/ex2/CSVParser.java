public class CSVParser extends DataParser{
    @Override
    protected String[] splitData(String rawData) {
        return rawData.split(",");
    }
}