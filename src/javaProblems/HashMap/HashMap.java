package javaProblems.HashMap;

public class HashMap
{
    private final Entity[] arr;

    HashMap(){
        arr= new Entity[100];
    }

    public void put(String key , String value){

        int idx = (Math.abs(key.hashCode())%arr.length);
        arr[idx] = new Entity(key , value);

    }

    @Override
    public String toString() {
        String res = "";
        res+="[";

        for(Entity item : arr){

            if(item == null){
                continue;
            }

            res+=item.key;
            res+="=";
            res+=item.value;
            res+=",";

        }

        return res;
    }

    public String get(String key){
        int idx = (Math.abs(key.hashCode())%arr.length);

        if(arr[idx] != null && arr[idx].key.equals(key)){
            return arr[idx].value;
        }

        return null;

    }

    public void remove(String key){

        int idx = (Math.abs(key.hashCode())%arr.length);
        if(arr[idx] != null && arr[idx].key.equals(key)){
            arr[idx] = null;
        }

    }

    static class Entity{

        String key;
        String value;


        Entity(String key  , String value){

            this.key = key;
            this.value = value;

        }

    }

}
