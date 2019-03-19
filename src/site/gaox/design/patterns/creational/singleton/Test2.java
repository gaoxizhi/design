package site.gaox.design.patterns.creational.singleton;

import java.io.*;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 17:42
 */
public class Test2{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(hungrySingleton);

        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream((new FileInputStream(file)));
        HungrySingleton newInstance = (HungrySingleton)ois.readObject();

        //   运行抛出java.io.NotSerializableException异常，需要将HungrySingleton实现Serializable实例化接口
        System.out.println(hungrySingleton);
        System.out.println(newInstance);
        System.out.println(hungrySingleton == newInstance);
    }
}
