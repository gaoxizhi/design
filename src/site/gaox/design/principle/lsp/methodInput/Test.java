package site.gaox.design.principle.lsp.methodInput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 16:52
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        Map map = null;
        child.method(hashMap);
        child.method(map);
    }
}
