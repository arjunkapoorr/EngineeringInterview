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

public class ec extends ActionBarActivity {



    String[] listArrayec = {
            "1. What is Electronic?",
            "2. What is communication?",
            "3. Different types of communications? Explain.",
            "4. What is sampling?",
            "5. State sampling theorem.",
            "6. What is cut-off frequency?",
            "7. What is pass band?",
            "8. What is stop band?",
            "9. Explain RF?",
            "10. What is modulation? And where it is utilized?",
            "11. What is demodulation?",
            "12. Name the modulation techniques.",
            "13. Explain AM and FM.",
            "14. Where do we use AM and FM?",
            "15. What is a base station?",
            "16. How many satellites are required to cover the earth?",
            "17. What is a repeater?",
            "18. What is an Amplifier?",
            "19. Example for negative feedback and positive feedback?",
            "20. What is Oscillator?",
            "21. What is an Integrated Circuit?",
            "22. What is crosstalk?",
            "23. What is resistor?",
            "24. What is inductor?",
            "25. What is conductor?",
            "26. What is a semi conductor?",
            "27. What is diode?",
            "28. What is transistor?",
            "29. What is op-amp?",
            "30. What is a feedback?",
            "31. Advantages of negative feedback over positive feedback.",
            "32. What is Barkhausen criteria?",
            "33. What is CDMA, TDMA, FDMA?",
            "34. explain different types of feedback",
            "35. What are the main divisions of power system?",
            "36. What is Instrumentation Amplifier (IA) and what are all the advantages?",
            "37. What is meant by impedance diagram? ",
            "38. What is the need for load flow study?",
            "39. What is the need for base values? ",
            "40. What are different categories of antenna and give an example of each?",
            "41. What is handover and what are its types?",
            "42. What is ionospheric bending?",
            "43. What is CDMA?",
            "44. Explain the concept of frequency re-use.",
            "45. Explain Bluetooth.",
            "46. What are GPRS services?",
            "47. What are the advantages of CDMA?",
            "48. What are the advantages of spread spectrum?",
            "49. Explain the steps involved in demodulating a signal.",
            "50. How can a Pseudo Random Noise COde be usable?",
            "51. What are the drawbacks of walsh codes?",
            "52. Explain radio environment in building.",
            "53.  List some advantages of GSM.",
            "54. What are the various types of numbers for network identity?",
            "55. What are the functions of Base Station System ( BSS)?",
            "56. What are the parts of Network Management System ( NMS )?",
            "57. What are applications of DSP?",
            "58. What is analog-to-digital conversion of signals?",
            "59. What are the properties of ROC for z-Transform?",
            "60. what is interrupt? "





    };

