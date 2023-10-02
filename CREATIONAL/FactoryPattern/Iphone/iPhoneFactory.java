public class iPhoneFactory{
    private iPhoneFactory(){};

    public static Phone producePhone(String type, String os, String metal, String processor) throws Exception{
        switch(type){
            case "iPhone":
                return new iPhone(os, metal, processor);
            case "iPhonePro":
                return new iPhonePro(os, metal, processor);
        }

        throw new Exception("No Type");
    }
}