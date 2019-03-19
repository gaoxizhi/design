package site.gaox.design.patterns.creational.prototype;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 09:55
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail："+mail);

        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setMailAddress("姓名"+i+"@gaox.site");
            mailTemp.setContent("恭喜您注册物联网系统成功，敬请体验吧！");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp："+mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
