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

public class mechanical extends ActionBarActivity {



    String[] listArraymechanical = {
            "1. What is the difference between scavenging and supercharging ?",
            "2. What are the names given to constant temperature, constant pressure, constant volume, constant internal energy, constant enthalpy, and constant entropy processes.?",
            "3. In a Rankine cycle if maximum steam pressure is increased keeping steam temperature and condenser pressure same, what will happen to dryness fraction of steam after expansion ?",
            "4. Why entropy change for a reversible adiabatic process is zero ?",
            "5. What are two essential conditions of perfect gas ?",
            "6. Enthalpy and entropy are functions of one single parameter. Which is that ?",
            "7. Why rate of condensation is higher on a polished surface compared to rusty surface ?",
            "8. How much resistance is offered to heat flow by drop wise condensation ?",
            "9. What is the relationship between COP of heating and cooling ?",
            "10. How much is the work done in isochoric process ?",
            "11. When maximum discharge is obtained in nozzle ?",
            "12. Under what condition the work done in reciprocating compressor will be least ?",
            "13. What is the difference between stalling and surging in rotary compressions ?",
            "14. Why the electric motor of a fan with backward curved blades is never got overloaded under any condition ?",
            "15. Why the work per kg of air flow in axial flow compressor is less compared to centrifugal compressor for same pressure ratio ?",
            "16. What is the name given to portion of thermal energy to be necessarily rejected to environment ?",
            "17. What is pitting ? How it is caused ?",
            "18. What is caustic embrittlement ?",
            "19. Which impurities form hard scale and which impurities soft scale ?",
            "20. What is the difference between hard water and soft water ?",
            "21. Which two elements in feed water can cause corrosion of tubes and plates in boiler ? '",
            "22. What should be done to prevent a safety valve to stick to its seat ?",
            "23. Why large boilers are water tube type ?",
            "24. What type of boiler does not need a steam drum ?",
            "25. Why manholes in vessels are usually elliptical in shape ?",
            "26. Low water in boiler drum is unsafe because it may result in overheating of water tubes in furnace. Why it is unsafe to have high water condition in boiler drum ?",
            "27. Why boiler is purged everytime before starting firing of fuel ?",
            "28. What is the principle of mechanical refrigeration ?",
            "29. Why high latent heat of vaporisation is desirable in a refrigerant ?",
            "30. What is the critical temperature of a refrigerant ?",
            "31. Maximum combustion temperature in gas turbines is of the order of 1100 to 10°C whereas same is around 00°C in I.C. engine ? Why ?",
            "32. Why efficiency of gas turbines is lower compared to I.C. engines ?",
            "33. What do you understand by timed cylinder lubrication ?",
            "34. What is IIUCR in relation to petrol engine ?",
            "35.  In some engines glycerine is used in place of water for cooling of engine. Why ?",
            "36. Why consumption of lubricating oil is more in two-stroke cycle petrol engine than four-stroke cycle petrol engine ?",
            "37. As compression ratio increases, thermal n increases. How is thermal n affected by weak and rich mixture strength ?",
            "38. How engine design needs to be changed to burn lean mixture ?",
            "39. Horse power of I.C. engines can be expressed as RAC rating, SAE rating, or DIN rating. To which countries these standards belong ?",
            "40. What is the use of flash chamber in a vapour compression refrigeration cycle to improve the COP of refrigeration cycle ?",
            "41. Why pistons are usually dished at top ?",
            "42. What is the function of thermostat in cooling system of an engine ?",
            "43. What are the causes of failure of boiler tubes ?",
            "44. What are the causes of failure of superheater tubes ?",
            "45. Why supercritical boilers use less amount of steel compared to non-supercritical boilers ?",
            "46. Out of electric heater and heat pump, which is economical in operation ?",
            "47. Which furnace burns low-ash fusion coal and retains most of the coal ash in the slag?",
            "48. How the thickness of thermal boundary layer and thickness of hydrodynamic boundary layer related ?",
            "49. What is the effect of friction on flow of steam through a nozzle ?",
            "50. Why gas turbine power plant needs efficient compressor ?",
            "51. Why rockets using liquid hydrogen have higher specific impulse compared to liquid hydrocarbon ?",
            "52. Why axial flow compressor is preferred for gas turbines for aeroplanes ?",
            "53. What is the effect of inter cooling in gas turbines ?",
            "54. Why iso-octane is chosen as reference fuel for S.I. engines and allotted 100 value for its octane number ?",
            "55. Why thermal efficiency of I.C. engines is more than that of gas turbine plant ?",
            "56. Which are the reference fuels for knock rating of S.I. engines ?",
            "57. When effect of variations in specific heats is considered then how do maximum temperature and pressure vary compared to air standard cycle ?",
            "58. Quantities like pressure, temperature, density, viscosity, etc. are independent of mass. What are these called ?",
            "59. The amount of radiation emitted per scm per sec is called .... ?",
            "60. In convection heat transfer, if heat flux intensity is doubled then temperature\n" +
                     "difference between solid surface and fluid will ?\n",
            "61. How you can define coal ?",
            "62. Which pollutant is major greenhouse gas and what is its effect ?",
            "63. In order to increase efficiency and reduce CO emissions and other emissions, clear coal technologies are receiving major attention. What are these ?",
            "64. What are the important operational performance parameters in design of fuel firing equipment ?",
            "65. What is the differenc between total moisture and inherent moisture in coal ?",
            "66. Proximity analysis of coal provides data for a first, general assessment of a coal's quality and type. What elements it reports ?",
            "67. Ultimate analysis of coal is elementary analysis. What it is concerned with ?",
            "68. Explain the difference between AFBC, BFBC, PFBC and PCFB in regard to fluidised bed technologies.",
            "69. What for Schmidt plot for is used in heat transfer problems ?",
            "70. In which reactor the coolant and moderator are the same ?",
            "71. Which reactor has no moderator ?",
            "72. What are thermal neutrons ?",
            "73. What is big advantage of fast breeder reactor ?",
            "74. What is the purpose of biological shield in nuclear plants ?",
            "75. Which two elements have same percentage in proximate and ultimate analysis of coal?",
            "76. On which analysis is based the Dulong's formula for the heating value of fuel ?",
            "77. Which element causes difference in higher and lower heating values of fuel ?",
            "78. Which heating value is indicated by a calorimeter and why ?",
            "79. State the difference between ultimate and proximate analysis of coal ?",
            "80. What is fuel ratio ?",
            "81. How the analyses and calorific values of fuels can be reported ?",
            "82. What is the difference between nuclear fission and fission chain reaction.",
            "83. Explain difference between fissile and fertile materials.",
            "84. What do you understand by fuel cycle in nuclear plants ?",
            "85. What is heavy water and what is its use in nuclear plants ?",
            "86. What is a converter reactor ?",
            "87. Explain nuclear reactor in brief.",
            "88. What is the difference between conversion and enrichment ?",
            "89. Disposal of radioactive waste materials and spent fuel is a major and important technology. How the waste radioactive material is disposed off ?",
            "90. Which nuclear reactor uses water as a coolant, moderator and reflector ?",
            "91. Which reactor produces more fissionable material than it consumes ?",
            "92. Which reactor uses natural uranium as fuel ?",
            "93. Which reactor uses heavy water as moderator ?",
            "94. Which reactor requires no moderator ?",
            "95. Which reactor uses primary coolant as fluoride salts of lithium, beryllium, thorium and uranium ?",
            "96. Why an increase in area is required to produce an increase of velocity in case of supersonic flow ?",
            "97. Under what circumstances would there be an increase in pressure in a diver¬gent nozzle ?",
            "98. Why water can't be used as refrigerant for small refrigerating equipment ?",
            "99. Which parameter remains constant in a throttling process ?",
            "100. What is the difference between isentropic process and throttlinglprocess ?"
    };

