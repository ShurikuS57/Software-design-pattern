package TemplateMethodPattern;


public abstract class CarMaker {

    final void makeToy(){

        addBody();

        paint();

        addWells();

        addStickers();

        System.out.println("Toy done.");
        System.out.println("----------------");
    }

    abstract void paint();

    abstract void addStickers();

    void addBody(){
        System.out.println("Add body");
    }

    void addWells(){
        System.out.println("Add Wells");
    }

}
