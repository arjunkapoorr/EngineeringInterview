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

public class aeronautical extends ActionBarActivity {



    String[] listArrayaeronautical = {
            "1. What are the characteristics that keep solid and fluid different?",
            "2. What are the objectives of Aerodynamics?",
            "3. What are the sources involved in aerodynamics?",
            "4. What are the conditions given for the two flows to be dynamically similar?",
            "5. What are the differences between continuum flow and free molecule flow?",
            "6. What are the differences between inviscid and viscous flow?",
            "7. What are the differences between incompressible and compressible flows?",
            "8. What are the different speed types of flows used in identifying Mach number?",
            "9. What are the major sectors involved in aircraft maintenance?",
            "10. What are the operations performed by Category B technicians?",
            "11. What is the main source of power in aircraft?",
            "12. What are the differences in the job performed by line maintenance certifying staff and base maintenance certifying staff?",
            "13. What is the role performed by Category C personnel in maintenance of aircraft?",
            "14. What are the safety recommendations required while maintaining aircraft?",
            "15. What are the different stress types present in aircraft operations?",
            "16. Why is strain a major factor in aircraft engineering?",
            "17. What are the different types of modulus involved in mechanics?",
            "18. What are the mechanical properties required to know before performing maintenance?",
            "19. Explain in brief about each property used in mechanics?",
            "20. What is the purpose of load extension graphs?",
            "21. Why is torsion such an important feature in aircraft engines?",
            "22. What is the main function of propulsive thrust?",
            "23. Why is the study of gyroscopes motion required to learn aircraft applications?",
            "24. What are the laws of gyro-dynamics?",
            "25. What is being expressed by Sperry’s rule of precession?",
            "26. What are the elements required to display oscillatory motion?",
            "27. What are the different lift augmentation devices present?",
            "28. What are the steps required to solve the problems of aircraft flying high and at very large speed?",
            "29. What are the functions performed by rudder?",
            "30. What are the criteria need to be followed for an aircraft to be longitudinal statically stable?",
            "31. Rotation of dc shunt motor is revers by using 2\n" +
                     "methods,which method is best and why?\n",
            "32. How the vfd is working?",
            "33. Why airline prefer beautiful girls for hostesses?",
            "34. Can a carbon dioxide gas use as fuel source?",
            "35. How the shockwave produced in aerofoil,and actually what happen that region?",
            "36. 1)what distance should be maintained between networking (data) cable & power cable if both cables are run in a seperate condute pipe parallaly?\n" +
                    "2)what happens if networking cable & power cable run parallel to each other, eventhough they run in a seperate\n" +
                    "condute pipes?\n",
            
            "37. What is yawing motion?",
            "38. Which is the high thrust producing jet engine?",
            "39. What is the difference between stress and pressure?",
            "40. What type of bearing used in bell helicopters?",
            "41. How can we draw design the airfoils using NACA series?",
            "42. Why refrigeration is done inside aircraft, and why aircraftbody is made of aluminums?",
            "43. What is ram jet?",
            "44. Does not simplification of complex honeycomb designed for thermal protection system of are usable launch vehicles jeopardize the accuracy of results?",
            "45. Are thermal protection systems of space crafts commonly composed of one panel or a collection of smaller tiles?",
            "46. What is a liquid metal?",
            "47. What is the highest temperature the space shuttle\n" +
                     "undersurface experiences during its mission?\n",
            "48. Explain how you overcame a major obstacle?",
            "49. Explain What are the main areas in Aviation?",
            "50. Tell me What is the requirement to become a Professional Engineer (PE) in the field of Aerospace?"

    };

