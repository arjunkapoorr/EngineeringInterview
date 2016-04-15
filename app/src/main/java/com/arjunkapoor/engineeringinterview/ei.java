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

public class ei extends ActionBarActivity {



    String[] listArrayei = {
            "1. How D.P. transmitter can be applied to close tank?",
            "2. How D.P. transmitter can be applied to open tank?",
            "3. Explain the working of an electronic level troll.",
            "4. Explain the working of an enraf level gauge.",
            "5. What is the constant voltage unit?",
            "6. Explain the burnout feature.",
            "7. Why thermo wells are used? What materials are used in thermo wells?",
            "8. How is automatic reference junction compensation carried out in temperature recorders?",
            "9. What are de-saturators?",
            "10. Explain the working of Rota meter.",
            "11. What is the working principle of the magnetic meter?",
            "12. Explain the mechanism behind the turbine meter.",
            "13. How would you choose differential range?",
            "14. What is the use of single seated valve?",
            "15. What is the use of double seated valve?",
            "16. What is the use of valve positioner?",
            "17. What are primary elements of measuring pressure? Which type of pressure can be measured by these elements?",
            "18. Name different types of bourdon tubes.",
            "19. What are different types of control valves?",
            "20. What is furnace draft control?",
            "21. What is intrinsically safe system?",
            "22. What is zener diode? What is voltage regulator?",
            "23. What is force balance principle? State some of its’ advantages.",
            "24. What is motion balance principle?",
            "25. How will you test a transistor with a multimeter?",
            "26. Explain ratio control system.",
            "27. What is solenoid valve? Where it is used?",
            "28. What is furnace draft control?",
            "29. What is intrinsically safe system?",
            "30. What is zener diode? What is voltage regulator?",
            "31. What is force balance principle? State some of its’ advantages.",
            "32. What is motion balance principle?",
            "33. How will you test a transistor with a multimeter?",
            "34. Explain ratio control system.",
            "35. What is solenoid valve? Where it is used?",
            "36. How to write the program for single push button by using Ladder diagram?",
            "37. What is remote mount with MTA option? (In case of Dual Sensor Vortex Flowmeter, rosemount has written in its Catalog drawings)?",
            "38. Why 4-20 mA signal is preferred over a 0-10V signal?",
            "39. Can we use a control valve without positioner?",
            "40. What is Instrumentation Measurement?",
            "41. What is Instrumentation Instrumentation engineering?",
            "42. What is Instrumentation technologists and mechanics?",
            "43. Difference between DCS and PLC including date processing and architecture.",
            "44. Do you know How D.P. transmitter can be applied to close tank?",
            "45. Explain How D.P. transmitter can be applied to open tank?",
            "46. Do you know the working of an electronic level troll?",
            "47. Tell me the working of an enraf level gauge?",
            "48. What is constant voltage unit?",
            "49. Why thermo wells are used? What materials are used in thermo wells?",
            "50. Explain What are different types of orifice plates? State their uses?",
            "51. Do you know How do you identify an orifice in the pipeline?",
            "52. Explain Why is the orifice tab provided?",
            "53. What is Bernoulli's theorem. State its application?",
            "54. Explain How can a D.P. transmitter be calibrated?",
            "55. Tell me How is flow measured in square root?",
            "56. Name different parts of a pressure gauge? Explain the use of hair spring in the pressure gauge?",
            "57. What is the use of single seated valve?",
            "58. What is the use of double seated valve?",
            "59. What is the use of valve positioner?",
            "60. What are primary elements of measuring pressure? Which type of pressure can be measured by these elements?",
            "61. Name different types of bourdon tubes?",
            "62. What are different types of control valves?",
            "63. What is furnace draft control?",
            "64. What is intrinsically safe system?",
            "65. What is force balance principle? State some of its' advantages?",
            "66. What is motion balance principle?",
            "67. Do you know How is automatic reference junction compensation carried out in temperature recorders?",
            "68. Explain What are de-saturators?",
            "69. What is the working of Rota meter?",
            "70. How to choose differential range?",
            "71. Tell me the mechanism behind the turbine meter?",
            "72. Explain What is the working principle of the magnetic meter?",
            "73. What do you mean by pt 100?",
            "74. How to use -24vdc in turbine vibration measurement?",
            "75. Why use -24vl in vibration?"





    };

