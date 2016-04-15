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

public class chemical extends ActionBarActivity {



    String[] listArraychemical = {
            "1. Explain the term Aliquot and Diluent?",
            "2. Explain what is molality?",
            "3. Explain what is titration?",
            "4. Explain what is buffer?",
            "5. Explain how buffer works?",
            "6. Explain what is mole?",
            "7. How will you calculate how many moles of glucose present in 320 mL of 5.0 M of glucose solution?",
            "8. Explain what is the difference between fractionation and distillation?",
            "9. Mention the formula to calculate pH of a solution?",
            "10. Explain what is Valency?",
            "11. Define what is Avogadro’s law?",
            "12. Explain what makes a molecule into organic molecule?",
            "13. Explain what is the metal used to extract copper from the solution of copper sulphate?",
            "14. Explain what is the chemical composition of fat in human body?",
            "15. What is the monomer of polyethene?",
            "16. Explain what is the formula you will use to calculate how many millilitres of 5.5 M NaOH are required to prepare 400 mL of 1.5M NaOH?",
            "17. Explain why graphite rod is used in nuclear reactor?",
            "18. Mention how many millilitre is equal to 1 litre and how many microliter is equal to litre?",
            "19. Define what is oxidation and reduction reaction?",
            "20. Explain what is iron ore consists of?",
            "21. Explain what is dextro-rotatory and levo-rotatory?",
            "22. For a given bulk solid how can the particle size distribution be determined?",
            "23. What are the different characteristics that can affect the flow of bulk solids and how?",
            "24. What do you understand by Wet bulb Globe temperature?",
            "25. In case of welded vessels why is stress relieving in the form of post-weld treatment necessary?",
            "26. What significance the angle of repose holds in the chemical industry, Explain?",
            "27. What are the design considerations for a piping system for the transfer of slurries?",
            "28. What are the problems that are associated with the expansion joints?",
            "29. What is the method involved in analyzing powders for composition?",
            "30. What are the methods involved to test helium leak testing in a vacuum system?",
            "31. What are the criteria’s involved in choosing mass balances for components?",
            "32. What are the assumptions made on conservation equation?",
            "33. What is the procedure to estimate the friction factor involved in heat exchanger tubes?",
            "34. What is the use of gear pumps in motor?",
            "35. What are the factors involved in considering the choice of dry screw compressor?",
            "36. What is the process of including heat exchangers in ammonia refrigeration system?",
            "37. What is the method adopted to minimize shell side pressure drop in a shell?",
            "38. What are the strategies acquired to cure tube vibration and exchangers in a shell?",
            "39. What are the factors involved in designing kettle type reboiler?",
            "40. What are the steps taken to operate a tank-blanketing valve?",
            "41. What are the steps required to design a vapor-liquid separator or flash drum?",
            "42. Why does catalytic converter used in an automobile?",
            "43. What are the different ways in which solids can be blended?",
            "44. What are the different types of equipments for the conveyance of solids?",
            "45. What are the reasons of removal of particles from effluent gas?",
            "46. In a crusher where is the energy provided to it is used up for?",
            "47. On what basis are materials to be crushed evaluated apart from size?",
            "48. What are the advantages of using a ball mill over other conventional methods of crushing?",
            "49. Mention some of the specialized grinding and crushing methods.",
            "50. What are the assumptions made for Kynch Theory?",
            "51. What are the merits of using a falling film evaporator?"


    };

