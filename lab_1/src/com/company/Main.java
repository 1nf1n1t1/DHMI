package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static File[] getFileArray(String path){

        File f = new File(path);

        File[] list = f.listFiles();

        return list;

    }
}
