package FacadePattern;

/**
 * 外观模式
 *
 * 定义一个接待员，帮助用户执行复杂的程序
 *
 * 只暴露一个接口出来
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
