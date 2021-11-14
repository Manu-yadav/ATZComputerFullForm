package com.example.atzcomputerfullform.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atzcomputerfullform.R;
import com.example.atzcomputerfullform.adaptor.AbbreviationAdaptor;
import com.example.atzcomputerfullform.models.AbbreviationModel;
import com.example.atzcomputerfullform.utils.Constants;

import java.util.ArrayList;

public class FullFormActivity extends BaseActivity {
    private RelativeLayout mHeaderRL;
    private TextView mTitleTV;
    private ArrayList<AbbreviationModel> mAbbreviationList;
    private RecyclerView mAbbreviationRV;
    AbbreviationAdaptor mAbbreviationAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_form);
        initView();
        initVariables();
    }

    @Override
    void initView() {
        mHeaderRL = (RelativeLayout) findViewById(R.id.rl_header);
        mTitleTV = (TextView) findViewById(R.id.tv_title);
        mAbbreviationRV = (RecyclerView) findViewById(R.id.rv_abbreviation);
        findViewById(R.id.iv_back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    void initVariables() {
        mAbbreviationList = new ArrayList<>();
        mAbbreviationAdaptor = new AbbreviationAdaptor(this, mAbbreviationList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mAbbreviationRV.setLayoutManager(linearLayoutManager);
        mAbbreviationRV.setAdapter(mAbbreviationAdaptor);
        Intent intent = getIntent();
        if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_A_TO_B)) {
            mTitleTV.setText("Computer Full Form A to B");
            int color = intent.getIntExtra(Constants.A_TO_B_COLOR_CODE, 0);
            String[] abbreviationAtoB = getResources().getStringArray(R.array.abbreviation_a_to_b);
            String[] fullFormAtoB = getResources().getStringArray(R.array.fullform_a_to_b);
            setHeaderColor(color);
            createModel(color, abbreviationAtoB, fullFormAtoB);
        } else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_C_TO_D)) {
            mTitleTV.setText("Computer Full Form C to D");
            int color = intent.getIntExtra(Constants.C_TO_D_COLOR_CODE, 0);
            String[] abbreviationCtoD = getResources().getStringArray(R.array.abbreviation_c_to_d);
            String[] fullFormCtoD = getResources().getStringArray(R.array.fullform_c_to_d);
            setHeaderColor(color);
            createModel(color, abbreviationCtoD, fullFormCtoD);
        } else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_E_TO_F)) {
            mTitleTV.setText("Computer Full Form E to F");
            int color = intent.getIntExtra(Constants.E_TO_F_COLOR_CODE, 0);
            String[] abbreviationEtoF = getResources().getStringArray(R.array.abbreviation_e_to_f);
            String[] fullFormEtoF = getResources().getStringArray(R.array.fullform_e_to_f);
            setHeaderColor(color);
            createModel(color, abbreviationEtoF, fullFormEtoF);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_G_TO_H)) {
            mTitleTV.setText("Computer Full Form G to H");
            int color = intent.getIntExtra(Constants.G_TO_H_COLOR_CODE, 0);
            String[] abbreviationGtoH = getResources().getStringArray(R.array.abbreviation_g_to_h);
            String[] fullFormGtoH = getResources().getStringArray(R.array.fullform_g_to_h);
            setHeaderColor(color);
            createModel(color, abbreviationGtoH, fullFormGtoH);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_I_TO_J)) {
            mTitleTV.setText("Computer Full Form I to J");
            int color = intent.getIntExtra(Constants.I_TO_J_COLOR_CODE, 0);
            String[] abbreviationItoJ = getResources().getStringArray(R.array.abbreviation_i_to_j);
            String[] fullFormItoJ = getResources().getStringArray(R.array.fullform_i_to_j);
            setHeaderColor(color);
            createModel(color, abbreviationItoJ, fullFormItoJ);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_K_TO_L)) {
            mTitleTV.setText("Computer Full Form K to L");
            int color = intent.getIntExtra(Constants.K_TO_L_COLOR_CODE, 0);
            String[] abbreviationKtoL = getResources().getStringArray(R.array.abbreviation_k_to_l);
            String[] fullFormKtoL = getResources().getStringArray(R.array.fullform_k_to_l);
            setHeaderColor(color);
            createModel(color, abbreviationKtoL, fullFormKtoL);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_M_TO_N)) {
            mTitleTV.setText("Computer Full Form M to N");
            int color = intent.getIntExtra(Constants.M_TO_N_COLOR_CODE, 0);
            String[] abbreviationMtoN = getResources().getStringArray(R.array.abbreviation_m_to_n);
            String[] fullFormMtoN = getResources().getStringArray(R.array.fullform_m_to_n);
            setHeaderColor(color);
            createModel(color, abbreviationMtoN, fullFormMtoN);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_O_TO_P)) {
            mTitleTV.setText("Computer Full Form O to P");
            int color = intent.getIntExtra(Constants.O_TO_P_COLOR_CODE, 0);
            String[] abbreviationOtoP = getResources().getStringArray(R.array.abbreviation_o_to_p);
            String[] fullFormOtoP = getResources().getStringArray(R.array.fullform_o_to_p);
            setHeaderColor(color);
            createModel(color, abbreviationOtoP, fullFormOtoP);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_Q_TO_R)) {
            mTitleTV.setText("Computer Full Form Q to R");
            int color = intent.getIntExtra(Constants.Q_TO_R_COLOR_CODE, 0);
            String[] abbreviationQtoR = getResources().getStringArray(R.array.abbreviation_q_to_r);
            String[] fullFormQtoR = getResources().getStringArray(R.array.fullform_q_to_r);
            setHeaderColor(color);
            createModel(color, abbreviationQtoR, fullFormQtoR);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_S_TO_T)) {
            mTitleTV.setText("Computer Full Form S to T");
            int color = intent.getIntExtra(Constants.S_TO_T_COLOR_CODE, 0);
            String[] abbreviationStoT = getResources().getStringArray(R.array.abbreviation_s_to_t);
            String[] fullFormStoT = getResources().getStringArray(R.array.fullform_s_to_t);
            setHeaderColor(color);
            createModel(color, abbreviationStoT, fullFormStoT);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_U_TO_V)) {
            mTitleTV.setText("Computer Full Form U to V");
            int color = intent.getIntExtra(Constants.U_TO_V_COLOR_CODE, 0);
            String[] abbreviationUtoV = getResources().getStringArray(R.array.abbreviation_u_to_v);
            String[] fullFormUtoV = getResources().getStringArray(R.array.fullform_u_to_v);
            setHeaderColor(color);
            createModel(color, abbreviationUtoV, fullFormUtoV);
        }else if (intent.getStringExtra(Constants.FROM).equals(Constants.FROM_W_TO_X)) {
            mTitleTV.setText("Computer Full Form W to X");
            int color = intent.getIntExtra(Constants.W_TO_X_COLOR_CODE, 0);
            String[] abbreviationWtoX = getResources().getStringArray(R.array.abbreviation_w_to_x);
            String[] fullFormWtoX = getResources().getStringArray(R.array.fullform_w_to_x);
            setHeaderColor(color);
            createModel(color, abbreviationWtoX, fullFormWtoX);
        }
    }

    private void createModel(int color, String[] abbreviation, String[] fullForm) {
        for (int i = 0; i < abbreviation.length; i++) {
            AbbreviationModel abbreviationModel = new AbbreviationModel();
            abbreviationModel.setAbbreviation(abbreviation[i]);
            abbreviationModel.setFullForm(fullForm[i]);
            abbreviationModel.setColorCode(color);
            mAbbreviationList.add(abbreviationModel);
        }
        mAbbreviationAdaptor.notifyDataSetChanged();
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
}