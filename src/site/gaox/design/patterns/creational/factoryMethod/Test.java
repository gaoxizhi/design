package site.gaox.design.patterns.creational.factoryMethod;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/18 10:57
 */
public class Test {
    public static void main(String[] args) {
        //V1.0
        //       VideoFactory factory = new VideoFactory();
        //       Video video = factory.getVideo("java");
        //       if(null == video){
        //           return;
        //       }
        //       video.produce();
        //    }

        // V2.0
//        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideo(PythonVideo.class);
//        if (null == video) {
//            return;
//        }
//        video.produce();



        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }


}
