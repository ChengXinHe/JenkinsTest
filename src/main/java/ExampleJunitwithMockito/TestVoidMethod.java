package ExampleJunitwithMockito;

import java.util.*;

public class TestVoidMethod {
    public Map<String,String> map = new HashMap<String,String>();
    private List l = new ArrayList<>();

    public void addString(String word, String meaning) {
        System.out.println("Real Method");
        map.put(word,meaning);
    }

    public void add(String s) {
        this.l.add(s);
    }

    public int size(){
        return this.l.size();
    }

}
