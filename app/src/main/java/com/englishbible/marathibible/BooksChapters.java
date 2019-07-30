package com.englishbible.marathibible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public int  getChaptersCount(int book)
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

    public String getBookName(int booknumber) {
        Map<Integer, String> bookName = new HashMap<Integer, String>();
        bookName.put(1, "उत्पत्ति-Genesis");
        bookName.put(2, "निर्गम-Exodus");
        bookName.put(3, "लेवीय-Leviticus");
        bookName.put(4, "गणना-Numbers");
        bookName.put(5, "अनुवाद-Deuteronomy");
        bookName.put(6, "यहोशवा-Joshua");
        bookName.put(7, "शास्ते-Judges");
        bookName.put(8, "रूथ-Ruth");
        bookName.put(9, "1 शमुवेल-1 Samuel");
        bookName.put(10, "2 शमुवेल-2 Samuel");
        bookName.put(11, "1 राजे-1 Kings");
        bookName.put(12, "2 राजे-2 Kings");
        bookName.put(13, "1 इतिहास-1 Chronicles");
        bookName.put(14, "2 इतिहास-2 Chronicles");
        bookName.put(15, "एज्रा-Ezra");
        bookName.put(16, "नहेम्या-Nehemiah");
        bookName.put(17, "एस्तेर-Esther");
        bookName.put(18, "ईयोब-Job");
        bookName.put(19, "स्तोत्रसंहिता-Psalms");
        bookName.put(20, "नीतिसूत्रे-Proverbs");
        bookName.put(21, "उपदेशक-Ecclesiastes");
        bookName.put(22, "गीतरत्न-Song of Songs");
        bookName.put(23, "यशया-Isaiah");
        bookName.put(24, "यिर्मया-Jeremiah");
        bookName.put(25, "विलापगीत-Lamentations");
        bookName.put(26, "यहेज्केल-Ezekiel");
        bookName.put(27, "दानीएल-Daniel");
        bookName.put(28, "होशेय-Hosea");
        bookName.put(29, "योएल-Joel");
        bookName.put(30, "आमोस-Amos");
        bookName.put(31, "ओबद्या-Obadiah");
        bookName.put(32, "योना-Jonah");
        bookName.put(33, "मीखा-Micah");
        bookName.put(34, "नहूम-Nahum");
        bookName.put(35, "हबक्कूक-Habakkuk");
        bookName.put(36, "सफन्या-Zephaniah");
        bookName.put(37, "हाग्गय-Haggai");
        bookName.put(38, "जखऱ्या-Zechariah");
        bookName.put(39, "मलाखी-Malachi");
        bookName.put(40, "मत्तय-Matthew");
        bookName.put(41, "मार्क-Mark");
        bookName.put(42, "लूक-Luke");
        bookName.put(43, "योहान-John");
        bookName.put(44, "प्रेषितांचीं कृत्यें-Acts");
        bookName.put(45, "रोमकरांस-Romans");
        bookName.put(46, "1 करिंथकरांस- 1 Corinthians");
        bookName.put(47, "2 करिंथकरांस- 2 Corinthians");
        bookName.put(48, "गलतीकरांस- Galatians");
        bookName.put(49, "इफिसकरांस- Ephesians");
        bookName.put(50, "फिलिप्पैकरांस-Philippians");
        bookName.put(51, "कलस्सैकरांस-Colossians");
        bookName.put(52, "1 थेस्सलनीकाकरांस-1 Thessalonians");
        bookName.put(53, "2 थेस्सलनीकाकरांस-2 Thessalonians");
        bookName.put(54, "1 तीमथ्याला-1 Timothy");
        bookName.put(55, "2 तीमथ्याला-2 Timothy");;
        bookName.put(56, "तीताला-Titus");
        bookName.put(57, "फिलेमोना-Philemon");
        bookName.put(58, "इब्री लोकांस-Hebrews");
        bookName.put(59, "याकोब-James");
        bookName.put(60, "1 पेत्र-1 Peter");
        bookName.put(61, "1 पेत्र-2 Peter");
        bookName.put(62, "1 योहान-1 John");
        bookName.put(63, "2 योहान-2 John");
        bookName.put(64, "3 योहान-3  John");
        bookName.put(65, "यहूदा-Jude");
        bookName.put(66, "प्रकटीकरण-Revelation");
        return bookName.get(booknumber);

    }

}