    String[] dataaeronautical = {
            "• When the force is applied tangentially on solid then it experiences a finite deformation and shear stress that is proportional to the deformation. Whereas, when the same shear stress is applied on the surface of fluid then it experiences continuous increasing deformation where, the shear stress is proportional to the rate of change of deformation. \n" +
                    "• The fluid dynamic is dividend in three different areas. They are as follows: Hydrodynamics (flow of liquids), Gas dynamics (flow of gases) and Aerodynamics (flow of air). Whereas, the state of, solid doesn’t represent any of the stages.\n",
            "Aerodynamics deals with the theory of flow of air and it has many practical applications in engineering. There are some objectives that are being used in aerodynamics and these are as follows:\n" +
                    "• It is used to predict the forces, moments and heat transfer from the bodies that is moving through the liquid. \n" +
                    "• It deals with the movement of wings or use of the wind force. This way it requires the calculations to be done for the aerodynamic heating of the flight vehicles and the hydrodynamic forces applied on the surface of the vehicle. \n" +
                    "• It is used to determine the flows that are moving internally through ducts. This way it makes the calculations and measurement of the flow properties that is inside the rocket and jet engines.\n",
            "There are two sources that are involved in the case of aerodynamics forces and moments that are on the body. These forces are as follows:\n" +
                    "• Pressure distribution: this is the distribution that is over the body surface\n" +
                    "• Shear stress distribution: this is the distribution that is over the body surface\n" +
                    "These sources are for the body shapes and it doesn’t matter how complex they are. The mechanism that is being used to communicate with the bodies that is moving through a fluid. Both the pressure (p) and shear stress (?) having the dimension force per unit area. This helps the movement of the body through the fluid.\n",
            "To measure the dynamicity of the two flows consider two different flow fields over two different bodies. This way the conditions that get generated are as follows:\n" +
                    "• The streamlined pattern shouldn’t be geometrically similar.\n" +
                    "• The distribution of the volume over change in volume (V/V8), pressure over change in pressure (p/p8), and time over change in time (T/T8). These changes take place throughout the flow of the field and they remain the same against the common non-dimensional coordinates\n" +
                    "• The force coefficient remains the same. \n" +
                    "• There is a similarity in both the flows like the solid boundaries are geometrically similar for both flows.\n",
            "• The flow that is moving over the body i.e. in a circular cylinder of diameter d is the continuum flow, whereas the flow that consists of individual molecules moving in random motion is the free molecule flow.\n" +
                    "• The mean free path (?) defines the mean distance between the collisions of the molecule and if this path (?) is smaller than the scale of the body measured (d) then the flow of the body is considered as continuum flow. \n" +
                    "• The path (?) that is of same order as the body scale then the gas molecules then the body surface will have an impact of the molecules and this is known as free molecular flow.\n",
            "• Viscous flow is the flow in which the molecule moves in random fashion and transfers their mass, momentum and energy from one place to another in fluid. Whereas, an inviscid flow is the flow in which there is no involvement of friction, thermal conduction or diffusion while the molecules are moving. \n" +
                    "• Inviscid flow consists of the limited influence of friction, thermal conduction and diffusion that is limited to thin region that is limited to the body surface. Whereas, the viscous flows involve the flows that dominates the aerodynamics of the blunt bodies like cylinder. In this the flow expands around front face of cylinder and it separates from the rear surface of it. \n",
            "• Incompressible flows are the flows that have a constant density (?). Whereas, the compressible flows are those that consists of variable densities. \n" +
                    "• The flows that exist are compressible in nature. Whereas, incompressible flows, doesn't exist in nature or are very rare. \n" +
                    "• Incompressible flows are used to model aerodynamic problems without loosing any detrimental accuracy i.e. most problems that exist in hydrodynamics considers the density (?) = constant. Whereas, compressible flow is hardly used as a mathematical model to, represent the hydrodynamics. \n" +
                    "• High speed flows are and must be treated as compressible, whereas incompressible flows are not considered for high speed flows.\n",
            "There are four types of flows that consist of different speeds and can be identified using Mach number:\n" +
                    "• Subsonic flow where M<1 everywhere, this is a field that is defined as subsonic if it matches the Mach number that is less than 1 at every point. These are displayed by smooth streamlines that consists of no discontinuity in slope. The flow velocity is everywhere less than the speed of sound and the disturbances are all around the flow field. \n" +
                    "• Transonic flow, where mixed regions exist and M<1 or M>1, this is a flow field that defines that the M8 is increased just above the unity and it is formed in front of the body. These are the mixed subsonic and supersonic flows that are influenced by both the flows. \n" +
                    "• Supersonic flow where M>1 everywhere, this type is defined when Mach number is greater than 1 at every point. They are represented by the presence of shock waves across which the flow properties and streamlines changes discontinuously. \n" +
                    "• Hypersonic flow where the speed is greater than supersonic, this is defined when the shock waves moves closer to the body surface and the strength of the shockwave increases leading to higher temperatures between the shock and body surface.\n",
            "There are two major sectors involved in aircraft maintenance and these are handled by certifying technician in the field of support and maintenance. These are divided into two sectors as:\n" +
                    "• Category B1 (mechanical): these are the maintenance technicians that have good knowledge regarding the working of airframe, engine, electrical power systems and equipment. It also requires additional knowledge of aircraft structures and materials. \n" +
                    "• Category B2 (avionic): this deals with the integrated knowledge of aircraft equipments, electrical, instrument and radar related systems. They undergo proper training to handle the aircraft equipments and gain practical experience to deal with day to day activities.\n",
            "Category B consists of two sectors in the field of maintenance and they are divided in B1 and B2 with certain roles. The operations performed by Category B technicians are as follows:\n" +
                    "• Activities related to scheduled on field inspections for aircraft maintenance.\n" +
                    "• Activities of complex rectification\n" +
                    "• Fault diagnosis on aircraft systems and their equipments.\n" +
                    "• Modification and performing special instruction to monitor and manage the system\n" +
                    "• Repairing of airframe and other aircrafts\n" +
                    "• Activities performed like removal of aircraft components and fitting the required parts.\n" +
                    "• Use of BITE (built-in test equipment) and diagnostic equipments to perform repair tasks.\n" +
                    "• Supervising and certifying the work of other technicians involved in it.\n",
            "The main source of power is the hydraulic motor that is provided by the scheduled service and involves operations that allow technicians to solve complex system problems. This setup required certifying the technician to operate all the system the same way as it is been done with one system. The hydraulic motor needs to be operated the same way and maintained in a proper way. The alignment need to in synchronization with the aircraft auxiliary power unity (APU) before anything is done with the aircraft positioning. A standard need to, be followed to maintain the aircrafts and its parts equipped and working.",
            "The difference that exists between the two is that line maintenance certifying staff has the responsibility to inspect, rectify and perform the related or associated maintenance activities on the aircraft on the airfield. Whereas, the base maintenance certifying staff, perform the maintenance activities away from the live aircraft areas. \n" +
                    "The maintenance that is being performed by the line maintenance staff is restricted to use limited tools, and equipments that are present on the site to perform the first line diagnostic maintenance. Whereas, Base maintenance certifying staff is associated with the line maintenance staff as it requires inspecting and performing complex modification in the aircraft carriers.\n",
            "Category C personnel are responsible for maintaining the management role of controlling the progress of the base maintenance inspections and seeing the work that is getting performed. These handle the category B and category A staff and monitor their work. They are responsible for ensuring the good work that will be carried out by providing the certification of maintenance. Category C personnel upon the completion of the maintenance job done by the base maintenance staff provides the certificate to allow the servicing of the aircraft to proceed. This way the people working in the staff become eligible to perform and provide services for flight.\n" +
                    "\n",
            "The safety recommendations are required while dealing with the accidents and the inquiry of the aircrafts. The recommendations needed are as follows:\n" +
                    "• CAA (Civil aviation authority) examines the applicability of self-certification of aircraft engineering and verifies the criticality of the tasks that need to be performed on the system. They also check the system for further services without doing any functional checks. \n" +
                    "• Review of the system takes place to interpret the single components of the aircraft that is vital in its design. \n" +
                    "• Reviewing of the quality assurance system and the reporting methods take place to encourage more better designs to be provided for the use. \n" +
                    "• Reviewing the need to, introduce a format of job description and grades that is being provided to the engineers and managers. \n" +
                    "• Providing a mechanism for an independent assessment to carry out the work audit and operations can be performed smoothly.\n",
            "Stress is a result that is caused when a solid e.g. metal bar is subjected to an external force. Stress is defined as force per unit area and the basic unit includes MN/m2, N/mm2 and Pa. There are basically three types of stress:\n" +
                    "• Tensile stress: it is the stress that is setup when the force tries to pull the material apart.\n" +
                    "• Compressive stress: it is the stress that is produced by the force that is trying to crush the material. \n" +
                    "• Shear stress: is the stress that results from the force that tends to cut through the material i.e. tend to put one material slide over another one.\n",
            "Strain is when a material is altered in shape, this happens due to the fact that the force is acting on the material. The body is strained internally as well as externally without having any differences of dimension but it just has the differences at the atomic level. It is the ratio of change in dimension over the original dimension. It is very important due to the fact that building an aircraft requires the knowledge of these factors and the formulas that are associated with it to successfully implementing the parts together. There are three types of strain:\n" +
                    "• Tensile strain\n" +
                    "• Compressive strain and\n" +
                    "• Shear strain\n",
            "Modulus of elasticity is given by the Hooke’s law that states that stress is directly proportional to strain, while the material remains elastic. The external forces that are acting on the material is just having the sufficient to stretch the atomic bonds this way the material can also return back to the original shape. The different types of modulus are as follows:\n" +
                    "• Modulus of rigidity: this defines the relationship between the shear stress (t ) and shear strain (? ) \n" +
                    "• Bulk modulus: this defines that if a body volume v is subjected to an increase in an external pressure then the volume will be changed by dV, this deformation will be change in volume not in shape.\n",
            "Modulus of elasticity is given by the Hooke’s law that states that stress is directly proportional to strain, while the material remains elastic. The external forces that are acting on the material is just having the sufficient to stretch the atomic bonds this way the material can also return back to the original shape. The different types of modulus are as follows:\n" +
                    "• Modulus of rigidity: this defines the relationship between the shear stress (t ) and shear strain (? ) \n" +
                    "• Bulk modulus: this defines that if a body volume v is subjected to an increase in an external pressure then the volume will be changed by dV, this deformation will be change in volume not in shape.\n",
            "The properties of the mechanics are as follows:\n" +
                    "• Strength: this is the applied force on a material that can withstand prior to fracture. It is measured by the proof or yield stress of a material that is under action. \n" +
                    "• Working stress: this is the stress that is being imposed on a material as a result of the load that is being subjected on the material. The loads that are given must be in the elastic range. \n" +
                    "• Proof stress: defines the tensile stress \n" +
                    "• Ultimate tensile stress (UTS): defines of a material that is given by a relationship or its maximum load.\n" +
                    "• Specific strength: defines the light and strong of a material that is used in aircraft making. This is done to maximize the payload and meeting all the safety requirements. \n" +
                    "• Malleability: defines the ability to be rolled into sheets or get a shape under pressure. This includes examples of gold, copper and lead.\n" +
                    "• Elasticity: defines the ability of a material to return to its original shape when an external force is removed from the material.\n",
            "Load extension graphs are used to show the result of mechanical test done on the material to know their certain properties for example finding out the heat treatment of a material. These graphs shows certain phases of a material when it is being tested for destruction of the properties like elastic range, limit of proportionality, etc. The material needs to obey Hooke’s law. The elastic limit needs to be at or very near to the limit of proportionality. If the limit is passed the material ceases to be proportional to the load. If the stress increases on the material then the waist reduces as the stress = force/area. This graph represents a curve that shows different stages like elastic stage, and plastic stage.",
            "Torsion is used to drive shafts for aircraft engine driven pumps and motors. They are also involved in having a force behind propeller shafts, pulley assemblies and rive couplings for machinery. The shear stress is setup within the shafts and it results from the torsional loads. The size and the nature of torsional loads and stresses need to be known while making the design or else premature failure can occur. The shafts are used as a component to transmit torsional loads and twisting moments or torque. They can be a cross section or a circular component as it is more suitable to transmit the torque for pumps and motors to supply the power to the aircraft system.",
            "Propulsive thrust is used in aircraft system, when an aircraft is traveling through air in straight or level flight then the engine produces a thrust that is equal to the air resistance or the drag force on the aircraft. If the engine thrust exceeds the drag then the aircraft will accelerate and if drag exceeds the engine thrusts then the aircraft system will slow down. The thrust force that is used for aircraft propulsion should always come from air or gas pressure. The forces that are external always act on the engine or propeller. This propeller can be driven either by a piston or a gas turbine engine. If there is a use of jet engine then the high velocity exhaust gas is produced.",
            "Gyroscopic motion is considered as an important study for aircraft application for the inertia and momentum of the body that is used in circular motion. The momentum is the product of the mass of a body and its velocity. This is a measure of the quantity of motion of a body. Inertia is the force that doesn’t allow any change to happen in momentum. Gyroscope is the rotating mass that can be moved freely at right angles to its plane of rotation. This utilizes the gyro rotor or gyroscopic inertia to provide the motion unless it is compelled by an external force to change the state. This uses property of rigidity as gyroscope acts as a reference point in space.",
            "Gyro-dynamics deals with gyroscopic motion that is used for creating aircraft application as it allows inertia and momentum of the body. These laws consist of the two properties of rigidity and precession to provide the visible effects gyro-dynamics. These are as follows:\n" +
                    "• If a rotating body is mounted and it is free to move about any axis that passes through the center of mass, then the spin axis that is used will remain fixed in inertial space without displacing any of the frame. \n" +
                    "• If a constant torque is applied to any direction such as about an axis, or perpendicular to the axis, then the spin axis will move about an axis that is mutually perpendicular to both the spin and the torque axis.\n",
            "Sperry’s rule of precession describes about the direction in which the precession takes place. This precession is dependent on the direction of rotation for the mass and the axis of the torque that is applied on the material. It provides a guide to the direction of precession that allows easy finding of the direction of the applied torque. This also helps in finding out the direction of the rotation of gyro-wheel. If the torque is applied and is perpendicular to the spin axis then it can be transferred as a force.",
            "The elements required to display oscillatory motion are as follows:\n" +
                    "Period: this is related to the time and it signifies the time that elapses in between the motion that will repeat itself after some time again. Oscillatory motions allow themselves to be repeated after equal intervals of time and this is called as periodic. \n" +
                    "• Cycle: it represents the completion of one period and it also signifies the motion that is completed in one period.\n" +
                    "• Frequency: defines the number of cycles completed in unit time. \n" +
                    "• Amplitude: defines the distance from one point to another or from highest to lowest point of the motion from the central position.\n",
            "Lift augmentation devices provides flaps that are moving wing sections that increase wing camber and provide an angel of attack. Flaps have their own use like if an aircraft takes off and land in a short distance then the wings of it should produce sufficient lift at lower speed. Flaps provide a way to slow down the aircraft. There two categories and they are as follows: \n" +
                    "• Trailing edge flaps includes different flaps like\n" +
                    "• Plain flap that is used to retract the complete section of trailing edge and it is used in downward. \n" +
                    "• Split flap gets formed by the hinged lower part of trailing edge and the lowered top surface remains unchanged and it eliminates the airflow that occurs over the top of the surface of the plain flap. \n" +
                    "• Leading edge flaps: is used to augment the low speed lift that is swept on the wing aircraft. They help in increase the camber and allow the coupling to operate together with the trailing edge flaps.\n" +
                    "\n",
            "There are various steps required to solve the problems of aircraft flying high and at very large speed are as follows: \n" +
                    "• Build stiff wings that allow and provide the resistance to torsional diversion beyond the maximum speed of the aircraft. \n" +
                    "• Use two sets of ailerons and one outboard pair that can be operated at low speeds. \n" +
                    "• Use of one inboard pair that can be used to operate on high speeds, this will have less twisting impact when the ailerons are positioned outboard.\n" +
                    "• Use spoilers that can be positioned independently or can be paired with ailerons. These reduce the lift on the down going wing by interrupting the airflow over the top surface.\n",
            "The rudder is involved in providing the movement to the ports that gives a lift force to starboard. This will allow the aircraft to turn and uses the ailerons effectively to bank the aircraft by minimum use of rudder. The functions performed by rudder are as follows: \n" +
                    "• It is used with different applications that are involved in taking off and landing to keep aircraft straight. \n" +
                    "• Providing assistance that is, limited only for the aircraft to turn correctly. \n" +
                    "• Used in applications during spin to reduce the roll rate of the aircraft and there are some applications that provides low speeds and high angles to allow the raising of the wings.\n",
            "The criteria that are required for an aircraft to be longitudinal statically stable, is:\n" +
                    "• To have a nose-down pitching disturbance that is used to produce the aerodynamics forces to give a nose-up restoring moment. \n" +
                    "• This restoring moment that is produced should be large enough to return the aircraft to its original position after the disturbance. \n" +
                    "• The requirements are met by using the tail-plain that is horizontal stabilizer used to provide the stability to the aircraft.\n",
            "reversing the armature terminal is better & applied in\n" +
                    "practice.this is becoz of the following drawbacks in field\n" +
                    "reversing method.\n" +
                    "* high voltage build-up during reversing the field terminal\n" +
                    "which is high enough to puncture the insulation of field\n" +
                    "coil.\n" +
                    "* high flash-over will occur.\n" +
                    "* during reversal, the armature current should be limited\n" +
                    "to the rated value,otherwise it will draw twice the time of\n" +
                    "starting current.we can insert the external resistance to\n" +
                    "limit the current while reversing the armature\n" +
                    "terminal.whereas,in field reversal we cannot give any\n" +
                    "provision to limit armature over current.\n",

            "VFD having 3 main section namely Rectifier , DC bus,\n" +
                    "Inverter.\n" +
                    "by Rectifier input supply AC is converted to DC , In the\n" +
                    "section main part is pulse also getting change by no. of\n" +
                    "Diodes.\n" +
                    "In DC bus section having capacitor , in this capacitor the\n" +
                    "power is getting store.\n" +
                    "In Inverter section the DC is converted to AC and the supply\n",
            "There are different kind of people travel in a airlines we dnt know about them? sum people may act violent normally girls soft nature? so the airlines prefer girls y\n" +
                    "there prefer a beautiful girls? to impress a customer so airline prefer beautiful girls for hostesses\n",
            "Due to new and utterly inefficient techniques, carbon\n" +
                    "dioxide can be broken down into oxygen and carbon monoxide.\n" +
                    " this carbon monoxide can then be used to produce plastics\n" +
                    "and gas.\n",
            "Shaock Only at supersonic speed\n" +
                    "Message(about aircraft prasence downstream) waves go\n" +
                    "upstream at the speed of sound.\n" +
                    "But Aircraft goes more than the speed of sound.(supersonic)\n" +
                    "Before upstream air get the message about aircraft prasence,\n" +
                    "air encouter the aircraft.\n" +
                    "No time to adjust the airflow,Hence Shock!\n",
            "POWER CABLE IS HAVING SOME HIGH MAGNITUDE, IF THE SIGNAL\n" +
                    "CABLE YOU ARE PLACING NEARER TO THE POWER CABLE, DUE TO THE\n" +
                    "MAGNITUDE (MITUAL INDDUCTANCE) THAT DATA CABLES ARE GETTING\n" +
                    "SOME SIGNAL FROM THE POWER CABLE.YOU REMEMBER THAT DATA\n" +
                    "CABLE SIGNAL FROM 1.5 VOLT TO 12 V HIGHLY SENSETIVE.THAT\n" +
                    "MAGNITUDE ENOUGH TO GENERATE THE TRIGGER VOLTAGE ON DATA\n" +
                    "CABLE.THEN SOME WRONG FUNCTION WILL HAPPEN INTO THAT\n" +
                    "RELATER CIRCUITS.\n",
            "yawing motion means the side ways motion aircraft about the\n" +
                    "lateral axis.in otherwords side to side motion of aircraft.\n",
            "ramjet engine",
            "when the external force is applied on the elastic body,the\n" +
                    "body will deform from its original position.there will be an\n" +
                    "internal resistance force which will act opposite to the\n" +
                    "external force with the same magnitude.the internal\n" +
                    "resistance force per unit area is called stress.....\n" +
                    " pressure is the force which will act normal to the surface\n" +
                    "and all over the surface..........\n",
            "Elastomeric bearings that Elastomeric bearings are bearings\n" +
                    "constructed from a rubber type material and have limited\n" +
                    "movement that is perfectly suited for helicopter\n" +
                    "applications.\n",
            "simply download naca series cordinates its available on net ..start plotting..tat coordiantes,,,and also templates all available",
            "This is the combined effect low pressure & speed of plane in\n" +
                    "sky. Body of aircraft is made up of aluminums due to its\n" +
                    "good tensile strength & good conductor.\n",
            "It is a jet engine with no moving parts, only fuel spayed\n" +
                    "and burned.\n",
            "It jeopardize the accuracy but it also has some advantages\n" +
                    "but cannot be used due to its inaccuracy.\n",
            "Thermal protection system of space crafts will be of tiles\n" +
                    "which are made up of ceramics and ceramic composites to with\n" +
                    "stand thermal shocks and to avoid cracks it is used as tiles.\n",
            "Mercury",
            "Under surface of the space shuttle will experience above\n" +
                    "2300'c at the time of re-entering.\n",
            "To overcome obstacle, one should have strong determination\n" +
                    "and self confidence on himself / herself. They have to face\n" +
                    "life as it comes.\n",
            "Artificial intelligence\n" +
                    "Aircrafts and parts\nArtificial intelligence\n" +
                    "Aircrafts and parts\n"+"Advanced materials, composites and specialty metals\n" +
                    "Computers, electronic components and systems\n" +
                    "Fighters and attack aircraft\n" +
                    "Government defense policies and goals\n" +
                    "Lasers\n" +
                    "Navigation controls and guidance systems\n" +
                    "Ordinance and Military vehicles\n" +
                    "Computers, electronic components and systems\n" +
                    "Aviation electronic/Avionics\n" +
                    "Robotics\n" +
                    "Satellites\n" +
                    "Search and detection equipments\n" +
                    "Strategic defensive initiative\n" +
                    "Sensors and instrumentation\n" +
                    "Ships\n" +
                    "Space vehicles and commercialization of space\n",
            "Professional Engineer license is required for people who\n" +
                    "aspire to go in as officially approved engineer. The design\n" +
                    "specification is done by self employed people or working in\n" +
                    "small business. General aerospace engineers work for\n" +
                    "government or for big companies and hence few people are not\n" +
                    "very keen on becoming PE’s. To become a PE one has to pass\n" +
                    "an exam on fundamentals of engineering which takes alot of\n" +
                    "hours to gruel and work under a licensed PE for about four\n" +
                    "years. Also they have to grow through a principle and\n" +
                    "practice of engineering exam which requires about 8 hours.\n"


           };

