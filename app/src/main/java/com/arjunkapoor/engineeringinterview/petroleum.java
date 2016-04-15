package com.arjunkapoor.engineeringinterview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class petroleum extends ActionBarActivity {



    String[] listArraypetroleum = {
            "1. List out the methods used for well test analyses?",
            "2. Mention what is the main advantage of using the pressure drawdown tests?",
            "3. Explain what is well logging?",
            "4. Mention what are the different types of well logging?",
            "5. Explain what is Pseudo Pressure?",
            "6. Explain the term “bull heading”?",
            "7. Which mineral is frequently used to increase the weight or density of drilling mud?",
            "8. What is the importance of drilling muds?",
            "9. What is the drill-stem testing?",
            "10. Explain what is hydraulic fracturing?",
            "11. What is proppant and what is the use of it?",
            "12. Explain what is perforation in oil well drilling?",
            "13. Explain the term desander and desilter?",
            "14. Explain what is dogleg?",
            "15. Explain what is wellbore storage?",
            "16. Explain what is a blowout preventer?",
            "17. Explain what is annular blowout preventer?",
            "18. Explain what is die insert?",
            "19. What is Kelly bushing?",
            "20. Explain the term Induction logs?",
            "21. Explain how Spontaneous logs are useful?",
            "22. Explain what is underbalanced drilling?",
            "23. Explain the method of “Gas injection down the drill pipe”? What are the advantages of this technique?"


    };

    String[] datapetroleum = {
            "Various methods for well test analyses are\n" +
                    "• Pressure drawdown tests\n" +
                    "• Pressure build up tests\n" +
                    "• Type curve analysis\n" +
                    "• Pulse tests and Interference\n" +
                    "• Drill stem and wireline formation\n" +
                    "• Gas well tests\n",
            "The draw down test will help you to estimate the reservoir volume.",
            "A well log is used for graphical representation of any drilling condition or subsurface features that come across while drilling, which is used for the evaluation of the well.",
            "• Resistivity logs\n" +
                    "• Spontaneous potential logs\n" +
                    "• Gamma ray logs\n" +
                    "• Gamma ray absorption logs\n" +
                    "• Neutron logs\n" +
                    "• Sonic porosity logs\n",
            "Pseudo pressure is a mathematical pressure function which accounts for the variable compressibility and viscosity of gas with respect to pressure.",
            "“Bull heading” is a process, where gas is forced back into a formation by pumping into the annulus from the surface.",
            "Barium Sulfate or BaSO4 mineral is frequently used to increase the density of drilling mud.",
            "The drilling muds are used for\n" +
                    "• Lubrication purpose and for cooling of the drill bit and pipe\n" +
                    "• It removes the cuttings that come from the bottom of the oil well\n" +
                    "• Prevent blowouts by acting as a sealant\n",
            "Lowering a device into the drill hole to measure the pressures, it will reveal whether reservoir rock has been reached.",
            "Hydraulic fracturing is a technique in which tons of gallons of water, chemicals and sand at high pressure is pumped down across the drilled well. This pressurized mixture makes rock layer to crack and make small space or fissure, through which natural gas emits out.",
            "A proppant is a solid material, which is treated with sand or ceramic materials. It is used to keep the induced hydraulic fracture open.",
            "A perforation is a hole made in the casing or liner of an oil well to connect it to the reservoir.",
            "Desander is a centrifugal device used for removing sand from drilling the fluid to avert the abrasion of the pumps. While Desilter is a centrifugal device used to remove the slit or very fine particles.",
            "Dogleg term is used to refer for an abrupt change in direction in the wellbore, resulting in the formation of the keyseat.",
            "When the oil well is shut-in, there is continue flow of fluid into the wellbore. This flow of fluid is referred as wellbore storage.",
            "Blowout preventer is installed on the top of the well and is used to control the back pressure produced by oil during the drilling process.",
            "Annular blowout preventer is usually a large valve, installed above the ram preventers, it forms a protective seal in the annular space between the pipes and well bore. It seals the annulus between the Kelly, drill collar and drill pipe.",
            "Die insert is a hard steel, a serrated piece which is removable and fits into the jaws of the tongs and firmly holds the body of the drill pipe, drill collars while the tongs are making up or breaking out of the pipes.",
            "Kelly bushing is a device fitted to the rotatory table through which the Kelly passes and the mean by which the torque of the rotatory table is transmitted to the Kelly and to the drill stem.",
            "Induction logs are used in wells that do not use water or mud, but oil-based drilling fluids or air. They are non-conductive and therefore cannot use electric logs instead they use magnetism and electricity to measure resistivity.",
            "Spontaneous logs determine the permeability of the rocks in the well by denoting the electrical currents produced between the drilling fluids and formation water held in the pore spaces.",
            "The underbalanced drilling is an alternative way of drilling oil and gas wells, where the pressure in the wellbore is kept lower than the fluid pressure. The advantage of underbalanced drilling is that it reduces formation damage in reservoirs.",
            "In this technique air or nitrogen is injected to the drilling fluid that is injected directly down the drill pipe. The advantages of this technique is\n" +
                    "• Improved penetration and decreased amount of gas\n" +
                    "• Wellbore is not required to specifically designed for underbalanced drilling\n" +
                    "• Less amount of gas required\n"



           };

    List<String> petroleumarrayquestionlist = Arrays.asList(listArraypetroleum);
    ArrayList<String> petroleumupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapterpetroleum;
    List<String> petroleumarrayanswerlist = Arrays.asList(datapetroleum);
    ArrayList<String> petroleumupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petroleum);
        ListView listViewpetroleum = (ListView) findViewById(R.id.listpetroleum);


            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        petroleumupdatequestionlist.addAll(petroleumarrayquestionlist);
        petroleumupdateanswerlist.addAll(petroleumarrayanswerlist);


        adapterpetroleum = new ArrayAdapter<String>(this, R.layout.textfieldlist, petroleumupdatequestionlist);



        listViewpetroleum.setAdapter(adapterpetroleum);


        listViewpetroleum.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionpetroleum = petroleumupdatequestionlist.get(position);
                String datapetroleum = petroleumupdateanswerlist.get(position);
                Intent startpetroleum = new Intent(getApplicationContext(), petroleumdata.class);
                startpetroleum.putExtra("senddatapetroleum", datapetroleum);
                startpetroleum.putExtra("senddata1petroleum", questionpetroleum);

                startActivity(startpetroleum);


            }
        });


    }
    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_branch, menu);

        return true;
    }

    String userquestionpetroleum;
    String useranswerpetroleum;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_addquestions) {
            Toast.makeText(this, "Questions once added,will not delete", Toast.LENGTH_SHORT);
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Add question of Petroleum");

            // Set an EditText view to get user input
            final EditText petroleumquestion = new EditText(this);
            petroleumquestion.setHint("Question");
            final EditText petroleumanswer = new EditText(this);
            petroleumanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(petroleumquestion);
            layout.addView(petroleumanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionpetroleum = petroleumquestion.getEditableText().toString();
                    useranswerpetroleum = petroleumanswer.getEditableText().toString();


                    if (userquestionpetroleum.length() > 0) {
                        petroleumupdatequestionlist.add(userquestionpetroleum);

                        adapterpetroleum.notifyDataSetChanged();
                        Toast.makeText(petroleum.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencespetroleum(userquestionpetroleum);


                    }
                    if (useranswerpetroleum.length() <= 0 && userquestionpetroleum.length() != 0) {

                        useranswerpetroleum = " ";


                    }
                    if (useranswerpetroleum.length() > 0) {
                        petroleumupdateanswerlist.add(useranswerpetroleum);
                        adapterpetroleum.notifyDataSetChanged();
                        saveStringToPreferences1petroleum(useranswerpetroleum);


                    }


                }
            });

            alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                }
            });

            alert.show();


        }
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

    private SharedPreferences prefspetroleum;
    private String prefNamepetroleum = "myPhrasesStoragepetroleum";
    private static final String PHRASEpetroleum = "Phrase_petroleum";


    private void saveStringToPreferencespetroleum(String strpetroleum) {
        prefspetroleum = getSharedPreferences(prefNamepetroleum, MODE_PRIVATE);
        SharedPreferences.Editor editorpetroleum = prefspetroleum.edit();
        //increments index by 1
        editorpetroleum.putInt("phrase_countpetroleum", prefspetroleum.getInt("phrase_countpetroleum", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorpetroleum.putString(PHRASEpetroleum + (prefspetroleum.getInt("phrase_countpetroleum", 0) + 1), userquestionpetroleum);

        editorpetroleum.commit();
    }

    private SharedPreferences prefs1petroleum;
    private String prefName1petroleum = "myPhrasesStorage1petroleum";
    private static final String PHRASE1petroleum = "Phrase_1petroleum";

    private void saveStringToPreferences1petroleum(String str1petroleum) {
        prefs1petroleum = getSharedPreferences(prefName1petroleum, MODE_PRIVATE);
        SharedPreferences.Editor editor1petroleum = prefs1petroleum.edit();
        //increments index by 1
        editor1petroleum.putInt("phrase_count1petroleum", prefs1petroleum.getInt("phrase_count1petroleum", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1petroleum.putString(PHRASE1petroleum + (prefs1petroleum.getInt("phrase_count1petroleum", 0) + 1), useranswerpetroleum);

        editor1petroleum.commit();
    }

    public void onResume() {
        super.onResume();

        prefspetroleum = getSharedPreferences(prefNamepetroleum, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionpetroleum = new LinkedList<String>();
        int phraseCountpetroleum = prefspetroleum.getInt("phrase_countpetroleum", 0);

        for (int i = 1; i <= phraseCountpetroleum; i++) {
            phrasesCollectionpetroleum.add(prefspetroleum.getString(PHRASEpetroleum + i, "<< Enter a phrase >>"));
        }

        petroleumupdatequestionlist.addAll(phrasesCollectionpetroleum);
        adapterpetroleum.notifyDataSetChanged();



        prefs1petroleum = getSharedPreferences(prefName1petroleum, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1petroleum = new LinkedList<String>();
        int phraseCount1petroleum = prefs1petroleum.getInt("phrase_count1petroleum", 0);

        for (int j = 1; j <= phraseCount1petroleum; j++) {
            phrasesCollection1petroleum.add(prefs1petroleum.getString(PHRASE1petroleum + j, "<< Enter a phrase >>"));
        }

        petroleumupdateanswerlist.addAll(phrasesCollection1petroleum);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







