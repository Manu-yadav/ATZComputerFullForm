package com.androidtalk.atzcomputerfullform.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.androidtalk.atzcomputerfullform.BuildConfig;
import com.androidtalk.atzcomputerfullform.R;

public class ContactUsActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        initView();
        initVariables();
    }

    @Override
    void initView() {
       // findViewById(R.id.iv_share_button).setOnClickListener(this);
        findViewById(R.id.tv_facebook_link).setOnClickListener(this);
        findViewById(R.id.tv_instagram_link).setOnClickListener(this);
        findViewById(R.id.tv_all_app_link).setOnClickListener(this);
    }

    @Override
    void initVariables() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
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
                                Uri.parse("https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID));
                startActivity(allOurApp);
                break;
            default:
                Toast.makeText(this, "Not Found!!", Toast.LENGTH_SHORT).show();
        }
    }
}