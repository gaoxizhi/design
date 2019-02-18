package site.gaox.design.principle.openclose;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/18 10:30
 */
public class JavaCourse implements ICourse{
    private Integer id;
    private String name;
    private Integer age;
    private Double weight;

    public JavaCourse(Integer id, String name, Integer age, Double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

}