    String[] datamechanical = {
            "Scavenging is process of flushing out burnt gases from engine cylinder by introducing fresh air in the cylinder before exhaust stroke ends. Supercharging is the process of supplying higher mass of air by compressing the atmospheric air.",
            "Isothermal, isochroic, isobaric, free expression, throttling and adiabatic processes respectively.",
            "It will decrease.",
            "Because there is no heat transfer in this process.",
            "It satisfies equation of state and its specific heats are constant.",
            "Temperature.",
            "Polished surface promotes drop wise condensation and does not wet the surface.",
            "Nil",
            "COP of heating is one(unity) more than COP of cooling.",
            "Zero.",
            " At the critical pressure ratio.",
            ": It is least when compression process approaches isothermal. For this purpose, attempts are made to cool the air during compression.",
            "Stalling is a local phenomenon and it occurs when How breaks away from the blades. Surging causes complete breakdown of flow and as such it affects the whole machine.",
            "The maximum power is consumed at about 70% of maximum flow in case'of fan with backward blades. For higher flow, power consumption gets lower.",
            "Isentropic efficiency of axial flow compressor is higher.",
            "Anergy.",
            "Non uniform corrosion over the entire metal surface, but occuring only in small pits is called pitting. It is caused by lack of uniformity in metal",
            ": It is the actual physical change in metal that makes it extremely brittle and filled with minute cracks. It occurs particularly in the seams of rivetted joints and around the rivet holes.",
            ": Sulphates and chlorides of lime and magnesium form hard scale, and carbonates of lime and magnesium form soft scale.",
            "Hard water contains excess of scale forming impurities and soft water contains very little or no scale forming substances.",
            ": Acid and oxygen in feed water lead to corrosion.",
            "Safety valve should be blown off periodically so that no corrosion can take place on valve and valve seat.",
            ": Water tube boilers raise steam fast because of large heat transfer area and positive water circulation. Thus they respond faster to fluctuations in demand. Further single tube failure does not lead to catastrophy.",
            "Super-critical pressure boiler.",
            "Elliptical shape has minimum area of opening and thus plate is weakened the least. Further it is very convenient to insert and take out the cover plate from elliptical opening.",
            "High drum level does not allow steam separation to be effective and some water can be carried over with steam which is not desirable for steam turbine.",
            ": Purging ensures that any unburnt fuel in furnace is removed, otherwise it may lead to explosion.",
            "A volatile liquid will boil under the proper conditions and in so doing will absorb heat from surrounding objects",
            ": A high latent heat of vaporisation of refrigerant results in small amount of refrigerant and thus lesser circulation system of refrigerant for same tonnage",
            "Critical temperature is the maximum temperature of a refrigerantrat which it can be condensed into liquid and beyond this it remains gas irrespective of pressure applied.",
            "High temperature in I.C. engine can be tolerated because it lasts for a fraction of second but gas turbines have to face it continuously which metals can't withstand.",
            "In gas turbines, 70% of the output of gas turbine is consumed by compressor. I.C. engines have much lower auxiliary consumption. Further combustion temperature of I.C. engines is much higher compared to gas turbine.",
            "For effective lubrication, lub oil needs to be injected between two piston rings when piston is at bottom of stroke so that piston rides in oi during upward movement. This way lot of lub oil can be saved and used properly.",
            "HUCR is highest useful compression ratio at which the fuel can be used in a specific test engine, under specified operating conditions, without knocking.",
            "Glycerine has boiling point of 90°C which increases its heat carrying capacity. Thus weight of coolant gets reduced and smaller riadiator can be used.",
            "In two-stroke engine lub oil is mixed with petrol and thus some lub oil is blown out through the exhaust valves by scavenging and charging air. There is no such wastage in four stroke petrol engine.",
            "Thermal n is high for weak mixture and it decreases as mixture strength becomes rich.",
            ": Engine to burn lean mixture uses high compression ratio and the highly turbulent move¬ment of the charge is produced by the geometry of the combustion chamber.",
            ": U.K., USA and Germany respectively.",
            ": When liquid refrigerant as obtained from condenser is throttled, there are some vapours. These vapours if carried through the evaporator will not contribute to refrigerating effect. Using a flash chamber at some intermediate pressure, the flash vapour at this pressure can be bled off and fed back to the compression process. The throttling process is then carried out in stages. Similarly compression process is also done in two separate compressor stages.",
            "Pistons are usually hollowed at top to (i) provide greater spa'e for combustion, (ii) increase surface for flue gases to act upon, and (iii) better distribution of stresses.",
            "Thermostat ensures optimum cooling because excessive cooling decreases the overall efficiency. It allows cooling water to go to radiator beyond a predetermined temperature.",
            "Boiler tubes, usually are made from carbon steel and are subject to (a) high rates of heat transfer,( b ). bending stresses due to uneven heating, especially at expanded or welded joints into headers or drums, © external erosion from burners and flue gas, (d) possible corrosion on the boiler side, and (e) occasional manufacturing defects.\n" +
                    "Failure may occur due to following reasons :\n" +
                    "(a) High thermal ratings may lead to rapid failure if the internal fluid flow is reduced for any reason. The resultant overheating leads to a failure by creep, characterised by the bulging of the tube with the eventual development of a longitudinal split.\n" +
                    "(b ) Fatigue cracking due to bending stresses occur. These are associated with change of section and/or weld undercut, where tubes are expanded or welded into headers.\n" +
                    "© Failure may arise due to overstressing of a reduced section of metal.\n" +
                    "(d) Sudden failure of the boiler tube due to corrosion arises from embrittlement of the carbon steel due to interaction between atomic hydrogen from the corrosion process and the iron carbide present in the steel.\n" +
                    "(e) Defects in tube manufacture, although far from being a regular occurrence, can be a cause of serious trouble. Lamination in boiler tubes or score marks arising from the cold drawing of tubes, give rise to premature failure and may promote corrosion at these regions.\n",
            "Superheater tubes are subjected to the most severe combination of stress, temperature and corrosive environment. In addition to high-temperature strength, resistance to corrosion is also important. For example, low-alloy ferritic steel such as -1/% Cr, 1% Mo would not be used at metal temperatures above 580°C because of inadequate resistance to corrosion and oxidation over a full service life of 100,000/150,000 hr.\n" +
                    "Failures in superheater tubes may arise from :\n" +
                    "(a) Prior fabrication history (b ) Faulty heat treatment\n" +
                    "© Consequences of welding (d) Overheating of the tube metal\n" +
                    "(e) Gas-side corrosion (f) Stress corrosion (austenitic steels).\n",
            ": Supercritical boilers do not head heavy drum for separation of steam from mixture of water and steam",
            "Heat pump.",
            "Cyclone furnace.",
            ": Ratio of their thickness = (Prandtl number)-1/3.",
            "To decrease both mass flow rate and wetness of steam.",
            "Because a large portion of turbine work is eaten away by compressor and its inefficiency will affect net power output and cost of generation.",
            "Liquid hydrogen has higher burning velocity.",
            "Because it has low frontal area.",
            "It decreases thermal efficiency but increases net output.",
            "Iso-octane permits highest compression without causing knocking.",
            "In I.C. engine maximum temperature attained is higher than in gas turbine.",
            "n-heptane and ISO-octane.",
            "Temperature increases and pressure decreases.",
            ": Intensive properties.",
            "Emissive power.",
            "Get doubled.",
            "Coal is a naturally occurring hydrocarbon that consists of the fossilised remains of buried plant debris that have undergone progressive physical and chemical alteration, called coalification, in the course of geologic time.",
            ": CO is major greenhouse gas and it traps the radiation of heat from the sun within earth's atmosphere.",
            "(i) Advanced pulverised and pressurised pulverised fuel combustion.\n" +
                    "(ii) Atmospheric fluidised bed combustion and pressurised fluidised bed combustion.\n" +
                    "(iii) Supercritical boilers.\n" +
                    "(iv) Integrated gasification combined cycle systems.\n" +
                    "(v) Advanced integrated gasification, including fuel cell systems.\n" +
                    "(vi) Magneto hydrodynamic electricity generation.\n",
            "Fuel flexibility, electrical load following capability, reliability, availability, and maintenance ease.",
            "The moisture content of the bulk as sampled is referred to as total moisture, and that of the air dried sample is called inherent moisture.",
            "Moisture, volatile matter, ash and fixed carbon.",
            ": Carbon, hydrogen, nitrogen, and sulphur in coal on a weight percentage basis.",
            "AFBC (Atmospheric fluidised bed combustion) process consists of forming a bed of inert materials like finely sized ash or ash mixed with sand, limestone (for sulphur removal), and solid fuel particles in a combustor and fluidising it by forcing combustion air up through the bed mixture. The gas flows thorugh bed without disturbing particles significantly but gas velocity is high enough to support the total weight of bed (fluidisation). At slightly higher velocity excess gas passes through the bed as bubbles (fluidised bed) and gives the bed the appearance of a boiling liquid.\n" +
                    "Bubbling fluidised bed combustion (BFBC) has a defined height of bed material and operates at or near atmospheric pressure in the furnace.\n" +
                    "Pressurised fluidised bed combustion (PFBC) system operates the bed at elevated pressure. Exhaust gases have sufficient energy to power a gas turbine, of course, gases need to be cleaned.\n" +
                    "In fluidised combustion, as ash is removed some unburned carbon is also removed resulting in lower efficiency. In circulating fluidised bed combustion (CFBC) system, bed is operated at higher pressure leading to high heat transfer, higher combustion efficiency, and better fuel feed. Circulating fluidised beds operate with relatively high gas velocities and fine particle sizes. The maintenance of steady state conditions in a fast fluidised bed requires the continuous recycle of particles removed by the gas stream (circulating bed). The term circulating bed is often used to include fluidised bed sys¬tems containing multiple conventional bubbling beds between which bed material is exchanged.\n",
            "Schmidt plot is a graphical method for determining the temperature at any point in a body at a specified time during the transient heating or cooling period.",
            "Pressurised water reactor.",
            ": Fast breeder reactor.",
            "Thermal neutrons are slow neutrons (having energy below 1 eV) which are in thermal equilibrium with their surroundings.",
            ": It has rapid self breeding of fissile fuel during the operation of the reactor, and thus, it offers about sixty times the output with same natural uranium resources through ordinary non-breeder nuclear reactor.",
            "Biological shield of heavy concrete prevents exposure to neutrons, beta rays and gamma rays which kill living things.",
            "Moisture and ash.",
            "On ultimate analysis.",
            "Hydrogen.",
            "Gross heating value because steam is condensed and heat of vapour formed is recovered.",
            "In ultimate analysis, chemical determination of following elements is made by weight: Fixed and combined carbon, H, O, N, S, water and ash. Heating value is due to C, H and S.\n" +
                    "In proximate analysis following constituents are mechanically determined by weight. Moisture, volatile matter, fixed carbon and ash. Heating value is due to fixed carbon and volatile matter.\n",
            ": Fuel ratio is the ratio of its % age of fixed carbon to volatile matter.",
            "It may be reported as\n" +
                    "(a) as received or fired (wet) basis\n" +
                    "(b ) dry or moisture free basis\n" +
                    "© combustible or ash and moisture free basis\n",
            "The process of splitting of nucleus into two almost equal fragments accompanied by re¬lease of heat is nuclear fission. Self sustained, continuing, sequence of fission reactions in a con¬trolled manner is fission chain reaction.",
            "The materials which can give nuclear fission e.g. U 35, Pu 39, U 33 are fissile materi¬als. Fertile material itself is not fissionable, but it can be converted to a fissionable material by irradiation of neutrons in a nuclear reactor.",
            "Fuel cycle a series of sequential steps involved in supplying fuel to a nuclear power reactor. The steps include : Mining, refining uranium, fabrication of fuel elements, their use in nuclear reactor, chemical processing to recover remaining fissionable material, re-enrichment of fuel from recovered material, refabrication of new fuel elements, waste storage etc.",
            "Water containing heavy isotopes of hydrogen (Deuterium) is known as heavy water. Heavy water is used as a moderator. Heavy water has low cross section for absorption of neutrons than ordinary water. Heavy water slows down the fast neutrons and thus moderates the chain reaction.",
            ": A reactor plant which is designed to produce more fuel than it consumes. The breeding is obtained by converting fertile material to fissile material.",
            "A plant which initiates, sustains, controls and maintains nuclear fission chain reaction and provides shielding against radioactive radiation is nuclear reactor.",
            "The process of converting the non fissile U 38 to fissile U-35 is also called \"Conversion\". The material like U 38 which can be converted to a fissile material by the neutron flux is called \"fertile material\". The conversion is obtained within the nuclear reactor during the chain reaction.\n" +
                    "Enrichment is the process by which the proportion of fissile uranium isotope (U-35) is increased above 0.7% (original % in natural uranium).\n" +
                    "The concentration of U-35 in the uranium hexafluoride is increased from the 0.7% in natural uranium to to 4%. This is called enrichment and is accomplished in an enrichment plant.\n",
            ": Nonusable fission products are radioactive and take short/medium/long time for radioactive decay to reach safe level of radioactivity. Accordingly three methods of disposal are :\n" +
                    "(a) Zero or low radioactivity material is dispersed or stored without elaborate shielding.\n" +
                    "(b ) Medium radioactivity material is stored for short duration of about 5 years to allow decay of radioactivity.\n" +
                    "© High radioactive material. They are stored in water for several months to permit radioactive decay to an accepetable low level.\n",
            "Pressurised water reactor.",
            "Breeder reactor.",
            ": Gas cooled reacator.",
            "CANDU.",
            "Breeder reactor.",
            ": Molten salt breeder reactor.",
            "Increase in area for increase in velocity for supersonic flow is required because the density decreases faster than velocity increases at supersonic speeds and to maintain continuity of mass, area must increase.",
            "For subsonic flow at inlet section of a diffuser a lower velocity and higher pressure will exist at the exit section. For supersonic isentropic flow at the inlet section a higher velocity and lower pressure will exist at the exit but if a shock wave occurs in the diffuser then a higher pressure will exist at the exit.",
            "The refrigerant should be such that vapour volume is low so that pumping work will be low. Water vapour volume is around 4000 times compared to R- for a given mass.",
            "Enthalpy.",
            "In isentropic process, heat transfer takes place and in throttling process, enthalpy before and after the process is same.",





           };

