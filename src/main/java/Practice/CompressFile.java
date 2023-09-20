//package Practice;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.zip.DeflaterOutputStream;
//
//public class CompressFile  {
//
//        public void compress() throws Exception {
//
//        //Instantiating the FileInputStream
//        String inputPath = "D:\\ExampleDirectory\\logo.jpg";
//        FileInputStream inputStream = new FileInputStream(inputPath);
//        //Instantiating the FileOutputStream
//        String outputPath = "D:\\ExampleDirectory\\compressedLogo.txt";
//        FileOutputStream outputStream = new FileOutputStream(outputPath);
//        //Instantiating the DeflaterOutputStream
//        DeflaterOutputStream compresser = new DeflaterOutputStream(outputStream);
//        int contents;
//        while ((contents = inputStream.read()) != -1) {
//            compresser.write(contents);
//        }
//        compresser.close();
//        System.out.println("File compressed.......");
//    }
//}
