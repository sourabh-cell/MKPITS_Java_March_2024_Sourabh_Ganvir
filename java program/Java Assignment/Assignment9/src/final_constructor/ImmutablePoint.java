package final_constructor;

public final class ImmutablePoint {
    private final float x;
    private final float y;

    public ImmutablePoint(float x,float y){
        this.x=x;
        this.y=y;

    }

    //we cannot reinitialize final variable

}
