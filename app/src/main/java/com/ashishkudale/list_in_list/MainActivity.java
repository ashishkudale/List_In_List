package com.ashishkudale.list_in_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashishkudale.list_in_list.models.Chapter;
import com.ashishkudale.list_in_list.models.Subject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Subject> subjects = new ArrayList<Subject>();

        Subject geometry = new Subject();
        geometry.id = 1;
        geometry.subjectName = "Geometry";
        geometry.chapters = new ArrayList<Chapter>();

        Chapter chapter1 = new Chapter();
        chapter1.id = 1;
        chapter1.chapterName = "";
        chapter1.imageUrl = "";

        Chapter chapter2 = new Chapter();
        chapter2.id = 2;
        chapter2.chapterName = "";
        chapter2.imageUrl = "";

        Chapter chapter3 = new Chapter();
        chapter3.id = 3;
        chapter3.chapterName = "";
        chapter3.imageUrl = "";

        Chapter chapter4 = new Chapter();
        chapter4.id = 4;
        chapter4.chapterName = "";
        chapter4.imageUrl = "";

        geometry.chapters.add(chapter1);
        geometry.chapters.add(chapter2);
        geometry.chapters.add(chapter3);
        geometry.chapters.add(chapter4);

        Subject algebra = new Subject();
        algebra.id = 1;
        algebra.subjectName = "Algebra";
        algebra.chapters = new ArrayList<Chapter>();

        Chapter chapter5 = new Chapter();
        chapter5.id = 1;
        chapter5.chapterName = "";
        chapter5.imageUrl = "";

        Chapter chapter6 = new Chapter();
        chapter6.id = 2;
        chapter6.chapterName = "";
        chapter6.imageUrl = "";

        Chapter chapter7 = new Chapter();
        chapter7.id = 3;
        chapter7.chapterName = "";
        chapter7.imageUrl = "";

        Chapter chapter8 = new Chapter();
        chapter8.id = 4;
        chapter8.chapterName = "";
        chapter8.imageUrl = "";

        algebra.chapters.add(chapter5);
        algebra.chapters.add(chapter6);
        algebra.chapters.add(chapter7);
        algebra.chapters.add(chapter8);

        Subject history = new Subject();
        history.id = 1;
        history.subjectName = "History";
        history.chapters = new ArrayList<Chapter>();

        Chapter chapter9 = new Chapter();
        chapter9.id = 1;
        chapter9.chapterName = "";
        chapter9.imageUrl = "";

        Chapter chapter10 = new Chapter();
        chapter10.id = 2;
        chapter10.chapterName = "";
        chapter10.imageUrl = "";

        Chapter chapter11 = new Chapter();
        chapter11.id = 3;
        chapter11.chapterName = "";
        chapter11.imageUrl = "";

        Chapter chapter12 = new Chapter();
        chapter12.id = 4;
        chapter12.chapterName = "";
        chapter12.imageUrl = "";

        history.chapters.add(chapter9);
        history.chapters.add(chapter10);
        history.chapters.add(chapter11);
        history.chapters.add(chapter12);

        Subject geography = new Subject();
        geography.id = 1;
        geography.subjectName = "Geography";
        geography.chapters = new ArrayList<Chapter>();

        Chapter chapter13 = new Chapter();
        chapter13.id = 1;
        chapter13.chapterName = "";
        chapter13.imageUrl = "";

        Chapter chapter14 = new Chapter();
        chapter14.id = 2;
        chapter14.chapterName = "";
        chapter14.imageUrl = "";

        Chapter chapter15 = new Chapter();
        chapter15.id = 3;
        chapter15.chapterName = "";
        chapter15.imageUrl = "";

        Chapter chapter16 = new Chapter();
        chapter16.id = 4;
        chapter16.chapterName = "";
        chapter16.imageUrl = "";

        geography.chapters.add(chapter13);
        geography.chapters.add(chapter14);
        geography.chapters.add(chapter15);
        geography.chapters.add(chapter16);

        subjects.add(geometry);
        subjects.add(algebra);
        subjects.add(history);
        subjects.add(geography);
    }
}
