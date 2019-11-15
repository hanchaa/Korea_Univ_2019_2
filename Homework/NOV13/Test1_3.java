package Homework.NOV13;

class Animal implements AnimalInterface { //클래스, 인터페이스
    private String color, name;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    } // 생성자

    public String speciality() {
        return "알 수 없음";
    }

    public String sound() {
        return "알 수 없음";
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

class Dog extends Animal { //상속
    Dog(String name, String color) {
        super(name, color);
    } //생성자

    @Override
    public String speciality() {
        return "으르릉대며 물기";
    } //오버라이딩

    @Override
    public String sound() {
        return "멍멍!";
    } //오버라이딩
}

class Chicken extends Animal { //상속
    Chicken(String name, String color) {
        super(name, color);
    } //생성자

    @Override
    public String speciality() {
        return "날아오르며 부리로 찍기";
    } //오버라이딩

    @Override
    public String sound() {
        return "꼬끼오";
    } //오버라이딩
}

class Cat extends Animal { //상속
    Cat(String name, String color) {
        super(name, color);
    } //생성자

    @Override
    public String speciality() {
        return "우아한 척하며 털 고르기";
    } //오버라이딩

    @Override
    public String sound() {
        return "야옹";
    } //오버라이딩
}

