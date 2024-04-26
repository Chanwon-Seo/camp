package week04.sample01;

public class OurClass {
    private final boolean just = true;

    public void thisMethodIsDangerous() throws OurBadException {
        //custom logic~!

        if (just) {
            throw new OurBadException();
        }
    }
}