    String[] dataec = {
            "The study and use of electrical devices that operate by controlling the flow of electrons or other electrically charged particles.",
            "Communication means transferring a signal from the transmitter which passes through a medium then the output is obtained at the receiver. (or)communication says as transferring of message from one place to another place called communication.",
            "Analog and digital communication.\n" +
                    "As a technology, analog is the process of taking an audio or video signal (the human voice) and translating it into electronic pulses. Digital on the other hand is breaking the signal into a binary format where the audio or video data is represented by a series of \"1\"s and \"0\"s.\n" +
                    "Digital signals are immune to noise, quality of transmission and reception is good, components used in digital communication can be produced with high precision and power consumption is also very less when compared with analog signals.\n",
            "The process of obtaining a set of samples from a continuous function of time x(t) is referred to as sampling.",
            "It states that, while taking the samples of a continuous signal, it has to be taken care that the sampling rate is equal to or greater than twice the cut off frequency and the minimum sampling rate is known as the Nyquist rate.\n" +
                    "\n",
            "The frequency at which the response is -3dB with respect to the maximum response.",
            "Passband is the range of frequencies or wavelengths that can pass through a filter without being attenuated.",
            "A stopband is a band of frequencies, between specified limits, in which a circuit, such as a filter or telephone circuit, does not let signals through, or the attenuation is above the required stopband attenuation level.",
            "Radio frequency (RF) is a frequency or rate of oscillation within the range of about 3 Hz to 300 GHz. This range corresponds to frequency of alternating current electrical signals used to produce and detect radio waves. Since most of this range is beyond the vibration rate that most mechanical systems can respond to, RF usually refers to oscillations in electrical circuits or electromagnetic radiation.",
            "Modulation is the process of varying some characteristic of a periodic wave with an external signals.\n" +
                    "Radio communication superimposes this information bearing signal onto a carrier signal.\n" +
                    "These high frequency carrier signals can be transmitted over the air easily and are capable of travelling long distances.\n" +
                    "The characteristics (amplitude, frequency, or phase) of the carrier signal are varied in accordance with the information bearing signal.\n" +
                    "Modulation is utilized to send an information bearing signal over long distances.\n",
            "Demodulation is the act of removing the modulation from an analog signal to get the original baseband signal back. Demodulating is necessary because the receiver system receives a modulated signal with specific characteristics and it needs to turn it to base-band.",
            "For Analog modulation--AM, SSB, FM, PM and SM\n" +
                    "Digital modulation--OOK, FSK, ASK, Psk, QAM, MSK, CPM, PPM, TCM, OFDM\n",
            "AM-Amplitude modulation is a type of modulation where the amplitude of the carrier signal is varied in accordance with the information bearing signal.\n" +
                    "FM-Frequency modulation is a type of modulation where the frequency of the carrier signal is varied in accordance with the information bearing signal.\n",
            "AM is used for video signals for example TV. Ranges from 535 to 1705 kHz.\n" +
                    "FM is used for audio signals for example Radio. Ranges from 88 to 108 MHz.\n",
            "Base station is a radio receiver/transmitter that serves as the hub of the local wireless network, and may also be the gateway between a wired network and the wireless network.\n" +
                    "\n",
            "3 satellites are required to cover the entire earth, which is placed at 120 degree to each other. The life span of the satellite is about 15 years.",
            "A repeater is an electronic device that receives a signal and retransmits it at a higher level and/or higher power, or onto the other side of an obstruction, so that the signal can cover longer distances without degradation.\n" +
                    " \n",
            "An electronic device or electrical circuit that is used to boost (amplify) the power, voltage or current of an applied signal.",
            "Example for –ve feedback is ---Amplifiers And for +ve feedback is – Oscillators",
            "An oscillator is a circuit that creates a waveform output from a direct current input. The two main types of oscillator are harmonic and relaxation. The harmonic oscillators have smooth curved waveforms, while relaxation oscillators have waveforms with sharp changes.",
            "An integrated circuit (IC), also called a microchip, is an electronic circuit etched onto a silicon chip. Their main advantages are low cost, low power, high performance, and very small size.",
            "Crosstalk is a form of interference caused by signals in nearby conductors. The most common example is hearing an unwanted conversation on the telephone. Crosstalk can also occur in radios, televisions, networking equipment, and even electric guitars.",
            "A resistor is a two-terminal electronic component that opposes an electric current by producing a voltage drop between its terminals in proportion to the current, that is, in accordance with Ohm's law:\n" +
                    "V = IR.\n",
            "An inductor is a passive electrical device employed in electrical circuits for its property of inductance. An inductor can take many forms.",
            "A substance, body, or device that readily conducts heat, electricity, sound, etc. Copper is a good conductor of electricity.",
            "A semiconductor is a solid material that has electrical conductivity in between that of a conductor and that of an insulator(An Insulator is a material that resists the flow of electric current. It is an object intended to support or separate electrical conductors without passing current through itself); it can vary over that wide range either permanently or dynamically.",
            "In electronics, a diode is a two-terminal device. Diodes have two active electrodes between which the signal of interest may flow, and most are used for their unidirectional current property.",
            "In electronics, a transistor is a semiconductor device commonly used to amplify or switch electronic signals. The transistor is the fundamental building block of computers, and all other modern electronic devices. Some transistors are packaged individually but most are found in integrated circuits",
            "An operational amplifier, often called an op-amp , is a DC-coupled high-gain electronic voltage amplifier with differential inputs[1] and, usually, a single output. Typically the output of the op-amp is controlled either by negative feedback, which largely determines the magnitude of its output voltage gain, or by positive feedback, which facilitates regenerative gain and oscillation.",
            "Feedback is a process whereby some proportion of the output signal of a system is passed (fed back) to the input. This is often used to control the dynamic behaviour of the system.",
            "Much attention has been given by researchers to negative feedback processes, because negative feedback processes lead systems towards equilibrium states. Positive feedback reinforces a given tendency of a system and can lead a system away from equilibrium states, possibly causing quite unexpected results.",
            "Barkhausen criteria, without which you will not know which conditions, are to be satisfied for oscillations.\n" +
                    "“Oscillations will not be sustained if, at the oscillator frequency, the magnitude of the product of the\n" +
                    "transfer gain of the amplifier and the magnitude of the feedback factor of the feedback network ( the magnitude of the loop gain ) are less than unity”.\n" +
                    "The condition of unity loop gain -Aβ = 1 is called the Barkhausen criterion. This condition implies that\n" +
                    "Aβ= 1and that the phase of - Aβ is zero.\n",
            "Code division multiple access (CDMA) is a channel access method utilized by various radio communication technologies. CDMA employs spread-spectrum technology and a special coding scheme (where each transmitter is assigned a code) to allow multiple users to be multiplexed over the same physical channel. By contrast, time division multiple access (TDMA) divides access by time, while frequency-division multiple access (FDMA) divides it by frequency.\n" +
                    "An analogy to the problem of multiple access is a room (channel) in which people wish to communicate with each other. To avoid confusion, people could take turns speaking (time division), speak at different pitches (frequency division), or speak in different directions (spatial division). In CDMA, they would speak different languages. People speaking the same language can understand each other, but not other people. Similarly, in radio CDMA, each group of users is given a shared code. Many codes occupy the same channel, but only users associated with a particular code can understand each other.\n",
            "Types of feedback:\n" +
                    "Negative feedback: This tends to reduce output (but in amplifiers, stabilizes and linearizes operation). Negative feedback feeds part of a system's output, inverted, into the system's input; generally with the result that fluctuations are attenuated.\n" +
                    "Positive feedback: This tends to increase output. Positive feedback, sometimes referred to as \"cumulative causation\", is a feedback loop system in which the system responds to perturbation (A perturbation means a system, is an alteration of function, induced by external or internal mechanisms) in the same direction as the perturbation. In contrast, a system that responds to the perturbation in the opposite direction is called a negative feedback system.\n" +
                    "Bipolar feedback: which can either increase or decrease output.\n",
            "The generating system,transmission system,and distribution system",
            "An instrumentation amplifier is a differential op-amp circuit providing high input impedances with ease of gain adjustment by varying a single resistor.",
            "The equivalent circuit of all the components of the power system are drawn and they are interconnected is called impedance diagram.",
            "The load flow study of a power system is essential to decide the best operation existing system and for planning the future expansion of the system. It is also essential for designing the power system.",
            "The components of power system may operate at different voltage and power levels. It will be convenient for analysis of power system if the voltage, power, current ratings of the components of the power system is expressed with referance to a common value called base value.",
            "Different categories of antenna are as follows :\n" +
                    "\n" +
                    "1. Wire Antennas - Short Dipole Antenna\n" +
                    "2. Microstrip Antennas - Rectangular Microstrip (Patch) Antennas\n" +
                    "3. Reflector Antennas - Corner Reflector\n" +
                    "4. Travelling Wave Antennas - Helical Antennas\n" +
                    "5. Aperture Antennas - Slot Antenna\n" +
                    "6. Other Antennas - NFC Antennas\n",
            "Handover in mobile communication refers to the process of transferring a call from one network cell to another without breaking the call.\n" +
                    "There are two types of handover which are as follows :\n" +
                    "\n" +
                    "Hard Handoff : hard handoff is the process in which the cell connection is disconnected from the previous cell before it is made with the new one.\n" +
                    "\n" +
                    "Soft Handoff : It is the process in which a new connection is established first before disconnecting the old one. It is thus more efficient and smart.\n",
            "When a radio wave travels into the ionospheric layer it experiences refraction due to difference in density. The density of ionospheric layer is rarer than the layer below which causes the radio wave to be bent away from the normal. Also the radio wave experiences a force from the ions in the ionospheric layer. If incident at the correct angle the radio wave is completely reflected back to the inner atmosphere due to total internal reflection. This phenomenon is called ionospheric reflection and is used in mobile communication for radio wave propagation also known as ionospheric bending of radio waves.",
            "CDMA stands for Code Division Multiple Access which uses digital format. In CDMA systems several transmissions via the radio interface take place simultaneously on the same frequency bandwidth. User data is combined at the transmitter’s side with a code, then transmitted. On air, all transmission get mixed. At the receiver's side the same code is used as in the transmitter’s side. The code helps the receiver to filter the user information of the transmitter from incoming mixture of all transmissions on the same frequency band and same time.",
            "The whole of the geographical area is divided into hexagonal shape geometrical area called cell and each cell having its own transceiver. Each BTS (cell site) allocated different band of frequency or different channel. Each BTS antenna is designed in such a way that i cover cell area in which it is placed with frequency allotted without interfering other cell signals. The design process of selecting and allocating channel groups for all of the cellular base station within system is called frequency reuse.",
            "Bluetooth is designed to be a personal area network, where participating entities are mobile and require sporadic communication with others. It is omni directional i.e. it does not have line of sight limitation like infra red does. Ericsson started the work on Bluetooth and named it after the Danish king Harold Biuetooth. Bluetooth operates in the 2.4 GHz area of spectrum and provides a range of 10 metres. It offers transfer speeds of around 720 Kbps.",
            "GPRS services are defined to fall in one of the two categories :\n" +
                    "- PTP ( Point to point)\n" +
                    "- PTM ( Point to Multipoint)\n" +
                    "Some of the GPRS services are not likely to be provided by network operators during early deployment of GPRS due in part to the phased development of standard. Market demand is another factor affecting the decision of operators regarding which services to offer first.\n",
            "Advantages of CDMa are as follows :\n" +
                    "\n" +
                    "1. Frequency diversity : Transmission is spread out over a large bandwidth due to that less affected by noise. If bandwidth is increased S/N ratio increases, which means noise will be reduced.\n" +
                    "2. Multiplication Resistance : Chipping codes used for CDMA not only exhibit low correlation but also low autocorrelation. Hence a version of the signal that is delayed by more than one chip interval does not interfere with dominant signal as in other multipath environments.\n" +
                    "3. Privacy : Due to spread spectrum is obtained by the use of noise like signals, where each user has a unique code, so privacy is inherent.\n" +
                    "4. Graceful Degradation. In CDMA, more users access the system simultaneously as compared to FDMa, TDMA.\n",
            "SPread spectrum has the following advantages :\n" +
                    "\n" +
                    "1. No crosstalk interference.\n" +
                    "2. Better voice quality/data integrity and less static noise.\n" +
                    "3. Lowered susceptibility to multipath fading.\n" +
                    "4. Inherent security.\n" +
                    "5. Co-existence.\n" +
                    "6. Longer operating distances.\n" +
                    "7. Hard to detect.\n" +
                    "8. Hard to intercept or demodulate.\n" +
                    "9. Harder to jam than narrow bands.\n" +
                    "10. Use of ranging and radar.\n",
            "Once the signal is coded, modulated and then sent, the receiver must demodulate the signal. This is usually done in two steps :\n" +
                    "1. Spectrum spreading (e.g., direct sequence or frequency hopping) modulation is removed.\n" +
                    "2. The remaining information bearing signal is demodulated by multiplying with a local reference identical in structure and synchronised with received signal.\n",
            "To be usable for direct sequence spreading, a PN code must meet the following conditions :\n" +
                    "\n" +
                    "1. Sequence must be built from 2 levelled numbers.\n" +
                    "2. The codes must have sharp autocorrelation peak to enable code synchronization.\n" +
                    "3. Codes must have a low cross-correlation value, the lower it is, more are the number of users which can be allowed in the system.\n" +
                    "4. The codes should be “balanced” i.e. the difference between ones and zeros in code may only be 1.\n",
            "To be usable for direct sequence spreading, a PN code must meet the following conditions :\n" +
                    "\n" +
                    "1. Sequence must be built from 2 levelled numbers.\n" +
                    "2. The codes must have sharp autocorrelation peak to enable code synchronization.\n" +
                    "3. Codes must have a low cross-correlation value, the lower it is, more are the number of users which can be allowed in the system.\n" +
                    "4. The codes should be “balanced” i.e. the difference between ones and zeros in code may only be 1.\n",
            "Building penetration : Building penetration depends on the material used for construction and architecture used. This varies building to building and is based on building construction.\n" +
                    "Building Height Effect : The signal strength is always higher at top floor and generally floor gain height is about 2.7dB/floor which is not dependent on building construction.\n" +
                    "Building Floor Reception : The signal isolation between floors in a multi floor building is on the average about 20dB. Within a floor of 150 * 150 feet, the propagation loss due to interior walls, depending on the wall materials is about 20 dB between the strong and the weak areas.\n",
            "Here are some advantages of GSM :\n" +
                    "1. GSM is mature, this maturity means a more stable network with robust features.\n" +
                    "2. Less signal deterioration inside buildings.\n" +
                    "3. Ability to use repeaters.\n" +
                    "4. Talk time is generally higher in GSM phones due to pulse nature of transmission.\n" +
                    "5. The availability of Subscriber Identity Modules allows users to switch networks and handset at will.\n" +
                    "6. GSM covers virtually all parts of world so international roaming is not a problem.\n",
            "Various types of number for network identity are as follows :\n" +
                    "1. MSISDN ( Mobile station ISDN) Number : It is international mobile subscriber number which is normally called mobile number. It is unique worldwide.\n" +
                    "2. MSRN ( Mobile Subscriber Routing Number) : MSRN is used during mobile terminate trunk call to provide location of mobile subscriber.\n" +
                    "3. HON ( Hand Over Number ) : HON is used for providing information required to transfer call from one B?SC to another BSC or to another MSC.\n" +
                    "4. ISMI ( International Mobile Subscriber Identity Number) : Purpose of ISMI is for location update and authentication.\n" +
                    "5. TMSI ( Temporary Mobile Subscriber Identity ) : TMSI is used instead of IMSI to improve security efficiency of network.\n" +
                    "6. IMEI : International Mobile Equipment Identity.\n",
            "Functions of BSS are as follows :\n" +
                    "1. Radio path control.\n" +
                    "2. BTS and TC control.\n" +
                    "3. Connection establishment with MS-NSS.\n" +
                    "4. Mobility management, speech transcoding.\n" +
                    "5. Connection of statistical data.\n",
            "Following are the parts of network management system :\n" +
                    "1. OMC : Operation and maintenance center - Computerized monitoring center.\n" +
                    "2. NMC : Network Management Center - Centralized control of a network is done here.\n" +
                    "3. OSS : Operation and support system - Used for supporting activities performed in an OMC and/or NMC.\n",
            "Some selected applications or digital signal processing that are often encountered in daily life are listed as follows:\n" +
                    "1. Telecommunication: Echo cancellation in telephone networks.\n" +
                    "2. Military Radar signal processing\n" +
                    "3. Consumer electronics Digital Audio/TV\n" +
                    "4. Instrumentation and control\n" +
                    "5. Image processing image representation, image compression\n" +
                    "6. Speech processing speech analysis methods are used in automatic speech recognition\n" +
                    "7. Medicine Medical diagnostic instrumentation such as computerised tomography (CT)\n" +
                    "8. Seismology DSP techniques are employed in geophysical exploration for oil and gas.\n" +
                    "9. Signal Filtering Removal of unwanted background noise.\n",
            "A discrete-time signal is defined by specifying its value only at discrete times, called sampling instants. When the sampled values are quantised and encoded, a digital signal is obtained. A digital signal is obtained from the analog signal by using an analog-to-digital converter. This entire process is referred to as the conversion of signals from analog to digital form.",
            "Properties of the ROC for the z-Transform :\n" +
                    "1. X(z) converges uniformly if and only if the ROC of the z-transform X(z) of the sequence includes the unit circle. The ROC of X(z) consists of a ring in the z-plane centered about the origin. That is, the ROC of the z-transform of x(n) has values of z for which x(n) r-n is absolutely summable.\n" +
                    "2. The ROC does not contain any poles.\n" +
                    "3. When x(n) is of finite duration then the ROC is the entire z-plane, except possibly z=0 and/or z=infinity.\n" +
                    "4. If x(n) is a right sided sequence, the ROC will not include infinity.\n" +
                    "5. If x(n) is a left sided sequence, the ROC will not include z=0. However if x(n)=0 for all n>0, the ROC will include z=0.\n" +
                    "6. If x(n) is two sided and if the circle |z| = r0 is in the ROC, then the ROC will consist of a ring in the z-plane that includes the circle |z|=r0.\n" +
                    "7. If X(z) is rational, then the ROC extends to infinity, i.e. the ROC is bounded by poles.\n" +
                    "8. If x(n) is causal, then the ROC includes z=infinity.\n" +
                    "9. If x(n) is anti- causal, trhen the ROC includes z=0.\n",
            "An interrupt is a signal from a device attached to a computer or from a program within the computer that causes the main program that operates the computer (the operating system ) to stop and figure out what to do next. Almost all personal (or larger) computers today are interrupt-driven - that is, they start down the list of computer instruction s in one program (perhaps an application such as a word processor) and keep running the instructions until either (A) they can't go any further or (B) an interrupt signal is sensed. After the interrupt signal is sensed, the computer either resumes running the program it was running or begins running another program. "





           };

