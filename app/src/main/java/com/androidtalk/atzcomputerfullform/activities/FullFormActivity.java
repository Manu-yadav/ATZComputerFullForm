package com.androidtalk.atzcomputerfullform.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.androidtalk.atzcomputerfullform.R;
import com.androidtalk.atzcomputerfullform.adaptor.AbbreviationAdaptor;
import com.androidtalk.atzcomputerfullform.models.AbbreviationModel;
import com.androidtalk.atzcomputerfullform.utils.Constants;

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
        String selectedCategory = intent.getStringExtra(Constants.KEY_SELECTED_CATEGORY);
        String from = intent.getStringExtra(Constants.FROM);
        int color = intent.getIntExtra(Constants.KEY_ABBREVIATION_COLOR, 0);
        loadData(selectedCategory, from, color);
    }

    private void loadData(String selectedCategory, String from, int color) {
        if (from.equals(Constants.FROM_A_TO_B)) {
            String[] abbreviationAtoB = null;
            String[] fullFormAtoB = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationAtoB = getResources().getStringArray(R.array.abbreviation_a_to_b);
                    fullFormAtoB = getResources().getStringArray(R.array.fullform_a_to_b);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationAtoB = getResources().getStringArray(R.array.medical_abbreviation_a_to_b);
                    fullFormAtoB = getResources().getStringArray(R.array.medical_fullform_a_to_b);
                    break;
                case "AUTOMOBILE":
                    abbreviationAtoB = getResources().getStringArray(R.array.automobile_abbreviation_a_to_b);
                    fullFormAtoB = getResources().getStringArray(R.array.automobile_fullform_a_to_b);
                    break;
                case "BANKING":
                    abbreviationAtoB = getResources().getStringArray(R.array.banking_abbreviation_a_to_b);
                    fullFormAtoB = getResources().getStringArray(R.array.banking_fullform_a_to_b);
                    break;
                case "CORPORATE":
                    abbreviationAtoB = getResources().getStringArray(R.array.business_abbreviation_a_to_b);
                    fullFormAtoB = getResources().getStringArray(R.array.business_fullform_a_to_b);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form A to B");
            //int color = intent.getIntExtra(Constants.A_TO_B_COLOR_CODE, 0);
            setHeaderColor(color);
            createModel(color, abbreviationAtoB, fullFormAtoB);
        } else if (from.equals(Constants.FROM_C_TO_D)) {
            String[] abbreviationCtoD = null;
            String[] fullFormCtoD = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationCtoD = getResources().getStringArray(R.array.abbreviation_c_to_d);
                    fullFormCtoD = getResources().getStringArray(R.array.fullform_c_to_d);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationCtoD = getResources().getStringArray(R.array.medical_abbreviation_c_to_d);
                    fullFormCtoD = getResources().getStringArray(R.array.medical_fullform_c_to_d);
                    break;
                case "AUTOMOBILE":
                    abbreviationCtoD = getResources().getStringArray(R.array.automobile_abbreviation_c_to_d);
                    fullFormCtoD = getResources().getStringArray(R.array.automobile_fullform_c_to_d);
                    break;
                case "BANKING":
                    abbreviationCtoD = getResources().getStringArray(R.array.banking_abbreviation_c_to_d);
                    fullFormCtoD = getResources().getStringArray(R.array.banking_fullform_c_to_d);
                    break;
                case "CORPORATE":
                    abbreviationCtoD = getResources().getStringArray(R.array.business_abbreviation_c_to_d);
                    fullFormCtoD = getResources().getStringArray(R.array.business_fullform_c_to_d);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form C to D");
            setHeaderColor(color);
            createModel(color, abbreviationCtoD, fullFormCtoD);
        } else if (from.equals(Constants.FROM_E_TO_F)) {
            String[] abbreviationEtoF = null;
            String[] fullFormEtoF = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationEtoF = getResources().getStringArray(R.array.abbreviation_e_to_f);
                    fullFormEtoF = getResources().getStringArray(R.array.fullform_e_to_f);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationEtoF = getResources().getStringArray(R.array.medical_abbreviation_e_to_f);
                    fullFormEtoF = getResources().getStringArray(R.array.medical_fullform_e_to_f);
                    break;
                case "AUTOMOBILE":
                    abbreviationEtoF = getResources().getStringArray(R.array.automobile_abbreviation_e_to_f);
                    fullFormEtoF = getResources().getStringArray(R.array.automobile_fullform_e_to_f);
                    break;
                case "BANKING":
                    abbreviationEtoF = getResources().getStringArray(R.array.banking_abbreviation_e_to_f);
                    fullFormEtoF = getResources().getStringArray(R.array.banking_fullform_e_to_f);
                    break;
                case "CORPORATE":
                    abbreviationEtoF = getResources().getStringArray(R.array.business_abbreviation_e_to_f);
                    fullFormEtoF = getResources().getStringArray(R.array.business_fullform_e_to_f);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form E to F");
            setHeaderColor(color);
            createModel(color, abbreviationEtoF, fullFormEtoF);
        } else if (from.equals(Constants.FROM_G_TO_H)) {
            String[] abbreviationGtoH = null;
            String[] fullFormGtoH = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationGtoH = getResources().getStringArray(R.array.abbreviation_g_to_h);
                    fullFormGtoH = getResources().getStringArray(R.array.fullform_g_to_h);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationGtoH = getResources().getStringArray(R.array.medical_abbreviation_g_to_h);
                    fullFormGtoH = getResources().getStringArray(R.array.medical_fullform_g_to_h);
                    break;
                case "AUTOMOBILE":
                    abbreviationGtoH = getResources().getStringArray(R.array.automobile_abbreviation_g_to_h);
                    fullFormGtoH = getResources().getStringArray(R.array.automobile_fullform_g_to_h);
                    break;
                case "BANKING":
                    abbreviationGtoH = getResources().getStringArray(R.array.banking_abbreviation_g_to_h);
                    fullFormGtoH = getResources().getStringArray(R.array.banking_fullform_g_to_h);
                    break;
                case "CORPORATE":
                    abbreviationGtoH = getResources().getStringArray(R.array.business_abbreviation_g_to_h);
                    fullFormGtoH = getResources().getStringArray(R.array.business_fullform_g_to_h);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form G to H");
            setHeaderColor(color);
            createModel(color, abbreviationGtoH, fullFormGtoH);
        } else if (from.equals(Constants.FROM_I_TO_J)) {
            String[] abbreviationItoJ = null;
            String[] fullFormItoJ = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationItoJ = getResources().getStringArray(R.array.abbreviation_i_to_j);
                    fullFormItoJ = getResources().getStringArray(R.array.fullform_i_to_j);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationItoJ = getResources().getStringArray(R.array.medical_abbreviation_i_to_j);
                    fullFormItoJ = getResources().getStringArray(R.array.medical_fullform_i_to_j);
                    break;
                case "AUTOMOBILE":
                    abbreviationItoJ = getResources().getStringArray(R.array.automobile_abbreviation_i_to_j);
                    fullFormItoJ = getResources().getStringArray(R.array.automobile_fullform_i_to_j);
                    break;
                case "BANKING":
                    abbreviationItoJ = getResources().getStringArray(R.array.banking_abbreviation_i_to_j);
                    fullFormItoJ = getResources().getStringArray(R.array.banking_fullform_i_to_j);
                    break;
                case "CORPORATE":
                    abbreviationItoJ = getResources().getStringArray(R.array.business_abbreviation_i_to_j);
                    fullFormItoJ = getResources().getStringArray(R.array.business_fullform_i_to_j);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form I to J");
            setHeaderColor(color);
            createModel(color, abbreviationItoJ, fullFormItoJ);
        } else if (from.equals(Constants.FROM_K_TO_L)) {
            String[] abbreviationKtoL = null;
            String[] fullFormKtoL = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationKtoL = getResources().getStringArray(R.array.abbreviation_k_to_l);
                    fullFormKtoL = getResources().getStringArray(R.array.fullform_k_to_l);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationKtoL = getResources().getStringArray(R.array.medical_abbreviation_k_to_l);
                    fullFormKtoL = getResources().getStringArray(R.array.medical_fullform_k_to_l);
                    break;
                case "AUTOMOBILE":
                    abbreviationKtoL = getResources().getStringArray(R.array.automobile_abbreviation_k_to_l);
                    fullFormKtoL = getResources().getStringArray(R.array.automobile_fullform_k_to_l);
                    break;
                case "BANKING":
                    abbreviationKtoL = getResources().getStringArray(R.array.banking_abbreviation_k_to_l);
                    fullFormKtoL = getResources().getStringArray(R.array.banking_fullform_k_to_l);
                    break;
                case "CORPORATE":
                    abbreviationKtoL = getResources().getStringArray(R.array.business_abbreviation_k_to_l);
                    fullFormKtoL = getResources().getStringArray(R.array.business_fullform_k_to_l);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form K to L");
            setHeaderColor(color);
            createModel(color, abbreviationKtoL, fullFormKtoL);
        } else if (from.equals(Constants.FROM_M_TO_N)) {
            String[] abbreviationMtoN = null;
            String[] fullFormMtoN = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationMtoN = getResources().getStringArray(R.array.abbreviation_m_to_n);
                    fullFormMtoN = getResources().getStringArray(R.array.fullform_m_to_n);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationMtoN = getResources().getStringArray(R.array.medical_abbreviation_m_to_n);
                    fullFormMtoN = getResources().getStringArray(R.array.medical_fullform_m_to_n);
                    break;
                case "AUTOMOBILE":
                    abbreviationMtoN = getResources().getStringArray(R.array.automobile_abbreviation_m_to_n);
                    fullFormMtoN = getResources().getStringArray(R.array.automobile_fullform_m_to_n);
                    break;
                case "BANKING":
                    abbreviationMtoN = getResources().getStringArray(R.array.banking_abbreviation_m_to_n);
                    fullFormMtoN = getResources().getStringArray(R.array.banking_fullform_m_to_n);
                    break;
                case "CORPORATE":
                    abbreviationMtoN = getResources().getStringArray(R.array.business_abbreviation_m_to_n);
                    fullFormMtoN = getResources().getStringArray(R.array.business_fullform_m_to_n);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form M to N");
            setHeaderColor(color);
            createModel(color, abbreviationMtoN, fullFormMtoN);
        } else if (from.equals(Constants.FROM_O_TO_P)) {
            String[] abbreviationOtoP = null;
            String[] fullFormOtoP = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationOtoP = getResources().getStringArray(R.array.abbreviation_o_to_p);
                    fullFormOtoP = getResources().getStringArray(R.array.fullform_o_to_p);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationOtoP = getResources().getStringArray(R.array.medical_abbreviation_o_to_p);
                    fullFormOtoP = getResources().getStringArray(R.array.medical_fullform_o_to_p);
                    break;
                case "AUTOMOBILE":
                    abbreviationOtoP = getResources().getStringArray(R.array.automobile_abbreviation_o_to_p);
                    fullFormOtoP = getResources().getStringArray(R.array.automobile_fullform_o_to_p);
                    break;
                case "BANKING":
                    abbreviationOtoP = getResources().getStringArray(R.array.banking_abbreviation_o_to_p);
                    fullFormOtoP = getResources().getStringArray(R.array.banking_fullform_o_to_p);
                    break;
                case "CORPORATE":
                    abbreviationOtoP = getResources().getStringArray(R.array.business_abbreviation_o_to_p);
                    fullFormOtoP = getResources().getStringArray(R.array.business_fullform_o_to_p);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form O to P");
            setHeaderColor(color);
            createModel(color, abbreviationOtoP, fullFormOtoP);
        } else if (from.equals(Constants.FROM_Q_TO_R)) {
            String[] abbreviationQtoR = null;
            String[] fullFormQtoR = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationQtoR = getResources().getStringArray(R.array.abbreviation_q_to_r);
                    fullFormQtoR = getResources().getStringArray(R.array.fullform_q_to_r);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationQtoR = getResources().getStringArray(R.array.medical_abbreviation_q_to_r);
                    fullFormQtoR = getResources().getStringArray(R.array.medical_fullform_q_to_r);
                    break;
                case "AUTOMOBILE":
                    abbreviationQtoR = getResources().getStringArray(R.array.automobile_abbreviation_q_to_r);
                    fullFormQtoR = getResources().getStringArray(R.array.automobile_fullform_q_to_r);
                    break;
                case "BANKING":
                    abbreviationQtoR = getResources().getStringArray(R.array.banking_abbreviation_q_to_r);
                    fullFormQtoR = getResources().getStringArray(R.array.banking_fullform_q_to_r);
                    break;
                case "CORPORATE":
                    abbreviationQtoR = getResources().getStringArray(R.array.business_abbreviation_q_to_r);
                    fullFormQtoR = getResources().getStringArray(R.array.business_fullform_q_to_r);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form Q to R");
            setHeaderColor(color);
            createModel(color, abbreviationQtoR, fullFormQtoR);
        } else if (from.equals(Constants.FROM_S_TO_T)) {
            String[] abbreviationStoT = null;
            String[] fullFormStoT = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationStoT = getResources().getStringArray(R.array.abbreviation_s_to_t);
                    fullFormStoT = getResources().getStringArray(R.array.fullform_s_to_t);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationStoT = getResources().getStringArray(R.array.medical_abbreviation_s_to_t);
                    fullFormStoT = getResources().getStringArray(R.array.medical_fullform_s_to_t);
                    break;
                case "AUTOMOBILE":
                    abbreviationStoT = getResources().getStringArray(R.array.automobile_abbreviation_s_to_t);
                    fullFormStoT = getResources().getStringArray(R.array.automobile_fullform_s_to_t);
                    break;
                case "BANKING":
                    abbreviationStoT = getResources().getStringArray(R.array.banking_abbreviation_s_to_t);
                    fullFormStoT = getResources().getStringArray(R.array.banking_fullform_s_to_t);
                    break;
                case "CORPORATE":
                    abbreviationStoT = getResources().getStringArray(R.array.business_abbreviation_s_to_t);
                    fullFormStoT = getResources().getStringArray(R.array.business_fullform_s_to_t);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form S to T");
            setHeaderColor(color);
            createModel(color, abbreviationStoT, fullFormStoT);
        } else if (from.equals(Constants.FROM_U_TO_V)) {
            String[] abbreviationUtoV = null;
            String[] fullFormUtoV = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationUtoV = getResources().getStringArray(R.array.abbreviation_u_to_v);
                    fullFormUtoV = getResources().getStringArray(R.array.fullform_u_to_v);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationUtoV = getResources().getStringArray(R.array.medical_abbreviation_u_to_v);
                    fullFormUtoV = getResources().getStringArray(R.array.medical_fullform_u_to_v);
                    break;
                case "AUTOMOBILE":
                    abbreviationUtoV = getResources().getStringArray(R.array.automobile_abbreviation_u_to_v);
                    fullFormUtoV = getResources().getStringArray(R.array.automobile_fullform_u_to_v);
                    break;
                case "BANKING":
                    abbreviationUtoV = getResources().getStringArray(R.array.banking_abbreviation_u_to_v);
                    fullFormUtoV = getResources().getStringArray(R.array.banking_fullform_u_to_v);
                    break;
                case "CORPORATE":
                    abbreviationUtoV = getResources().getStringArray(R.array.business_abbreviation_u_to_v);
                    fullFormUtoV = getResources().getStringArray(R.array.business_fullform_u_to_v);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form U to V");
            setHeaderColor(color);
            createModel(color, abbreviationUtoV, fullFormUtoV);
        } else if (from.equals(Constants.FROM_W_TO_X)) {
            String[] abbreviationWtoX = null;
            String[] fullFormWtoX = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    abbreviationWtoX = getResources().getStringArray(R.array.abbreviation_w_to_x);
                    fullFormWtoX = getResources().getStringArray(R.array.fullform_w_to_x);
                    break;
                case "MEDICAL SCIENCE":
                    abbreviationWtoX = getResources().getStringArray(R.array.medical_abbreviation_w_to_x);
                    fullFormWtoX = getResources().getStringArray(R.array.medical_fullform_w_to_x);
                    break;
                case "AUTOMOBILE":
                    abbreviationWtoX = getResources().getStringArray(R.array.automobile_abbreviation_w_to_x);
                    fullFormWtoX = getResources().getStringArray(R.array.automobile_fullform_w_to_x);
                    break;
                case "BANKING":
                    abbreviationWtoX = getResources().getStringArray(R.array.banking_abbreviation_w_to_x);
                    fullFormWtoX = getResources().getStringArray(R.array.banking_fullform_w_to_x);
                    break;
                case "CORPORATE":
                    abbreviationWtoX = getResources().getStringArray(R.array.business_abbreviation_w_to_x);
                    fullFormWtoX = getResources().getStringArray(R.array.business_fullform_w_to_x);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form W to X");
            setHeaderColor(color);
            createModel(color, abbreviationWtoX, fullFormWtoX);
        } else if (from.equals(Constants.FROM_Y_TO_Z)) {
            String[] abbreviationYtoZ = null;
            String[] fullFormYtoZ = null;
            switch (selectedCategory) {
                case "COMPUTER":
                    //abbreviationYtoZ = getResources().getStringArray(R.array.abbreviation_y_to_z);
                    // fullFormYtoZ = getResources().getStringArray(R.array.fullform_y_to_z);
                    break;
                case "MEDICAL SCIENCE":
                    // abbreviationYtoZ = getResources().getStringArray(R.array.medical_abbreviation_y_to_z);
                    //fullFormYtoZ = getResources().getStringArray(R.array.medical_fullform_y_to_z);
                    break;
                case "AUTOMOBILE":
                    abbreviationYtoZ = getResources().getStringArray(R.array.automobile_abbreviation_y_to_z);
                    fullFormYtoZ = getResources().getStringArray(R.array.automobile_fullform_y_to_z);
                    break;
                case "BANKING":
                    //abbreviationYtoZ = getResources().getStringArray(R.array.banking_abbreviation_y_to_z);
                    // fullFormYtoZ = getResources().getStringArray(R.array.banking_fullform_y_to_z);
                    break;
                case "CORPORATE":
                    abbreviationYtoZ = getResources().getStringArray(R.array.business_abbreviation_y_to_z);
                    fullFormYtoZ = getResources().getStringArray(R.array.business_fullform_y_to_z);
                    break;
            }
            mTitleTV.setText(selectedCategory + " Full Form Y to Z");
            setHeaderColor(color);
            createModel(color, abbreviationYtoZ, fullFormYtoZ);
        }
    }

    private void createModel(int color, String[] abbreviation, String[] fullForm) {
        if (abbreviation != null && fullForm != null) {
            for (int i = 0; i < abbreviation.length; i++) {
                AbbreviationModel abbreviationModel = new AbbreviationModel();
                abbreviationModel.setAbbreviation(abbreviation[i]);
                abbreviationModel.setFullForm(fullForm[i]);
                abbreviationModel.setColorCode(color);
                mAbbreviationList.add(abbreviationModel);
            }
            mAbbreviationAdaptor.notifyDataSetChanged();
        } else {
            Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
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