    List<String> aeronauticalarrayquestionlist = Arrays.asList(listArrayaeronautical);
    ArrayList<String> aeronauticalupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapteraeronautical;
    List<String> aeronauticalarrayanswerlist = Arrays.asList(dataaeronautical);
    ArrayList<String> aeronauticalupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aeronautical);
        ListView listViewaeronautical = (ListView) findViewById(R.id.listaeronautical);


            AdView mAdView = (AdView) findViewById(R.id.adView);

            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        aeronauticalupdatequestionlist.addAll(aeronauticalarrayquestionlist);
        aeronauticalupdateanswerlist.addAll(aeronauticalarrayanswerlist);


        adapteraeronautical = new ArrayAdapter<String>(this, R.layout.textfieldlist, aeronauticalupdatequestionlist);



        listViewaeronautical.setAdapter(adapteraeronautical);


        listViewaeronautical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionaeronautical = aeronauticalupdatequestionlist.get(position);
                String dataaeronautical = aeronauticalupdateanswerlist.get(position);
                Intent startaeronautical = new Intent(getApplicationContext(), aeronauticaldata.class);
                startaeronautical.putExtra("senddataaeronautical", dataaeronautical);
                startaeronautical.putExtra("senddata1aeronautical", questionaeronautical);

                startActivity(startaeronautical);


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

    String userquestionaeronautical;
    String useransweraeronautical;

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
            alert.setTitle("Add question of Aeronautical");

            // Set an EditText view to get user input
            final EditText aeronauticalquestion = new EditText(this);
            aeronauticalquestion.setHint("Question");
            final EditText aeronauticalanswer = new EditText(this);
            aeronauticalanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(aeronauticalquestion);
            layout.addView(aeronauticalanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionaeronautical = aeronauticalquestion.getEditableText().toString();
                    useransweraeronautical = aeronauticalanswer.getEditableText().toString();


                    if (userquestionaeronautical.length() > 0) {
                        aeronauticalupdatequestionlist.add(userquestionaeronautical);

                        adapteraeronautical.notifyDataSetChanged();
                        Toast.makeText(aeronautical.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencesaeronautical(userquestionaeronautical);


                    }
                    if (useransweraeronautical.length() <= 0 && userquestionaeronautical.length() != 0) {

                        useransweraeronautical = " ";


                    }
                    if (useransweraeronautical.length() > 0) {
                        aeronauticalupdateanswerlist.add(useransweraeronautical);
                        adapteraeronautical.notifyDataSetChanged();
                        saveStringToPreferences1aeronautical(useransweraeronautical);


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

    private SharedPreferences prefsaeronautical;
    private String prefNameaeronautical = "myPhrasesStorageaeronautical";
    private static final String PHRASEaeronautical = "Phrase_aeronautical";


    private void saveStringToPreferencesaeronautical(String straeronautical) {
        prefsaeronautical = getSharedPreferences(prefNameaeronautical, MODE_PRIVATE);
        SharedPreferences.Editor editoraeronautical = prefsaeronautical.edit();
        //increments index by 1
        editoraeronautical.putInt("phrase_countaeronautical", prefsaeronautical.getInt("phrase_countaeronautical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editoraeronautical.putString(PHRASEaeronautical + (prefsaeronautical.getInt("phrase_countaeronautical", 0) + 1), userquestionaeronautical);

        editoraeronautical.commit();
    }

    private SharedPreferences prefs1aeronautical;
    private String prefName1aeronautical = "myPhrasesStorage1aeronautical";
    private static final String PHRASE1aeronautical = "Phrase_1aeronautical";

    private void saveStringToPreferences1aeronautical(String str1aeronautical) {
        prefs1aeronautical = getSharedPreferences(prefName1aeronautical, MODE_PRIVATE);
        SharedPreferences.Editor editor1aeronautical = prefs1aeronautical.edit();
        //increments index by 1
        editor1aeronautical.putInt("phrase_count1aeronautical", prefs1aeronautical.getInt("phrase_count1aeronautical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1aeronautical.putString(PHRASE1aeronautical + (prefs1aeronautical.getInt("phrase_count1aeronautical", 0) + 1), useransweraeronautical);

        editor1aeronautical.commit();
    }

    public void onResume() {
        super.onResume();

        prefsaeronautical = getSharedPreferences(prefNameaeronautical, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionaeronautical = new LinkedList<String>();
        int phraseCountaeronautical = prefsaeronautical.getInt("phrase_countaeronautical", 0);

        for (int i = 1; i <= phraseCountaeronautical; i++) {
            phrasesCollectionaeronautical.add(prefsaeronautical.getString(PHRASEaeronautical + i, "<< Enter a phrase >>"));
        }

        aeronauticalupdatequestionlist.addAll(phrasesCollectionaeronautical);
        adapteraeronautical.notifyDataSetChanged();



        prefs1aeronautical = getSharedPreferences(prefName1aeronautical, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1aeronautical = new LinkedList<String>();
        int phraseCount1aeronautical = prefs1aeronautical.getInt("phrase_count1aeronautical", 0);

        for (int j = 1; j <= phraseCount1aeronautical; j++) {
            phrasesCollection1aeronautical.add(prefs1aeronautical.getString(PHRASE1aeronautical + j, "<< Enter a phrase >>"));
        }

        aeronauticalupdateanswerlist.addAll(phrasesCollection1aeronautical);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







