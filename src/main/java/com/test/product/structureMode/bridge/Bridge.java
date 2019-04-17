package com.test.product.structureMode.bridge;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 16:09 2019-04-17
 * @Modify By:
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
