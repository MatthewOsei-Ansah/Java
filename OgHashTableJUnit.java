import hashing.Hashing;
import org.junit.Assert;
import org.junit.Test;

public class HashJUnitTest {
    @Test
    public void test1isEmpty()
    {
        Hashing h = new Hashing();
        Assert.assertTrue("Test 1: isEmpty {,,,,,,,,,,}", h.isEmpty());
    }

    @Test
    public void test2add54Bill()
    {
        Hashing h = new Hashing();
        h.add(54, "Bill");
        Assert.assertArrayEquals("Test 2: add 54:Bill: {,,,,,,,,,,54:Bill}", new String[]{null,null,null,null,null,null,null,null,null,null,"Bill"}, h.asArray());
    }

    @Test
    public void test3add26Ben()
    {
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        Assert.assertArrayEquals("Test 3: add 54:Bill: {,,,,26:Ben,,,,,,54:Bill}", new String[]{null,null,null,null,"Ben",null,null,null,null,null,"Bill"}, h.asArray());
    }

    @Test
    public void test4Add93Bob(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        Assert.assertArrayEquals("Test 4: add 93:Bob: {,,,,26:Ben,93:Bob,,,,,54:Bill}", new String[]{null,null,null,null,"Ben","Bob",null,null,null,null,"Bill"}, h.asArray());
    }

    @Test
    public void test5Add17Benny(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        Assert.assertArrayEquals("Test 5: add 17:Benny: {,,,,26:Ben,93:Bob,17:Benny,,,,54:Bill}", new String[]{null,null,null,null,"Ben","Bob","Benny",null,null,null,"Bill"}, h.asArray());
    }

    @Test
    public void test6Add77Benji(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        Assert.assertArrayEquals("Test 6: add 77:Benji: {77:Benji,,,,26:Ben,93:Bob,17:Benny,,,,54:Bill}", new String[]{"Benji",null,null,null,"Ben","Bob","Benny",null,null,null,"Bill"}, h.asArray());
    }


    @Test
    public void test7Add31Banksy(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        Assert.assertArrayEquals("Test 7: add 31:Banksy: {77:Benji,,,,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", new String[]{"Benji",null,null,null,"Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray());
    }

    @Test
    public void test8Add65Bobby(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        Assert.assertArrayEquals("Test 8: add 65:Bobby: {77:Benji,65:Bobby,,,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", new String[]{"Benji","Bobby",null,null,"Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray());
    }

    @Test
    public void test9Add11Bernard(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        Assert.assertArrayEquals("Test 9: add 11:Bernard: {77:Benji,65:Bobby,11:Bernard,,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", new String[]{"Benji","Bobby","Bernard",null,"Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray());
    }

    @Test
    public void test10Add53Billy(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertArrayEquals("Test 10: add 53:Billy: {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", new String[]{"Benji","Bobby","Bernard","Billy","Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray());
    }

    @Test
    public void test11IsEmpty(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertFalse("Test 11: isEmpty(): {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", h.isEmpty());
    }


    @Test
    public void test12Length(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertEquals("Test 12: length(): {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", 9, h.length());
    }

    @Test
    public void test13Item53(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertEquals("Test 13: item(53): {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", "Billy", h.item(53));
    }


    @Test(expected = IllegalArgumentException.class)
    public void test14item99()
    {
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertNull("Test 14: item(99) {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", h.item(99));
    }

    @Test
    public void test15Contains11()
    {
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertTrue("Test 15: contains(11) {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", h.contains(11));
    }

    @Test
    public void test16Contains13()
    {
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        Assert.assertFalse("Test 16: contains(13) {77:Benji,65:Bobby,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", h.contains(13));
    }

    @Test
    public void test17delete65(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        Assert.assertArrayEquals("Test 17: delete(65) {77:Benji,,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}",  new String[]{"Benji",null,"Bernard","Billy","Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray() );
    }

    @Test(expected = IllegalArgumentException.class)
    public void test18delete99(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.delete(99);
        Assert.assertArrayEquals("Test 18: remove(99): {77:Benji,,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", new String[]{"Benji",null,"Bernard","Billy","Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray());
    }

    @Test
    public void test19length(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        Assert.assertEquals("Test 19: length {77:Benji,,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}", 8, h.length());
    }

    @Test
    public void test20add12Benji(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        Assert.assertArrayEquals("Test 20: add(12, Benji) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,,,31:Banksy,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny",null,null,"Banksy","Bill"}, h.asArray() );
    }

    @Test
    public void test21add28Butch(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        Assert.assertArrayEquals("Test 21: add(28, Butch) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,,31:Banksy,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch",null,"Banksy","Bill"}, h.asArray() );
    }

    @Test(expected = IllegalArgumentException.class)
    public void test22Add77Blobby(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.add(77, "Blobby");
        Assert.assertArrayEquals("Test 22: add(77, Blobby) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,,31:Banksy,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch",null,"Banksy","Bill"}, h.asArray() );
    }

    @Test
    public void test23delete31(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.delete(31);
        Assert.assertArrayEquals("Test 23: remove(31) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,,,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch",null,null,"Bill"}, h.asArray() );
    }

    @Test
    public void test24Item53(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.delete(31);
        Assert.assertEquals("Test 24: item(53) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,,,54:Bill}","Billy", h.item(53));
    }

    @Test
    public void test25Add42Boris(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.delete(31);
        h.add(42, "Boris");
        Assert.assertArrayEquals("Test 25: add(42, Boris) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,,42:Boris,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch",null,"Boris","Bill"}, h.asArray() );
    }

    @Test
    public void test26Add41Blinky(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.delete(31);
        h.add(42, "Boris");
        h.add(41, "Blinky");
        Assert.assertArrayEquals("Test 26: add(41, Blinky) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,41:Blinky,42:Boris,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch","Blinky","Boris","Bill"}, h.asArray() );
    }

    @Test(expected = UnsupportedOperationException.class)
    public void test27AddBlanka(){
        Hashing h = new Hashing();
        h.add(54, "Bill");
        h.add(26, "Ben");
        h.add(93, "Bob");
        h.add(17, "Benny");
        h.add(77, "Benji");
        h.add(31, "Banksy");
        h.add(65, "Bobby");
        h.add(11, "Bernard");
        h.add(53, "Billy");
        h.delete(65);
        h.add(12, "Benji");
        h.add(28, "Butch");
        h.delete(31);
        h.add(42, "Boris");
        h.add(41, "Blinky");
        h.add(13, "Blanka");
        Assert.assertArrayEquals("Test 27: add(11, Blanka) {77:Benji,12:Benji,11:Bernard,53:Billy,26:Ben,93:Bob,17:Benny,28:Butch,41:Blinky,42:Boris,54:Bill}",  new String[]{"Benji","Benji","Bernard","Billy","Ben","Bob","Benny","Butch","Blinky","Boris","Bill"}, h.asArray() );
    }



}
