package site.gaox.design.patterns.creational.prototype.clone;

import java.util.Date;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/3/19 10:20
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthDay;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        //深克隆，将对象的属性拷贝出单独赋值
        pig.birthDay = (Date) pig.birthDay.clone();
        return pig;
    }
    public Pig() {
    }

    public Pig(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}'+super.toString();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
