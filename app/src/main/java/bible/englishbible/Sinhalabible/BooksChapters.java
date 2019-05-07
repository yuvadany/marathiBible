package bible.englishbible.Sinhalabible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public static int  getChaptersCount(int book)
    {
        HashMap<Integer,Integer> booksChapters = new HashMap<Integer,Integer>();
        booksChapters.put(	1 , 50	);
        booksChapters.put(	2 , 40	);
        booksChapters.put(	3 , 27	);
        booksChapters.put(	4 , 36	);
        booksChapters.put(	5 , 34	);
        booksChapters.put(	6 , 24	);
        booksChapters.put(	7 , 21	);
        booksChapters.put(	8 , 4	);
        booksChapters.put(	9 , 31	);
        booksChapters.put(	10 , 24	);
        booksChapters.put(	11 , 22	);
        booksChapters.put(	12 , 25	);
        booksChapters.put(	13 , 29	);
        booksChapters.put(	14 , 36	);
        booksChapters.put(	15 , 10	);
        booksChapters.put(	16 , 13	);
        booksChapters.put(	17 , 10	);
        booksChapters.put(	18 , 42	);
        booksChapters.put(	19 , 150);
        booksChapters.put(	20 , 31	);
        booksChapters.put(	21 , 12	);
        booksChapters.put(	22 , 8	);
        booksChapters.put(	23 , 66	);
        booksChapters.put(	24 , 52	);
        booksChapters.put(	25 , 5	);
        booksChapters.put(	26 , 48	);
        booksChapters.put(	27 , 12	);
        booksChapters.put(	28 , 14	);
        booksChapters.put(	29 , 3	);
        booksChapters.put(	30 , 9	);
        booksChapters.put(	31 , 1	);
        booksChapters.put(	32 , 4	);
        booksChapters.put(	33 , 7	);
        booksChapters.put(	34 , 3	);
        booksChapters.put(	35 , 3	);
        booksChapters.put(	36 , 3	);
        booksChapters.put(	37 , 2	);
        booksChapters.put(	38 , 14	);
        booksChapters.put(	39 , 4	);
        booksChapters.put(	40 , 28	);
        booksChapters.put(	41 , 16	);
        booksChapters.put(	42 , 24	);
        booksChapters.put(	43 , 21	);
        booksChapters.put(	44 , 28	);
        booksChapters.put(	45 , 16	);
        booksChapters.put(	46 , 16	);
        booksChapters.put(	47 , 13	);
        booksChapters.put(	48 , 6	);
        booksChapters.put(	49 , 6	);
        booksChapters.put(	50 , 4	);
        booksChapters.put(	51 , 4	);
        booksChapters.put(	52 , 5	);
        booksChapters.put(	53 , 3	);
        booksChapters.put(	54 , 6	);
        booksChapters.put(	55 , 4	);
        booksChapters.put(	56 , 3	);
        booksChapters.put(	57 , 1	);
        booksChapters.put(	58 , 13	);
        booksChapters.put(	59 , 5	);
        booksChapters.put(	60 , 5	);
        booksChapters.put(	61 , 3	);
        booksChapters.put(	62 , 5	);
        booksChapters.put(	63 , 1	);
        booksChapters.put(	64 , 1	);
        booksChapters.put(	65 , 1	);
        booksChapters.put(	66 , 22	);
        return booksChapters.get(book);
    }

    public static String getBookName(int booknumber)
    {
        Map<Integer,String> bookName = new HashMap<Integer,String>();
        bookName.put(1 ,"උත්පත්ති-Genesis" );
        bookName.put(2 ,"නික්මයාම-Exodus" );
        bookName.put(3 ,"ලෙවී කථාව-Leviticus");
        bookName.put(4 ,"ගණන් කථාව-Numbers");
        bookName.put(5 ,"ද්වීතීය කථාව-Deuteronomy" );
        bookName.put(6 ,"යෝෂුවා-Joshua");
        bookName.put(7 ,"විනිශ්චයකාරයන්ගේ පොත-Judges" );
        bookName.put(8 ,"රූත්ගේ කථාව-Ruth");
        bookName.put(9 ,"1 සාමුවෙල්-1 Samuel");
        bookName.put(10 ,"2 සාමුවෙල්-2 Samuel");
        bookName.put(11 ,"1 රාජාවලිය-1 Kings");
        bookName.put(12 ,"2 රාජාවලිය-2 Kings");
        bookName.put(13 ,"1 ලේකම්-1 Chronicles" );
        bookName.put(14 ,"2 ලේකම්-2 Chronicles");
        bookName.put(15 ,"එස්රා-Ezra");
        bookName.put(16 ,"නෙහෙමියා-Nehemiah");
        bookName.put(17 ,"එස්තර්-Esther");
        bookName.put(18 ,"යෝබ්-Job");
        bookName.put(19 ,"ගීතාවලිය-Psalms" );
        bookName.put(20 ,"හිතෝපදේශ-Proverbes" );
        bookName.put(21 ,"දේශනාකාරයා-Ecclesiastes");
        bookName.put(22 ,"සාලමොන්ගේ ගීතිකා-Song of Songs");
        bookName.put(23 ,"යෙසායා-Isaiah");
        bookName.put(24 ,"යෙරෙමියා-Jeremiah" );
        bookName.put(25 ,"විලාප ගී-Lamentations" );
        bookName.put(26 ,"එසකියෙල්-Ezekiel");
        bookName.put(27 ,"දානියෙල්-Daniel" );
        bookName.put(28 ,"හොෂෙයා-Hosea" );
        bookName.put(29 ,"යෝවෙල්-Joel");
        bookName.put(30 ,"ආමොස්-Amos");
        bookName.put(31 ,"ඔබදියා-Obadiah");
        bookName.put(32 ,"යෝනා-Jonah");
        bookName.put(33 ,"මීකා-Micah" );
        bookName.put(34 ,"නාහුම්-Nahum");
        bookName.put(35 ,"හබක්කුක්-Habakkuk" );
        bookName.put(36 ,"ශෙපනියා-Zephaniah" );
        bookName.put(37 ,"හග්ගයි-Haggai");
        bookName.put(38 ,"සෙකරියා-Zechariah");
        bookName.put(39 ,"මලාකි-Malachi");
        bookName.put(40 ,"ශු. මතෙව්-Matthew");
        bookName.put(41 ,"ශු. මාර්ක්-Mark");
        bookName.put(42 ,"ශු. ලූක්-Luke" );
        bookName.put(43 ,"ශු. යොහන්-John");
        bookName.put(44 ,"ක්රිරයා-Acts" );
        bookName.put(45 ,"රෝම-Romans");
        bookName.put(46 ,"1 කොරින්ති-1 Corinthians");
        bookName.put(47 ,"2 කොරින්ති-2 Corinthians" );
        bookName.put(48 ,"ගලාති-Galatians" );
        bookName.put(49 ,"එපීස-Ephesians");
        bookName.put(50 ,"පිලිප්පි-Philippians");
        bookName.put(51 ,"කොලොස්සි-Colossians" );
        bookName.put(52 ,"1 තෙසලෝනික-1 Thessalonians");
        bookName.put(53 ,"2 තෙසලෝනික-2 Thessalonians");
        bookName.put(54 ,"1 තිමෝති-1 Timothy" );
        bookName.put(55 ,"2 තිමෝති-2 Timothy");
        bookName.put(56 ,"තීතස්-Titus" );
        bookName.put(57 ,"පිලෙමොන්-Philemon" );
        bookName.put(58 ,"හෙබ්රෙනව්-Hebrews");
        bookName.put(59 ,"යාකොබ්-James" );
        bookName.put(60 ,"1 පේතෘස්-1 Peter");
        bookName.put(61 ,"2 පේතෘස්-2 Peter");
        bookName.put(62 ,"1 යොහන්-1 John");
        bookName.put(63 ,"2 යොහන්-2 John");
        bookName.put(64 ,"3 යොහන්-3 John");;
        bookName.put(65 ,"යූදස් (යූද්)-Jude");
        bookName.put(66 ,"එළිදරව්-Revelation");
        return bookName.get(booknumber);

    }

}
