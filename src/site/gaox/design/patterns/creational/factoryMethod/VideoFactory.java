package site.gaox.design.patterns.creational.factoryMethod;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 10:58
 */
public abstract class VideoFactory {

    //同样可以使用接口来做
    //此处使用抽闲类抽象方法，由具体实现子类实现
    public abstract Video getVideo();
    //V1.0
//    public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type))
//            return new JavaVideo();
//        else if ("python".equalsIgnoreCase(type))
//                return new PythonVideo();
//        return null;
//    }
//V2.0
//    public Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }


}
