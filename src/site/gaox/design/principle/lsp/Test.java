package site.gaox.design.principle.lsp;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 16:20
 *
 * 避免继承关系混乱
 */
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + "\tlength:" + rectangle.getLength());
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(21);
        rectangle.setWidth(10);
        resize(rectangle);

        System.out.println("--------------------------------");
        // 这里就已经违反了里氏替换原则，由子类替换了父类
        //达不到预期的目的
//        Rectangle square = new Square();
//        square.setWidth(10);
//        resize(square);


    }
}
