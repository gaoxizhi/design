package site.gaox.design.principle.openclose;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 11:19
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Integer age, Double weight) {
        super(id, name, age, weight);
    }
    public Double getOriginWeight(){
        return super.getWeight();
    }

    @Override
    public Double getWeight() {
        return super.getWeight()*0.96;
    }
}
