package com.androidtalk.atzcomputerfullform.activities;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.androidtalk.atzcomputerfullform.Category;
import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.utils.Constants;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private View mComputerCV;
    private CardView mMedicalScienceCV;
    private CardView mAutomobileCV;
    private CardView mBankingCV;
    private CardView mCorporateCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVariables();
    }

    @Override
    void initView() {
        mComputerCV = (CardView) findViewById(R.id.cat_computer);
        mComputerCV.setOnClickListener(this);
        mMedicalScienceCV = (CardView) findViewById(R.id.cat_medical_science);
        mMedicalScienceCV.setOnClickListener(this);
        mAutomobileCV = (CardView) findViewById(R.id.cat_automobile);
        mAutomobileCV.setOnClickListener(this);
        mBankingCV = (CardView) findViewById(R.id.cat_banking);
        mBankingCV.setOnClickListener(this);
        mCorporateCV = (CardView) findViewById(R.id.cat_corporate);
        mCorporateCV.setOnClickListener(this);
        findViewById(R.id.cv_contact_us).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this, ContactUsActivity.class);
                startActivity(contactIntent);
            }
        });
    }

    @Override
    void initVariables() {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        Intent main = new Intent(this, AbbreviationActivity.class);

        if (view.getId() == R.id.cat_computer) {
            main.putExtra(Constants.KEY_SELECTED_CATEGORY, Constants.CAT_COMPUTER);
            main.putExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, getViewBackGroundColor(mComputerCV));
        } else if (view.getId() == R.id.cat_medical_science) {
            main.putExtra(Constants.KEY_SELECTED_CATEGORY, Constants.CAT_MEDICAL_SCIENCE);
            main.putExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, getViewBackGroundColor(mMedicalScienceCV));
        } else if (view.getId() == R.id.cat_automobile) {
            main.putExtra(Constants.KEY_SELECTED_CATEGORY, Constants.CAT_AUTOMOBILE);
            main.putExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, getViewBackGroundColor(mAutomobileCV));
        } else if (view.getId() == R.id.cat_banking) {
            main.putExtra(Constants.KEY_SELECTED_CATEGORY, Constants.CAT_BANKING);
            main.putExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, getViewBackGroundColor(mBankingCV));
        } else if (view.getId() == R.id.cat_corporate) {
            main.putExtra(Constants.KEY_SELECTED_CATEGORY, Constants.CAT_CORPORATE);
            main.putExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, getViewBackGroundColor(mCorporateCV));
        }
        startActivity(main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private int getViewBackGroundColor(View view) {
        ColorStateList color = ((CardView) view).getCardBackgroundColor();
        return color.getDefaultColor();
    }
}