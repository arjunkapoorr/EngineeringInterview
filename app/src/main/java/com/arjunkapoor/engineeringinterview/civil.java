package com.arjunkapoor.engineeringinterview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
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

public class civil extends ActionBarActivity {



    String[] listArraycivil = {"1. What are the cause of building collapse?",
            "2. What are the application of modolous of elasticity?",
            "3. What is the difference between routing maintenance and major maintenance in school facilities?",
            "4. How are freeway bridges built?",
            "5. What is the difference between absorption & adsorption and sorption?",
            "6. How do you measure concrete?",
            "7. Which is stronger solid steel rod or hollow steel pipe?",
            "8. What is the tallest man made structure in the world?",
            "9. What are the uses of alloys in daily life and how are alloys made?",
            "10. What is the worlds largest concrete dam?",
            "11. What is braced excavation all about?",
            "12. What is the meaning of soil reinforcement?",
            "13. What is aggregate?",
            "14. What year was the keystone power plant in Indiana County constructed?",
            "15. What is the force exerted by the Tacoma narrows bridge?",
            "16. How do you calculate the power of a centrifugal pump?",
            "17. Why nautical mile is different from statute mile?",
            "18. What is rigging?",
            "19. What is absolute pressure?",
            "20. How do we calculate absolute pressure?",
            "21. What is Gravity flow?",
            "22. What is horizon or horizontal mining?",
            "23. What is the difference between engineering stress and true stress?",
            "24. What is a kip?",
            "25. What are some structures that may be subjected to fatigue?",
            "26. Will going from a 3-tap to 6-tap increase water pressure?",
            "27. Why does the pressure increase under soil?",
            "28. What is the distance between railway tracks?",
            "29. How high should the water tank be to provide a 60 PSI at base of this water tower?",
            "30. What are the reasons for geotechnical site investigations in Uganda?",
            "31. What do you mean by honeycomb in concrete?",
            "32. What is the purpose of the gap in the road on this bridge?",
            "33. What is the tensile strength of wood?",
            "34. How many Lbs are there in a yard?",
            "35. What is a projection line?",
            "36. What are moment of inertia and its importance in civil engineering?",
            "37. What is the origin of name Railway Sleepers?",
            "38. What is BMC stands for in BMC Software?",
            "39. Does brick grows bigger every year.",
            "40. How did street originate in the plumbing term street ell?",
            "41. What is the absolute pressure scale?",
            "42. What is the difference between QA and QC?",
            "43. How did the Romans get water up hills using aqua ducts?",
            "44. Will Water damage concrete?",
            "45. How do you determine Specific gravity of cement?",
            "46. What is the meaning of a blue land surveyors flag?",
            "47. What are advancements in civil engineering?",
            "48. Why is the statue of liberty made of copper?",
            "49. Are cruise ships built for the transatlantic run",
            "50. What is diversion tunnel in a dam?",
            "51. What distance in meters on the ground is the equivalent of one second of arc in longitude or latitude?",
            "52. How do you maintain water pressure?",
            "53. What are some facts about concrete?",
            "54. Who designed the city of Washington DC?",
            "55. Where is the worlds longest elevator and how long is it?",
            "56. How many kilo-Newtons equals 1000 kilogram?",
            "57. How is the Leaning Tower of Pisa supported?",
            "58. What does civil engineering mean?",
            "59. How long does it take concrete to harden?",
            "60. What is the biggest dam in America?",
            "61. How does siphoning work?",
            "62.  What is the quantity of cement in Mix M20 concrete?",
            "63. What is unit weight of normal concrete?",
            "64. What is the difference between shear and tensile strength?",
            "65. Would you cause a 55-gallon drum of water to weigh more by climbing in?",
            "66. At what point does a circle start losing area when being flattened?",
            "67. How do you compute volume of airflow?",
            "68. What is made from large rocks, which protects the base of cliffs?",
            "69. What are the materials used in building a gravity dam?",
            "70. How many feet are in 4 square yards?",
            "71. What is the average density of soil?",
            "72. What are the strongest shapes in building?",
            "73. What is the withdrawal force of steel nails?",
            "74. What is the formula for figuring out how many gallons of water are in a pipe by the foot?",
            "75. What is the tensile strength of marble?",
            "76. What is the density of most of construction materials?",
            "77. What does civil status mean?",
            "78. What are the advantages and disadvantages of lead products in construction?",
            "79. How do you measure water flowing through 300mm diameter pipes?",
            "80. How do you convert wind speed into force?",
            "81. What is kn measurement?",
            "81. What is the best type of wood glue?",
            "83. What are the uses of Groynes?",
            "84. What are the functions of a column in a building?",
            "85. What is an ice dam sock?",
            "86. Concrete cover for slab, column, beam and footing?",
            "87. What is the density of steel?",
            "88. How much quantity water should be placed in one cubic meter area?",
            "89. What in bending moment, if a moment is free end of cantilever beam?",
            "90. Explain Creep?",
            "91. How is make concrete cube?",
            "92. What is rate for brick masonry work of 1.0 m3 in cm 1:6?"
           };

