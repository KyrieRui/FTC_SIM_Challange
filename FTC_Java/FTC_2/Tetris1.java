import java.awt.*;
import javax.swing.*;

public class Tetris1 
{
    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                // 创建窗口
                JFrame frame = new JFrame();
                frame.setTitle("Tetris");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(525, 525); // 设置窗口大小
                frame.setLocationByPlatform(true); // 窗口位置由平台决定
                frame.setVisible(true); // 窗口可见
            }
        });
    }
}
