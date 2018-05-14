package com.ashishkudale.list_in_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ashishkudale.list_in_list.adapters.SubjectAdapter;
import com.ashishkudale.list_in_list.models.Chapter;
import com.ashishkudale.list_in_list.models.Subject;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvSubject;
    private SubjectAdapter subjectAdapter;
    private ArrayList<Subject> subjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();

        subjects = prepareData();

        subjectAdapter = new SubjectAdapter(subjects, HomeActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(HomeActivity.this);
        rvSubject.setLayoutManager(manager);
        rvSubject.setAdapter(subjectAdapter);

    }

    private void initComponents() {
        rvSubject = findViewById(R.id.rvSubject);
    }

    private ArrayList<Subject> prepareData() {
        ArrayList<Subject> subjects = new ArrayList<Subject>();

        Subject physics = new Subject();
        physics.id = 1;
        physics.subjectName = "Physics";
        physics.chapters = new ArrayList<Chapter>();

        Chapter chapter1 = new Chapter();
        chapter1.id = 1;
        chapter1.chapterName = "Atomic power";
        chapter1.imageUrl = "http://ashishkudale.com/images/phy/atoms.png";

        Chapter chapter2 = new Chapter();
        chapter2.id = 2;
        chapter2.chapterName = "Theory of relativity";
        chapter2.imageUrl = "http://ashishkudale.com/images/phy/sigma.png";

        Chapter chapter3 = new Chapter();
        chapter3.id = 3;
        chapter3.chapterName = "Magnetic field";
        chapter3.imageUrl = "http://ashishkudale.com/images/phy/magnet.png";

        Chapter chapter4 = new Chapter();
        chapter4.id = 4;
        chapter4.chapterName = "Practical 1";
        chapter4.imageUrl = "http://ashishkudale.com/images/phy/caliper.png";

        Chapter chapter5 = new Chapter();
        chapter5.id = 5;
        chapter5.chapterName = "Practical 2";
        chapter5.imageUrl = "http://ashishkudale.com/images/phy/micrometer.png";

        physics.chapters.add(chapter1);
        physics.chapters.add(chapter2);
        physics.chapters.add(chapter3);
        physics.chapters.add(chapter4);
        physics.chapters.add(chapter5);

        Subject chem = new Subject();
        chem.id = 2;
        chem.subjectName = "Chemistry";
        chem.chapters = new ArrayList<Chapter>();

        Chapter chapter6 = new Chapter();
        chapter6.id = 6;
        chapter6.chapterName = "Chemical bonds";
        chapter6.imageUrl = "http://ashishkudale.com/images/chem/bonds.png";

        Chapter chapter7 = new Chapter();
        chapter7.id = 7;
        chapter7.chapterName = "Sodium";
        chapter7.imageUrl = "http://ashishkudale.com/images/chem/sodium.png";

        Chapter chapter8 = new Chapter();
        chapter8.id = 8;
        chapter8.chapterName = "Periodic table";
        chapter8.imageUrl = "http://ashishkudale.com/images/chem/periodic_table.png";

        Chapter chapter9 = new Chapter();
        chapter9.id = 9;
        chapter9.chapterName = "Acid and Base";
        chapter9.imageUrl = "http://ashishkudale.com/images/chem/chem.png";

        chem.chapters.add(chapter6);
        chem.chapters.add(chapter7);
        chem.chapters.add(chapter8);
        chem.chapters.add(chapter9);

        Subject bio = new Subject();
        bio.id = 3;
        bio.subjectName = "Biology";
        bio.chapters = new ArrayList<Chapter>();

        Chapter chapter10 = new Chapter();
        chapter10.id = 10;
        chapter10.chapterName = "Bacteria";
        chapter10.imageUrl = "http://ashishkudale.com/images/bio/bacteria.png";

        Chapter chapter11 = new Chapter();
        chapter11.id = 11;
        chapter11.chapterName = "DNA and RNA";
        chapter11.imageUrl = "http://ashishkudale.com/images/bio/dna.png";

        Chapter chapter12 = new Chapter();
        chapter12.id = 12;
        chapter12.chapterName = "Study of microscope";
        chapter12.imageUrl = "http://ashishkudale.com/images/bio/microscope.png";

        Chapter chapter13 = new Chapter();
        chapter13.id = 13;
        chapter13.chapterName = "Protein and fibers";
        chapter13.imageUrl = "http://ashishkudale.com/images/bio/protein.png";

        bio.chapters.add(chapter10);
        bio.chapters.add(chapter11);
        bio.chapters.add(chapter12);
        bio.chapters.add(chapter13);

        Subject maths = new Subject();
        maths.id = 4;
        maths.subjectName = "Maths";
        maths.chapters = new ArrayList<Chapter>();

        Chapter chapter14 = new Chapter();
        chapter14.id = 14;
        chapter14.chapterName = "Circle";
        chapter14.imageUrl = "http://ashishkudale.com/images/maths/circle.png";

        Chapter chapter15 = new Chapter();
        chapter15.id = 15;
        chapter15.chapterName = "Geometry";
        chapter15.imageUrl = "http://ashishkudale.com/images/maths/geometry.png";

        Chapter chapter16 = new Chapter();
        chapter16.id = 16;
        chapter16.chapterName = "Linear equations";
        chapter16.imageUrl = "http://ashishkudale.com/images/maths/linear.png";

        Chapter chapter17 = new Chapter();
        chapter17.id = 17;
        chapter17.chapterName = "Graph";
        chapter17.imageUrl = "http://ashishkudale.com/images/maths/plot.png";

        Chapter chapter18 = new Chapter();
        chapter18.id = 18;
        chapter18.chapterName = "Trigonometry";
        chapter18.imageUrl = "http://ashishkudale.com/images/maths/trigonometry.png";

        maths.chapters.add(chapter14);
        maths.chapters.add(chapter18);
        maths.chapters.add(chapter15);
        maths.chapters.add(chapter16);
        maths.chapters.add(chapter17);

        subjects.add(physics);
        subjects.add(chem);
        subjects.add(maths);
        subjects.add(bio);

        return subjects;
    }
}
