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

public class electrical extends ActionBarActivity {



    String[] listArrayelectrical = {
            "1. Why star delta starter is preferred with induction motor?",
            "2. State the difference between generator and alternator?",
            "3. Why AC systems are preferred over DC systems?",
            "4. How can you relate power engineering with electrical engineering?",
            "5. What are the various kind of cables used for transmission?",
            "6. Why back emf used for a dc motor? highlight its significance?",
            "7. What is slip in an induction motor?",
            "8. Explain the application of storage batteries?",
            "9. Explain advantages of storage batteries?",
            "10. What are the different methods for the starting of a synchronous motor?",
            "11. Name the types of motors used in vacuum cleaners, phonographic appliances, vending machines, refrigerators, rolling mills, lathes, power factor improvement and cranes?",
            "12. State Thevenin’s Theorem?",
            "13. State Norton’s Theorem?",
            "14. State Maximum power transfer theorem?",
            "15. Explain different losses in a transformer?",
            "16. Explain different types of D.C motors? Give their applications",
            "17. Explain the process of commutation in a dc machine. Explain what are inter-poles and why they are required in a dc machine.",
            "18. Comment on the working principle of operation of a single-phase transformer?",
            "19. Define the following terms:-\n" +
                    "• Reliability,\n" +
                    "• Maximum demand,\n" +
                    "• Reserve-generating capacity, \n" +
                    "• Availability (operational).\n",
            "20. Mention the disadvantages of low power factor? How can it be improved?",
            "21. State the methods of improving power factor?",
            "22. State the factors, for the choice of electrical system for an aero turbine?",
            "23. What are the advantages of VSCF wind electrical system?",
            "24. Explain the terms real power, apparent power and reactive power for ac circuits and also the units used?",
            "25. Define the following: Average demand, Maximum demand, Demand factor, Load factor?",
            "26. Explain forward resistance, static resistance and dynamic resistance of a pn junction diode?",
            "27. How does Zener phenomenon differ from Avalanche breakdown?",
            "28. Compare JFET’s and MOSFET’s?",
            "29. Explain thin film resistors and wire-wound resistors?",
            "30. What is a differential amplifier? Also, explain CMRR?",



    };

