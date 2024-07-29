import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tetris3 {
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
                CustomPanel customPanel = new CustomPanel();
                customPanel.setBackground(Color.WHITE); // 设置画布背景为白色
                frame.add(customPanel); // 将绘图面板添加到窗口

                System.out.println("CustomPanel added to frame"); // 调试输出

                frame.setVisible(true); // 窗口可见

                // 设置键盘监听
                frame.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        customPanel.moveSquare(e.getKeyCode());
                    }
                });

                // 使窗口获取焦点，以便接收键盘事件
                frame.setFocusable(true);
                frame.requestFocusInWindow();
            }
        });
    }
}

// 自定义绘图面板
class CustomPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private int x = 127; // 初始x坐标
    private int y = 237; // 初始y坐标
    private final int size = 50; // 正方形的边长
    private final int moveDelta = 10; // 每次移动的像素数

    public CustomPanel() {
        System.out.println("CustomPanel constructor called"); // 调试输出
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("paintComponent called"); // 调试输出
        System.out.println("CustomPanel size: " + getWidth() + "x" + getHeight()); // 输出画布大小

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK); // 设置颜色为黑色

        // 绘制正方形
        g2.fillRect(x, y, size, size);
    }

    public void moveSquare(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y = Math.max(y - moveDelta, 0); // 向上移动，防止越界
                break;
            case KeyEvent.VK_DOWN:
                y = Math.min(y + moveDelta, getHeight() - size); // 向下移动，防止越界
                break;
            case KeyEvent.VK_LEFT:
                x = Math.max(x - moveDelta, 0); // 向左移动，防止越界
                break;
            case KeyEvent.VK_RIGHT:
                x = Math.min(x + moveDelta, getWidth() - size); // 向右移动，防止越界
                break;
        }
        repaint(); // 重新绘制面板
    }
}