    List<String> mechanicalarrayquestionlist = Arrays.asList(listArraymechanical);
    ArrayList<String> mechanicalupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adaptermechanical;
    List<String> mechanicalarrayanswerlist = Arrays.asList(datamechanical);
    ArrayList<String> mechanicalupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);
        ListView listViewmechanical = (ListView) findViewById(R.id.listmechanical);



            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mechanicalupdatequestionlist.addAll(mechanicalarrayquestionlist);
        mechanicalupdateanswerlist.addAll(mechanicalarrayanswerlist);


        adaptermechanical = new ArrayAdapter<String>(this, R.layout.textfieldlist, mechanicalupdatequestionlist);



        listViewmechanical.setAdapter(adaptermechanical);


        listViewmechanical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionmechanical = mechanicalupdatequestionlist.get(position);
                String datamechanical = mechanicalupdateanswerlist.get(position);
                Intent startmechanical = new Intent(getApplicationContext(), mechanicaldata.class);
                startmechanical.putExtra("senddatamechanical", datamechanical);
                startmechanical.putExtra("senddata1mechanical", questionmechanical);

                startActivity(startmechanical);


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

    String userquestionmechanical;
    String useranswermechanical;

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
                alert.setTitle("Add question of Mechanical");

            // Set an EditText view to get user input
            final EditText mechanicalquestion = new EditText(this);
            mechanicalquestion.setHint("Question");
            final EditText mechanicalanswer = new EditText(this);
            mechanicalanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(mechanicalquestion);
            layout.addView(mechanicalanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionmechanical = mechanicalquestion.getEditableText().toString();
                    useranswermechanical = mechanicalanswer.getEditableText().toString();


                    if (userquestionmechanical.length() > 0) {
                        mechanicalupdatequestionlist.add(userquestionmechanical);

                        adaptermechanical.notifyDataSetChanged();
                        Toast.makeText(mechanical.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencesmechanical(userquestionmechanical);


                    }
                    if (useranswermechanical.length() <= 0 && userquestionmechanical.length() != 0) {

                        useranswermechanical = " ";


                    }
                    if (useranswermechanical.length() > 0) {
                        mechanicalupdateanswerlist.add(useranswermechanical);
                        adaptermechanical.notifyDataSetChanged();
                        saveStringToPreferences1mechanical(useranswermechanical);


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

    private SharedPreferences prefsmechanical;
    private String prefNamemechanical = "myPhrasesStoragemechanical";
    private static final String PHRASEmechanical = "Phrase_mechanical";


    private void saveStringToPreferencesmechanical(String strmechanical) {
        prefsmechanical = getSharedPreferences(prefNamemechanical, MODE_PRIVATE);
        SharedPreferences.Editor editormechanical = prefsmechanical.edit();
        //increments index by 1
        editormechanical.putInt("phrase_countmechanical", prefsmechanical.getInt("phrase_countmechanical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editormechanical.putString(PHRASEmechanical + (prefsmechanical.getInt("phrase_countmechanical", 0) + 1), userquestionmechanical);

        editormechanical.commit();
    }

    private SharedPreferences prefs1mechanical;
    private String prefName1mechanical = "myPhrasesStorage1mechanical";
    private static final String PHRASE1mechanical = "Phrase_1mechanical";

    private void saveStringToPreferences1mechanical(String str1mechanical) {
        prefs1mechanical = getSharedPreferences(prefName1mechanical, MODE_PRIVATE);
        SharedPreferences.Editor editor1mechanical = prefs1mechanical.edit();
        //increments index by 1
        editor1mechanical.putInt("phrase_count1mechanical", prefs1mechanical.getInt("phrase_count1mechanical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1mechanical.putString(PHRASE1mechanical + (prefs1mechanical.getInt("phrase_count1mechanical", 0) + 1), useranswermechanical);

        editor1mechanical.commit();
    }

    public void onResume() {
        super.onResume();

        prefsmechanical = getSharedPreferences(prefNamemechanical, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionmechanical = new LinkedList<String>();
        int phraseCountmechanical = prefsmechanical.getInt("phrase_countmechanical", 0);

        for (int i = 1; i <= phraseCountmechanical; i++) {
            phrasesCollectionmechanical.add(prefsmechanical.getString(PHRASEmechanical + i, "<< Enter a phrase >>"));
        }

        mechanicalupdatequestionlist.addAll(phrasesCollectionmechanical);
        adaptermechanical.notifyDataSetChanged();



        prefs1mechanical = getSharedPreferences(prefName1mechanical, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1mechanical = new LinkedList<String>();
        int phraseCount1mechanical = prefs1mechanical.getInt("phrase_count1mechanical", 0);

        for (int j = 1; j <= phraseCount1mechanical; j++) {
            phrasesCollection1mechanical.add(prefs1mechanical.getString(PHRASE1mechanical + j, "<< Enter a phrase >>"));
        }

        mechanicalupdateanswerlist.addAll(phrasesCollection1mechanical);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







