public class Program {

    public static void main(String[] args) throws IOException{ 
        JsonReader reader = Json.createReader(new StringReader(jsonString));
        JsonObject jsonObject = reader.readObject();
}