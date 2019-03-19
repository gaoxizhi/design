package site.gaox.design.patterns.creational.prototype;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 09:46
 */
//V1.0
//public class Mail {
//实现克隆接口
public class Mail implements Cloneable{

    private String name;
    private String mailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail class Constructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", content='" + content + '\'' +
                '}'+super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //  实现克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
