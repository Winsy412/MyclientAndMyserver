package com.observer.server;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class Ui extends JFrame{
    public Ui()
    {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        setTitle("1801130033 万盛玉");    //设置显示窗口标题
        setSize(400,200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(2,2,5,5));
        panel.add(new JLabel("已连接数量："));
        JLabel Jlnumber=new JLabel();

        JButton jb = new JButton("添加");
        jb.setBounds(0, 10, 1, 1);
        panel.add(Jlnumber);
        panel.add(jb);
        panel.add(new JLabel("连接告警："));
        JLabel Jcolor = new JLabel();
        Jcolor.setOpaque(true);
        Jcolor.setBackground(Color.green);
        panel.add(Jcolor);
        Container c=getContentPane();    //获取当前窗口的内容窗格
        c.add(panel);    //将标签组件添加到内容窗格上
        setVisible(true);    //设置窗口是否可见



        int port = 1234;
        TcpServer server = new TcpServer(port) {

            @Override
            public void onConnect(SocketTransceiver client) {
                //printInfo(client, "Connect");
                Jlnumber.setText(Integer.toString(GetClient()));
                if(GetClient() >= 5 && GetClient() < 10){
                    Jcolor.setBackground(Color.yellow);
                }else{
                    if(GetClient() >= 10 ){
                        Jcolor.setBackground(Color.red);
                    }
                    else {
                        Jcolor.setBackground(Color.green);
                    }
                }
                System.out.println("client number:"+Integer.toString(GetClient()));
            }

            @Override
            public void onConnectFailed() {
                System.out.println("Client Connect Failed");
            }

            @Override
            public void onReceive(SocketTransceiver client, String s) {
                printInfo(client, "Send Data: " + s);
                client.send(s);
            }

            @Override
            public void onDisconnect(SocketTransceiver client) {
                //printInfo(client, "Disconnect");
                Jlnumber.setText(Integer.toString(GetClient()));
                if(GetClient() >= 5 && GetClient() < 10){
                    Jcolor.setBackground(Color.yellow);
                }else{
                    if(GetClient() >= 10 ){
                        Jcolor.setBackground(Color.red);
                    }
                    else {
                        Jcolor.setBackground(Color.green);
                    }
                }
                System.out.println("client number:"+Integer.toString(GetClient()));
            }

            @Override
            public void onServerStop() {
                System.out.println("--------Server Stopped--------");
            }
        };
        System.out.println("--------Server Started--------");
        server.start();
    }
    static void printInfo(SocketTransceiver st, String msg) {
        System.out.println("Client " + st.getInetAddress().getHostAddress());
        System.out.println("  " + msg);
    }
}
