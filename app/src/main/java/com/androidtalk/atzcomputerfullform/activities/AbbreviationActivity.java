package com.androidtalk.atzcomputerfullform.activities;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;

import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.utils.Constants;

public class AbbreviationActivity extends BaseActivity implements View.OnClickListener {

    private RelativeLayout mHeaderRL;
    private TextView mTitleTV;
    private CardView mAtoB_LL;
    private CardView mCtoD_LL;
    private CardView mEtoF_LL;
    private CardView mGtoH_LL;
    private CardView mItoJ_LL;
    private CardView mKtoL_LL;
    private CardView mMtoN_LL;
    private CardView mOtoP_LL;
    private CardView mQtoR_LL;
    private CardView mStoT_LL;
    private CardView mUtoV_LL;
    private CardView mWtoX_LL;
    private String mSelectedCategory;
    private CardView mYtoZ_LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abbreviation);
        initView();
        initVariables();
    }

    @Override
    void initView() {
        mHeaderRL = (RelativeLayout) findViewById(R.id.rl_header);
        mTitleTV = (TextView) findViewById(R.id.tv_title);
        mAtoB_LL = (CardView) findViewById(R.id.a_b_ff_ll);
        mCtoD_LL = (CardView) findViewById(R.id.c_d_ff_ll);
        mEtoF_LL = (CardView) findViewById(R.id.e_f_ff_ll);
        mGtoH_LL = (CardView) findViewById(R.id.g_h_ff_ll);
        mItoJ_LL = (CardView) findViewById(R.id.i_j_ff_ll);
        mKtoL_LL = (CardView) findViewById(R.id.k_l_ff_ll);
        mMtoN_LL = (CardView) findViewById(R.id.m_n_ff_ll);
        mOtoP_LL = (CardView) findViewById(R.id.o_p_ff_ll);
        mQtoR_LL = (CardView) findViewById(R.id.q_r_ff_ll);
        mStoT_LL = (CardView) findViewById(R.id.s_t_ff_ll);
        mUtoV_LL = (CardView) findViewById(R.id.u_v_ff_ll);
        mWtoX_LL = (CardView) findViewById(R.id.w_x_ff_ll);
        mYtoZ_LL = (CardView) findViewById(R.id.y_z_ff_ll);

        mAtoB_LL.setOnClickListener(this);
        mCtoD_LL.setOnClickListener(this);
        mEtoF_LL.setOnClickListener(this);
        mGtoH_LL.setOnClickListener(this);
        mItoJ_LL.setOnClickListener(this);
        mKtoL_LL.setOnClickListener(this);
        mMtoN_LL.setOnClickListener(this);
        mOtoP_LL.setOnClickListener(this);
        mQtoR_LL.setOnClickListener(this);
        mStoT_LL.setOnClickListener(this);
        mUtoV_LL.setOnClickListener(this);
        mWtoX_LL.setOnClickListener(this);
        mYtoZ_LL.setOnClickListener(this);

        //Initializing ad.
        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });*/
    }

    @Override
    void initVariables() {

        // Get the selected category info. from intent.
        Intent intent = getIntent();
        mSelectedCategory = intent.getStringExtra(Constants.KEY_SELECTED_CATEGORY);
        int mSelectedCategoryColor = intent.getIntExtra(Constants.KEY_SELECTED_CATEGORY_COLOR, 0);
        setHeaderColor(mSelectedCategoryColor, mSelectedCategory);
       /* mAdManagerAdView = findViewById(R.id.adManagerAdView);
        mAdManagerAdView.setVisibility(View.VISIBLE);
        AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();
        mAdManagerAdView.loadAd(adRequest);
        mAdManagerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
                mAdManagerAdView.setVisibility(View.GONE);
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                mAdManagerAdView.loadAd(adRequest);
                Toast.makeText(MainActivity.this,"Failed to load "+adError.getMessage(),Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Toast.makeText(MainActivity.this,"Ad loaded",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });*/
    }

    private void setHeaderColor(int color, String title) {
        Drawable unwrappedDrawable = mHeaderRL.getBackground();
        Drawable wrappedDrawable = DrawableCompat.wrap(unwrappedDrawable);
        DrawableCompat.setTint(wrappedDrawable, color);
//Changed notification try color
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(color);
        }
        mTitleTV.setText(title);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a_b_ff_ll:
                Intent aTobIntent = new Intent(this, FullFormActivity.class);
                aTobIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                aTobIntent.putExtra(Constants.FROM, Constants.FROM_A_TO_B);
                aTobIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mAtoB_LL));
                startActivity(aTobIntent);
                break;
            case R.id.c_d_ff_ll:
                Intent cTodIntent = new Intent(this, FullFormActivity.class);
                cTodIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                cTodIntent.putExtra(Constants.FROM, Constants.FROM_C_TO_D);
                cTodIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mCtoD_LL));
                startActivity(cTodIntent);
                break;
            case R.id.e_f_ff_ll:
                Intent eTofIntent = new Intent(this, FullFormActivity.class);
                eTofIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                eTofIntent.putExtra(Constants.FROM, Constants.FROM_E_TO_F);
                eTofIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mEtoF_LL));
                startActivity(eTofIntent);
                break;
            case R.id.g_h_ff_ll:
                Intent gTohIntent = new Intent(this, FullFormActivity.class);
                gTohIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                gTohIntent.putExtra(Constants.FROM, Constants.FROM_G_TO_H);
                gTohIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mGtoH_LL));
                startActivity(gTohIntent);
                break;
            case R.id.i_j_ff_ll:
                Intent iTojIntent = new Intent(this, FullFormActivity.class);
                iTojIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                iTojIntent.putExtra(Constants.FROM, Constants.FROM_I_TO_J);
                iTojIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mItoJ_LL));
                startActivity(iTojIntent);
                break;
            case R.id.k_l_ff_ll:
                Intent kTolIntent = new Intent(this, FullFormActivity.class);
                kTolIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                kTolIntent.putExtra(Constants.FROM, Constants.FROM_K_TO_L);
                kTolIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mKtoL_LL));
                startActivity(kTolIntent);
                break;
            case R.id.m_n_ff_ll:
                Intent mTonIntent = new Intent(this, FullFormActivity.class);
                mTonIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                mTonIntent.putExtra(Constants.FROM, Constants.FROM_M_TO_N);
                mTonIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mMtoN_LL));
                startActivity(mTonIntent);
                break;
            case R.id.o_p_ff_ll:
                Intent oTopIntent = new Intent(this, FullFormActivity.class);
                oTopIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                oTopIntent.putExtra(Constants.FROM, Constants.FROM_O_TO_P);
                oTopIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mOtoP_LL));
                startActivity(oTopIntent);
                break;
            case R.id.q_r_ff_ll:
                Intent qTorIntent = new Intent(this, FullFormActivity.class);
                qTorIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                qTorIntent.putExtra(Constants.FROM, Constants.FROM_Q_TO_R);
                qTorIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mQtoR_LL));
                startActivity(qTorIntent);
                break;
            case R.id.s_t_ff_ll:
                Intent sTotIntent = new Intent(this, FullFormActivity.class);
                sTotIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                sTotIntent.putExtra(Constants.FROM, Constants.FROM_S_TO_T);
                sTotIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mStoT_LL));
                startActivity(sTotIntent);
                break;
            case R.id.u_v_ff_ll:
                Intent uTovIntent = new Intent(this, FullFormActivity.class);
                uTovIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                uTovIntent.putExtra(Constants.FROM, Constants.FROM_U_TO_V);
                uTovIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mUtoV_LL));
                startActivity(uTovIntent);
                break;
            case R.id.w_x_ff_ll:
                Intent wToxIntent = new Intent(this, FullFormActivity.class);
                wToxIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                wToxIntent.putExtra(Constants.FROM, Constants.FROM_W_TO_X);
                wToxIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mWtoX_LL));
                startActivity(wToxIntent);
                break;
            case R.id.y_z_ff_ll:
                Intent yTozIntent = new Intent(this, FullFormActivity.class);
                yTozIntent.putExtra(Constants.KEY_SELECTED_CATEGORY, mSelectedCategory);
                yTozIntent.putExtra(Constants.FROM, Constants.FROM_Y_TO_Z);
                yTozIntent.putExtra(Constants.KEY_ABBREVIATION_COLOR, getViewBackGroundColor(mYtoZ_LL));
                startActivity(yTozIntent);
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private int getViewBackGroundColor(View view) {
        ColorStateList color = ((CardView) view).getCardBackgroundColor();
        return color.getDefaultColor();
    }
}