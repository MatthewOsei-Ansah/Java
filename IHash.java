import java.lang.String;

public interface IHash {
    void add(String Value);
    void delete(int Key);
    String item(int Key);
    boolean contains(int Key);
    int length();
    boolean isEmpty();
}
