import java.io.*;

public class Uebung09 {
    public static void main(String[] args) throws IOException {
        String fileName = "Test.txt";
        String savePath = "C:\\Users\\alexa\\AppData\\Local\\Test\\";
        File file = new File(savePath + fileName);
        if (file.exists()) {
            System.out.println("Die Datei " + fileName + " exisitert bereits.");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Die Datei " + fileName + " hat folgende Eigenschaften:");
        System.out.println("Dateipfad: " + file.getPath());
        System.out.println("Ist Datei: " + file.isFile());
        System.out.println("Festplattenspeicher: " + file.getFreeSpace());
        System.out.println("Absoluter Speicher: " + file.getTotalSpace());
        System.out.println("Nutzbarer Speicher: " + file.getUsableSpace());
        //file.delete();
        //System.out.println("Status nach löschen: "+file.exists());

        file.setReadOnly();
        System.out.println("Ist Readable: " + file.canRead());
        System.out.println("Ist Writable: " + file.canWrite());
        file.setWritable(true);
        System.out.println("Ist Readable: " + file.canRead());
        System.out.println("Ist Writable: " + file.canWrite());

        Reader reader = null;
        try {
            reader = new FileReader(savePath + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newFileName = "Test_Kopie.txt";
        Writer writer = null;
        try {
            writer = new FileWriter(savePath + newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            assert reader != null;
            int c = reader.read();
            assert writer != null;
            writer.write(c);
            if (c == -1) break;
            System.out.print((char) c);
        }
        reader.close();
        writer.close();
    }
}
