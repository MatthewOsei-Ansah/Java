public class Element<T> {
    private T value;
    private Element<T> previous;
    private Element<T> next;

    public Element(T value, Element<T> previous, Element<T> next)
    {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    @Override
    public String toString()
    {
        return value.toString();
    }

    public T Value()
    {
        return value;
    }

    public Element<T> Previous()
    {
        return previous;
    }

    public void Previous(Element<T> value)
    {
        previous = value;
    }

    public Element<T> Next()
    {
        return next;
    }

    public void Next(Element<T> value)
    {
        next = value;
    }
}
