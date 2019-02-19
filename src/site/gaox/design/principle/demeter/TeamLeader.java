package site.gaox.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:56
 */
public class TeamLeader {
//    //V1.0
//    public void checkNumberOfCourse(List<Course> courseList){
//
//        System.out.println("在线课程数量为："+courseList.size());
//    }

    //V2.0
    public void checkNumberOfCourse() {

        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程数量为：" + courseList.size());
    }
}
