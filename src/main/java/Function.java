package main.java;

/**
 * @author jinfeng 2014/10/27
 */
public class Function {

    public int add(int a, int b){
        return a + b;
    }

    public int compareTo(String a, String b){
        if(a == null || b == null)
            return -2;
        else
            return a.compareTo(b);
    }

    public static void main(String[] args) {
        Function f = new Function();
        f.add(1, 1);
    }
}
