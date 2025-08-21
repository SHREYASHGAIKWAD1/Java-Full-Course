package com.OOPSLEVEL2;

public abstract class AbstractRecipe {
    public void execute() {
        prepare();
        makeDish();
        cleanUp();
    }

    abstract void prepare();
    abstract void makeDish();
    abstract void cleanUp();

}