    String[] dataei = {

            "In closed tank, bottom of the tank is connected to the high pressure side of the transmitter. Top of tank is connected to the lower pressure side of the transmitter. In this way vessel pressure can be measured.",
            "In open tank the lower pressure side is vented to the atmosphere. All pressure is applied to the high pressure side. This vessel pressure is measured through high pressure side.",
            "The variation in level of buoyancy resulting from a change in liquid level varies the net weight of the displacer increasing or decreasing the load on the torque arm. This change is directly proportional to change in level and specific gravity of the liquid. The resulting torque tube movement varies the angular motion of the rotor in RVDT providing a rotor change proportional to the rotor displacement, which is converted and amplified to a D.C. current.",
            "Enraf level gauge is based on the ser powered null balance technique. A displacer serves as continuous level sensing element. A two phase ser motor controlled by a capacitive balance system winds unwinds the the measuring wire until the tension in the weight springs is in balance with the weight of the displaced part immersed in the liquid. The sensing system in balance measures the two capacitance formed by the moving central sensing rod provided by the two capacitor plates and the si plates.",
            "The constant voltage circuit consists of a rectifier, CR and a filter capacitor. It is followed by two stages of zener regulation. Abridge configuration is provided to lamp line voltage zener regulation. Regulation 1 and regulation 2 provides relatively provide constant current. Resistors form a bridge that may remoment line voltage effects.",
            "Burnout provides the warnsug feature of driving indicator at the end of scale, if the input circuit is open. A burnout resistor is provided which develops a voltage drop between the measuring circuit and amplifier. The polarity of the signal determines the direction of the servo drive upon an open circuit in the input.\n" +
                    "Upscale burnout: R value 10 M\n" +
                    "Downscale burnout: R value 22 M\n",
            "In numerous applications, it is neither desirable nor practical to expose a temperature sensor directly to a material. Wells are therefore used to protect against damage corresion, arosion, aborsion and high pressure processes. A thermo well is also useful in protecting a sensor from physical damage during handling and normal operations.\n" +
                    "Materials used in thermo wells: Stainless steel, Inconel, Monel, Alloy Steel, Hastelloy\n",
            "In automatic reference junction compensation, variable nickel resistor is used. As the temperature changes, so does its resistance. This reference junction compensator is located, so that it will be at the temperature of the reference junction. The reference junction is at the poset where the dissimilar wire of the thermocouple is rejoined. This joint is invariably at the terminal strip of the instrument.",
            "When, in some processes, e.g. batch processes, long transient responses are expected during which a sustained deviation is present the controller integral action continuously drives the output to a minimum or maximum value. This phenomenon is called ‘integral saturation of the control unit’. When this condition is met, then this unit is de-saturated.",
            "Variable area meters are special form of head meters. Where in the area of flow restrictor is varied. So as to hold the differential pressure constant. The rota meter consists of a vertical tapered tube through which the metered fluid flows in upward direction. As the flow varies the ‘float’ rises or falls to vary the area of the passages that the differential across it balances the gravitational force on the ‘float’. The differential pressure is maintained constant. The position of the ‘float’ is the measure of the rate of flow.",
            "An electric potential is developed when a conductor is moved across the magnetic field. In most electrical machinery the conductor is a wire. The principle is equally applicable to a moving, electrically conductive liquid. The primary device of commercial magnetic meters consist of straight cylindrical electrically insulated tube with a pair of electrodes nearly flush with the tube walls and located at opposite end of a tube diameter. This device is limited to electrically conducting liquids. The magnetic meter is particularly suited to measurement of slurries and dirty fluids.",
            "Turbine meters consist of straight flow tube within which a turbine or fan is free to rotate about it s axis which is fixed along g the centre line of the tube. Mostly, a magnetic pick up system senses the rotation of the rotor through the tube walls. The turbine meter is a flow rate device\n" +
                    ", since the rotor speed is directly proportional to the flow rate. The output is usually in the form of electric pulses from the magnetic pick up with a frequency proportional to the flow rate.\n",
            "The most common range for differential range for liquid measurement is 0-100. This range is high enough to minimize the errors caused by unequal heads in the seal chambers. It is also dependent on the differences in the temperature of the load lines. The 100 range permits an increased in capacity up to 400. While decrease down up to 20 by merely changing the range tubes or range adjustments.",
            "The single seated valve is used on smaller sizes where an absolute shut off is required. The use of single seated valve is limited by pressure drop across the valve in the closed or almost closed position.",
            "In double seated valves the upward and downward forces on the plug due to reduction of fluid pressure are nearly equalized. It is generally used on bigger size valves and high pressure systems. Actuator forces required are less.",
            "Valve positioner can be used for following reasons:\n" +
                    "a. Quick action\n" +
                    "b. Valve hysterisis\n" +
                    "c. Viscous liquids\n" +
                    "d. Split range.\n" +
                    "e. Line pressure changes on valve\n" +
                    "f. Bench set not standard\n" +
                    "g. Reverse valve operations\n",
            "Primary elements of measuring pressure are:\n" +
                    "a. Bourdon Tube\n" +
                    "b. Diaphragm\n" +
                    "c. Capsule\n" +
                    "d. Bellows\n" +
                    "e. Pressure springs\n" +
                    "These elements are known as elastic deformation pressure elements.\n",
            "Types of bourdon tubes:\n" +
                    "1. C type\n" +
                    "2. Spiral\n" +
                    "3. Helix\n",
            "The commonly used control valves can be defined as follows:\n" +
                    "a. Depending on Action: \n" +
                    "Depending on action there are two types of control valves 1. Air to close 2. Air to close\n" +
                    "b. Depending on body:\n" +
                    "Depending on body there are 4 types of control valves\n" +
                    "1. Globe valves single or double seated\n" +
                    "2. Angle valves\n" +
                    "3. Butterfly valves\n" +
                    "4. Three way valves\n",
            "Balanced draft boilers are generally used negative furnace pressure. When both forced draft and induced draft are used together, at some point in the system the pressure will be same as that of atmosphere. Therefore the furnace pressure must be negative to prevent hot gas leakage. Excessive vacuum in the furnace however produces heat losses through air infiltration. The most desirable condition is that the one have a very slight negative pressure of the top of furnace.",
            "Intrinsic safety is a technique for designing electrical equipment for safe use in locations made hazardous by the presence of flammable gas or vapours in the air. Intrinsically safe circuit is one in which any spark or thermal effect produce either normally or under specified fault conditions is incapable of causing ignition of a specified gas or vapour in air mixture at the most ignited concentration.",
            "The breakdown region of a p-n diode can be made very sharp and almost vertical diodes with almost vertical breakdown region are known a s zener diodes. A zener diode operating in the breakdown region is equivalent to a battery. Because of this current through zener diode can change but the voltage remains constant. It is this constant voltage that has made the zener diode an important device in voltage regulation.\n" +
                    "Voltage regulator: The output remains constant despite changes in the input voltage due to zener effect.\n",
            "Force balance principle: A controller which generates an output signal by opposing torque. The input force is applied on the input bellows which moves the beam. This crackles nozzle back pressure. The nozzle back pressure is sensed by the balancing bellows which brings the beam to balance. The baffle movement is very less about 0.002 for full scale output.\n" +
                    "Advantages: \n" +
                    "a. Moving parts are fewer. \n" +
                    "b. Baffle movement is negligible \n" +
                    "c. Frictional losses are less\n",
            "A controller which generates an output signal by motion of its parts. The increase in the baffle is to move towards the nozzle. The nozzle back pressure will increase. This increase in the back pressure acting on the balancing bellows, will expand the bellows. The nozzle is moved upward due to this. The nozzle will move until motion almost equals the input baffle motion.",
            "1. Emitter +ve of meter and base -ve output =Low resistance \n" +
                    "2. Emitter -ve of meter and base +ve output =High resistance \n" +
                    "3. Collector +ve and base -ve output =Low \n" +
                    "4. Collector -ve and base +ve output =Low\n" +
                    "Emitter: Collector = High resistance\n" +
                    "PNP: Opposite Results\n",
            "A ratio control system is characterized by the fact that variations in the secondary variable don’t reflect back on the primary variable. A ratio control system is the system where secondary flow is hold in some proportion to a primary uncontrollable flow.\n" +
                    "If we assume that the output of a primary transmitter is A. and the output of the secondary transmitter is B, and that the multiplication factor of the ratio relay is K, then for equilibrium conditions which means set valve is equal to measured valve, we find the following relation:\n" +
                    "KA-B=0 or B/A = K where ‘K’ is the ratio setting off the relay.\n",
            "A solenoid is electrically operated valve. It consists of solenoid coil in which magnetic plunger moves. This plunger is connected to the plug and tends to open or close the valve. There are two types of solenoid valves:\n" +
                    "1. Normally Open \n" +
                    "2. Normally closed\n" +
                    "Use: It is used for safety purpose in different electric work\n",
            "Balanced draft boilers are generally used negative furnace pressure. When both forced draft and induced draft are used together, at some point in the system the pressure will be same as that of atmosphere. Therefore the furnace pressure must be negative to prevent hot gas leakage. Excessive vacuum in the furnace however produces heat losses through air infiltration. The most desirable condition is that the one have a very slight negative pressure of the top of furnace.",
            "Intrinsic safety is a technique for designing electrical equipment for safe use in locations made hazardous by the presence of flammable gas or vapours in the air. Intrinsically safe circuit is one in which any spark or thermal effect produce either normally or under specified fault conditions is incapable of causing ignition of a specified gas or vapour in air mixture at the most ignited concentration.",
            "The breakdown region of a p-n diode can be made very sharp and almost vertical diodes with almost vertical breakdown region are known a s zener diodes. A zener diode operating in the breakdown region is equivalent to a battery. Because of this current through zener diode can change but the voltage remains constant. It is this constant voltage that has made the zener diode an important device in voltage regulation.\n" +
                    "Voltage regulator: The output remains constant despite changes in the input voltage due to zener effect.\n",
            "Force balance principle: A controller which generates an output signal by opposing torque. The input force is applied on the input bellows which moves the beam. This crackles nozzle back pressure. The nozzle back pressure is sensed by the balancing bellows which brings the beam to balance. The baffle movement is very less about 0.002 for full scale output.\n" +
                    "Advantages: \n" +
                    "a. Moving parts are fewer. \n" +
                    "b. Baffle movement is negligible \n" +
                    "c. Frictional losses are less\n",
            "A controller which generates an output signal by motion of its parts. The increase in the baffle is to move towards the nozzle. The nozzle back pressure will increase. This increase in the back pressure acting on the balancing bellows, will expand the bellows. The nozzle is moved upward due to this. The nozzle will move until motion almost equals the input baffle motion.",
            "1. Emitter +ve of meter and base -ve output =Low resistance \n" +
                    "2. Emitter -ve of meter and base +ve output =High resistance \n" +
                    "3. Collector +ve and base -ve output =Low \n" +
                    "4. Collector -ve and base +ve output =Low\n" +
                    "Emitter: Collector = High resistance\n" +
                    "PNP: Opposite Results\n",
            "A ratio control system is characterized by the fact that variations in the secondary variable don’t reflect back on the primary variable. A ratio control system is the system where secondary flow is hold in some proportion to a primary uncontrollable flow.\n" +
                    "If we assume that the output of a primary transmitter is A. and the output of the secondary transmitter is B, and that the multiplication factor of the ratio relay is K, then for equilibrium conditions which means set valve is equal to measured valve, we find the following relation:\n" +
                    "KA-B=0 or B/A = K where ‘K’ is the ratio setting off the relay.\n",
            "A solenoid is electrically operated valve. It consists of solenoid coil in which magnetic plunger moves. This plunger is connected to the plug and tends to open or close the valve. There are two types of solenoid valves:\n" +
                    "1. Normally Open \n" +
                    "2. Normally closed\n" +
                    "Use: It is used for safety purpose in different electric work\n" +
                    "\n",
            "Create a Push button\n" +
                    "Connect a Counter series to PB\n" +
                    "Create a compare button\n" +
                    "Initialize 1 at one end\n" +
                    "Counter output in another\n" +
                    "Connect the Coil which has to be energized\n" +
                    "Initialize 2 at one end\n" +
                    "Counter output in another\n" +
                    "Connect the Coil which has to be reenergized.\n",
            "Remote mount with MTA means MTA connector for mounting remote connection. MTA is the Connector used for connection. Generally we called it MTA Connector.\n" +
                    "There are many types of MTA connector such as MTA 100connectors, Mta 156 connectors etc...\n",
            "Generally in a transistor some amount of voltage is required for turning it on. This voltage is the cut in voltage. Up to this voltage the exists a nonlinearity in its characteristics. Beyond this cut in voltage the char. of transistor is linear. This nonlinear region lays between 0-4ma, beyond 4ma it linear. This is why 4-20 ma range is used.\n",
            "Control valve can not be without positioner. The purpose of the positioner is to control the control valve stroke so as to keep the valve in desired position. The positioner receives signal from the controller, and send the boosted signal to the actuator to reach the desired position as and when the valve reaches the desired position the positioner cuts the boosted signal to the actuator and keeps the position.\n",
            "Instrumentation can be used to measure certain field parameters (physical values): These measured values include:\n" +
                    "pressure, either differential or static\n" +
                    "flow\n" +
                    "temperature - Temperature_measurement\n" +
                    "level - Level Measurement\n" +
                    "density\n" +
                    "viscosity\n" +
                    "\n" +
                    "\n" +
                    "radiation\n" +
                    "current\n" +
                    "voltage\n" +
                    "inductance\n" +
                    "capacitance\n" +
                    "frequency\n" +
                    "resistivity\n" +
                    "conductivity\n" +
                    "chemical composition\n" +
                    "chemical properties\n" +
                    "various physical properties\n",
            "Instrumentation engineering is the engineering specialization focused on the principle and operation of measuring instruments which are used in design and configuration of automated systems in electrical, pneumatic domains etc. They typically work for industries with automated processes, such as chemical or manufacturing plants, with the goal of improving system productivity, reliability, safety, optimization and stability.\n",
            "Instrumentation technologists, technicians and mechanics specialize in troubleshooting and repairing instruments and instrumentation systems. This trade is so intertwined with electricians, pipefitters, power engineers, and engineering companies, that one can find him/herself in extremely diverse working situations. An over-arching term, \"Instrument Fitter\" is often used to describe people in this field, regardless of any specialization. oo nga.\n",
            "If we have more I/o's in digital signals than analogue signals normally we choose DCS....and vice versa.\n",
            "In closed tank, bottom of the tank is connected to the high pressure side of the transmitter. Top of tank is connected to the lower pressure side of the transmitter. In this way vessel pressure can be measured.\n",
            "In open tank the lower pressure side is vented to the atmosphere. All pressure is applied to the high pressure side. This vessel pressure is measured through high pressure side.\n",
            "The variation in level of buoyancy resulting from a change in liquid level varies the net weight of the displacer increasing or decreasing the load on the torque arm. This change is directly proportional to change in level and specific gravity of the liquid. The resulting torque tube movement varies the angular motion of the rotor in\n",
            "Enraf level gauge is based on the ser powered null balance technique. A displacer serves as continuous level sensing element. A two phase ser motor controlled by a capacitive balance system winds unwinds the the measuring wire until the tension in the weight springs is in balance with the weight of the displaced part immersed in the liquid. The sensing system in balance measures the two capacitance formed by the moving central sensing rod provided by the two capacitor plates and the si plates.\n",
            "The constant voltage circuit consists of a rectifier, CR and a filter capacitor. It is followed by two stages of zener regulation. Abridge configuration is provided to lamp line voltage zener regulation. Regulation 1 and regulation 2 provides relatively provide constant current. Resistors form a bridge that may remoment line voltage effects.\n",
            "In numerous applications, it is neither desirable nor practical to expose a temperature sensor directly to a material. Wells are therefore used to protect against damage corresion, arosion, aborsion and high pressure processes. A thermo well is also useful in protecting a sensor from physical damage during handling and normal operations.\n" +
                    "Materials used in thermo wells: Stainless steel, Inconel, Monel, Alloy Steel, Hastelloy\n",
            "Different orifice plates are:\n" +
                    "Concentric\n" +
                    "Segmental\n" +
                    "Eccentric\n" +
                    "Concentric: These plates are used for ideal liquid as well as gases and steam service. Concentric holes are present in these plates, thats why it is known as concentric orifice.\n" +
                    "Segmental: This plate has hole in the form of segment of the circle. This plate is used for colloidal and sherry flow measurement.\n" +
                    "Eccentric: This plate has the eccentric holes. This plate is used in viscous and sherry flow measurement.\n",
            "An orifice tab is welded on the orifice plate which extends out of the line giving an indication of the orifice plate.\n",
            "Following reasons justify for providing orifice tab:\n" +
                    "Indication of orifice plate in a line\n" +
                    "The orifice diameter is marked on it.\n" +
                    "The material of the orifice plate.\n" +
                    "The tag number of the orifice plate.\n" +
                    "To mark the inlet of an orifice.\n",
            "Bernoulli's theorem states that the ‘total energy of a liquid flowing from one point to another remains constant'. It is applicable for non-compressible liquids. For different types of liquid flow Bernoulli's equation changes. There is direct proportion between speed of fluid and its dynamic pressure and its kinetic energy. It can be used in various real life situations like measuring pressure on aircraft wing and calibrating the airspeed indicator. It can also be used to low pressure in the venturi tubes present in carburetor.\n",
            "D.P. transmitter can be calibrated using following steps:\n" +
                    "Adjust zero of Xmtrs.\n" +
                    "Perform static pressure test: Give equal pressure on both sides of transmitter. Zero should not shift either side. If the zero shifts then carry out static alignment.\n" +
                    "\n" +
                    "\n" +
                    "Perform vacuum test: Apply equal vacuum to both the sides. Zero should not shift.\n" +
                    "Calibration procedure: Give 20 psi air supply to the transmitter and vent L.P. side to atmosphere. Connect output of the instrument to the standard test gauge. Adjust zero. Apply required pressure to the high pressure side and adjust the span. Adjust zero gain if necessary.\n",
            "Flow varies directly as the square root of pressure. Thus, F=K of square root of applied pressure. Since this flow varies as the square root of differential pressure. The pressure pen does not directly indicate flow. Thus flow can be determined by taking the square root of the pen. Assume the pen reads 50% of the chart. So, flow can be calculated using the pen measure in the chart.\n",
            "Pressure gauge includes following components:\n" +
                    "‘C' type bourdon tube.\n" +
                    "Connecting link\n" +
                    "Sector gear\n" +
                    "Pinion Gear\n" +
                    "Hair spring\n" +
                    "Pointer\n" +
                    "Dial\n" +
                    "Use of hair spring: Hair spring is responsible for controlling torque. It is also used to eliminate any play into linkages.\n",
            "The single seated valve is used on smaller sizes where an absolute shut off is required. The use of single seated valve is limited by pressure drop across the valve in the closed or almost closed position.\n",
            "In double seated valves the upward and downward forces on the plug due to reduction of fluid pressure are nearly equalized. It is generally used on bigger size valves and high pressure systems. Actuator forces required are less.\n",
            "Valve positioner can be used for following reasons:\n" +
                    "Quick action\n" +
                    "Valve hysterisis\n" +
                    "Viscous liquids\n" +
                    "Split range.\n" +
                    "Line pressure changes on valve\n" +
                    "Bench set not standard\n" +
                    "Reverse valve operations\n",
            "Primary elements of measuring pressure are:\n" +
                    "Bourdon Tube\n" +
                    "Diaphragm\n" +
                    "Capsule\n" +
                    "Bellows\n" +
                    "Pressure springs\n" +
                    "These elements are known as elastic deformation pressure elements.\n",
            "Types of bourdon tubes:\n" +
                    "C type\n" +
                    "Spiral\n" +
                    "Helix\n",
            "The commonly used control valves can be defined as follows:\n" +
                    "Depending on Action:\n" +
                    "Depending on action there are two types of control valves 1. Air to close 2. Air to close\n" +
                    "Depending on body:\n" +
                    "Depending on body there are 4 types of control valves\n" +
                    "Globe valves single or double seated\n" +
                    "Angle valves\n" +
                    "Butterfly valves\n" +
                    "Three way valves\n",
            "Balanced draft boilers are generally used negative furnace pressure. When both forced draft and induced draft are used together, at some point in the system the pressure will be same as that of atmosphere. Therefore the furnace pressure must be negative to prevent hot gas leakage. Excessive vacuum in the furnace however produces heat losses through air infiltration. The most desirable condition is that the one have a very slight negative pressure of the top of furnace.\n",
            "Intrinsic safety is a technique for designing electrical equipment for safe use in locations made hazardous by the presence of flammable gas or vapours in the air. Intrinsically safe circuit is one in which any spark or thermal effect produce either normally or under specified fault conditions is incapable of causing ignition of a specified gas or vapour in air mixture at the most ignited concentration.\n",
            "Force balance principle: A controller which generates an output signal by opposing torque. The input force is applied on the input bellows which moves the beam. This crackles nozzle back pressure. The nozzle back pressure is sensed by the balancing bellows which brings the beam to balance. The baffle movement is very less about 0.002 for full scale output.\n" +
                    "Advantages:\n" +
                    "Moving parts are fewer.\n" +
                    "Baffle movement is negligible\n" +
                    "Frictional losses are less\n",
            "A controller which generates an output signal by motion of its parts. The increase in the baffle is to move towards the nozzle. The nozzle back pressure will increase. This increase in the back pressure acting on the balancing bellows, will expand the bellows. The nozzle is moved upward due to this. The nozzle will move until motion almost equals the input baffle motion.\n",
            "In automatic reference junction compensation, variable nickel resistor is used. As the temperature changes, so does its resistance. This reference junction compensator is located, so that it will be at the temperature of the reference junction. The reference junction is at the poset where the dissimilar wire of the thermocouple is rejoined. This joint is invariably at the terminal strip of the instrument.\n",
            "When, in some processes, e.g. batch processes, long transient responses are expected during which a sustained deviation is present the controller integral action continuously drives the output to a minimum or maximum value. This phenomenon is called ‘integral saturation of the control unit'. When this condition is met, then this unit is de-saturated.\n",
            "Variable area meters are special form of head meters. Where in the area of flow restrictor is varied. So as to hold the differential pressure constant. The rota meter consists of a vertical tapered tube through which the metered fluid flows in upward direction. As the flow varies the ‘float' rises or falls to vary the area of the passages that the differential across it balances the gravitational force on the ‘float'. The differential pressure is maintained constant. The position of the ‘float' is the measure of the rate of flow.\n",
            "The most common range for differential range for liquid measurement is 0-100. This range is high enough to minimize the errors caused by unequal heads in the seal chambers. It is also dependent on the differences in the temperature of the load lines. The 100 range permits an increased in capacity up to 400. While decrease down up to 20 by merely changing the range tubes or range adjustments.\n",
            "Turbine meters consist of straight flow tube within which a turbine or fan is free to rotate about it s axis which is fixed along g the centre line of the tube. Mostly, a magnetic pick up system senses the rotation of the rotor through the tube walls. The turbine meter is a flow rate device\n" +
                    ", since the rotor speed is directly proportional to the flow rate. The output is usually in the form of electric pulses from the magnetic pick up with a frequency proportional to the flow rate.\n",
            "An electric potential is developed when a conductor is moved across the magnetic field. In most electrical machinery the conductor is a wire. The principle is equally applicable to a moving, electrically conductive liquid. The primary device of commercial magnetic meters consist of straight cylindrical electrically insulated tube with a pair of electrodes nearly flush with the tube walls and located at opposite end of a tube diameter. This device is limited to electrically conducting liquids. The magnetic meter is particularly suited to measurement of slurries and dirty fluids.\n",
            "Pt100 is a type of Resistence temprature detector(RTD).It is made by platanium.It means 100 ohms,resistance of 0 degree c.\n",
            "You are probably referring to a proximity probe, and specifically a probe manufacturered by Bently Nevada (now GE Power). Actually the negative DC voltage is bias power that the sensor requires in order to return a voltage (also negative) corresponding to the actual gap between the sensor tip and the target. The gap between the sensor and target must be set prior to using the probe at a distance relative to the probe sensitivity, this gap varies depending on what type of probe is being used. The output DC voltage from the signal conditioner used by the probe can be checked to set the gap. At the far end of the sensitivity range, the output voltage may be close to -24 VDC. As this gap decreases the voltage becomes more positive and at a nearly closed gap it is almost 0 VDC.\n" +
                    "There is no good reason for this supply voltage or output voltage to be negative, as other types of proximity probes use positive bias voltage. I suspect that the Bently company used a minus bias voltage for product protection. They have been selling their hardware for 50 years, so it\\'s impossible to switch now.\n",
            "normally in electronics and instrumentation cct the pnp transistr is used thats y the olp is 24vlt bt in vibartion he npn transistr is used thats y v use -24vlt\n"

          };