    String[] datachemical = {
            "•\tAliquot :  It is a measured sub-volume of original sample\n" +
                    "•\tDiluent: Material with which sample is diluted\n",
            "Molality is the number of solute that is present in 1 kg of a solvent.",
            "Titration is a process to determine the molarity of a base or an acid.  In this process a reaction is carried out between the known volumes of a solution with a known concentration, against the known volume of a solution with an unknown concentration.",
            "A buffer is an aqueous solution which has highly stable pH. It is a blend of a weak acid and its conjugate base or vice versa. On adding small amount of base or acid to buffer, its pH hardly changes.",
            "In buffer when hydrogen ion is added, it will neutralized by the base in buffer.  Hydroxide ion will be neutralized by the acid.  On the overall pH of the buffer solution, these neutralization reactions will not show much effect.\n" +
                    "While when you select an acid as a buffer solution, try to use an acid acid that has a pH closed to your desired pH.  This will help your buffer to achieve nearly equivalent amount of acid and conjugate base, so that it will enable to neutralize as much as H+ and OH -.\n",
            "Mole is the unit used to define the number of chemical substance present in a substance. It is the amount of substance which consists of the same number of chemical units as there are atoms in exactly 12 gram of pure carbon-12.",
            "First step: Convert the volume from millilitres to litres\n" +
                    "•\t320  X (1 litre/1000mL) = 0.320 L solution\n" +
                    "Second use the formula = M x V\n" +
                    "= 5.0 moles glucose/ litre solution X 0.320 L solution\n" +
                    "= 1.6 moles of glucose present in 320mL of solution\n",
            "Both methods are used to separate the components present in the solution based on the melting points\n" +
                    "•\tDistillation : This technique is used when boiling point of chemicals are different in the mixtures\n" +
                    "•\tFractionation : This technique is used when boiling point of chemicals are close to each other in the mixtures\n",
            "In order to calculate the pH of a solution you have to use the formula pH= -log [H+] or pH = -log [H3O+]",
            "A valency is a property of a groups or atoms, equal to the number of atoms of hydrogen that the group or atom could combine with or displace it in forming compounds.",
            "According to Avogadro’s law, at same temperature and pressure equal volume of gases contains the same number or molecules regardless of the chemical nature and physical properties.",
            "In a molecule when hydrogen atom is less than the ratio of carbon atom, then such molecules are referred as an organic molecule.",
            "Fe or ferrous is the metal that is used to extract copper from the solution of copper sulphate.",
            "Fat found in human body is mainly composed of\n" +
                    "•\tGlycerides\n" +
                    "•\tGlycerides+Phospholipids\n" +
                    "•\tGlycolipids\n" +
                    "•\tPhosphoinotisides\n" +
                    "•\tTocopherol\n",
            "The monomer of polyethene is ethylene",
            "To know the amount or volume of NaOH to prepare 400 mL of 1.5 M NaOH, we use formula\n" +
                    "M1 X V1 = M2 X V2\n" +
                    "V1 = M2 X V2/ M1\n" +
                    "But before that we will convert 400 mL into litre = 0.4 L\n" +
                    "5.5 X V1 = 1.5 M x 0.4 L\n" +
                    "V1 = 1.5 M X 0.4L/ 5.5\n" +
                    "V1= 0.10 L\n" +
                    "V1 = 100mL\n" +
                    "So, you need 100mL of 5.5 NaOH\n",
            "Graphite rod is used in nuclear reactor to convert fast moving neutrons into thermal neutrons.",
            "•\t1 millilitre = 0.0001 litre\n" +
                    "•\t1 microliter = 0.0000001 litre\n",
            "•\tOxidation = When there is a loss of hydrogen or electrons, OR gain of oxygen is known as Oxidation reaction.\n" +
                    "•\tReduction = When there is a gain of hydrogen or electron OR loss of oxygen is known as reduction reaction\n" +
                    "Example of oxidation-reduction reaction is observed in human body, when an electron is transferred into the cell and oxidation of glucose take place from which we get the energy.\n",
            "Iron ore is consists of Fe2O3",
            "Levorotation and Dextrorotation is referred to the properties of plane polarized light, when light rotates clockwise when it approaches the observer is then known as dextro-rotation and when the light rotates anti-clockwise then it is referred as levo-rotation.\n" +
                    "A compound which exhibits a dextro-rotation is referred as dextro-rotatory and which exhibits levo-rotation is referred as levo-rotatory.\n",
            "In order to determine the particle size distribution the simplest method is to make use of a sieve stack. In this method a stack is created of with different mesh sizes at each stack level. The structure is such that the biggest mesh size is at the top and the smallest at the bottom. Once this setup is created the before beginning the weight and other values of the solid is noted down. Once this is done the solid is placed at the topmost cylinder and the entire setup is exposed to a combination of vertical and horizontal movements. This will make the solid pass through different mesh sizes in the process separating the different particles according to their sizes. There are other more advanced methods of determining the particle size distribution as well such as video imaging and laser diffraction as well.",
            "The main characteristics that can affect the flow of bulk solids are as follows:\n" +
                    "> Moisture Content: when the moisture content is high the bulk solids become sticky in nature. This moisture can sometimes be absorbed from the atmosphere by some solids.\n" +
                    "> Temperature: The flow of the bulk solids can be sometimes affected by the temperature and also the period for which it is exposed to a particular temperature.\n" +
                    "> Particle size: More cohesive particles are generally found in bulk solids that are finer. Round particles are handled easily in comparison to odd, unsymmetrical shapes.\n" +
                    "> Time at rest: Many times the flow of certain bulk solids is affected by the time for which it has been kept stagnant or at rest. The more it is kept at rest the more slow the bulk solid flows.\n",
            "The wet bulb globe temperature index is used to measure the sultriness of the environment. The sultriness is calculated on the basis of the humidity affects, the air speed and temperature and also the sun`s radiant heating factor. The sultriness in some cases could be fatal and hence it is very important to keep this under consideration. The wet bulb globe temperature index number was developed in the 1950`s and is now accepted as an industry standard. It is comprised of three temperature readings:\n" +
                    "> Wet bulb temperature\n" +
                    "> Ordinary dry bulb temperature\n" +
                    "> Black bulb globe temperature\n",
            "When a metal is welded together the point at which the two surfaces are joined are subjected to very high temperatures. During this time period the metals can go through a lot of random metallurgical processes. This causes the metal to be harder and brittle. This depends on the amount of carbon content. In order to relieve the metal of these properties heat treatment is done on the affected areas. By doing so the affected areas ductility increases. In this process the heat is maintained in the affected metal according to the thickness of the metal. The temperature of the heat is calculated from the P number which is unique for a particular composition.",
            "The angle of repose is a property of particulate solids. A conical pile is formed when a bulk solid is poured onto a flat surface. The angle formed between the flat surface and the pile edge is called the angle of repose. The angle of repose depends on the following factors:\n" +
                    "> Density of the material\n" +
                    "> Surface area\n" +
                    "> Coefficient of friction of the material\n" +
                    "A material having a low angle of repose would always create float piles as compared to materials with a high angle of repose. This is used in the designing of equipments which are used for particulate solids. In addition to that this angle can be used to calculate the size of the conveyor belt that is used to transfer the materials.\n",
            "The following points must be considered for designing a piping system to carry slurries:\n" +
                    "> The design of the piping system should be able to self drain.\n" +
                    "> At the sections of the pipe where self draining is not possible provision to install manual draining must be installed.\n" +
                    "> At certain points where the chances of plugging are high, rod-out or blow-out connections must be provided to clear the lines.\n" +
                    "> In order to make flushing possible clean-out connections should be installed on either side of the main valves.\n" +
                    "> For easy access all the manifolds should have flanged connections.\n" +
                    "> T-connections are a must for access flanges.\n",
            "Expansion joints are said to be weak points that are used in piping. They are used to reduce the stress that comes in the piping while installing and implementing it. This allows minor piping to be settled during the joining function. Expansion joints can’t stand the stress that is being produced by the piping forces. The problems that have been given are as follows:\n" +
                    ">Expansion joints get dirty very easily and they tend to build up as the time progresses.\n" +
                    ">They include some weak points that can`t stand the stress of the piping.\n" +
                    ">The issues can be removed if the drains are installed properly and purging of the material is being done.\n",
            "The method that is used to analyze powders for compositions called as Fourier transform-infrared spectroscopy. This method is widely used to send the light beams of varying wavelength passing through the sample that is given and the light that is reflected from there will be analyzed by spectroscopy. This method is used to find out the absorption of each wavelength. The wavelength is measured with the laser light that is being referenced and on the basis of that calculations will be performed. The method is adopted to measure the compositions with accuracy.",
            "The helium gets detected when it is found in the location of suction line. The helium source is passed over the flanges and possible sources of leakage in the vacuum system. The monitoring of the system takes place to see the detector and the pump suction to be found for the detectable amount of helium. The pressure can be increased or decreased according to the environment. If the system is allowing the pressure and the vacuum at the same time then more pressure can be applied to set the leaks. An installation of IR unit can be done to suction the substance of the pump and the spraying will be done on the flanges.",
            "The mass balances are used to combine all the masses that are present in the substance and create an overall effect when it is combined with other factors. The equations can be set for the component to allow any of the components used in mass balances. The criterions on which the balances are dependent are as follows:\n" +
                    "> Need to find out which component(s) are involved in solving the equations, without proper information the equation can`t be solved.\n" +
                    "> Find out about the components about which the reasonable assumptions can be made. By doing this the process gets simplified and it will help in making quick calculations.\n",
            "The conservation equation is applied to the property of the system. It can have complicated as well as easy to solve calculations:\n" +
                    "> Closed system: that doesn`t have flows out of the substance. It deals with the closed mass flow. The equation to calculate this is:\n" +
                    "Accumulation= Generation\n" +
                    "> Open system: that allows the substance to enter or leave the system.\n" +
                    "> Conserved state system: in which no generation of the quantities happens. The quantities in this doesn`t get created or destroyed. These quantities are useful to balance according to the users need.\n" +
                    "> Steady State system: in which no accumulation of the substance is in steady state. This system avoids having differential equations. The process needs to be validated before it can run in any state.\n",
            "The following procedure is involved in determining the factors used inside the heat exchanger tubes that are varying with the temperatures. These are as follows:\n" +
                    ">Determine the average of the temperature by taking the mean of all the temperatures stored in the processing line.\n" +
                    ">Check the condition of the fluid entering the line at around 300 Celsius and leaving at around 280 Celsius.\n" +
                    ">Determine the physical properties at the temperature of 290 Celsius and the friction factors of the tubes at the same temperature.\n" +
                    ">Use the formula to calculate the friction factor of the laminar flow in the case where the liquid is cooling:\n" +
                    "Mean temperature/((sum of viscosity/wall viscosity)*0.38)\n" +
                    "Where Bulk and wall is determined at mean temperature over the length of line.\n" +
                    "Use the formula to calculate the friction factor of the turbulent flow in the case where the liquid is cooling:\n" +
                    "> (Mean temperature + bulk properties / ((sum of viscosity/wall viscosity)*0.11))/(bulk viscosity/wall viscosity)*0.17\n",
            "Gear pumps uses meshing gears that allow the pump fluid to be displaced by the method of displacement. They are used for hydraulic fluid power applications. They are one of the key factors involved in chemical installation having a certain viscosity to pump fluid. This type of pumps uses positive displacement pump having high pressure and low capacities. This includes the ability to handle wide range of viscosities, and allow easy to build and maintain the pumps. The gear pumps are controlled through the motor speed. Gear pumps can’t handle high tolerances and the fluids that are free of abrasives.",
            "Screw compressors are made up of a pair of meshing helical screws that is used to compress the gases. The dry screw compressors are used to have a flow range of 85-170 m/h and the discharge pressure is of 2070-2760 kPa. The dry screw compressor consists of timing gears that is maintained aligned with the rotors. The effectiveness is dependent on the clearances that exist between the helical rotors and between the chambers used for sealing the compression cavities. They are compact and smooth having the limited vibration and require spring suspension as well.",
            "The heat exchangers are used in ammonia refrigeration system from a very long time. The heat exchanger used is having smaller sizes and they are equivalent to the tubular exchanger can. This process works best for flooded system that require a separate liquid from the vapor. The system that is explained consists of a vessel, a drum, and accumulator and header tank with the heat exchanger. It works like this:\n" +
                    ">Liquid ammonia moves from vessel to exchanger\n" +
                    ">Vapor is returned to middle of drum\n" +
                    ">Vapor is removed from the drum and liquid enters through exchanger as it has lower density than others entering at the same rate in the system\n",
            "The method of protecting the shell from the pressure drop is very essential as it is very critical stage, where if not taken care properly the shell has to be replaced due to its degradation. In this rods or tube protectors are used instead of plates in top rows. The use of these rods puts less pressure drop and provides better distribution of the pressure on the plate. The plate that is used causes an abrupt of 90 degree turn of shell stream and an extra pressure drop on the whole shell. Use of the tube protectors will allow the shell to be saved from this and maintains its longevity.",
            "The strategies that can be followed are as follows:\n" +
                    ">To cure the tube vibration uses the tubes that doesn’t allow passing of the flow-induced vibrations through them and are longer in height than others. Usually the tubes supported\n" +
                    ">Are of 3-4 inch. To make the bundle stiff insert metal slats and rods between the tubes that is used in the process.\n" +
                    ">Add a shell nozzle opposite of the inlet to cut the flow of the velocity of the fluid in half. This solution works for non-removable bundles that can easily be solved also by adding a distributor belt on the shell. This might be expensive solution to adopt as it requires more man power and use of more tubes.\n",
            "To design the kettle type reboiler the requirements that needed to be present are as follows:\n" +
                    ">The size of the kettle has to be determined.\n" +
                    ">Provide the space to slow down the vapor velocity of all the liquid droplets.\n" +
                    ">Deciding the destination where the vapor would be deposited.\n" +
                    ">Handling a distillation tower with the following property: large space, high efficiency and high reflux rate.\n" +
                    ">The height of the vapor space should be kept such that the differences in the temperature won’t affect the kettle.\n" +
                    "There should be high heat flux for the kettles that run on higher temperatures.\n",
            "The steps taken are as follows: \n" +
                    ">Tank blanketing valves provide a way to prevent and control the fires in the flammable liquid storage tanks.\n" +
                    ">The vapors that are produced cannot be ignited if there is no supply of oxygen present at that time.\n" +
                    ">The oxygen in most of the cases being provided by the air that is drawn into tank from the atmosphere when the empty process is taking place.\n" +
                    ">Install tank blanketing valves with inlet connected to the inert gas that is kept under the pressure. And the tanks outlet is being placed in vapor space.\n" +
                    ">The pressure drop is happening in the tank at predetermined level where the blanketing valve allows the transfer of gas into vapor space.\n",
            "The steps that are required are as follows: \n" +
                    "> The size of the vapor-liquid separator depends on the flow rate of vapor and the liquid that is coming out of the vessel.\n" +
                    "> Assumed from the flow rates that if they are known then the size can be found out.\n" +
                    "> Use vertical pressure vessel to set it up or install it at given location.\n" +
                    "> The length to diameter ratio will be taken to provide liquid inventory between the level of liquid and the bottom of the vessel.\n" +
                    "> Provide a blockage mesh section at the vapor outlet to let the vapor pass through the mesh that is taken and can successfully leave the vessel.\n" +
                    "> Let liquid flow control the level of the valve.\n",
            "The catalytic converter is a device that converts harmful compounds in harmless compounds. The compounds harmful in nature are as follows:\n" +
                    "> Hydrocarbons- this is in the form of unburned gasoline that creates pollution and is more harmful.\n" +
                    "> Carbon monoxide is very harmful gas formed by the combustion of gasoline and used mainly for fuels.\n" +
                    "> Nitrogen oxides is also one of the gases that is poisonous in nature and produced by the release of heat from the engines. The release of nitrogen from the engine gets mixed with the oxygen in the air.\n" +
                    "The catalyst converter takes these harmful gases and uses the catalyst that is coated on the ceramic honeycomb or beads and attached to the exhaust pipe. This converts the carbon monoxide in carbon dioxide and makes it easy for the nature to consume it. The hydrocarbon gets converted in carbon dioxide and water. Same way the nitrogen oxides also gets converted in nitrogen and oxygen.\n",
            "There are various ways in which solids can be blended, some of the common methods are:\n" +
                    "> Convective mixing: In this type of mixing the group of particles of a solid is transferred from one place to another, vigorous repositioning takes place in this method. This type of mixing is prevalent in the Trough mixer.\n" +
                    "> Diffusion mixing: In this type of mixing a new interface is formed over which the particles of a solid are distributed. A good example of diffusion mixing is in the traditional barrel mixer, where a new interface is formed.\n" +
                    "> Shear Mixing: In this type of mixing slipping planes are created over which the group of particles of a solid are mixed.\n",
            "The various types of equipments available for the conveyance of solids are as follows:\n" +
                    "> Gravity Chutes: This equipment relies on gravity for the solids to fall under.\n" +
                    "> Air Slides: In this equipment the particles are suspended in air, and flow at an angle to the horizontal.\n" +
                    "> Belt Conveyors: This equipments use a belt to transfer the solids.\n" +
                    "> Screw Conveyors: The solids are moved using a rotating helical impeller.\n" +
                    "> Bucket elevators: The solids are moved using buckets which are attached to a belt in motion.\n" +
                    "> Vibrating Conveyors: The solid particles are subjected to vibrations and travel over to a table in a series of steps.\n" +
                    "> Pneumatic/ Hydraulic Installations: The particles are transported over a stream of air or water.\n",
            "The main reasons for the removal of particles from effluent gas are:\n" +
                    "> In order to protect and maintain the health of the workers and operators in the plant. It is also done to protect the surrounding population. The primary danger is due to the inhaling of the dust particles which can cause health issues.\n" +
                    "> It is also done to minimize the chances of explosions. Many carbonaceous materials remain suspended in air and when mixed with finely powdered metals can form a highly combustible mixture. \n" +
                    "> Particles are also removed to reduce the loss of valuable materials.\n" +
                    "> It can also be used to recycle the gas for ex in case of blast furnaces the gas is used to fire the stoves.\n",
            "The energy fed to a crusher is utilized for the following purposes:\n" +
                    "> To produce the elastic deformation of the particles prior to the fracture of the particles.\n" +
                    "> In order to produce inelastic deformation this causes the particles to reduce in size.\n" +
                    "> The energy is also used to cause the equipments elastic distortion.\n" +
                    "> In the friction of the particles between themselves and between the machine.\n" +
                    "> The energy also gets used up in the form of heat, noise and vibration in the plant.\n" +
                    "> The energy also get used up in the friction losses in the plant.\n" +
                    "Most of the energy is lost and only some of it is properly utilized. Nowadays it is of prime importance to reduce the energy losses.\n",
            "The choice of the crusher machine to be employed to crush the materials depends on the following properties apart from the size of it:\n" +
                    "> Hardness: The hardness affects the power consumption and the wearing of the machine. With hard materials it is necessary to use a low speed machine along with pressure lubrication.\n" +
                    "> Structure: Normal granular materials can be crushed by using compression and impact methods. On the other hand for fiber like materials compression and impact methods don't work instead a tearing action is required.\n" +
                    "> Moisture content: The moisture content in the materials can greatly affect the choice of machines. In case of excess moisture the materials flow gets hindered and it is essential to prevent them from caking together and form balls.\n" +
                    "> Crushing Strength: The amount of power that is required to crush a material can be derived directly from the crushing strength of the material.\n" +
                    "> Friability: This property indicates the tendency of a material to fracture.\n" +
                    "> Stickiness: As the name suggests this property is used to evaluate how sticky a material is as a very high sticky material can clog the machinery.\n",
            "The advantages of using a ball mill over other conventional methods are as follows:\n" +
                    "> The mill can be used in multiple modes. It can be used in both wet and dry modes. The wet mode helps in the removal of the product. \n" +
                    "> The installation cost and the power consumption of the mill is low.\n" +
                    "> Since the mill can be used in an inert atmosphere hence it could be used for the crushing of explosive materials.\n" +
                    "> It can be used for any type of hardness materials and also the grinding medium is cheap.\n" +
                    "> It can also be used for continuous and batch operations.\n" +
                    "> The ball mill supports two types of grinding:\n" +
                    "> Open circuit grinding \n" +
                    "> Closed circuit grinding\n",
            "Some of the specially developed grinding and crushing methods are as follows:\n" +
                    "> Electrohydraulic crushing: In this method an underwater discharge is created from a high capacity capacitor.\n" +
                    "> Ultrasonic Grinding: This type of grinding the material id placed between a drive roll and plate both of which are ultrasonically activated. This process is used for grinding micro sized materials.\n" +
                    "> Cryogenic grinding: For certain materials effective grinding is not possible by conventional means such as rubber, textiles etc. In order to cope with this problem the material is frozen to ultra low temperatures using liquid nitrogen. Once the material is frozen it is grounded as per requirements.\n" +
                    ">Explosive Shattering: This type of shattering is still on experimental basis, it involves energy to be transmitted to the particles in the form of shockwaves from an explosion chamber.\n",
            "The following assumptions are made for the Kynch Theory: \n" +
                    "> Across the horizontal layer the particle concentration is uniform \n" +
                    "> The effects of the wall can be ignored.\n" +
                    "> No differential settings of particles are considered due to shape, size or composition changes or differences.\n" +
                    "> The velocity at which particles fall depends only on the local concentration of the particles and nothing else.\n" +
                    "> The concentration is considered to be uniform throughout or it can be assumed to increase towards the bottom.\n" +
                    "> The velocity of sedimentation approaches zero as the concentration reaches the limiting value. This limiting value corresponds to the sediment layer at the bottom which gets deposited.\n",
            "The advantages of using falling film evaporators are as follows:\n" +
                    "> These types of evaporators have very high heat transfer coefficients ranging from 2000-5000 W/m(square) for water and 500 to 1000 for organic liquids \n" +
                    "> The residence times are short in case of heated surfaces, 5-10 seconds without recirculation\n" +
                    "> They have very low pressure drops, 0.2-0.5 kN/m(square) ,\n" +
                    "> These evaporators are well suited for vacuum operations as well.\n" +
                    "> The evaporation ratios are very high. 70 per cent without and 95 per cent with recirculation,\n" +
                    "> They have a very wide operating range, they can provide as much as 400% of the minimum throughput,\n" +
                    "> In addition to the above advantages they have a low cost of operation and are less susceptible to fouling\n"


           };

