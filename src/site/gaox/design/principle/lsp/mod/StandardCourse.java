package site.gaox.design.principle.lsp.mod;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 11:19
 */
public class StandardCourse extends Course {
    public StandardCourse(Integer id, String name, Integer age, Double weight) {
        super(id, name, age, weight);
    }

    public Double getStandardWeight() {
        return super.getWeight()*0.96;
    }

    //子类不能重写父类原有的非抽象方法
    //只能重写父类抽象方法
//    @Override
//    public Double getWeight() {
//        return super.getWeight() * 0.96;
//    }
}
