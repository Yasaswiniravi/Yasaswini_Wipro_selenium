package Assignment5;
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x; 
        this.y = y;
        this.xSpeed = xSpeed; 
        this.ySpeed = ySpeed;
    }
    public void moveUp() { 
    	y += ySpeed; 
    	}
    public void moveDown() {
    	y -= ySpeed; 
    	}
    public void moveLeft() { 
    	x -= xSpeed; 
    	}
    public void moveRight() {
    	x += xSpeed; 
    	}
    public String toString() { 
    	return "(" + x + "," + y + ")";
    	}
}

class MovableCircle implements Movable {
    int radius; MovablePoint center;
    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius; 
        this.center = center;
    }
    public void moveUp() { 
    	center.moveUp(); 
    	}
    public void moveDown() { 
    	center.moveDown();
    	}
    public void moveLeft() { 
    	center.moveLeft(); 
    	}
    public void moveRight() { 
    	center.moveRight();
    	}
    public String toString() { 
    	return "Circle center=" + center + " radius=" + radius;
    	}
}
class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;
    MovableRectangle(MovablePoint t, MovablePoint b) {
        if (t.xSpeed != b.xSpeed || t.ySpeed != b.ySpeed)
            throw new IllegalArgumentException("Speeds must match");
        this.topLeft = t; 
        this.bottomRight = b;
    }
    public void moveUp() { 
    	topLeft.moveUp(); 
    	bottomRight.moveUp(); 
    	}
    public void moveDown() { 
    	topLeft.moveDown(); 
    	bottomRight.moveDown(); 
    	}
    public void moveLeft() { 
    	topLeft.moveLeft(); 
    	bottomRight.moveLeft(); 
    	}
    public void moveRight() {
    	topLeft.moveRight();
    	bottomRight.moveRight(); 
    	}
    public String toString() { 
    	return "Rect TL=" + topLeft + " BR=" + bottomRight; 
    	}
}

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0,0,1,1);
        MovableCircle c = new MovableCircle(5, new MovablePoint(2,2,1,1));
        MovableRectangle r = new MovableRectangle(
            new MovablePoint(0,5,2,2),
            new MovablePoint(4,1,2,2)
        );
        System.out.println(p);
        System.out.println(c);
        System.out.println(r);
        p.moveRight(); 
        c.moveUp();
        r.moveLeft();
        System.out.println(p);
        System.out.println(c);
        System.out.println(r);
    }
} 

