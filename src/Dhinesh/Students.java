package Dhinesh;

import java.util.Objects;

public class Students implements Comparable<Students>{
    private int maths;
    private int physics;

    @Override
    public String toString() {
        return "Students{" + "maths=" + maths + ", physics=" + physics + '}';
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public Students(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public int compareTo(Students o){
//        /*
//        current object < other object
//               return -1;
//        current object > other object
//               return 1;
//        current object == other object
//               return 0;
//        */
//        if(this.maths < o.maths) return -1;
//        if(this.maths > o.maths) return 1;
//        if(this.maths == o.maths) return 0;
        System.out.println("Compare to () is called");
        return o.maths - this.maths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return maths == students.maths && physics == students.physics;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maths;
        result = prime * result + physics;
        return result;
    }
}
