
import java.io.*;
import java.util.*;

class FlattenMap {

    // adding comments

    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
        HashMap<String, String> flatMap = new HashMap<String, String>();
        return flattenDictionary(dict, flatMap, null, null);
    }

    //adding more comments

    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict, HashMap<String, String> flatMap, String key, Object value) {
        String key1 = null;
        Object value1 = null;
        for(Map.Entry<String, Object> entry1 : dict.entrySet()){
            if(key == null ){
                key1 = entry1.getKey();
            }else{
                key1 = key;
            }
            if(value == null){
                value1 = entry1.getValue();
            }else{
                value1 = value;
            }

            if(value1 instanceof String){
                flatMap.put(key, (String)value1);
            }else {
                HashMap<String, Object> temp = (HashMap<String, Object>) value1;
                for(Map.Entry<String, Object> entry2: temp.entrySet()){
                    String k = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if(value2 instanceof  String){
//                        flattenDictionary(value2, flatMap, key1+"."+k, value2);

                    }else{
                        flattenDictionary((HashMap<String, Object>)value2, flatMap, key1+"."+k, value2);
                    }
                }
            }
        }
        return flatMap;

    }

    public static void main(String[] args) {
        HashMap<String, Object> input = new HashMap<String, Object>();
        HashMap<String, Object> input2 = new HashMap<String, Object>();
        HashMap<String, Object> input3 = new HashMap<String, Object>();
        HashMap<String, Object> input4 = new HashMap<String, Object>();
        input4.put("", "1");

        input3.put("d", "4");
        input3.put("e", input4);

        input2.put("a", "2");
        input2.put("b", "3");
        input2.put("c", input3);

        input.put("key1", "1");
        input.put("key2", input2);

        HashMap<String, String> resultMap = flattenDictionary(input);

        for(Map.Entry entry : resultMap.entrySet()){
            System.out.println("key = "+entry.getKey()+" :::: value = "+entry.getValue());
        }
    }

}