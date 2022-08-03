package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame 界面，窗体
    //子类呢？也表示界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中

    //创建一个二维数组
    //目的：用来管理数据
    //加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];
    //x,y 用来记录空白方块的位置
    int x=0;
    int y=0;

    //定义一个相对路径的变量 这样方便使用
    String path = "..\\puzzlegame\\image\\animal\\animal3\\";

    int[][] win = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //用来记录步数
    int step = 0;

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();


        //初始化数据（打乱）
        initData();

        //初始化图片（根据打乱之后的结果去加载图片）
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);

    }



    //初始化数据（打乱）
    private void initData() {
        //1.定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据的顺序
        //遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //4.给二维数组添加数据
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]==0){
                x = i/4;
                y = i%4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }


    }

    //初始化图片
    //添加图片的时候，就需要按照二维数组中管理的数据添加图片
    private void initImage() {
        //删除全部的图片  起到更新的作用
        this.getContentPane().removeAll();

        //添加胜利的图标
        if(Victory()){
            JLabel win = new JLabel(new ImageIcon("D:\\Java_Code\\puzzlegame\\image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }
        //生成步数
        JLabel stepcount = new JLabel("步数"+step);
        stepcount.setBounds(50,30,100,20);
        this.getContentPane().add(stepcount);



        //外循环 --- 把内循环重复执行了4次。
        for (int i = 0; i < 4; i++) {
            //内循环 --- 表示在一行添加4张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                int num = data[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon( path+ num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        JLabel background = new JLabel(new ImageIcon("..\\puzzlegame\\image\\background.png"));
        background.setBounds(40,40,508,560);

        this.getContentPane().add(background);

        //刷新
        this.getContentPane().repaint();

    }


    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //创建更换图片
        JMenu changeimage = new JMenu("更换图片");
        //创建选项下面的条目对象


        //把美女、动物、运动添加到更换图片当中
        changeimage.add(girl);
        changeimage.add(animal);
        changeimage.add(sport);

        //将每一个选项下面的条目天极爱到选项当中
        functionJMenu.add(changeimage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        //把公众号添加到关于我们当中
        aboutJMenu.add(accountItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
        //给美女、动物、运动天加动作监听
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //给界面添加一个键盘监听
        this.addKeyListener(this);

    }

    public boolean Victory(){
        //判断游戏是否赢，如果data和win的其中一个元素不一样就返回false否则返回true
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
//        if(source==girl){
//            Random r = new Random();
//            String gilrPath = "..\\puzzlegame\\image\\girl\\girl"+r.nextInt(14);
//            initImage();
//        }
        if(source==replayItem){
            System.out.println("重新游戏");
            //步数清零
            step=0;
            //更新重新打乱图片
            initData();

            //更新图片
            initImage();
        } else if (source == reLoginItem) {
            System.out.println("重新登录");
            //隐藏掉游戏界面
            this.setVisible(false);

            new LoginJFrame();
        } else if (source==closeItem){
            System.exit(0);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code==65){
            //添加全部图片
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("D:\\Java_Code\\puzzlegame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.println(code);
        if(Victory()){
            return;
        }
        if(code==37){
            System.out.println("向左移动");
            if(y==3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1]=0;
            y++;
            //每走一步步数增加
            step++;
            initImage();

        } else if (code == 38) {
            System.out.println("向上移动");
            if(x==3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y]=0;
            x++;
            //每走一步步数增加
            step++;
            initImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            if(y==0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1]=0;
            y--;
            //每走一步步数增加
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if(x==0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y]=0;
            x--;
            //每走一步步数增加
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }
}
