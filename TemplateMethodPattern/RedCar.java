package TemplateMethodPattern;

public class RedCar extends CarMaker {

    @Override
    void paint() {
        System.out.println("Paint red color.");
    }

    @Override
    void addStickers() {
        System.out.println("Add stickers for red car.");
    }
}
