public class Main {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parse("apple,orange,banana,mango");

        DataParser jsonParser = new CustomJSONParser();
        jsonParser.parse("{CustomerName:NguyenVanTeo}");
    }
}