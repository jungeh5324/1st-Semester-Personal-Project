package com.example.whatshouldido;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class StudyFragment extends Fragment {
    MainActivity activity;
    Context context;
    Random random = new Random();
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        activity = (MainActivity) getActivity();
    }

    @Override
    public void onDetach(){
        super.onDetach();
        activity = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_study,container,false);
        Button study = (Button)v.findViewById(R.id.studyButton);
        ImageView studyV = (ImageView)v.findViewById(R.id.studyView);
        TextView studyT = (TextView)v.findViewById(R.id.studyText);
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studyT.setVisibility(View.VISIBLE);
                int count = random.nextInt(11)+1;
                switch (count){
                    case 1:
                        studyV.setImageResource(R.drawable.python);
                        studyT.setText("전공(파이썬)");
                        break;
                    case 2:
                        studyV.setImageResource(R.drawable.c);
                        studyT.setText("전공(C)");
                        break;
                    case 3:
                        studyV.setImageResource(R.drawable.cpp);
                        studyT.setText("전공(C++)");
                        break;
                    case 4:
                        studyV.setImageResource(R.drawable.eng);
                        studyT.setText("영어");
                        break;
                    case 5:
                        studyV.setImageResource(R.drawable.math);
                        studyT.setText("수학");
                        break;
                    case 6:
                        studyV.setImageResource(R.drawable.soi);
                        studyT.setText("사회");
                        break;
                    case 7:
                        studyV.setImageResource(R.drawable.sci);
                        studyT.setText("과학");
                        break;
                    case 8:
                        studyV.setImageResource(R.drawable.html5);
                        studyT.setText("전공(html)");
                        break;
                    case 9:
                        studyV.setImageResource(R.drawable.js);
                        studyT.setText("전공(JavaScript)");
                        break;
                    case 10:
                        studyV.setImageResource(R.drawable.css);
                        studyT.setText("전공(CSS)");
                        break;
                    case 11:
                        studyV.setImageResource(R.drawable.korean);
                        studyT.setText("국어");
                }
            }
        });
        return v;
    }
}