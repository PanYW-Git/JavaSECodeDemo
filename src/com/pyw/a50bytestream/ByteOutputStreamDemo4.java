package com.pyw.a50bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
            换行写：
                再次写出一个换行符就可以了
                windows： \r\n
                Linux:    \n
                Mac:      \r
            细节：
                在windows操作系统当中，java对回车换行进行了优化。
                虽然完整的是\r\n，但是我们写其中一个\r或者\n，
                java也可以实现换行，因为java在底层会补全。
            建议：
                不要省略，还是写全了。


            续写：
                如果想要续写，打开续写开关即可
                开关位置：创建对象的第二个参数
                默认false：表示关闭续写，此时创建对象会清空文件
                手动传递true：表示打开续写，此时创建对象不会清空文件

        */
        FileOutputStream fos = new FileOutputStream("src\\com\\pyw\\a50bytestream\\temp\\c.txt",true);

        String str1 = "helloworld";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //换行符
        String wrap = "\r\n";
        byte[] bytesWrap = wrap.getBytes();
        fos.write(bytesWrap);

        String str2 = "IO";
        byte[] bytes2 = str2.getBytes();

        fos.write(bytes2);
        fos.close();
    }
}
