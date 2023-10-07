public class JsonTool{
    private String data;

    public JsonTool() {
    }

    public void setData(String data){
        this.data = data;
    }

    public void analyzeData(){
        if( data.contains("json") ){
            System.out.println("Valid Json, I am happy to process...");
        }else{
            System.out.println("Not a Valid Json..!");
        }
    }
}