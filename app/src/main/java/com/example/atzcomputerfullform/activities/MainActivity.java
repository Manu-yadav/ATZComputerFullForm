package com.example.atzcomputerfullform.activities;

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

import com.example.atzcomputerfullform.BuildConfig;
import com.example.atzcomputerfullform.R;
import com.example.atzcomputerfullform.utils.Constants;

public class MainActivity extends BaseActivity implements View.OnClickListener {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        findViewById(R.id.iv_share_button).setOnClickListener(this);
        findViewById(R.id.tv_facebook_link).setOnClickListener(this);
        findViewById(R.id.tv_instagram_link).setOnClickListener(this);
        findViewById(R.id.tv_all_app_link).setOnClickListener(this);
    }

    @Override
    void initVariables() {
        setHeaderColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    private void setHeaderColor(int color) {
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
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_share_button:
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.a_b_ff_ll:
                Intent aTobIntent = new Intent(this, FullFormActivity.class);
                aTobIntent.putExtra(Constants.FROM, Constants.FROM_A_TO_B);
                aTobIntent.putExtra(Constants.A_TO_B_COLOR_CODE, getViewBackGroundColor(mAtoB_LL));
                startActivity(aTobIntent);
                break;
            case R.id.c_d_ff_ll:
                Intent cTodIntent = new Intent(this, FullFormActivity.class);
                cTodIntent.putExtra(Constants.FROM, Constants.FROM_C_TO_D);
                cTodIntent.putExtra(Constants.C_TO_D_COLOR_CODE, getViewBackGroundColor(mCtoD_LL));
                startActivity(cTodIntent);
                break;
            case R.id.e_f_ff_ll:
                Intent eTofIntent = new Intent(this, FullFormActivity.class);
                eTofIntent.putExtra(Constants.FROM, Constants.FROM_E_TO_F);
                eTofIntent.putExtra(Constants.E_TO_F_COLOR_CODE, getViewBackGroundColor(mEtoF_LL));
                startActivity(eTofIntent);
                break;
            case R.id.g_h_ff_ll:
                Intent gTohIntent = new Intent(this, FullFormActivity.class);
                gTohIntent.putExtra(Constants.FROM, Constants.FROM_G_TO_H);
                gTohIntent.putExtra(Constants.G_TO_H_COLOR_CODE, getViewBackGroundColor(mGtoH_LL));
                startActivity(gTohIntent);
                break;
            case R.id.i_j_ff_ll:
                Intent iTojIntent = new Intent(this, FullFormActivity.class);
                iTojIntent.putExtra(Constants.FROM, Constants.FROM_I_TO_J);
                iTojIntent.putExtra(Constants.I_TO_J_COLOR_CODE, getViewBackGroundColor(mItoJ_LL));
                startActivity(iTojIntent);
                break;
            case R.id.k_l_ff_ll:
                Intent kTolIntent = new Intent(this, FullFormActivity.class);
                kTolIntent.putExtra(Constants.FROM, Constants.FROM_K_TO_L);
                kTolIntent.putExtra(Constants.K_TO_L_COLOR_CODE, getViewBackGroundColor(mKtoL_LL));
                startActivity(kTolIntent);
                break;
            case R.id.m_n_ff_ll:
                Intent mTonIntent = new Intent(this, FullFormActivity.class);
                mTonIntent.putExtra(Constants.FROM, Constants.FROM_M_TO_N);
                mTonIntent.putExtra(Constants.M_TO_N_COLOR_CODE, getViewBackGroundColor(mMtoN_LL));
                startActivity(mTonIntent);
                break;
            case R.id.o_p_ff_ll:
                Intent oTopIntent = new Intent(this, FullFormActivity.class);
                oTopIntent.putExtra(Constants.FROM, Constants.FROM_O_TO_P);
                oTopIntent.putExtra(Constants.O_TO_P_COLOR_CODE, getViewBackGroundColor(mOtoP_LL));
                startActivity(oTopIntent);
                break;
            case R.id.q_r_ff_ll:
                Intent qTorIntent = new Intent(this, FullFormActivity.class);
                qTorIntent.putExtra(Constants.FROM, Constants.FROM_Q_TO_R);
                qTorIntent.putExtra(Constants.Q_TO_R_COLOR_CODE, getViewBackGroundColor(mQtoR_LL));
                startActivity(qTorIntent);
                break;
            case R.id.s_t_ff_ll:
                Intent sTotIntent = new Intent(this, FullFormActivity.class);
                sTotIntent.putExtra(Constants.FROM, Constants.FROM_S_TO_T);
                sTotIntent.putExtra(Constants.S_TO_T_COLOR_CODE, getViewBackGroundColor(mStoT_LL));
                startActivity(sTotIntent);
                break;
            case R.id.u_v_ff_ll:
                Intent uTovIntent = new Intent(this, FullFormActivity.class);
                uTovIntent.putExtra(Constants.FROM, Constants.FROM_U_TO_V);
                uTovIntent.putExtra(Constants.U_TO_V_COLOR_CODE, getViewBackGroundColor(mUtoV_LL));
                startActivity(uTovIntent);
                break;
            case R.id.w_x_ff_ll:
                Intent wToxIntent = new Intent(this, FullFormActivity.class);
                wToxIntent.putExtra(Constants.FROM, Constants.FROM_W_TO_X);
                wToxIntent.putExtra(Constants.W_TO_X_COLOR_CODE, getViewBackGroundColor(mWtoX_LL));
                startActivity(wToxIntent);
                break;
            case R.id.tv_facebook_link:
                Intent facebookIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.facebook.com/its.android.talk"));
                startActivity(facebookIntent);
                break;
            case R.id.tv_instagram_link:
                Intent instagramIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.instagram.com/developer_android_app/"));
                startActivity(instagramIntent);
                break;
            case R.id.tv_all_app_link:
                Intent allOurApp =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.google.com/"));
                startActivity(allOurApp);
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private int getViewBackGroundColor(View view) {
        ColorStateList color = ((CardView)view).getCardBackgroundColor();
        return color.getDefaultColor();
    }
}