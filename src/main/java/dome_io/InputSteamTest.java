package dome_io;

import java.io.*;

public class InputSteamTest {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("a")) {
            System.out.println("++++++++++++++++++++++");
            InputStream in = new FileInputStream("E://test.txt");
            OutputStream out = new FileOutputStream("E://test1.txt");
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = in.read(bytes)) > 0) {
                out.write(bytes);
                out.flush();
            }

        } else if("b".equals(args[0])){
            FileWriter file = new FileWriter("E://test.txt");
            file.write("zhangkaiulong\r\n");
            file.write("kailong\r\n");
            file.write("long\r\n");
            file.flush();
            System.out.println("========");
        }else if("c".equals(args[0])){
            File file=new File("E://test.txt");
            file.delete();
        }


    }
}