    List<String> ecarrayquestionlist = Arrays.asList(listArrayec);
    ArrayList<String> ecupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapterec;
    List<String> ecarrayanswerlist = Arrays.asList(dataec);
    ArrayList<String> ecupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec);
        ListView listViewec = (ListView) findViewById(R.id.listec);


            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ecupdatequestionlist.addAll(ecarrayquestionlist);
        ecupdateanswerlist.addAll(ecarrayanswerlist);


        adapterec = new ArrayAdapter<String>(this, R.layout.textfieldlist, ecupdatequestionlist);



        listViewec.setAdapter(adapterec);


        listViewec.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionec = ecupdatequestionlist.get(position);
                String dataec = ecupdateanswerlist.get(position);
                Intent startec = new Intent(getApplicationContext(), ecdata.class);
                startec.putExtra("senddataec", dataec);
                startec.putExtra("senddata1ec", questionec);

                startActivity(startec);


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

    String userquestionec;
    String useranswerec;

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
            alert.setTitle("Add question of EC");

            // Set an EditText view to get user input
            final EditText ecquestion = new EditText(this);
            ecquestion.setHint("Question");
            final EditText ecanswer = new EditText(this);
            ecanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(ecquestion);
            layout.addView(ecanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionec = ecquestion.getEditableText().toString();
                    useranswerec = ecanswer.getEditableText().toString();


                    if (userquestionec.length() > 0) {
                        ecupdatequestionlist.add(userquestionec);

                        adapterec.notifyDataSetChanged();
                        Toast.makeText(ec.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencesec(userquestionec);


                    }
                    if (useranswerec.length() <= 0 && userquestionec.length() != 0) {

                        useranswerec = " ";


                    }
                    if (useranswerec.length() > 0) {
                        ecupdateanswerlist.add(useranswerec);
                        adapterec.notifyDataSetChanged();
                        saveStringToPreferences1ec(useranswerec);


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
                    .setTitle(getResources().getString(R.string.app_name))
                    .setIcon(android.R.drawable.ic_dialog_info)
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

    private SharedPreferences prefsec;
    private String prefNameec = "myPhrasesStorageec";
    private static final String PHRASEec = "Phrase_ec";


    private void saveStringToPreferencesec(String strec) {
        prefsec = getSharedPreferences(prefNameec, MODE_PRIVATE);
        SharedPreferences.Editor editorec = prefsec.edit();
        //increments index by 1
        editorec.putInt("phrase_countec", prefsec.getInt("phrase_countec", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorec.putString(PHRASEec + (prefsec.getInt("phrase_countec", 0) + 1), userquestionec);

        editorec.commit();
    }

    private SharedPreferences prefs1ec;
    private String prefName1ec = "myPhrasesStorage1ec";
    private static final String PHRASE1ec = "Phrase_1ec";

    private void saveStringToPreferences1ec(String str1ec) {
        prefs1ec = getSharedPreferences(prefName1ec, MODE_PRIVATE);
        SharedPreferences.Editor editor1ec = prefs1ec.edit();
        //increments index by 1
        editor1ec.putInt("phrase_count1ec", prefs1ec.getInt("phrase_count1ec", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1ec.putString(PHRASE1ec + (prefs1ec.getInt("phrase_count1ec", 0) + 1), useranswerec);

        editor1ec.commit();
    }

    public void onResume() {
        super.onResume();

        prefsec = getSharedPreferences(prefNameec, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionec = new LinkedList<String>();
        int phraseCountec = prefsec.getInt("phrase_countec", 0);

        for (int i = 1; i <= phraseCountec; i++) {
            phrasesCollectionec.add(prefsec.getString(PHRASEec + i, "<< Enter a phrase >>"));
        }

        ecupdatequestionlist.addAll(phrasesCollectionec);
        adapterec.notifyDataSetChanged();



        prefs1ec = getSharedPreferences(prefName1ec, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1ec = new LinkedList<String>();
        int phraseCount1ec = prefs1ec.getInt("phrase_count1ec", 0);

        for (int j = 1; j <= phraseCount1ec; j++) {
            phrasesCollection1ec.add(prefs1ec.getString(PHRASE1ec + j, "<< Enter a phrase >>"));
        }

        ecupdateanswerlist.addAll(phrasesCollection1ec);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







