package com.sheepsonit.allAlgorithms;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DepthFirstSearch {
    public static List<String> getFileTree(String root) {
        File rootDir = new File(root);
        Queue<File> allFiles = new LinkedList<>();
        List<String> listFilePaths = new ArrayList<>();
        if (rootDir.isDirectory())
            allFiles.add(rootDir);
        while (!allFiles.isEmpty()) {
            File item = allFiles.poll();
            if (item.isDirectory()) {
                File[] files = item.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isDirectory()) {
                            File[] childFiles = file.listFiles();
                            if (childFiles != null)
                                allFiles.addAll(Arrays.asList(childFiles));
                        } else {
                            listFilePaths.add(file.getAbsolutePath());
                        }
                    }
                }
            } else
                listFilePaths.add(item.getAbsolutePath());
        }

        return listFilePaths;
    }
}
