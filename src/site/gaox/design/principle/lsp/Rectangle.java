package site.gaox.design.principle.lsp;

/**
 * @Description: <p>  </p>
 * @Auther: gaox·Eric
 * @Date: 2019/2/19 16:14
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;
    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    // 只会生成set方法
    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