    String[] datacivil = {
            "The PAssage of time is one reason. Buildings also collapse due to weak foundations. Earthquakes, hurricanes and other natural disasters can also damage the structure of the buildings and cause it to collapse. Bombings or demolition of buildings is also other reasons.\n",
            "As the term implies, \"Modulus of Elasticity” relates to the elasticity or \"flexibility\" of a material. The value of modulus of elasticity is very much significant relating to deflection of certain materials used in the construction industry. Take for example the general E value of mild carbon steel is about 200 GPA comPAred to about  70 GPA for aluminum. This simply translate that aluminum is 3 times flexible than steel.\n",
            "The routine maintenance is the minor and consistent rePAirs that are engaged in the school premises. Examples could include PAinting, replacement of fixtures, louver blades, furniture rePAirs, and PAtching cracks in the school buildings.\n" +
                    "The major maintenance could also be a total rehabilitation of the school, either school buildings or any other project within the school community. It could be total restructuring of the lighting system in the school or sanitary system.\n",
            "After calculating the anticiPAted traffic for the bridge, cement/reinforced- with- rebar stanchions are sPAced over the freeway to accommodate the bridge. An 'off-ramp' from the freeway to the bridge is constructed, as is an 'on-ramp' to the subsequent road. Cement/rebar slabs are built and lifted with cranes to form the platform, and voila! Drive carefully.\n" +
                    "Although the bridge deck/roadway is almost always a concrete slab, the structure that holds up the bridge deck can be reinforced concrete, structural steel, or a combination of steel and concrete.\n",
            "Absorption generally refers to two phenomena, which are largely unrelated. In one case, it refers to when atoms, molecules, or ions enter some bulk phase - gas,  liquid or solid material. For instance, a sponge absorbs water when it is dry.\n" +
                    "Absorption also refers to the process by which the energy of a photon is taken up by another entity, for example, by an atom whose valence electrons make transition between two electronic energy levels. The photon is destroyed in the process. The absorbed energy may be re-emitted as radiant energy or transformed into heat energy. The absorption of light during wave proPAgation is often called attenuation. The tools of spectroscopy in chemistry are based on the absorption of photons by atoms and molecules.\n" +
                    "Adsorption is similar, but refers to a surface rather than a volume: adsorption is a process that occurs when a gas or liquid solute accumulates on the surface of a solid or, more rarely, a liquid (adsorbent), forming a molecular or atomic film (the adsorb-ate). It is different from absorption, in which a substance diffuses into a liquid or solid to form a solution.\n",
            "Cubic feet, Cubic yards, Cubic Meter\n",
            "On a per pound basis, steel pipe is stronger in bending and is less likely to buckle in axial compression.\n",
            "The tallest man made structure is the KVLY-TV mast which is 2063 feet tall. The worlds tallest man made structure is Burj Dubai which is 800 meter tall.\n",
            "Alloying is not always done to produce a 'superior' material, but to produce materials having a desired requirement in the industry or elsewhere. A classic case is of lead solder (containing lead & tin), in which the melting point of the constituent elements are lowered, not necessarily a desirable property.\n" +
                    "Alloying can be carried out using hot press method (a sheet of material is sandwiched with alloying material), rolling the heated base metal in a drum full of alloying metal powder, using hot spraying, galvanizing (dipping the base in a molten solution of alloying material) etc. Sometimes the alloying material is added in small proportions to the molten base metal (e.g., in production of different types of steel).\n",
            "The Grand Coulee Dam is said to be the largest concrete dam. Currently the world's largest concrete dam is the Itaipu Dam, an accomplishment of two neighboring countries, Brazil and PAraguay in South America.\n" +
                    "Though it is not finished yet, the Three Gorges (or Sandapong) Dam on the Yangtze River in China will take over as the largest upon its completion, which is slated for 2009.\n",
            "Excavations are braced to prevent the cave-in of surrounding unstable soil.\n",
            "Soil reinforcement is the act of improving soil strength to enable it support or carry more load. Two common examples are:\n" +
                    "Mixing a soil amendment such as lime into weak clayey soil and re-comPActing to improve soil-bearing caPAcity (often done under the road base in highway construction)\n" +
                    "Installing plastic or composite webbing layers (called geo-grid material) alternating with comPActed soil to produce a stronger sloped soil structure (often done on steep roadway embankments to improve strength and stability)\n",
            "Aggregate is the component of a composite material used to resist compressive stress.\n",
            "1967 began commercial operation on unit 1.\n",
            "The force exerted to the Tacoma narrows bridge was initially the wind resistance. The wind resistance caused the whole bridge to act as a system with forced  vibration with damping.\n",
            "The input power, that is, the power required to operate the pump should be stated in Hp (horsepower) on the pump's nameplate. It can also be calculated by the 3-phase power equation:\n" +
                    "P(in Hp) = VI(1.7c) = Rated Voltage x Rated Current x 1.73/ %Efficiency\n" +
                    "If this is a consumer grade pump that operates on 120Vac, then the equation becomes P = VI, simply multiply the operating voltage, 120 x current (which is the number followed by the letter \"A\".\n" +
                    "The output power, which really is not technically power, but rated in Gpm (gallons per minute), or caPAcity should also be on the nameplate. If you have the make, model, and (not necessarily needed) the serial number (also on the nameplate) you could call the manufacturer's customer service dept. As an application engineer, I have contacted countless manufacturers', and service dept's for assistance. It is now big deal to them, they will be happy to answer your questions.\n",
            "One nautical mile is defined by one latitude minute of arc (there are 60 such minutes to a degree). This equals 1852 meters, and roughly (but coincidentally) 2000 yards or 6000 feet. (Edit: actually, a standard nautical mile is 6076 feet, 6000 feet and 2000 yards are commonly used approximations, but produce an error of about 1%).\n" +
                    "The statute mile had a little fuzzier definition to start with, as one mile was the same as 1000 roman PAces/steps. The definition has since changed, but one statute mile equals about 1609 meters.\n",
            "In sailing, the ropes used to move the sails around so the boat will move in the right direction when the wind blows.\n",
            "Absolute pressure is simply the addition of the observed gage pressure plus the value of the local atmospheric pressure.\n",
            "Absolute is equal to gauge pressure plus atmospheric.\n",
            "Gravity flow is fluid flowing due to the forces of gravity alone and not to an applied pressure head. In the Bernoulli equation, the pressure term is omitted, and the height and velocity terms are the only ones included.\n",
            "Horizon or horizontal mining can be applied to extraction of material from seams of any stratified mineral such as limestone or ironstone, but it is more usually associated with coal - PArticularly where there are several seams that are inclined or folded and/or faulted.\n" +
                    "Horizon mining involves long level roadways (horizons) being driven from the shafts to the extremity of the area to be mined.\n" +
                    "\n" +
                    "\n" +
                    "The levels of the horizons are chosen to intersect the maximum number of seams the maximum number of times. As the seams are intersected, headings will be  driven into the seam so that the desired material may be extracted. This method of mining requires a thorough understanding of the geological structure of the area to be mined so that the level of the horizons can be chosen for optimum results.\n" +
                    "This method of mining is popular in modern coalmines with seams worked from several horizons. The considerable capital outlay of driving horizons before production can begin is recouped by the advantage of having long straight level roadways of generous dimensions unaffected by the crushing effect of nearby extraction of the mineral.\n",
            "In biology, Stress is something that disrupts homeostasis of an organism. In engineering, Stress is an external force that pushes, pulls, twists, or otherwise puts force on something.\n" +
                    "Engineering stress assumes that the area a force is acting upon remains constant, true stress takes into account the reduction in area caused by the force.\n",
            "1 kip = 1000 lbs\n",
            "Bridges, hydraulic presses, burners trains\n",
            "No, the pressure will be the same, you will get more volume only if your pumps can handle the GPM, to increase pressure you may need a booster pump or a single pump that is rated for your needs.\n",
            "Soil pressure increases with depth due to the overburden or self-weight of the soil and due to loads imposed upon the soil.\n" +
                    "For example, the pressure variation below the depth of soil is linear and the relation is given by pressure = unit wt * depth. As depth increases, there will be a linear increase in the soil pressure.\n",
            "4 feet, 8 1/2 inches\n",
            "138.60ft\n" +
                    "2.31ft of water= 1 PSI\n",
            "To know the soil properties, in so doing be in position to determine whether the PArticular site is suitable for the purpose intended To know the history of the site\n" +
                    "To know what remedies need to be put in place before construction can start\n" +
                    "Based on the soil properties, that can be determined on site and in the lab, design the appropriate foundation for the structure.\n",
            "Some people call it an air pocket in the concrete or a void.\n",
            "Purpose of the gap in the road is to allow the road to exPAnd and contract with temperature changes without causing damage or deformation to the road.\n",
            "The tensile strength of a material is the value at which the material fails when subjected to a tensile force. (Tensile means a force pulling the wood fibers lengthwise, as opposed to a compressive force.) There are a lot of different types and load cases for wood, so there is not one answer to this question. For example, wood used outside will fail at a lower load than wood inside. Wood is also anisotropic, i.e. it has different strength in different directions.\n" +
                    "Example values of tensile strength vary anywhere from 175 pounds per square inch for Utility Grade pine to 1400 PSI for Dense Select Structural grade Douglas Fir. A good reference for material strength data for most species and grades of commercially available wood can be found in the American Institute of Timber Construction handbook.\n",
            "A pound (Lb) is a unit of measurement for weight while a yard is a unit of measurement for distance.\n" +
                    "If you are referring to common measurements used on a construction site, a \"yard\" is a common abbreviation for a \"cubic yard\", which is a unit of measurement of volume. (A cubic yard equals 27 cubic feet.)\n" +
                    "Since dirt weighs about 110 pounds per cubic feet, a cubic yard of dirt weighs about 2970 Lbs. Since concrete is heavier (150 PCF), a cubic yard of concrete weighs about 4050 Lbs.\n",
            "Projection line is the way, in which the earth is shown on a flat piece of PAper.\n",
            "The moment of inertia measures the opposition any kind of body will have against a certain momentum (along that same axis) trying to rotate that body.\n",
            "When sleepers were added below the railway, lines the trains ran more smoothly and people fell asleep on their journeys.\n",
            "BMC Software founders Scott Boulett, John Moores, and Dan Cloer began a contract programming PArtnership that operated in and around Houston, Texas.\n",
            "Usually bricks do not grow, but since stuff gets all over, it looks like it grows.\n",
            "A \"street ell\" may have gotten its name because it describes a 90° fitting PArticularly useful in tight, street ditches. When installing water pipes under a street, or from a water service, again under the street, into a home or business, this street ell allows one to change pipe direction with one less fitting, and in less sPAce, than with a standard ell.\n",
            "Absolute pressure is calculated from a vacuum (0 PSI) and atmospheric pressure is14.7PSIa or 14.7 PSI above a vacuum 1PSI on a tire pressure gauge is called 1PSIg\n" +
                    "= 15.7PSIa 10PSIg=24.7PSIa 100PSIg=114.7PSIa etc.\n",
            "Many people and organizations are confused about the difference between quality assurance (QA), quality control (QC), and testing. They are closely related, but  they are different concepts. Since all three are necessary to manage the risks of developing and maintaining software, it is important for software managers to understand the differences. They are defined below:\n" +
                    "Quality Assurance: A set of activities designed to ensure that the development and/or maintenance process is adequate to ensure a system will meet its objectives.\n" +
                    "Quality Control: A set of activities designed to evaluate a developed work product.\n" +
                    "Testing is the process of executing a system with the intent of finding defects. (Note that the \"process of executing a system\" includes test planning prior to the execution of the test cases.)\n",
            "Technically, the Romans were not able to get water to move uphill in a general sense. All aqueducts move water from an elevated source (spring-fed streams in the mountains) to end-users at a lower elevation. The water flows almost entirely downhill from the source to the end user. If the water needed to cross a valley, the Romans would build an arched structure with an elevated channel to cross the valley, but even this channel would have a vary slight downhill gradient that allowed water to flow towards the end user. If a large hill was in their way, the Romans would either divert the channel around the hill, dig a trench through the hill, or dig a tunnel through the hill, all while maintaining a fairly constant, slight downhill gradient towards the end user.\n" +
                    "The only exception to the rule of a generally constant downhill slope to the water channel is that specific tunnel segments, the Romans could build the tunnel as an inverted siphon (mentioned above) to cross a depression or valley and raise the water level on the downhill side almost to the level of the uphill side. To do this requires a well-sealed tunnel strong enough to withstand the increased water pressure within the siphon. Note, however, that except for gaining a little bit of elevation if you slow down fast-moving water, you normally cannot get water to flow out of the outlet at a higher elevation than the inlet. So technically, even the Romans were not able to get water to flow \"up a hill\".\n",
            "As far as only concrete is concerned i.e. plain concrete, the effect of water seePAge is very little (depending upon the grade of concrete) whereas for RCC (reinforced cement concrete) water that seeps in corrodes the reinforcement and thus reduces the life of the structure. The defects that water seePAge induces in concrete are as follows:\n" +
                    "induces capillary formation (due to the detiorating characteristics of water)\n" +
                    "With this capillaries the concrete starts sPAlling out; i.e. the places where capillaries are formed, with even slight amount of stress that portion comes out and exposes the steel to the atmosphere\n" +
                    "Concrete has a pH of about 12 -13. It also reduces the pH of the concrete when in salty water (or) when exposed to marshy areas.\n" +
                    "Reduces the overall strength of concrete\n" +
                    "Reduces durability\n" +
                    "Reduces permeability to further water seePAge\n" +
                    "Results in ageing of structures\n",
            "Cement is usually purchased as a powdery substance that is mixed with sand, aggregate, gravel, and water to form concrete. Since the cement itself is usually a powder, it is hard to measure a standard value for its specific gravity. In addition, since cement is usually not used by itself, knowing its specific gravity is not PArticularly useful.\n" +
                    "A more useful question is \"What is the typical density of concrete?\" A rule of thumb answer is that normal cured concrete has a density of about 150 pounds per cubic foot. This includes the weight of the cement, sand, aggregate, and that PArt of the water that chemically binds with the cement to form the concrete. Since water\n" +
                                         "weighs about 62.4 pounds per cubic feet, concrete is about 2.4 times as heavy. Thus, the specific gravity of concrete is about 2.4. If you took cement and mixed it  with water, you would eventually have a hard lump of useless cement and it would also have a specific gravity of between 2 and 2.4.\n",
            "If the flag was placed by Utility personnel responding to a \"One-call\" locate request, the blue flag indicates a buried water line. You see these marked when a contractor calls the \"Call before you dig number\" a couple of days prior to excavating. This is required by law in each state to reduce the likelihood of damaging underground utilities when excavating.\n",
            "Unlike other fields of engineering, the major advancement of the filed has been in the early years of the century before the last century where the use of concrete technology is advanced. The use of cement as a construction material is since the turn of the last century, improvement in the field increase by the use of steel elements in the construction of buildings and bridges of various types. With the help of two, it was possible to do multistory buildings in the world.\n" +
                    "Machineries were created to speed up the construction structures. The last century has also seen the advent of sophisticated design to withstand the effect of earthquake that was not possible before. With the use of computers, development of model and analysis of structures under the effect of loads was made possible. Before just two decades, it used to take months and months to design high-rise building and big bridges. Now it is a matter of hours.\n",
            "Copper is a very durable material when exposed to weather and is soft enough that it can be easily molded to curved shapes such as those in the Statue of Liberty. It is also traditionally used in buildings for complex roofs, so there would have been trades people available trained to use it.\n" +
                    "Other metals that can be molded are lead but it does not have the attractive verdigris color, and gold much is more expensive\n",
            "The Queen Mary 2 was built for transatlantic crossings, but much smaller ships can make the crossing easily. In 1995, I crossed the Atlantic from New York to the Azores on the Royal Princess (which was not the same ship as the current Royal Princess), which was about one-fourth the size of the QM2. Just about any seaworthy PAssenger ship can navigate the Atlantic safely, if not comfortably.\n",
            "When a dam is to be built, a diversion tunnel is usually bored through solid rock next to the dam site to byPAss the dam construction site. The dam is built while the river flows through the diversion tunnel.\n",
            "One minute of arc as measured at the centre of the Earth covers one nautical mile on the surface of the Earth at mean sea level. One nautical mile is 6080 feet or\n" +
                    "1853.2 meters. Therefore one second of arc would be 6080 / 60 = 101.3 feet or 30.886 meters.\n" +
                    "Lines of latitude are at regular intervals PArallel to the equator. The relationship between degrees of latitude and the distance sPAnned on the earth's surface remains constant. Therefore at all latitudes 1 minute of latitude sPAns 1 nautical mile on the earths surface.\n" +
                    "Lines of longitude converge at the poles. Therefore, the relationship between degrees of longitude and the distance sPAnned on the earth's surface is reduced as the poles are approached.\n" +
                    "At the equator, the distance sPAnned by 1 minute of longitude would be 1 nautical mile. At the poles, it would be zero. To calculate the actual distance on the surface of the earth between two points of known latitude and longitude requires knowledge of spherical trigonometry to calculate the great circle distance between the two points.\n",
            "If you have water pressure and wish to maintain it, do not cause flow in the line, which will reduce pressure due to friction. To keep pressure up, reduce friction by increasing the line size or eliminating some other restriction.\n",
            "Actually, drying is not directly linked to hardness in concrete. After concrete is poured, putting it in a wet environment by spraying it constantly with water will  hasten its hardening and its curing. After concrete cures, it is hard.\n",
            "Pierre L'enfant\n",
            "Gold mines in South Africa go a few kilometers below the surface. The deepest mine now is the Mponeng Mine in the Orange Free State. The depth of the mine is well over 3000m from the surface and is getting deeper. The lift itself descends 3037m to a point 1200m below sea level. It takes 4 minutes.\n",
            "When the 1000 kg are at rest, on Earth with gravitational acceleration 9.81 m/s2, 1000 kg equal 9.81 kN.\n",
            "In the same manner, it was supported when it was constructed. However, it has gotten some \"help\" over the years.\n" +
                    "In the last couple of decades, the responsible PArties rolled up their sleeves and removed something approaching 40 meters3 of earth from under the higher side of  the structure. This had the effect of straightening it toward the vertical by about a foot and a half at the top. For the first time in its history, it is no longer moving. In addition, in the good-news corner of the PAper is that it is open to the public again. In addition, the folks who lived near the tower in the direction it was leaning have returned to their homes and do not have to sleep with an eye and an ear open.\n",
            "They do many interesting things. Their job has to do a lot with design and construction. They can tell you what works and what will not for all sorts of situations. There is a lot of mathematics involved along with many other disciplines. They have to have a good solid understanding of how the environment works and how nature interacts with man made. They are probably best known for designing bridges, interstates, skyscrapers, canals, and so forth.\n",
            "It takes 28 days to cure.\n",
            "The Grand Coulee Dam - Grand Coulee, Washington\n" +
                    "Length 5,223 ft\n" +
                    "Height 550 ft\n",
            "Pretty good if the outside hose is a lot lower than the inside hose. The siphon works by a hose stuck in a fluid container higher than the receiving container. Suction is shortly placed on the lower side of the hose until the fluid is flowing down the down line. Gravity will cause a continued flow.\n",
            "For nominal Mix Cement consumption for M25 will be 570 kg per cum. and for Design Mix it can be optimized to 510 kg per cum.\n",
            "145 PCF\n",
            "Tensile Strength for a Bolt is determined by applying a Force along it long axis. Shear Strength for a Bolt is determined by applying a Force across its diameter, as it would be loaded in a lug joint.\n",
            "A person will sink in water if he is not holding enough air in his lungs to keep him floating. Therefore, the person weighs more than the amount of water that he will displace.\n",

            "The area ratio decreases slowly at first then more rapidly.\n" +
                    "The area of an ellipse is A=pi x a X b, a and b are the 1/2 major and 1/2 minor axis. If a = r = b the area is A=pi X r2, which is a circle. Not hard to graph this but you will have to write the area of the ellipse in terms of the circumference.\n",
            "Orifice meter is used for measuring flow rate air.\n",
            "Stacks\n",
            "There are many gravity dams constructed of comPActed earth. High dams are generally concrete. All dams require a spillway to be safe. The spillway must be armored.\n",
            "There are 9 square feet in a square yard therefore there are 36 square feet in 4 square yards.\n",
            "For purposes of civil engineering, an average soil will have a density of about 100 to 110 pounds per cubic foot. (This can vary a little depending upon how well compacted the soil is.)\n",
            "The pillars\n",
            "In engineering, the code-allowable withdrawal force is zero, because the wood exPAnds and contracts over time and the nail pullout force can reduce to zero.\n",
            "0.61 * d2, where d is the diameter of the pipe in inches.\n",
            "Tensile Strength, Ultimate 7.00 - 20.0 MPA 1020 - 2900 PSI this is the strength in a pure tension test. For bending use: Modulus of Rupture 0.00410 - 0.0276 GPA 0.595 - 4.00 ksi\n",
            "If it floats it is less dense than water, 62.4 lbs/cubic ft. Wood is about 40 lbs/ cu.ft.--it floats. Concrete is 150 lbs. / cu.ft. -- It does not float.\n",
            "Civil means like, when you do not get on with someone, but only talk when you have to. Alternatively, when you do talk you do not argue. Alternatively, if you are with someone who is of your both friends and family, you do not ruin it for them.\n",
            "Disadvantages: -Lead is very toxic; its use can result in pollution of the ground and more importantly of water supplies. This leads to the contamination of drinking water and can cause hazards to human health as well as disrupting entire ecosystems.\n" +
                    "Advantages: Because of its toxicity, lead is being bought less and less around the world, which of course results in the lowering of its cost. In addition, lead melts at a relatively low temperature, making it great for solder. However, recently the Chinese have show an interest in buying mass quantities to manufacture batteries made from a base of lead so the price of this metal may soon rise.\n",
            "Same as in inches 3.14159265 and PSI have to be known.\n",
            "Therometer\n",
            "kn (both letters lowercase) is knots, which is a speed nautical miles per hour.\n",
            "Noob\n",
            "They prevent, or slow down erosion, and stop long shore drift. This, however, can have bad knock-on effects somewhere near.\n",
            "A column is used to support the weight of the roof and/or the upper floors. Now days, many columns are used for decorative purposes. A column along with load bearing beams can support a lot of weight.\n",
            "If you have never used a ice dam melting sock on your roof before, you will find that they provide an inexpensive method for removing roof ice dams and improving your home's heating efficiency. Roof ice dams are an annoying source of roof damage, leaks, and heat loss in the winter. The main causes are drip melt from improperly capped warm air vent pipes and poor roof insulation. Laying a ice melt sock onto the roof so it crosses the ice dam and overhangs the gutter, will melt through the snow and ice and create a channel for water to flow down into the gutters or off the roof. If done properly those ice sickles that form as the snow melts from the edges of the gutters will never appear, they too are a cause of much damage and are dangerous to life and limb.\n",
            "for slab 2.5 to 3 cm, columns 3cm, beams 3 cm and footings 4 to 7 cm as per size of footing\n",
            "7850 kg/m3\n",
            "1000 litres in 1 cum\n",
            "A bending moment is the reaction induced in a structural element when an external force or moment is applied to the element causing the element to bend. in the free end of cantilever beam the moment should be maximum, and the middle of simply supported beam BM will be maximum.\n",
            "bend cause if load act over the beam\n",
            "For testing the crushing strength of concrete in the labortary,concrete cubes are molded during the exicution of concretting by the engineer incharge\n",
            "Rs.1450\n",
            };

