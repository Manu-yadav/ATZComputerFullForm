package com.androidtalk.atzcomputerfullform.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.adaptor.CustomExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewIntelligenceAgenciesActivity extends BaseActivity {

    private CustomExpandableListAdapter mExpandableListAdapter;
    private ExpandableListView mExpandableListView;
    private ArrayList<String> mExpandableTitleList;
    private HashMap<String, List<String>> mExpandableDetailMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_intelligence_agencies);
        initView();
        initVariables();
    }

    @Override
    void initView() {
        mExpandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
    }

    @Override
    void initVariables() {
        mExpandableDetailMap = getData();
        mExpandableTitleList = new ArrayList<String>(mExpandableDetailMap.keySet());
        mExpandableListAdapter = new CustomExpandableListAdapter(this, mExpandableTitleList, mExpandableDetailMap);
        mExpandableListView.setAdapter(mExpandableListAdapter);
    }

    private HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("India");
        cricket.add("Pakistan");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");

        List<String> football = new ArrayList<String>();
        football.add("Brazil");
        football.add("Spain");
        football.add("Germany");
        football.add("Netherlands");
        football.add("Italy");

        List<String> basketball = new ArrayList<String>();
        basketball.add("United States");
        basketball.add("Spain");
        basketball.add("Argentina");
        basketball.add("France");
        basketball.add("Russia");

        expandableListDetail.put("CRICKET TEAMS", cricket);
        expandableListDetail.put("FOOTBALL TEAMS", football);
        expandableListDetail.put("BASKETBALL TEAMS", basketball);
        return expandableListDetail;
    }
}