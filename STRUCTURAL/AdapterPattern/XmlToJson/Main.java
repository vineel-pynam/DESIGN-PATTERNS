public class Main{
    public static void main(String args[]){
        String data = "I am xml";
        JsonTool jsonTool = new JsonTool();
        jsonTool.setData(data);
        jsonTool.analyzeData();

        System.out.println("---------- Using Adapter ------------ ");
        AnalyticsTool tool = new XmlToJsonAdapter(data);
        tool.analyzeData();

    }
}