    List<String> chemicalarrayquestionlist = Arrays.asList(listArraychemical);
    ArrayList<String> chemicalupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adapterchemical;
    List<String> chemicalarrayanswerlist = Arrays.asList(datachemical);
    ArrayList<String> chemicalupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemical);
        ListView listViewchemical = (ListView) findViewById(R.id.listchemical);


            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chemicalupdatequestionlist.addAll(chemicalarrayquestionlist);
        chemicalupdateanswerlist.addAll(chemicalarrayanswerlist);


        adapterchemical = new ArrayAdapter<String>(this, R.layout.textfieldlist, chemicalupdatequestionlist);



        listViewchemical.setAdapter(adapterchemical);


        listViewchemical.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questionchemical = chemicalupdatequestionlist.get(position);
                String datachemical = chemicalupdateanswerlist.get(position);
                Intent startchemical = new Intent(getApplicationContext(), chemicaldata.class);
                startchemical.putExtra("senddatachemical", datachemical);
                startchemical.putExtra("senddata1chemical", questionchemical);

                startActivity(startchemical);


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

    String userquestionchemical;
    String useranswerchemical;

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
            alert.setTitle("Add question of Chemical");

            // Set an EditText view to get user input
            final EditText chemicalquestion = new EditText(this);
            chemicalquestion.setHint("Question");
            final EditText chemicalanswer = new EditText(this);
            chemicalanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(chemicalquestion);
            layout.addView(chemicalanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestionchemical = chemicalquestion.getEditableText().toString();
                    useranswerchemical = chemicalanswer.getEditableText().toString();


                    if (userquestionchemical.length() > 0) {
                        chemicalupdatequestionlist.add(userquestionchemical);

                        adapterchemical.notifyDataSetChanged();
                        Toast.makeText(chemical.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferenceschemical(userquestionchemical);


                    }
                    if (useranswerchemical.length() <= 0 && userquestionchemical.length() != 0) {

                        useranswerchemical = " ";


                    }
                    if (useranswerchemical.length() > 0) {
                        chemicalupdateanswerlist.add(useranswerchemical);
                        adapterchemical.notifyDataSetChanged();
                        saveStringToPreferences1chemical(useranswerchemical);


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

    private SharedPreferences prefschemical;
    private String prefNamechemical = "myPhrasesStoragechemical";
    private static final String PHRASEchemical = "Phrase_chemical";


    private void saveStringToPreferenceschemical(String strchemical) {
        prefschemical = getSharedPreferences(prefNamechemical, MODE_PRIVATE);
        SharedPreferences.Editor editorchemical = prefschemical.edit();
        //increments index by 1
        editorchemical.putInt("phrase_countchemical", prefschemical.getInt("phrase_countchemical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorchemical.putString(PHRASEchemical + (prefschemical.getInt("phrase_countchemical", 0) + 1), userquestionchemical);

        editorchemical.commit();
    }

    private SharedPreferences prefs1chemical;
    private String prefName1chemical = "myPhrasesStorage1chemical";
    private static final String PHRASE1chemical = "Phrase_1chemical";

    private void saveStringToPreferences1chemical(String str1chemical) {
        prefs1chemical = getSharedPreferences(prefName1chemical, MODE_PRIVATE);
        SharedPreferences.Editor editor1chemical = prefs1chemical.edit();
        //increments index by 1
        editor1chemical.putInt("phrase_count1chemical", prefs1chemical.getInt("phrase_count1chemical", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1chemical.putString(PHRASE1chemical + (prefs1chemical.getInt("phrase_count1chemical", 0) + 1), useranswerchemical);

        editor1chemical.commit();
    }

    public void onResume() {
        super.onResume();

        prefschemical = getSharedPreferences(prefNamechemical, MODE_PRIVATE);
        LinkedList<String> phrasesCollectionchemical = new LinkedList<String>();
        int phraseCountchemical = prefschemical.getInt("phrase_countchemical", 0);

        for (int i = 1; i <= phraseCountchemical; i++) {
            phrasesCollectionchemical.add(prefschemical.getString(PHRASEchemical + i, "<< Enter a phrase >>"));
        }

        chemicalupdatequestionlist.addAll(phrasesCollectionchemical);
        adapterchemical.notifyDataSetChanged();



        prefs1chemical = getSharedPreferences(prefName1chemical, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1chemical = new LinkedList<String>();
        int phraseCount1chemical = prefs1chemical.getInt("phrase_count1chemical", 0);

        for (int j = 1; j <= phraseCount1chemical; j++) {
            phrasesCollection1chemical.add(prefs1chemical.getString(PHRASE1chemical + j, "<< Enter a phrase >>"));
        }

        chemicalupdateanswerlist.addAll(phrasesCollection1chemical);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







