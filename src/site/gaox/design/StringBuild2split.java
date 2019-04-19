package site.gaox.design;/**
 * @Description: <p>  </p>
 * @Author: gaox·Eric
 * @Date: 2019/3/25 10:16
 */

/**
 * @ClassName StringBuild2split
 * @Author none
 * @Version 1.0
 */
public class StringBuild2split {


    /**
     * 传入参数即存储名称预编译处理
     *
     * @param storageName 存储过程的名称
     * @param size        参数的数量
     * @return 返回存储过程的参数集
     */
    public static String storageNameHandle(String storageName, Integer size) {
        // 参数没有，直接返回存储名
        if (size <= 0) {
            return storageName;
        }
        // 预处理参数
        String params = "?";
        // 参数拼接
        for (int i = 1; i < size; i++) {
            params += ",?";
        }
        String newstorageName = storageName + "(" + params + ")";

        return newstorageName;
    }

    public static void getString() {
        String string = "abc,dde,rrrd,sdmj,rete,ssdfd,";
        String substring = string.substring(0, string.length() - 1);//截取最后一个
        System.out.println(substring);
        String[] split = substring.split(",");//以逗号分割
        System.out.println(split.length);
        for (String string2 : split) {
            System.out.println("string2-->>>" + string2);
        }
    }

    /* String str = ""; 
    StringBuffer sb = new StringBuffer(); 
    long start = 0L; 
    long end = 0L; 
    start = System.currentTimeMillis(); 
    for (int i = 0; i < 9999; i++) { 
    str = str + "a"; 

    } 
    System.out.println("str-->>"+str);
    end = System.currentTimeMillis(); 
    System.out.println("使用string的时间是:" + (end - start) + "毫秒!"); 


    start = System.currentTimeMillis(); 
    for (int i = 0; i < 9999; i++) { 
    sb.append("a"); 
    } 
    end = System.currentTimeMillis(); 
    System.out.println("使用StringBuffer的时间是:" + (end - start) + "毫秒!"); */
    public static void getStringBuffer() {
        Long start = 0L;
        Long end = 0L;

        String string = "";
        StringBuffer stringBuffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            string += i + "a";
        }
        System.out.println(string);
        end = System.currentTimeMillis();
        System.out.println("使用string用了多少秒:" + (end - start) + "mm");

        start = System.currentTimeMillis();
        for (int j = 0; j < 9999; j++) {
            stringBuffer.append("a");

        }
        System.out.println(stringBuffer.length());
        end = System.currentTimeMillis();
        System.out.println("使用StringBuffer的时间是:" + (end - start) + "毫秒!");


/* for (String string : ids) {
idd.append("'"+string+"',");
} 
if(idd.length()>0){
idd.deleteCharAt(idd.length()-1);
}*/
        String string2 = "a,b,c,d,e,f,g,j,k,m,n,";
        String substring = string2.substring(0, string2.length() - 1);
        System.out.println(string2);
        String[] split = substring.split(",");
        System.out.println(split.length);
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        for (String string3 : split) {
            buffer.append(string3 + ",");
        }

        //相当于-->>>>String substring = string2.substring(0, string2.length()-1); 
        if (buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        System.out.println(buffer);
    }

    static String useStringBuilder() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9999; ++i) {
            builder.append("as");
        }
        return builder.toString();
    }

    public static void getSbf() {

        StringBuffer sb = new StringBuffer("TestString");
        sb.insert(4, false);
        System.out.println(sb.toString());
        StringBuffer sbs = new StringBuffer();

        String user = "test";
        String pwd = "123";
        sbs.append("select * from userInfo where username=")
                .append(user)
                .append("and pwd=")
                .append(pwd);
        System.out.println(sbs.toString());

        StringBuffer sbss = new StringBuffer("Test");
        sbss.deleteCharAt(1);
        System.out.println(sbss);
    }

    public static void main(String[] args) {
/*getString();
String newstorageName = ConnSql.storageNameHandle("call op_search_flow_port_analysis_trend ", 4);
System.out.println("newstorageName=" + newstorageName);
*/

//getStringBuffer();
//useStringBuilder();
        getSbf();

    }

}
