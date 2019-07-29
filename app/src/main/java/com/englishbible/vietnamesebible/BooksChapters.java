package com.englishbible.vietnamesebible;

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
        bookName.put(1, "Sáng-thế Ký-Genesis");
        bookName.put(2, "Xuất Ê-díp-tô Ký-Exodus");
        bookName.put(3, "Lê-vi Ký-Leviticus");
        bookName.put(4, "Dân-số Ký--Numbers");
        bookName.put(5, "Phục-truyền Luật-lệ Ký-Deuteronomy");
        bookName.put(6, "Giô-suê-Joshua");
        bookName.put(7, "Các Quan Xét-Judges");
        bookName.put(8, "Ru-tơ-Ruth");
        bookName.put(9, "1 Sa-mu-ên-1 Samuel");
        bookName.put(10, "2 Sa-mu-ên-2 Samuel");
        bookName.put(11, "1 Các Vua-1 Kings");
        bookName.put(12, "2 Các Vua-2 Kings");
        bookName.put(13, "1 Sử-ký-1 Chronicles");
        bookName.put(14, "2 Sử-ký-2 Chronicles");
        bookName.put(15, "Ê-xơ-ra-Ezr");
        bookName.put(16, "Nê-hê-mi-Nehemiah");
        bookName.put(17, "Ê-xơ-tê-Esther");
        bookName.put(18, "Gióp-Job");
        bookName.put(19, "Thi-thiên-Psalms");
        bookName.put(20, "Châm-ngôn-Proverbs");
        bookName.put(21, "Truyền-đạo-Ecclesiastes");
        bookName.put(22, "Nhã-ca-Song of Songs");
        bookName.put(23, "Ê-sai-Isaiah");
        bookName.put(24, "Giê-rê-mi-Jeremiah");
        bookName.put(25, "Ca-thương-Lamentations");
        bookName.put(26, "Ê-xê-chi-ên-Ezekiel");
        bookName.put(27, "Đa-ni-ên-Daniel");
        bookName.put(28, "Ô-sê-Hosea");
        bookName.put(29, "Giô-ên-Joel");
        bookName.put(30, "A-mốt-Amos");
        bookName.put(31, "Áp-đia-Obadiah");
        bookName.put(32, "Giô-na-Jonah");
        bookName.put(33, "Mi-chê-Micah");
        bookName.put(34, "Na-hum-Nahum");
        bookName.put(35, "Ha-ba-cúc-Habakkuk");
        bookName.put(36, "Sô-phô-ni-Zephaniah");
        bookName.put(37, "A-ghê-Haggai");
        bookName.put(38, "Xa-cha-ri-Zechariah");
        bookName.put(39, "Ma-la-chi-Malachi");
        bookName.put(40, "Ma-thi-ơ-Matthew");
        bookName.put(41, "Mác-Mark");
        bookName.put(42, "Lu-ca-Luke");
        bookName.put(43, "Giăng-John");
        bookName.put(44, "Công-vụ các Sứ-đồ-Acts");
        bookName.put(45, "Rô-ma-Romans");
        bookName.put(46, "1 Cô-rinh-tô- 1 Corinthians");
        bookName.put(47, "2 Cô-rinh-tô- 2 Corinthians");
        bookName.put(48, "Ga-la-ti- Galatians");
        bookName.put(49, "Ê-phê-sô - Ephesians");
        bookName.put(50, "Phi-líp-Philippians");
        bookName.put(51, "Cô-lô-se-Colossians");
        bookName.put(52, "1 Tê-sa-lô-ni-ca-1 Thessalonians");
        bookName.put(53, "2 Tê-sa-lô-ni-ca-2 Thessalonians");
        bookName.put(54, "1 Ti-mô-thê-1 Timothy");
        bookName.put(55, "2 Ti-mô-thê-2 Timothy");;
        bookName.put(56, "Tít-Titus");
        bookName.put(57, "Phi-lê-môn-Philemon");
        bookName.put(58, "Hê-bơ-rơ-Hebrews");
        bookName.put(59, "Gia-cơ-James");
        bookName.put(60, "1 Phi-e-rơ-1 Peter");
        bookName.put(61, "2 Phi-e-rơ-2 Peter");
        bookName.put(62, "1 Giăng-1 John");
        bookName.put(63, "2 Giăng-2 John");
        bookName.put(64, "3 Giăng-3  John");
        bookName.put(65, "Giu-đe-Jude");
        bookName.put(66, "Khải-huyền-Revelation");
        return bookName.get(booknumber);

    }

}
