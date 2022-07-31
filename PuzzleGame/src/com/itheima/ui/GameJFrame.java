package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame{
    public  GameJFrame(){
        initJframe();

        initJMenuBar();

        initImage();
    }

    private void initImage() {
        ImageIcon icon = new ImageIcon("/Users/oliverdai/java_code/PuzzleGame/image/animal/animal3/3.jpg");

        JLabel jLabel = new JLabel(icon);

        this.add(jLabel);
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重等游戏");
        JMenuItem closeItem = new JMenuItem("退出游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutMenu);

        System.setProperty("apple.laf.useScreenMenuBar", "true");
    }

    private void initJframe() {
        this.setSize(603,680);

        this.setTitle("拼图单机版 v.10");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(3);

        //这个在最后
        this.setVisible(true);
    }
}
