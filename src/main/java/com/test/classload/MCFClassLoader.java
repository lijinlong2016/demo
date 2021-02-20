package com.test.classload;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

public class MCFClassLoader extends URLClassLoader {
    public MCFClassLoader(URL[] urls) {
        super(urls);
    }

    public MCFClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public MCFClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }

    @SuppressWarnings("rawtypes")
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class c = findLoadedClass(name);
        if (c == null) {
            try {
                c = findClass(name);
            } catch (ClassNotFoundException e) {
                return super.loadClass(name);
            }
        }
        return c;
    }

}

class AA {
    public ClassLoader getDSClassLoader(String moudleName) {
        URLClassLoader urlClassLoader = null;
        try {
            urlClassLoader = new MCFClassLoader(new URL[]{new URL("......xxx.jar"), new URL("......yyy.jar")}, this.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return urlClassLoader;
    }
}