package com.example.aleron.mpmpmpmpmpmp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;


public class HomeFragment extends Fragment {

    List<Drawable> temp;
    ArrayList<TextItems> tempText;
    AutoScrollViewPager autoViewPager;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_home, null);

        temp = new ArrayList<>();
        temp.add(ContextCompat.getDrawable(getContext(), R.drawable.backscreen));
        temp.add(ContextCompat.getDrawable(getContext(), R.drawable.backscreen));
        temp.add(ContextCompat.getDrawable(getContext(), R.drawable.backscreen));

        tempText = new ArrayList<TextItems>();
        // 1번째 텍스트 정보
        TextItems text1 = new TextItems("땡땡님 밤 9시에도 어디에서나"+ "\n" + "운동 클래스를 수강 할 수 있어요.",
                "장소 + 코치 보러가기", ContextCompat.getDrawable(getContext(), R.drawable.arrow_button));
        // 2번째 텍스트 정보
        TextItems text2 = new TextItems("땡땡님 밤 9시에도" + "\n" + "원하는 코치에게서 수강 할 수 있어요.",
                "코치 보러가기", ContextCompat.getDrawable(getContext(), R.drawable.arrow_button));
        // 3번째 텍스트 정보
        TextItems text3 = new TextItems("땡땡님 밤 9시에도 어디에서나" + "\n" + "장소를 대여 할 수 있어요.",
                "장소 보러가기", ContextCompat.getDrawable(getContext(), R.drawable.arrow_button));

        // 1~3 텍스트 정보 tempText에 저장하고 어댑터로 넘김
        tempText.add(text1);
        tempText.add(text2);
        tempText.add(text3);


        autoViewPager = (AutoScrollViewPager)v.findViewById(R.id.autoViewpager);

        // 오토 스크롤 시킬 그림 파일 리스트(temp), 텍스트 리스트(tempText) 어댑터 생성 및 오토 스크롤링
        Adapter a = new Adapter(temp, getContext(), tempText);
        autoViewPager.setAdapter(a);
        autoViewPager.setInterval(4000);
        autoViewPager.startAutoScroll();

        TabLayout tabLayout = (TabLayout)v.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(autoViewPager, true);

        return v;
    }
}


