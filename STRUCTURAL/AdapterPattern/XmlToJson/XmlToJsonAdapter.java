public class XmlToJsonAdapter implements AnalyticsTool{
    private JsonTool jsonTool;

    public XmlToJsonAdapter(String data){
        data = data + " is a json";
        jsonTool = new JsonTool();
        jsonTool.setData(data);
    }

    @Override
    public void analyzeData(){
        jsonTool.analyzeData();
    }
}