package site.gaox.design.patterns.creational.prototype;

import java.text.MessageFormat;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 09:48
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容{2}发送邮件。";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getMailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail："+ mail.getContent());
    }
}
