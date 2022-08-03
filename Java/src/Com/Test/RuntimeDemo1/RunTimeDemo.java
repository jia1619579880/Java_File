package Com.Test.RuntimeDemo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RunTimeDemo extends JFrame implements ActionListener {
    //初始化文字
    JLabel text = new JLabel("你觉得自己帅吗？");
    //初始化按钮
    JButton jb1 = new JButton("帅爆了");
    JButton jb2 = new JButton("一般般吧");
    JButton jb3 = new JButton("不帅，有点坎坷");

    //决定了上方的按钮
    boolean flag = false;
    JButton notShutdown = new JButton("绕了我把!");

    public RunTimeDemo() {
        //initFrame methon
        initJFrame();

        //initBotton
        initView();
        //display Frame
        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();

        if (flag) {
            //展示按钮
            notShutdown.setBounds(125, 100, 250, 25);
            notShutdown.addActionListener(this);
            this.getContentPane().add(notShutdown);
        }

        //给文字设置字体和位置
        text.setFont(new Font("微软雅黑", 0, 30));
        text.setBounds(120, 150, 300, 50);


        //设置按钮的位置
        jb1.setBounds(175, 300, 150, 25);
        jb2.setBounds(175, 350, 150, 25);
        jb3.setBounds(125, 400, 250, 25);

        //给按钮添加动作
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);

        //把文字和按钮添加到主界面中
        this.getContentPane().add(text);
        this.getContentPane().add(jb1);
        this.getContentPane().add(jb2);
        this.getContentPane().add(jb3);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(500, 600);

        //取消剧中
        this.setLayout(null);

        //标题
        this.setTitle("恶搞好基友");

        //窗口默认居中
        this.setLocationRelativeTo(null);

        //默认关闭模式
        this.setDefaultCloseOperation(3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if (source == jb1) {
            System.out.println("你的好基友点击了帅爆了");
            showJDialog("xxx 你太自信了，给你一个小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == jb2) {
            System.out.println("你的好基友点击了一般般吧");
            showJDialog("xxx,你还是太自信了。也要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == jb3) {
            System.out.println("你的好基友点击了不帅");
            showJDialog("xxx,你还是有自知之明的，也要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1800");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (source == notShutdown) {
            showJDialog("xxx,这次饶了你");

            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        Container container = null;
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
