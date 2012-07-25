package com.foursquare.heapaudit.tutorials.example4;

import com.foursquare.heapaudit.tutorials.Example;

// The following illustrates using HeapAudit to record allocations by static
// instrumentation using a custom recorder. See https://github.com/foursquare/heapaudit/blob/master/src/test/java/com/foursquare/heapaudit/tutorials/example4/README.md
// for more information.

public class Custom1 extends Example {

    public static void main(String[] args) {
        //allocateFoo();
        //allocateBar();
        allocateFoos();
        Custom2.main1();


    }
    public static void allocateFoos() {
        Foo1 f = new Foo1();
        f.createFoo2();
    }

}


class Foo1 {
  private Foo2 foo2;
    public Foo1()  {
        //String foo = new String("foo1");

    }
    public void createFoo2() {
        this.foo2 = new Foo2();
    }
}

class Foo2 {
    public Foo2() {
        //String foo = new String("foo2");

        com.foursquare.heapaudit.tutorials.Example.allocateBar();
    }

        }
