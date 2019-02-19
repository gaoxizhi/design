package site.gaox.design.principle.demeter;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 09:56
 *
 * 设计优点： 只需做好本职工作
 * 不需要过多的了解其他的功能
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        // V1.0
//        List<Course> courseList = new ArrayList<Course>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
//        teamLeader.checkNumberOfCourse(courseList);

        //V2.0 清晰
        // 只需要下发指令
        teamLeader.checkNumberOfCourse();
    }
}
