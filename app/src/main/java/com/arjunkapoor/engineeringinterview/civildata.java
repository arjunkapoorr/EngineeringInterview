package com.arjunkapoor.engineeringinterview;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class civildata extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civildata);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("senddatacivil");
        String value1 = extras.getString("senddata1civil");
        TextView textview = (TextView) findViewById(R.id.datatextcivil);
        textview.setText(value1 + "\n \n" + "Answer-" + "\n" + value);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        textview.setMovementMethod(new ScrollingMovementMethod());

    }







    public void onBackPressed()
    {
        Intent intent = new Intent(this, civil.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        return;
    }










            @Override
            public boolean onCreateOptionsMenu (Menu menu){
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_mainactivity, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected (MenuItem item){
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_rateus) {


                    final String GooglePlayStorePackageNameOld = "com.google.market";
                    final String GooglePlayStorePackageNameNew = "com.android.vending";
                    boolean googlePlayStoreInstalled = false;
                    Intent intent = new Intent();
                    PackageManager packageManager = getApplication().getPackageManager();
                    List<PackageInfo> packages = packageManager.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);
                    for (PackageInfo packageInfo : packages) {
                        if (packageInfo.packageName.equals(GooglePlayStorePackageNameOld) ||
                                packageInfo.packageName.equals(GooglePlayStorePackageNameNew)) {
                            googlePlayStoreInstalled = true;
                            break;
                        }
                    }
                    if (googlePlayStoreInstalled == true) {
                        intent = new Intent(Intent.ACTION_VIEW);
                        //Try Google play
                        intent.setData(Uri.parse("market://details?id=com.arjunkapoor.engineeringinterview"));
                        startActivity(intent);

                    } else {

                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.arjunkapoor.engineeringinterview"));
                    }




                }
                if (id == R.id.action_ask) {
                    AlertDialog mDialog;
                    Button PositiveButton;
                    String positiveButtonText = "OK";
                    String negativeButtonText = "CANCEL";
                    mDialog = new AlertDialog.Builder(this)
                            .setIcon(android.R.drawable.ic_dialog_info)
                            .setTitle(getResources().getString(R.string.app_name))
                            .setMessage("Oops,We will add this feature soon")

                            .setPositiveButton(positiveButtonText, null)
                            .setNegativeButton(negativeButtonText, null)
                            .show();

                    WindowManager.LayoutParams layoutParams = mDialog.getWindow().getAttributes();
                    layoutParams.dimAmount = 0.9f;
                    mDialog.getWindow().setAttributes(layoutParams);
                    mDialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                }


                return super.onOptionsItemSelected(item);
            }
        }