    String[] dataelectrical = {

            "Star delta starter is preferred with induction motor due to following reasons:\n" +
                    "• Starting current is reduced 3-4 times of the direct current due to which voltage drops and hence it causes less losses.\n" +
                    "• Star delta starter circuit comes in circuit first during starting of motor, which reduces voltage 3 times, that is why current also reduces up to 3 times and hence less motor burning is caused.\n" +
                    "• In addition, starting torque is increased and it prevents the damage of motor winding.\n",
            "Generator and alternator are two devices, which converts mechanical energy into electrical energy. Both have the same principle of electromagnetic induction, the only difference is that their construction. Generator persists stationary magnetic field and rotating conductor which rolls on the armature with slip rings and brushes riding against each other, hence it converts the induced emf into dc current for external load whereas an alternator has a stationary armature and rotating magnetic field for high voltages but for low voltage output rotating armature and stationary magnetic field is used.",
            "Due to following reasons, AC systems are preferred over DC systems:\n" +
                    "a. It is easy to maintain and change the voltage of AC electricity for transmission and distribution.\n" +
                    "b. Plant cost for AC transmission (circuit breakers, transformers etc) is much lower than the equivalent DC transmission\n" +
                    "c. From power stations, AC is produced so it is better to use AC then DC instead of converting it.\n" +
                    "d. When a large fault occurs in a network, it is easier to interrupt in an AC system, as the sine wave current will naturally tend to zero at some point making the current easier to interrupt.\n",
            "Power engineering is a sub division of electrical engineering. It deals with generation, transmission and distribution of energy in electrical form. Design of all power equipments also comes under power engineering. Power engineers may work on the design and maintenance of the power grid i.e. called on grid systems and they might work on off grid systems that are not connected to the system.",
            "Cables, which are used for transmitting power, can be categorized in three forms:\n" +
                    "• Low-tension cables, which can transmit voltage upto 1000 volts.\n" +
                    "• High-tension cables can transmit voltage upto 23000 volts.\n" +
                    "• Super tension cables can transmit voltage 66 kV to 132 kV.\n",
            "The induced emf developed when the rotating conductors of the armature between the poles of magnet, in a DC motor, cut the magnetic flux, opposes the current flowing through the conductor, when the armature rotates, is called back emf. Its value depends upon the speed of rotation of the armature conductors. In starting, the value of back emf is zero.",
            "Slip can be defined as the difference between the flux speed (Ns) and the rotor speed (N). Speed of the rotor of an induction motor is always less than its synchronous speed. It is usually expressed as a percentage of synchronous speed (Ns) and represented by the symbol ‘S’.",
            "Storage batteries are used for various purposes, some of the applications are mentioned below:\n" +
                    "• For the operation of protective devices and for emergency lighting at generating stations and substations.\n" +
                    "• For starting, ignition and lighting of automobiles, aircrafts etc.\n" +
                    "• For lighting on steam and diesel railways trains.\n" +
                    "• As a supply power source in telephone exchange, laboratories and broad casting stations.\n" +
                    "• For emergency lighting at hospitals, banks, rural areas where electricity supplies are not possible.\n",
            "Few advantages of storage batteries are mentioned below:\n" +
                    "• Most efficient form of storing energy portably.\n" +
                    "• Stored energy is available immediately because there is no lag of time for delivering the stored energy.\n" +
                    "• Reliable source for supply of energy.\n" +
                    "• The energy can be drawn at a fairly constant rate.\n",
            "Starting methods: Synchronous motor can be started by the following two methods:\n" +
                    "• By means of an auxiliary motor: The rotor of a synchronous motor is rotated by auxiliary motor. Then rotor poles are excited due to which the rotor field is locked with the stator-revolving field and continuous rotation is obtained.\n" +
                    "• By providing damper winding: Here, bar conductors are embedded in the outer periphery of the rotor poles and are short-circuited with the short-circuiting rings at both sides. The machine is started as a squirrel cage induction motor first. When it picks up speed, excitation is given to the rotor and the rotor starts rotating continuously as the rotor field is locked with stator revolving field.\n",
            "Following motors are used: -\n" +
                    "• Vacuum cleaners- Universal motor.\n" +
                    "• Phonographic appliances – Hysteresis motor.\n" +
                    "• Vending machines – Shaded pole motor.\n" +
                    "• Refrigerators – Capacitor split phase motors.\n" +
                    "• Rolling mills – Cumulative motors.\n" +
                    "• Lathes – DC shunt motors.\n" +
                    "• Power factor improvement – Synchronous motors.\n",
            "According to thevenin’s theorem, the current flowing through a load resistance \n" +
                    "Connected across any two terminals of a linear active bilateral network is the ratio open circuit voltage (i.e. the voltage across the two terminals when RL is removed) and sum of load resistance and internal resistance of the network. It is given by Voc / (Ri + RL).\n",
            "The Norton’s theorem explains the fact that there are two terminals and they are as follows:\n" +
                    "• One is terminal active network containing voltage sources \n" +
                    "• Another is the resistance that is viewed from the output terminals. The output terminals are equivalent to the constant source of current and it allows giving the parallel resistance. \n" +
                    "The Norton’s theorem also explains about the constant current that is equal to the current of the short circuit placed across the terminals. The parallel resistance of the network can be viewed from the open circuit terminals when all the voltage and current sources are removed and replaced by the internal resistance.\n",
            "The Maximum power transfer theorem explains about the load that a resistance will extract from the network. This includes the maximum power from the network and in this case the load resistance is being is equal to the resistance of the network and it also allows the resistance to be equal to the resistance of the network. This resistance can be viewed by the output terminals and the energy sources can be removed by leaving the internal resistance behind.",
            "There are two types of losses occurring in transformer:\n" +
                    "• Constant losses or Iron losses: The losses that occur in the core are known as core losses or iron losses. Two types of iron losses are:\n" +
                    "o eddy current loss \n" +
                    "o Hysteresis loss. \n" +
                    "These losses depend upon the supply voltage, frequency, core material and its construction. As long as supply voltage and frequency is constant, these losses remain the same whether the transformer is loaded or not. These are also known as constant losses.\n" +
                    "• Variable losses or copper losses: when the transformer is loaded, current flows in primary and secondary windings, there is loss of electrical energy due to the resistance of the primary winding, and secondary winding and they are called variable losses. These losses depend upon the loading conditions of the transformers. Therefore, these losses are also called as variable losses.\n",
            "Different type of DC motors and their applications are as follows:-\n" +
                    "• Shunt motors: It has a constant speed though its starting torque is not very high. Therefore, it is suitable for constant speed drive, where high starting torque is not required such as pumps, blowers, fan, lathe machines, tools, belt or chain conveyor etc.\n" +
                    "• Service motors: It has high starting torque & its speed is inversely proportional to the loading conditions i.e. when lightly loaded, the speed is high and when heavily loaded, it is low. Therefore, motor is used in lifts, cranes, traction work, coal loader and coal cutter in coalmines etc.\n" +
                    "• Compound motors: It also has high starting torque and variable speed. Its advantage is, it can run at NIL loads without any danger. This motor will therefore find its application in loads having high inertia load or requiring high intermittent torque such as elevators, conveyor, rolling mill, planes, presses, shears and punches, coal cutter and winding machines etc.\n",
            "Commutation: It is phenomenon when an armature coil moves under the influence of one pole- pair; it carries constant current in one direction. As the coil moves into the influence of the next pole- pair, the current in it must reverse. This reversal of current in a coil is called commutation. Several coils undergo commutation simultaneously. The reversal of current is opposed by the static coil emf and therefore must be aided in some fashion for smooth current reversal, which otherwise would result in sparking at the brushes. The aiding emf is dynamically induced into the coils undergoing commutation by means of compoles or interpoles, which are series excited by the armature current. These are located in the interpolar region of the main poles and therefore influence the armature coils only when these undergo commutation.",
            "Working principle of operation of a single-phase transformer can be explained as\n" +
                    "An AC supply passes through the primary winding, a current will start flowing in the primary winding. As a result, the flux is set. This flux is linked with primary and secondary windings. Hence, voltage is induced in both the windings. Now, when the load is connected to the secondary side, the current will start flowing in the load in the secondary winding, resulting in the flow of additional current in the secondary winding. Hence, according to Faraday’s laws of electromagnetic induction, emf will be induced in both the windings. The voltage induced in the primary winding is due to its self inductance and known as self induced emf and according to Lenze’s law it will oppose the cause i.e. supply voltage hence called as back emf. The voltage induced in secondary coil is known as mutually induced voltage. Hence, transformer works on the principle of electromagnetic induction.\n",
            "Reliability: It is the capacity of the power system to serve all power demands without failure over long periods.\n" +
                    "Maximum Demand: It is maximum load demand required in a power station during a given period.\n" +
                    "Reserve generating capacity: Extra generation capacity installed to meet the need of scheduled downtimes for preventive maintenance is called reserve-generating capacity.\n Availability: As the percentage of the time a unit is available to produce power whether needed by the system or not.",
            "Disadvantages of low power factor:\n" +
                    "• Line losses are 1.57 times unity power factor.\n" +
                    "• Larger generators and transformers are required.\n" +
                    "• Low lagging power factor causes a large voltage drop, hence extra regulation equipment is required to keep voltage drop within prescribed limits.\n" +
                    "• Greater conductor size: To transmit or distribute a fixed amount of power at fixed voltage, the conductors will have to carry more current at low power factor. This requires a large conductor size.\n",
            "Methods of improving power factor:\n" +
                    "• By connecting static capacitors in parallel with the load operating at lagging power factor. \n" +
                    "• A synchronous motor takes a leading current when over excited and therefore behaves like a capacitor.\n" +
                    "• By using phase advancers to improve the power factor of induction motors. It provides exciting ampere turns to the rotor circuit of the motor. By providing more ampere-turns than required, the induction motor can be made to operate on leading power factor like an overexcited synchronous motor.\n",
            "The choice of electrical system for an aero turbine is guided by three factors:\n" +
                    "• Type of electrical output: dc, variable- frequency ac, and constant- frequency ac.\n" +
                    "• Aero turbine rotational speed: constant speed with variable blade pitch, nearly constant speed with simpler pitch- changing mechanism or variable speed with fixed pitch blades.\n" +
                    "• Utilization of electrical energy output: in conjunction with battery or other form of storage, or interconnection with power grid.\n",
            "Advantages of VSCF wind electrical system are:\n" +
                    "• No complex pitch changing mechanism is needed.\n" +
                    "• Aero turbine always operates at maximum efficiency point.\n" +
                    "• Extra energy in the high wind speed region of the speed – duration curve can be extracted\n" +
                    "• Significant reduction in aerodynamic stresses, which are associated with constant – speed operation.\n",
            "• Real Power: It is the product of voltage, current and power factor i.e. P = V I cos j and basic unit of real power is watt. i.e. Expressed as W or kW.\n" +
                    "• Apparent power: It is the product of voltage and current. Apparent power = V I and basic unit of apparent power is volt- ampere. Expressed as VA or KVA.\n" +
                    "• Reactive Power: It is the product of voltage, current and sine of angle between the voltage and current i.e. Reactive power = voltage X current X sinj or Reactive power = V I sin j and has no other unit but expressed in VAR or KVAR.\n",
            "• Average Demand: the average power requirement during some specified period of time of considerable duration is called the average demand of installation.\n" +
                    "• Maximum Demand: The maximum demand of an installation is defined as the greatest of all the demand, which have occurred during a given period. It is measured accordingly to specifications, over a prescribed time interval during a certain period.\n" +
                    "• Demand Factor: It is defined as the ratio of actual maximum demand made by the load to the rating of the connected load.\n" +
                    "• Load Factor: It is defined as the ratio of the average power to the maximum demand.\n",
            "• Forward Resistance: Resistance offered in a diode circuit, when it is forward biased, is called forward-resistance. \n" +
                    "• DC or Static Resistance: DC resistance can be explained as the ratio of the dc-voltage across the diode to the direct current flowing through it. \n" +
                    "• AC or Dynamic Resistance: It can be defined as the reciprocal of the slope of the forward characteristic of the diode. It is the resistance offered by a diode to the changing forward current.\n",
            "The phenomenon when the depletion region expands and the potential barrier increases leading to a very high electric field across the junction, due to which suddenly the reverse current increases under a very high reverse voltage is called Zener effect. Zener-breakdown or Avalanche breakdown may occur independently or both of these may occur simultaneously. Diode junctions that breakdown below 5v are caused by Zener Effect. Junctions that experience breakdown above 5v are caused by avalanche-effect. The Zener-breakdown occurs in heavily doped junctions, which produce narrow depletion layers. The avalanche breakdown occurs in lightly doped junctions, which produce wide depletion layers.",
            "Comparison of JFET’s and MOSFET’s:\n" +
                    "• JFET’s can only be operated in the depletion mode whereas MOSFET’s can be operated in either depletion or in enhancement mode. In a JFET, if the gate is forward-biased, excess-carrier injunction occurs and the gate-current is substantial.\n" +
                    "• MOSFET’s have input impedance much higher than that of JFET’s. Thus is due to negligible small leakage current.\n" +
                    "• JFET’s have characteristic curves more flat than that of MOSFET is indicating a higher drain resistance.\n" +
                    "• When JFET is operated with a reverse-bias on the junction, the gate-current IG is larger than it would be in a comparable MOSFET.\n",
            "a. Thin film resistors- It is constructed as a thin film of resistive material is deposited on an insulating substrate. Desired results are obtained by either trimming the layer thickness or by cutting helical grooves of suitable pitch along its length. During this process, the value of the resistance is monitored closely and cutting of grooves is stopped as soon as the desired value of resistance is obtained.\n" +
                    "b. Wire wound resistors – length of wire wound around an insulating cylindrical core are known as wire wound resistors. These wires are made of materials such as Constantan and Manganin because of their high resistivity, and low temperature coefficients. The complete wire wound resistor is coated with an insulating material such as baked enamel\n",
            "Differential Amplifier: The amplifier, which is used to amplify the voltage difference between two input-lines neither of which is grounded, is called differential amplifier. This reduces the amount of noise injected into the amplifier, because any noise appearing simultaneously on both the input-terminals as the amplifying circuitry rejects it being a common mode signal.\n" +
                    "CMRR: It can be defined as the ratio of differential voltage-gain to common made voltage gain. If a differential amplifier is perfect, CMRR would be infinite because in that case common mode voltage gain would be zero.\n",


    };

