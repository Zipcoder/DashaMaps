public class DashaMapOne implements HashMapX {
    public void set(String key, String value){

    }
    public String delete(String key){
        return null;
    }

    public String get(String key){
        return null;
    }


    public boolean isEmpty(){
        return false;
    }


    public long size(){
        return 0;
    }

    @Override
    protected boolean bucketSize(String key) {
        return false;
    }
}
