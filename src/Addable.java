public interface Addable<T extends Addable<T>> {
    public T adds(T addend);
    public T zero();

    public T increment();

    public default T sum(T... addends) {
        T sum = zero();
        for(int i = 0; i < addends.length; i++) {
            sum.adds(addends[i]);
        }
        return sum;
    }
}
