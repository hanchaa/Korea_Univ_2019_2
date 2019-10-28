package io.github.hanchaa;

class Point {
    private int x, y;
    
    Point(int x, int y){
    	this.x = x;
    	this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
