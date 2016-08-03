package com.springinaction.springidol;

/**
 * @author oleh.krupenia.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

//    public PoeticJuggler(Poem poem) {
//        super();
//        this.poem = poem;
//    }

    public PoeticJuggler(int beanBags) {
        super(beanBags);
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }

    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
