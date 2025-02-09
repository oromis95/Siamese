package crest.siamese.document;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
/**
 * Created by Chaiyong on 7/27/16.
 */
public class DocumentTest {

    @Test
    public void TestDocumentCreation() {
        Document d = new Document();
        d.setFile("/my/test/file");
        d.setId(0);
        d.setSource("import java.io.*; class BubbleSort { public static void main ( String[] args )");

        Document d2 = new Document(
                0,
                "/my/test/file",
                1,
                1,
                "import java.io.*; class BubbleSort { public static void main ( String[] args )",
                "import java.io.*; class BubbleSort { public static void main ( String[] args )",
                "import java.io.*; class BubbleSort { public static void main ( String[] args )",
                "import java.io.*; class BubbleSort { public static void main ( String[] args )",
                "import java.io.*; class BubbleSort { public static void main ( String[] args )",
                "",
                ""
        );

        assertEquals(d, d2);
    }

    @Test
    public void TestDifferentDocuments() {
        Document d = new Document();
        d.setFile("/my/test/file");
        d.setId(0);
        d.setSource("import java.io.*; class BubbleSort { public static void main ( String[] args )");

        Document d3 = new Document(
                1,
                "/my/file",
                1,
                1,
                "Hello world!",
                "Hello world!",
                "Hello world!",
                "Hello world!",
                "Hello world!",
                "MIT",
                "https://hello.world");

        assertNotEquals(d, d3);
    }
}
