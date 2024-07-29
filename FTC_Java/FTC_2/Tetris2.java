import java.awt.*;
import javax.swing.*;

public class Tetris2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // 创建窗口
                JFrame frame = new JFrame();
                frame.setTitle("Tetris");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(305, 525); // 设置窗口大小
                frame.setLocationByPlatform(true); // 窗口位置由平台决定

                // 创建自定义绘图面板
                CustomPanel canvas = new CustomPanel();
                canvas.setBackground(Color.WHITE); // 设置画布背景为白色
                frame.add(canvas); // 将绘图面板添加到窗口

                System.out.println("Canvas added to frame"); // 调试输出

                frame.setVisible(true); // 窗口可见
            }
        });
    }
}

// 自定义绘图面板
class CustomPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public CustomPanel() {
        System.out.println("Canvas constructor called"); // 调试输出
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("paintComponent called"); // 调试输出
        System.out.println("Canvas size: " + getWidth() + "x" + getHeight()); // 输出画布大小

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK); // 设置颜色为黑色

        // 在面板上绘制一个正方形
        int size = 50; // 正方形的边长
        int x = (getWidth() - size) / 2; // 计算正方形左上角的x坐标，使其居中
        int y = (getHeight() - size) / 2; // 计算正方形左上角的y坐标，使其居中
        g2.fillRect(x, y, size, size); // 绘制正方形
    }
}