    List<String> electricalarrayquestionlist = Arrays.asList(listArrayelectrical);
    ArrayList<String> electricalupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapterelectrical;
    List<String> electricalarrayanswerlist = Arrays.asList(dataelectrical);
    ArrayList<String> electricalupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);
        ListView listViewelectrical= (ListView) findViewById(R.id.listelectrical);



            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        electricalupdatequestionlist.addAll(electricalarrayquestionlist);
        electricalupdateanswerlist.addAll(electricalarrayanswerlist);


        adapterelectrical = new ArrayAdapter<String>(this, R.layout.textfieldlist, electricalupdatequestionlist);



        listViewelectrical.setAdapter(adapterelectrical);


        listViewelectrical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionelectrical = electricalupdatequestionlist.get(position);
                String dataelectrical = electricalupdateanswerlist.get(position);
                Intent startelectrical = new Intent(getApplicationContext(), electricaldata.class);
                startelectrical.putExtra("senddataelectrical", dataelectrical);
                startelectrical.putExtra("senddata1electrical", questionelectrical);

                startActivity(startelectrical);


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

    String userquestionelectrical;
    String useranswerelectrical;

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
            alert.setTitle("Add question of Electrical");

            // Set an EditText view to get user input
            final EditText electricalquestion = new EditText(this);
            electricalquestion.setHint("Question");
            final EditText electricalanswer = new EditText(this);
            electricalanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(electricalquestion);
            layout.addView(electricalanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionelectrical = electricalquestion.getEditableText().toString();
                    useranswerelectrical = electricalanswer.getEditableText().toString();


                    if (userquestionelectrical.length() > 0) {
                        electricalupdatequestionlist.add(userquestionelectrical);

                        adapterelectrical.notifyDataSetChanged();
                        Toast.makeText(electrical.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferenceselectrical(userquestionelectrical);


                    }
                    if (useranswerelectrical.length() <= 0 && userquestionelectrical.length() != 0) {

                        useranswerelectrical = " ";


                    }
                    if (useranswerelectrical.length() > 0) {
                        electricalupdateanswerlist.add(useranswerelectrical);
                        adapterelectrical.notifyDataSetChanged();
                        saveStringToPreferences1electrical(useranswerelectrical);


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

    private SharedPreferences prefselectrical;
    private String prefNameelectrical = "myPhrasesStorageelectrical";
    private static final String PHRASEelectrical = "Phrase_electrical";


    private void saveStringToPreferenceselectrical(String strelectrical) {
        prefselectrical = getSharedPreferences(prefNameelectrical, MODE_PRIVATE);
        SharedPreferences.Editor editorelectrical = prefselectrical.edit();
        //increments index by 1
        editorelectrical.putInt("phrase_countelectrical", prefselectrical.getInt("phrase_countelectrical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorelectrical.putString(PHRASEelectrical + (prefselectrical.getInt("phrase_countelectrical", 0) + 1), userquestionelectrical);

        editorelectrical.commit();
    }

    private SharedPreferences prefs1electrical;
    private String prefName1electrical = "myPhrasesStorage1electrical";
    private static final String PHRASE1electrical = "Phrase_1electrical";

    private void saveStringToPreferences1electrical(String str1electrical) {
        prefs1electrical = getSharedPreferences(prefName1electrical, MODE_PRIVATE);
        SharedPreferences.Editor editor1electrical = prefs1electrical.edit();
        //increments index by 1
        editor1electrical.putInt("phrase_count1electrical", prefs1electrical.getInt("phrase_count1electrical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1electrical.putString(PHRASE1electrical + (prefs1electrical.getInt("phrase_count1electrical", 0) + 1), useranswerelectrical);

        editor1electrical.commit();
    }

    public void onResume() {
        super.onResume();

        prefselectrical = getSharedPreferences(prefNameelectrical, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionelectrical = new LinkedList<String>();
        int phraseCountelectrical = prefselectrical.getInt("phrase_countelectrical", 0);

        for (int i = 1; i <= phraseCountelectrical; i++) {
            phrasesCollectionelectrical.add(prefselectrical.getString(PHRASEelectrical + i, "<< Enter a phrase >>"));
        }

        electricalupdatequestionlist.addAll(phrasesCollectionelectrical);
        adapterelectrical.notifyDataSetChanged();



        prefs1electrical = getSharedPreferences(prefName1electrical, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1electrical = new LinkedList<String>();
        int phraseCount1electrical = prefs1electrical.getInt("phrase_count1electrical", 0);

        for (int j = 1; j <= phraseCount1electrical; j++) {
            phrasesCollection1electrical.add(prefs1electrical.getString(PHRASE1electrical + j, "<< Enter a phrase >>"));
        }

        electricalupdateanswerlist.addAll(phrasesCollection1electrical);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







