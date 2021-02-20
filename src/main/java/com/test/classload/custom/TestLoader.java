package com.test.classload.custom;

public class TestLoader {
    public static void main(String[] args) throws Exception {
        DogClassLoader l1 = new DogClassLoader("loaderDog");
        Class<?> dogC = l1.loadClass("Dog");
        dogC.newInstance();
        CatClassLoader l2 = new CatClassLoader("loaderCat", l1); // 把l1作为它的父加载器
        Class<?> doccc = l2.loadClass("Cat");
        doccc.newInstance();
    }
}