    List<String> civilarrayquestionlist = Arrays.asList(listArraycivil);
    ArrayList<String> civilupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adaptercivil;
    List<String> civilarrayanswerlist = Arrays.asList(datacivil);
    ArrayList<String> civilupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil);
        ListView listViewcivil = (ListView) findViewById(R.id.listcivil);







            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        civilupdatequestionlist.addAll(civilarrayquestionlist);
        civilupdateanswerlist.addAll(civilarrayanswerlist);


        adaptercivil = new ArrayAdapter<String>(this, R.layout.textfieldlist, civilupdatequestionlist);



        listViewcivil.setAdapter(adaptercivil);


        listViewcivil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questioncivil = civilupdatequestionlist.get(position);
                String datacivil = civilupdateanswerlist.get(position);
                Intent start = new Intent(getApplicationContext(), civildata.class);
                start.putExtra("senddatacivil", datacivil);
                start.putExtra("senddata1civil", questioncivil);

                startActivity(start);


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

    String userquestioncivil;
    String useranswercivil;

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
            alert.setTitle("Add question of Civil");


            // Set an EditText view to get user input
            final EditText civilquestion = new EditText(this);
            civilquestion.setHint("Question");
            final EditText civilanswer = new EditText(this);
            civilanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(civilquestion);
            layout.addView(civilanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestioncivil = civilquestion.getEditableText().toString();
                    useranswercivil = civilanswer.getEditableText().toString();


                    if (userquestioncivil.length() > 0) {
                        civilupdatequestionlist.add(userquestioncivil);

                        adaptercivil.notifyDataSetChanged();
                        Toast.makeText(civil.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferences(userquestioncivil);


                    }
                    if (useranswercivil.length() <= 0 && userquestioncivil.length() != 0) {

                        useranswercivil = " ";


                    }
                    if (useranswercivil.length() > 0) {
                        civilupdateanswerlist.add(useranswercivil);
                        adaptercivil.notifyDataSetChanged();
                        saveStringToPreferences1(useranswercivil);


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

    private SharedPreferences prefs;
    private String prefName = "myPhrasesStorage";
    private static final String PHRASE = "Phrase_";


    private void saveStringToPreferences(String str) {
        prefs = getSharedPreferences(prefName, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        //increments index by 1
        editor.putInt("phrase_count", prefs.getInt("phrase_count", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor.putString(PHRASE + (prefs.getInt("phrase_count", 0) + 1), userquestioncivil);

        editor.commit();
    }

    private SharedPreferences prefs1;
    private String prefName1 = "myPhrasesStorage1";
    private static final String PHRASE1 = "Phrase_1";

    private void saveStringToPreferences1(String str1) {
        prefs1 = getSharedPreferences(prefName1, MODE_PRIVATE);
        SharedPreferences.Editor editor1 = prefs1.edit();
        //increments index by 1
        editor1.putInt("phrase_count1", prefs1.getInt("phrase_count1", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1.putString(PHRASE1 + (prefs1.getInt("phrase_count1", 0) + 1), useranswercivil);

        editor1.commit();
    }

    public void onResume() {
        super.onResume();

            prefs = getSharedPreferences(prefName, MODE_PRIVATE);
            LinkedList<String> phrasesCollection = new LinkedList<String>();
            int phraseCount = prefs.getInt("phrase_count", 0);

            for (int i = 1; i <= phraseCount; i++) {
                phrasesCollection.add(prefs.getString(PHRASE + i, "<< Enter a phrase >>"));
            }

            civilupdatequestionlist.addAll(phrasesCollection);
            adaptercivil.notifyDataSetChanged();



            prefs1 = getSharedPreferences(prefName1, MODE_PRIVATE);
            LinkedList<String> phrasesCollection1 = new LinkedList<String>();
            int phraseCount1 = prefs1.getInt("phrase_count1", 0);

            for (int j = 1; j <= phraseCount1; j++) {
                phrasesCollection1.add(prefs1.getString(PHRASE1 + j, "<< Enter a phrase >>"));
            }

            civilupdateanswerlist.addAll(phrasesCollection1);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







