package com.wyb.rmi;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;

/**
 * @author Tommy
 * Created by Tommy on 2019/12/1
 **/
public class RmiRegister {
    public static void main(String[] args) throws IOException {
        // 本地主机上的远程对象注册表Registry的实例
        LocateRegistry.createRegistry(8999);
        System.out.println("======= 注册中心启动成功! =======");
        System.in.read(new byte[1024]);
    }

}
