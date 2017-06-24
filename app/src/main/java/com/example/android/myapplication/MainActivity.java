package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentOne = new ReportCard(12345);

        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Football");
        subjectsList.add("Soccer");
        subjectsList.add("Gaelic");
        subjectsList.add("Hurling");
        subjectsList.add("Rugby");

        studentOne.setSubjects(subjectsList);

        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(18);
        gradesList.add(15);
        gradesList.add(20);
        gradesList.add(17);
        gradesList.add(13);

        studentOne.setGrades(gradesList);

        List<Integer> attendanceList = new ArrayList<>();
        attendanceList.add(200);
        attendanceList.add(270);
        attendanceList.add(200);
        attendanceList.add(280);
        attendanceList.add(40);

        studentOne.setAttendance(attendanceList);

        String messageToParents = "Wnjoy the rest of the Summer Break and we will see you in July";
        studentOne.setMessageToParents(messageToParents);

        Log.v("MainActivity", "studentOne: " + studentOne);
        }

        }