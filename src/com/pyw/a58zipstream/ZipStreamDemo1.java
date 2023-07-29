package com.pyw.a58zipstream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a58zipstream\\temp\\temp.zip");
        //2.创建一个File表示要解压的目的地
        File dest = new File("D:\\Software\\java\\Project\\javaSE\\JavaSECodeDemo\\src\\com\\pyw\\a58zipstream\\temp");
        unzip(src,dest);
    }

    /**
     * 解压
     * @param src 要解压的文件
     * @param dest 要解压的目的地
     * @throws IOException
     */
    public static void unzip(File src,File dest) throws IOException {
        //解压的本质：把压缩包里面的每一个文件或文件夹读取出来，按照层级拷贝到目的地当中

        //创建一个解压缩流用来读取压缩包中的数据
        //中文需要指定字符编码是GBK
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src), Charset.forName("GBK"));
        //要先获取到压缩包里面的每一个ZipEntry对象
        //zip.getNextEntry()的底层会获取压缩文件夹以及子文件夹中的文件和文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) !=null){
            System.out.println(entry);
            File file = new File(dest,entry.toString());
            if(entry.isDirectory()){
                //文件夹：需要再目的地的dest处创建一个同样的文件夹
                file.mkdirs();
            }else {
                //文件:需要读取到压缩包中的文件，并把他存放到目的地的dest文件夹中（按照层级目录存放）
                FileOutputStream fos = new FileOutputStream(file);
                int b;
                while ((b = zip.read()) != -1){
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
