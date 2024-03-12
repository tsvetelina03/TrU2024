import java.io.*;
import java.io.File;
import java.io.FileFilter;

public class DirectoryLister {
    public static void listFiles(File directory, FileFilter filter) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("Директория: " + file.getAbsolutePath());
                        listFiles(file, filter);
                    } else if (filter == null || filter.accept(file)) {
                        System.out.println("Файл: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String directoryPath = ".";

        if (args.length > 0) {
            directoryPath = args[0];
        }

        File directory = new File(directoryPath);
        if (directory.exists()) {
            System.out.println("Съдържание: " + directory.getAbsolutePath());
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    // Филтър по разширение, например ".java"
                    return file.getName().endsWith(".java");
                }
            };
            listFiles(directory, filter);
        } else {
            System.err.println("Не съществува.");
        }
    }
}