    List<String> eiarrayquestionlist = Arrays.asList(listArrayei);
    ArrayList<String> eiupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapterei;
    List<String> eiarrayanswerlist = Arrays.asList(dataei);
    ArrayList<String> eiupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ei);
        ListView listViewei = (ListView) findViewById(R.id.listei);



            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        eiupdatequestionlist.addAll(eiarrayquestionlist);
        eiupdateanswerlist.addAll(eiarrayanswerlist);


        adapterei = new ArrayAdapter<String>(this, R.layout.textfieldlist, eiupdatequestionlist);



        listViewei.setAdapter(adapterei);


        listViewei.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionei = eiupdatequestionlist.get(position);
                String dataei = eiupdateanswerlist.get(position);
                Intent startei = new Intent(getApplicationContext(), eidata.class);
                startei.putExtra("senddataei", dataei);
                startei.putExtra("senddata1ei", questionei);

                startActivity(startei);


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

    String userquestionei;
    String useranswerei;

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
            alert.setTitle("Add question of EI");

            // Set an EditText view to get user input
            final EditText eiquestion = new EditText(this);
            eiquestion.setHint("Question");
            final EditText eianswer = new EditText(this);
            eianswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(eiquestion);
            layout.addView(eianswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionei = eiquestion.getEditableText().toString();
                    useranswerei = eianswer.getEditableText().toString();


                    if (userquestionei.length() > 0) {
                        eiupdatequestionlist.add(userquestionei);

                        adapterei.notifyDataSetChanged();
                        Toast.makeText(ei.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencesei(userquestionei);


                    }
                    if (useranswerei.length() <= 0 && userquestionei.length() != 0) {

                        useranswerei = " ";


                    }
                    if (useranswerei.length() > 0) {
                        eiupdateanswerlist.add(useranswerei);
                        adapterei.notifyDataSetChanged();
                        saveStringToPreferences1ei(useranswerei);


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

    private SharedPreferences prefsei;
    private String prefNameei = "myPhrasesStorageei";
    private static final String PHRASEei = "Phrase_ei";


    private void saveStringToPreferencesei(String strei) {
        prefsei = getSharedPreferences(prefNameei, MODE_PRIVATE);
        SharedPreferences.Editor editorei = prefsei.edit();
        //increments index by 1
        editorei.putInt("phrase_countei", prefsei.getInt("phrase_countei", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorei.putString(PHRASEei + (prefsei.getInt("phrase_countei", 0) + 1), userquestionei);

        editorei.commit();
    }

    private SharedPreferences prefs1ei;
    private String prefName1ei = "myPhrasesStorage1ei";
    private static final String PHRASE1ei = "Phrase_1ei";

    private void saveStringToPreferences1ei(String str1ei) {
        prefs1ei = getSharedPreferences(prefName1ei, MODE_PRIVATE);
        SharedPreferences.Editor editor1ei = prefs1ei.edit();
        //increments index by 1
        editor1ei.putInt("phrase_count1ei", prefs1ei.getInt("phrase_count1ei", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1ei.putString(PHRASE1ei + (prefs1ei.getInt("phrase_count1ei", 0) + 1), useranswerei);

        editor1ei.commit();
    }

    public void onResume() {
        super.onResume();

        prefsei = getSharedPreferences(prefNameei, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionei = new LinkedList<String>();
        int phraseCountei= prefsei.getInt("phrase_countei", 0);

        for (int i = 1; i <= phraseCountei; i++) {
            phrasesCollectionei.add(prefsei.getString(PHRASEei + i, "<< Enter a phrase >>"));
        }

        eiupdatequestionlist.addAll(phrasesCollectionei);
        adapterei.notifyDataSetChanged();



        prefs1ei = getSharedPreferences(prefName1ei, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1ei = new LinkedList<String>();
        int phraseCount1ei = prefs1ei.getInt("phrase_count1ei", 0);

        for (int j = 1; j <= phraseCount1ei; j++) {
            phrasesCollection1ei.add(prefs1ei.getString(PHRASE1ei + j, "<< Enter a phrase >>"));
        }

        eiupdateanswerlist.addAll(phrasesCollection1ei);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







