package com.englishbible.punjabibible;

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
        bookName.put(1, "ਪੈਦਾਇਸ਼-Genesis");
        bookName.put(2, "ਖ਼ਰੋਜ-Exodus");
        bookName.put(3, "ਅਹਬਾਰ-Leviticus");
        bookName.put(4, "ਗਿਣਤੀ-Numbers");
        bookName.put(5, "ਅਸਤਸਨਾ-Deuteronomy");
        bookName.put(6, "ਯਸ਼ਵਾ-Joshua");
        bookName.put(7, "ਕਜ਼ਾૃ-Judges");
        bookName.put(8, "ਰੁੱਤ-Ruth");
        bookName.put(9, "੧ ਸਮੋਈਲ-1 Samuel");
        bookName.put(10, "੨ ਸਮੋਈਲ-2 Samuel");
        bookName.put(11, "੧ ਸਲਾਤੀਨ-1 Kings");
        bookName.put(12, "੨ ਸਲਾਤੀਨ-2 Kings");
        bookName.put(13, "੧ ਤਵਾਰੀਖ਼-1 Chronicles");
        bookName.put(14, "੨ ਤਵਾਰੀਖ਼-2 Chronicles");
        bookName.put(15, "ਅਜ਼ਰਾ-Ezra");
        bookName.put(16, "ਨਹਮਿਆਹ-Nehemiah");
        bookName.put(17, "ਆ ਸਤਰ-Esther");
        bookName.put(18, "ਅੱਯੂਬ-Job");
        bookName.put(19, "ਜ਼ਬੂਰ-Psalms");
        bookName.put(20, "ਅਮਸਾਲ-Proverbs");
        bookName.put(21, "ਵਾਈਜ਼-Ecclesiastes");
        bookName.put(22, "ਗ਼ਜ਼ਲ ਅਲਗ਼ਜ਼ਲਾਤ-Song of Songs");
        bookName.put(23, "ਯਸਈਆਹ-Isaiah");
        bookName.put(24, "ਯਰਮਿਆਹ-Jeremiah");
        bookName.put(25, "ਨੂਹ-Lamentations");
        bookName.put(26, "ਹਿਜ਼ ਕੀ ਐਲ-Ezekiel");
        bookName.put(27, "ਦਾਨੀ ਐਲ-Daniel");
        bookName.put(28, "ਹੋ ਸੀਅ-Hosea");
        bookName.put(29, "ਯਵਾਐਲ-Joel");
        bookName.put(30, "ਆਮੋਸ-Amos");
        bookName.put(31, "ਅਬਦ ਯਾਹ-Obadiah");
        bookName.put(32, "ਯਵਨਾਹ-Jonah");
        bookName.put(33, "ਮੀਕਾਹ-Micah");
        bookName.put(34, "ਨਾ ਹੋਮ-Nahum");
        bookName.put(35, "ਹਬਕੋਕ-Habakkuk");
        bookName.put(36, "ਸਫ਼ਨਿਆਹ-Zephaniah");
        bookName.put(37, "ਹਜਿ-Haggai");
        bookName.put(38, "ਜ਼ਿਕਰ ਯਾਹ-Zechariah");
        bookName.put(39, "ਮਲਾਕੀ-Malachi");
        bookName.put(40, "ਮੱਤੀ-Matthew");
        bookName.put(41, "ਮਰਕੁਸ-Mark");
        bookName.put(42, "ਲੋਕਾ-Luke");
        bookName.put(43, "ਯੂਹੰਨਾ-John");
        bookName.put(44, "ਰਸੂਲਾਂ ਦੇ ਕਰਤੱਬ-Acts");
        bookName.put(45, "ਰੋਮੀਆਂ-Romans");
        bookName.put(46, "੧ ਕੁਰਿੰਥੀਆਂ- 1 Corinthians");
        bookName.put(47, "੨ ਕੁਰਿੰਥੀਆਂ- 2 Corinthians");
        bookName.put(48, "ਗਲਾਤੀਆਂ- Galatians");
        bookName.put(49, "ਅਫ਼ਸੀਆਂ- Ephesians");
        bookName.put(50, "ਫ਼ਿਲਿੱਪੀਆਂ-Philippians");
        bookName.put(51, "ਕੁਲੁੱਸੀਆਂ-Colossians");
        bookName.put(52, "੧ ਥੱਸਲੁਨੀਕੀਆਂ-1 Thessalonians");
        bookName.put(53, "੨ ਥੱਸਲੁਨੀਕੀਆਂ-2 Thessalonians");
        bookName.put(54, "੧ ਤਿਮੋਥਿਉਸ-1 Timothy");
        bookName.put(55, "੨ ਤਿਮੋਥਿਉਸ-2 Timothy");;
        bookName.put(56, "ਤੀਤੁਸ-Titus");
        bookName.put(57, "ਫ਼ਿਲੇਮੋਨ-Philemon");
        bookName.put(58, "ਇਬਰਾਨੀਆਂ-Hebrews");
        bookName.put(59, "ਯਾਕੂਬ-James");
        bookName.put(60, "੧ ਪਤਰਸ-1 Peter");
        bookName.put(61, "੨ ਪਤਰਸ-2 Peter");
        bookName.put(62, "੧ ਯੂਹੰਨਾ-1 John");
        bookName.put(63, "੨ ਯੂਹੰਨਾ-2 John");
        bookName.put(64, "੩ ਯੂਹੰਨਾ-3  John");
        bookName.put(65, "ਯਹੂ ਦਾਹ-Jude");
        bookName.put(66, "ਪਰਕਾਸ਼ ਦੀ ਪੋਥੀ-Revelation");
        return bookName.get(booknumber);

    }

}
