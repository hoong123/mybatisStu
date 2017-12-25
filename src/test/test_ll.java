package test;

/**
 * @author weihoong
 * @since 2017/10/23
 */
public class test_ll {
    public static void add3(Integer i){
        int val = i.intValue();
        val+=3;
    }
    public static void main(String[] args) {
        Integer i = new Integer(0);
        add3(i);
        System.out.println(i.intValue());
    }
}
