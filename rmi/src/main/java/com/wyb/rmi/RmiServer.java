package com.wyb.rmi;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;

/**
 * @author Tommy
 * Created by Tommy on 2019/12/1
 **/
public class RmiServer {
    public static void main(String[] args) throws IOException, AlreadyBoundException {
        // 创建一个远程对象
        UserService hello = new UserServiceImpl();
        //绑定的URL标准格式为：rmi://host:port/name
        Naming.bind("rmi://localhost:8999/UserService3", hello);
        System.out.println("======= 启动RMI服务注册成功! =======");
        System.in.read(new byte[1024]);
    }
}
