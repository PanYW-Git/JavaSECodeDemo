package com.pyw.a53streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest2 {

    public static void main(String[] args) throws IOException {
                /*
            为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
            加密原理：
                对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
            解密原理：
                读取加密之后的文件，按照加密的规则反向操作，变成原始文件。


             ^ : 异或
                 两边相同：false
                 两边不同：true

                 0：false
                 1：true

               100:1100100
               10: 1010
            二进制的每一位进行上下对比，一样返回0，不一样返回1
               1100100
             ^ 0001010
             __________
               1101110
             ^ 0001010
             __________
               1100100
            得出结论：一个数字异或同一个数字两次会得到本身
        */
        //加密
        encryptionAndReduction(
                new File("src/com/pyw/a53streamtest/temp/63816496808450.png"),
                new File("src/com/pyw/a53streamtest/temp/secret.png")
        );

        //解密
        encryptionAndReduction(
                new File("src/com/pyw/a53streamtest/temp/secret.png"),
                new File("src/com/pyw/a53streamtest/temp/1.png")
        );
    }

    public static void encryptionAndReduction(File src, File dest) throws IOException {
        //1.创建对象关联原始文件
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 10);
        }
        fos.close();
        fis.close();
    }
}
