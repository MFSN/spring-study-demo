package com.mfs.demonstrationdemo01;

/**
 * @Author:MuFanSen
 * @Date: 18:27 2020/11/27
 */
public class T03_ThisEscape {
        private int num = 8;

        public T03_ThisExcape(){
            new Thread(() - >System.out.println(this.num))
		).start();
        }
        public static void main(String[] args)throws Exception{
            new T03_ThisEscape();
            System.in.read();
        }


}
