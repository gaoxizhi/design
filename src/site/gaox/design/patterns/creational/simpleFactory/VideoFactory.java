package site.gaox.design.patterns.creational.simpleFactory;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 10:58
 */
public class VideoFactory {
    //V1.0
//    public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type))
//            return new JavaVideo();
//        else if ("python".equalsIgnoreCase(type))
//                return new PythonVideo();
//        return null;
//    }

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
