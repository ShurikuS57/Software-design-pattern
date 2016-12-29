package TemplateMethodPattern;

public class BlueCar extends CarMaker {

    @Override
    void paint() {
        System.out.println("Paint blue color.");
    }

    @Override
    void addStickers() {
        System.out.println("Add stickers for blue car.");
    }
}
