public abstract class DataParser{
    final void parse (String rawData){
        String[] tokens = splitData(rawData);
        processTokens(tokens);
    }

    protected abstract String[] splitData(String rawData);

    protected void processTokens(String[] tokens){ 
        for(String token : tokens){
            System.out.println("Processed token: " + token);
        }
    }

}