package site.gaox.design.principle.singleresponsibility;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:34
 *   空方法示例
 *
 *   缺点：不使用继承，过度的使用会造成
 *   类的爆炸，太多的类
 */
public class Method {
    private void updateUserInfo(String userName, String tel){
        userName = "gaox";
        tel = "18754032688";
    }

    // 对updateUserInfo的拆分
    private void updateUserName(String userName){
        userName = "gaox";
    }
    private void updateUserTel(String tel){
        tel = "18754032688";
    }

    private void updateUserInfo(String userName, String ... properties){
        userName = "gaox";
    }

    // 原则上该写法还需要进行拆分
    // 属于两个职责
    private void updateUserInfo(String userName, String tel, boolean bool){
        if(bool){
            //todo something1
        }else {
            //todo something2
        }
    }
}
