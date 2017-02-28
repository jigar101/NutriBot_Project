package com.apps.dietplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.apps.nutribot.R;

public class Recipe extends Activity {
	
	TextView  txt1,txt2,txt3,txt9,txt10,txt12;
	ImageView img,img1,img2;
	ScrollView scrollView;
	int a;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		 
		setContentView(R.layout.recipe);
		 
		img = (ImageView)findViewById(R.id.imageView_head);
		scrollView = (ScrollView)findViewById(R.id.scrollView1);
		txt1 = (TextView)findViewById(R.id.textView1);
		txt2 = (TextView)findViewById(R.id.textView2);
		txt3 = (TextView)findViewById(R.id.textView3);		 	 
		txt9 = (TextView)findViewById(R.id.textView9);
		txt10 = (TextView)findViewById(R.id.textView10);
		txt12 = (TextView)findViewById(R.id.textView12);
		img1 = (ImageView)findViewById(R.id.imageView1);
		img2 = (ImageView)findViewById(R.id.imageView2);		 
		
		 
		
		Intent i = getIntent();
		a = i.getIntExtra("box3",0);
		
		if (a == 1) {
			
			txt1.setText("Vietnamese-Style Beef & Noodle Broth");
			txt2.setText("2 teaspoons canola oil\n1 pound beef flank steak, very thinly sliced against the grain (see Tip)\n4 cups chopped bok choy, (1 small head, about 1 pound)\n4 cups reduced-sodium chicken broth\n1 cup water\n4 ounces wide rice noodles\n2 teaspoons reduced-sodium soy sauce\n1 1/2 cups mung bean sprouts\n 4 tablespoons chopped fresh basil, or to taste");
			txt3.setText("Heat oil in a Dutch oven or soup pot over high heat.\nAdd beef and cook, stirring often, until just cooked, about 2 minutes.\nTransfer to a plate using tongs, leaving the juices in the pot.\nAdd bok choy to the pot and cook, stirring, until wilted, about 2 minutes.\nAdd broth and water, cover and bring to a boil.\nAdd noodles and soy sauce; simmer until the noodles are soft, about 4 minutes.\nReturn the beef to the pot and cook until heated through,1 to 2 minutes more. Ladle into bowls and sprinkle with bean sprouts and basil.\nServe hot.");
			img1.setBackgroundResource(R.drawable.rec1);		 
			
			
		}else if(a == 2) {
			
			txt1.setText("Green & Yellow Beans with Wild Mushrooms");
			txt2.setText("1 pound green beans, trimmed\n1 pound yellow wax beans, trimmed\n3 tablespoons extra-virgin olive oil\n2 cloves garlic, minced\n8 ounces wild mushrooms, such as chanterelle, oyster or porcini, trimmed and sliced (see Substitution Note)\n1/2 teaspoon kosher salt, divided\nFreshly ground pepper, to taste");
			txt3.setText("Bring a large pot of water to a boil.\nAdd green beans and wax beans and cook until tender-crisp, about 4 minutes.\n(Cook for another minute or two if you like your green beans more tender.) Drain well.\nMeanwhile, heat oil in a large heavy skillet over medium heat.\nAdd garlic and cook, stirring, until fragrant, about 1 minute.\nStir in mushrooms and cook, stirring, until they release their juices and most of the liquid has evaporated, about 5 minutes.\nSeason with 1/4 teaspoon salt and pepper.\nReserve 1 tablespoon of the mushrooms for garnish.\nAdd the cooked beans to the mushrooms in the pan and cook, stirring to combine, until heated through, 1 to 3 minutes.\nSeason with the remaining 1/4 teaspoon salt and pepper.\nServe topped with the reserved mushrooms.");
			img1.setBackgroundResource(R.drawable.rec2);
		
		}else if(a == 3) {
			
			txt1.setText("Roasted Cod with Warm Tomato-Olive-Caper Tapenade");
			txt2.setText("1 pound cod fillet (see Tip)\n3 teaspoons extra-virgin olive oil, divided\n1/4 teaspoon freshly ground pepper\n1 tablespoon minced shallot\n1 cup halved cherry tomatoes\n1/4 cup chopped cured olives\n1 tablespoon capers, rinsed and chopped\n1 1/2 teaspoons chopped fresh oregano\n1 teaspoon balsamic vinegar");
			txt3.setText("Preheat oven to 450�F. Coat a baking sheet with cooking spray.\n Rub cod with 2 teaspoons oil. Sprinkle with pepper. Place on the prepared baking sheet. Transfer to the oven and roast until the fish flakes easily with a fork, 15 to 20 minutes, depending on the thickness of the fillet.\nMeanwhile, heat the remaining 1 teaspoon oil in a small skillet over medium heat. Add shallot and cook, stirring, until beginning to soften, about 20 seconds. Add tomatoes and cook, stirring, until softened, about 1 1/2 minutes. Add olives and capers; cook, stirring, for 30 seconds more. Stir in oregano and vinegar; remove from heat. Spoon the tapenade over the cod to serve.");
			img1.setBackgroundResource(R.drawable.rec3);
		
		}else if (a == 4) {
			
			txt1.setText("Warm Salmon Salad with Crispy Potatoes");
			txt2.setText("2 tablespoons extra-virgin olive oil, divided\n2 small yellow-fleshed potatoes, such as Yukon Gold, scrubbed and cut into 1/8-inch slices\n1/2 teaspoon salt, divided\n1 medium shallot, thinly sliced\n2 teaspoons rice vinegar\n1/4 cup buttermilk\n2 7-ounce cans boneless, skinless salmon, drained\n4 cups arugula");
			txt3.setText("Heat 1 tablespoon oil in a large nonstick skillet over medium-high heat.\nAdd potatoes and cook, turning once, until brown and crispy, 5 to 6 minutes per side.\nTransfer to a plate and season with 1/4 teaspoon salt; cover with foil to keep warm.\nCombine the remaining 1 tablespoon oil, 1/4 teaspoon salt, shallot and vinegar in a small saucepan.\nBring to a boil over medium heat.\nRemove from the heat and whisk in buttermilk.\nPlace salmon in a medium bowl and toss with the warm dressing.\nDivide arugula among 4 plates and top with the potatoes and salmon.");
			img1.setBackgroundResource(R.drawable.rec4);
		
		}else if (a == 5) {
			
			txt1.setText("Beef Tataki");
			txt2.setText("1 cup matchstick-cut red radishes, or peeled daikon radish (see Note)\n1 cup matchstick-cut carrots\n1/2 cup thinly sliced onion\n1/4 cup reduced-sodium soy sauce\n2 tablespoons plus 2 teaspoons lemon juice\n2 tablespoons finely chopped scallions\n2 teaspoons finely grated fresh ginger\n1 pound boneless sirloin steak, 3/4-1 inch thick, trimmed\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n2 teaspoons canola oil");
			txt3.setText(" Place radishes (or daikon), carrot and onion in a medium bowl.\nCover with cold water and let soak for 5 minutes. Drain.\nCombine soy sauce, lemon juice, scallions and ginger in a small bowl.\nAdd 2 tablespoons of the mixture to the drained vegetables and toss.\nSet aside the remaining sauce.\nSeason steak on both sides with salt and pepper.\nHeat oil in a large nonstick skillet over medium-high heat.\nCook the steak 3 to 4 minutes per side for medium-rare.\nLet rest on a cutting board for 5 minutes, then thinly slice and serve with the vegetables, drizzled with the reserved sauce.");
			img1.setBackgroundResource(R.drawable.rec5);
			
		}else if(a == 6) {
			
			txt1.setText("�Cocoa-Nut� Bananas");
			txt2.setText("4 teaspoons cocoa powder\n4 teaspoons toasted unsweetened coconut\n2 small bananas, sliced on the bias");
			txt3.setText("Place cocoa and coconut on separate plates.\nRoll each banana slice in the cocoa, shake off the excess, then dip in the coconut.");
			img1.setBackgroundResource(R.drawable.rec6);
		
		}else if (a == 7) {
			
			txt1.setText("Pineapple-Raspberry Parfaits");
			txt2.setText("2 8-ounce containers (2 cups) nonfat peach yogurt\n1/2 pint fresh raspberries, (about 1 1/4 cups)\n1 1/2 cups fresh, frozen or canned pineapple chunks");
			txt3.setText("Divide and layer yogurt, raspberries and pineapple into 4 glasses.");
			img1.setBackgroundResource(R.drawable.rec7);
			
		}else if (a == 8) {
			
			txt1.setText("Lemony Lentil Salad with Salmon");
			txt2.setText("1/3 cup lemon juice\n1/3 cup chopped fresh dill\n2 teaspoons Dijon mustard\n1/4 teaspoon salt\nFreshly ground pepper to taste\n1/3 cup extra-virgin olive oil\n1 medium red bell pepper, seeded and diced\n1 cup diced seedless cucumber\n1/2 cup finely chopped red onion\n2 15-ounce cans lentils, rinsed, or 3 cups cooked brown or green lentils (see Tip)\n2 7-ounce cans salmon , drained and flaked, or 1 1/2 cups flaked cooked salmon");
			txt3.setText("Whisk lemon juice, dill, mustard, salt and pepper in a large bowl.\nGradually whisk in oil.\nAdd bell pepper, cucumber, onion, lentils and salmon; toss to coat.");
			img1.setBackgroundResource(R.drawable.rec8);
			
		}else if (a == 9) {
			
			txt1.setText("Grilled Steak with Pepper Relish");
			txt2.setText("3 small red, yellow and/or orange bell peppers, sliced\n1 small onion, halved and sliced\n2 tablespoons balsamic vinegar\n1 tablespoon extra-virgin olive oil\n1 tablespoon capers, rinsed\n1 tablespoon finely chopped fresh thyme or 1 teaspoon dried, divided\n1/2 teaspoon salt, divided\n1/2 teaspoon freshly ground pepper, divided\n1 pound sirloin steak or strip steak (1-1 1/4 inches thick), trimmed and cut into 4 portions\n1 teaspoon garlic powder");
			txt3.setText("Preheat grill to medium.\nCombine bell peppers, onion, vinegar, oil, capers, 2 teaspoons fresh thyme (or 3/4 teaspoon dried) and 1/4 teaspoon each salt and pepper in a large bowl.\nStack two 30-inch-long pieces of foil.\nArrange the pepper mixture on one half and fold the foil.\nTightly seal the packet by crimping and folding the edges together.\nSprinkle both sides of steak with garlic powder, the remaining thyme and 1/4 teaspoon each salt and pepper.\nOil the grill rack (see Tip).\nPlace the steak and foil packet on the grill.\nGrill the steak about 4 minutes per side for medium-rare, 5 minutes per side for medium.\nGrill the packet until the vegetables are tender, 10 to 12 minutes.\nLet the steak rest for 5 minutes.\nServe the steak with the peppers.");			 
			img1.setBackgroundResource(R.drawable.rec9);
			
		}else if (a == 10) {
			
			txt1.setText("Vietnamese Steak Sandwich");
			txt2.setText("3 tablespoons fish sauce, (see Note)\n3 tablespoons lime juice\n4 teaspoons brown sugar\n1/2 teaspoon freshly ground pepper\n1pound flank steak, thinly sliced against the grain\n1 teaspoon canola oil\n6 tablespoons reduced-fat mayonnaise\n3 12-inch baguettes, cut in half and split horizontally\n2 small carrots, shredded or cut into matchsticks\n1/2 small cucumber, cut into thin spears\n1/2 cup shredded peeled daikon radish\n3 scallions, trimmed and thinly sliced\n1/3 cup coarsely chopped fresh cilantro");
			txt3.setText("Preheat grill to high.\nWhisk fish sauce, lime juice, brown sugar and pepper in a shallow dish until the sugar dissolves.\nSet aside 2 tablespoons of the sauce in a small bowl for Step 4.\nPlace steak in a medium bowl, add oil and toss to coat.\nOil the grill rack (see Tip).\nGrill the steak slices, turning once, until cooked through, 3 to 4 minutes total.\nTransfer to the dish with the marinade, stir to coat and refrigerate for 15 minutes or up to 8 hours.\nTo assemble sandwiches: Add mayonnaise to the reserved sauce and stir to combine.\nSpread the mixture on baguettes, top with the marinated steak, carrots, cucumber, daikon, scallions and cilantro.\nSlice the sandwiches in half.");
			img1.setBackgroundResource(R.drawable.rec10);
			
		}else if (a == 11) {
			
			txt1.setText("Grilled Whole Trout with Lemon-Tarragon Bean Salad");
			txt2.setText("1/4 cup chopped fresh tarragon, plus 4 whole sprigs\n3 tablespoons lemon juice\n2 tablespoons extra-virgin olive oil\n1 tablespoon chopped shallot\n1 teaspoon kosher salt, divided\n1/4 teaspoon sugar\n1/4 teaspoon freshly ground pepper, divided\n1 15-ounce can small white beans, rinsed\n1/3 cup chopped roasted red peppers\n4 cleaned whole rainbow trout, (about 5 ounces each; see Shopping Tip)\n12 thin slices of lemon, (1-2 lemons)");
			txt3.setText("Whisk chopped tarragon, lemon juice, oil, shallot, 1/4 teaspoon salt, sugar and 1/8 teaspoon pepper in a medium bowl until combined.\nReserve 2 tablespoons of the dressing; add beans and peppers to the rest and toss to combine.\nPreheat grill to medium-high.\nCoat a large fish-grilling basket with cooking spray.\nStuff each trout with 3 slices lemon and 1 tarragon sprig.\nSprinkle inside and out with the remaining 3/4 teaspoon salt and 1/8 teaspoon pepper.\nPlace in the basket.\nGrill the fish until the skin is golden and crispy, 4 to 5 minutes per side.\nCarefully remove the lemon and tarragon, drizzle the fish with the reserved dressing and serve with the bean salad.");
			img1.setBackgroundResource(R.drawable.rec11);
			
		}else if(a == 12) {
			
			txt1.setText("Strawberry Sherbet");
			txt2.setText("2 cups chopped fresh or frozen (not thawed) strawberries , (about 10 ounces), divided\n1/2 cup sugar\n2 1/2 cups nonfat or low-fat buttermilk\n1/2 cup half-and-half\n2 teaspoons lemon juice\n1 teaspoon vanilla extract\nPinch of salt");
			txt3.setText("Combine 1 cup berries and sugar in a small bowl and let sit, stirring occasionally until the sugar has begun to dissolve, about 10 minutes.\nTransfer the berry mixture to a food processor or blender and process until smooth.\nMeanwhile, combine buttermilk, half-and-half, lemon juice, vanilla and salt in a medium bowl.\nPress the strawberry mixture through a fine-mesh sieve into the bowl.\nStir, cover and chill for at least 2 hours or up to 1 day.\nWhisk the sherbet mixture and pour into the canister of an ice cream maker.\nFreeze according to manufacturer�s directions.\nDuring the last 5 minutes of freezing, add the remaining 1 cup chopped berries.\nIf necessary, place the sherbet in the freezer to firm up before serving.\n(If the sherbet becomes very hard in the freezer, soften it in the refrigerator for about 30 minutes before scooping.)");
			img1.setBackgroundResource(R.drawable.rec12);
			
		}else if (a == 13) {
			
			txt1.setText("Cranberry Muesli");
			txt2.setText("1/2 cup low-fat plain yogurt\n1/2 cup unsweetened or fruit-juice-sweetened cranberry juice\n6 tablespoons old-fashioned rolled oats, (not quick-cooking or steel-cut)\n2 tablespoons dried cranberries\n1 tablespoon unsalted sunflower seeds\n1 tablespoon wheat germ\n2 teaspoons honey\n1/4 teaspoon vanilla extract\n1/8 teaspoon salt");
			txt3.setText("Combine yogurt, juice, oats, cranberries, sunflower seeds, wheat germ, honey, vanilla and salt in a medium bowl; cover and refrigerate for at least 8 hours and up to 1 day.");
			img1.setBackgroundResource(R.drawable.rec13);
		
		}else if (a == 14) {			
			
			txt1.setText("Herbed Lamb Chops with Greek Couscous Salad");
			txt2.setText("1 cup water\n1 tablespoon minced garlic\n1 tablespoon finely chopped fresh parsley\n1/4 teaspoon salt\n2 1/2 pounds lamb loin chops, (about 8), trimmed of fat\n2 teaspoons extra-virgin olive oil\n1/2 cup whole-wheat couscous\n2 medium tomatoes, chopped\n1 medium cucumber, peeled and chopped\n1/2 cup crumbled feta\n3 tablespoons lemon juice\n2 tablespoons finely chopped fresh dill");
			txt3.setText("Put water on to boil in a medium saucepan.\nCombine garlic, parsley and salt in a small bowl.\nPress the garlic mixture into both sides of lamb chops.\nHeat oil in a large nonstick skillet over medium-high heat.\nAdd the lamb chops and cook to desired doneness, 5 to 6 minutes per side for medium. Keep warm.\nMeanwhile, stir couscous into the boiling water.\nReturn to a boil, reduce heat to a low simmer, cover and cook for 2 minutes.\nRemove from the heat and let stand, covered, for 5 minutes; fluff with a fork.\nTransfer to a medium bowl.\nAdd tomatoes, cucumber, feta, lemon juice and dill.\nStir to combine.\nServe the couscous with the lamb chops.");
			img1.setBackgroundResource(R.drawable.rec14);
		
		}else if (a == 15) {
			
			txt1.setText("Turkey with Blueberry Pan Sauce");
			txt2.setText("1/4 cup all-purpose flour\n3/4 teaspoon salt, divided\n1/2 teaspoon freshly ground pepper\n1 pound turkey tenderloin, (see Ingredient note)\n1 tablespoon extra-virgin olive oil\n1/4 cup chopped shallots\n1 tablespoon chopped fresh thyme\n2 cups blueberries\n3 tablespoons balsamic vinegar");
			txt3.setText("Preheat oven to 450�F.\nWhisk flour, 1/2 teaspoon salt and pepper in a shallow dish.\nDredge turkey in the mixture.\n(Discard any leftover flour.)=n Heat oil in a large ovenproof skillet over high heat.\nAdd the turkey; cook until golden brown on one side, 3 to 5 minutes.\nTurn the turkey over and transfer the pan to the oven.\nRoast until the turkey is just cooked through and no longer pink in the middle, 15 to 20 minutes.\nTransfer the turkey to a plate and tent with foil to keep warm.\nPlace the skillet over medium heat.\n(Take care, the handle will still be very hot.) Add shallots and thyme and cook, stirring constantly, until the shallots begin to brown, 30 seconds to 1 minute.\nAdd blueberries, vinegar and the remaining 1/4 teaspoon salt; continue cooking, stirring occasionally and scraping up any brown bits, until the blueberries burst and release their juices and the mixture becomes thick and syrupy, 4 to 5 minutes.\nSlice the turkey and serve with the blueberry pan sauce.");
			img1.setBackgroundResource(R.drawable.rec15);
			
		}else if (a == 16) {
			
			txt1.setText("Spicy Thai Shrimp Salad");
			txt2.setText("2 tablespoons lime juice\n4 teaspoons fish sauce, (see Note)\n1 tablespoon canola oil\n2 teaspoons light brown sugar\n1/2 teaspoon crushed red pepper\n1 pound cooked and peeled small shrimp\n1 cup thinly sliced red, yellow and/or orange bell pepper\n1 cup seeded and thinly sliced cucumber\n1/4 cup mixed chopped fresh herbs, such as basil, cilantro and/or mint");
			txt3.setText("Whisk lime juice, fish sauce, oil, brown sugar and crushed red pepper in a large bowl.\nAdd shrimp, bell pepper, cucumber and fresh herbs; toss to coat.");
			img1.setBackgroundResource(R.drawable.rec16);
			
		}else if(a == 17) {
			
			txt1.setText("Chocolate-Raspberry Frozen Yogurt Pops");
			txt2.setText("2 cups fresh or frozen raspberries\n2 cups nonfat or low-fat plain yogurt, preferably Greek-style (see Note)\n3-5 tablespoons sugar\n1/2 cup mini chocolate chips");
			txt3.setText("Puree raspberries, yogurt and sugar to taste in a food processor until smooth.\nDivide the mixture among freezer-pop molds, stopping about 1 inch from the top.\nEvenly divide chocolate chips among the molds.\nStir the chips into the raspberry mixture, stirring out any air pockets at the same time.\nInsert the sticks and freeze until completely firm, about 6 hours.\nDip the molds briefly in hot water before unmolding.");
			img1.setBackgroundResource(R.drawable.rec17);
			
		}else if (a == 18) {
			
			txt1.setText("Almond-Crusted Chicken Fingers");
			txt2.setText("Canola oil cooking spray\n1/2 cup sliced almonds\n1/4 cup whole-wheat flour\n1 1/2 teaspoons paprika\n1/2 teaspoon garlic powder\n1/2 teaspoon dry mustard\n1/4 teaspoon salt\n1/8 teaspoon freshly ground pepper\n1 1/2 teaspoons extra-virgin olive oil\n4 large egg whites\n1 pound chicken tenders, (see Ingredient Note)");
			txt3.setText("Preheat oven to 475�F.\nLine a baking sheet with foil.\nSet a wire rack on the baking sheet and coat it with cooking spray.\nPlace almonds, flour, paprika, garlic powder, dry mustard, salt and pepper in a food processor; process until the almonds are finely chopped and the paprika is mixed throughout, about 1 minute.\nWith the motor running, drizzle in oil; process until combined.\nTransfer the mixture to a shallow dish.\nWhisk egg whites in a second shallow dish.\nAdd chicken tenders and turn to coat.\nTransfer each tender to the almond mixture; turn to coat evenly.\n(Discard any remaining egg white and almond mixture.) Place the tenders on the prepared rack and coat with cooking spray; turn and spray the other side.\nBake the chicken fingers until golden brown, crispy and no longer pink in the center, 20 to 25 minutes.");
			img1.setBackgroundResource(R.drawable.rec18);
			
		}else if (a == 19) {
			
			txt1.setText("A Gilding of Shrimp & Saffron Rice");
			txt2.setText("2 1/2 cups water\n1 teaspoon salt, divided\n1/4-1/2 teaspoon saffron threads, (see Ingredient Note)\n1 cup long-grain brown rice\n2 tablespoons extra-virgin olive oil\n3 medium yellow summer squash, quartered lengthwise and cut into 1/4-inch-thick slices\n1 pound raw shrimp, (21-25 per pound), peeled and deveined\n1/3 cup tightly packed fresh mint leaves, finely chopped\n2 tablespoons lemon juice\nFreshly ground pepper, to taste");
			txt3.setText("Bring water, 1/2 teaspoon salt and saffron to taste to a boil in a medium saucepan.\nAdd rice, return to a boil, cover and reduce the heat to maintain a gentle simmer.\nCook until the water is absorbed and the rice is tender, 40 to 45 minutes.\nFluff with a fork.\nAbout 10 minutes before the rice is done, heat oil in a large skillet over medium heat.\nAdd squash and cook, stirring occasionally, until just tender (do not brown), 5 to 7 minutes.\nStir in shrimp and cook, stirring constantly, for 2 minutes.\nStir in mint and cook for 30 seconds.\nStir in lemon juice; remove from heat.\nSeason with the remaining 1/2 teaspoon salt and pepper.\nServe over the rice.");
			img1.setBackgroundResource(R.drawable.rec19);
			
		}else if(a == 20) {
			
		 	txt1.setText("Watermelon-Blueberry Ice Pops");
			txt2.setText("3 3/4 cups chopped seedless watermelon\n2 tablespoons lime juice\n1-2 tablespoons sugar\n1 cup fresh blueberries");
			txt3.setText("Puree watermelon, lime juice and sugar to taste in a food processor or blender until smooth.\nivide blueberries among freezer-pop molds.\nTop with the watermelon mixture.\nInsert the sticks and freeze until completely firm, about 6 hours.\nDip the molds briefly in hot water before unmolding.");
			img1.setBackgroundResource(R.drawable.rec20);
			
		}else if (a == 21) {
			
			txt1.setText("Grilled Chicken Tenders with Cilantro Pesto");
			txt2.setText("1/4 cup lime juice\n1/4 cup reduced-sodium soy sauce\n1 tablespoon canola oil\n1 teaspoon chili powder\n1 pound chicken tenders\n2 cups loosely packed fresh cilantro leaves, (1-2 bunches)\n2 scallions, sliced\n2 tablespoons toasted sesame seeds, (see Ingredient Note)");
			txt3.setText("Whisk lime juice, soy sauce, oil and chili powder in a large bowl.\nReserve 2 tablespoons of the marinade in a small bowl.\nAdd chicken to the remaining marinade; toss to coat.\nMarinate in the refrigerator for 20 minutes or up to 1 hour.\nPreheat grill to medium-high.\nMeanwhile, place cilantro, scallions, sesame seeds and the reserved marinade in a food processor and process until fairly smooth.\nOil the grill rack (see Tip).\nRemove the chicken from the marinade (discard marinade) and grill until cooked through and no longer pink in the middle, about 2 minutes per side.\nServe the chicken with the cilantro-sesame pesto.");
			img1.setBackgroundResource(R.drawable.rec21);
			
		}else if (a == 22) {
			
			txt1.setText("Chopped Greek Salad with Chicken");
			txt2.setText("1/3 cup red-wine vinegar\n2 tablespoons extra-virgin olive oil\n1 tablespoon chopped fresh dill, or oregano or 1 teaspoon dried\n1 teaspoon garlic powder\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n6 cups chopped romaine lettuce\n2 1/2 cups chopped cooked chicken, (about 12 ounces; see Tip)\n2 medium tomatoes, chopped\n1 medium cucumber, peeled, seeded and chopped\n1/2 cup finely chopped red onion\n1/2 cup sliced ripe black olives\n1/2 cup crumbled feta cheese");
			txt3.setText("Whisk vinegar, oil, dill (or oregano), garlic powder, salt and pepper in a large bowl.\nAdd lettuce, chicken, tomatoes, cucumber, onion, olives and feta; toss to coat.");
			img1.setBackgroundResource(R.drawable.rec22);
			
		}else if (a == 23) {
			
			txt1.setText("Mixed Lettuce Salad with Cucumber Herb Vinaigrette");
			txt2.setText("VINAIGRETTE\n1 small cucumber, peeled, seeded and chopped\n1/4 cup extra-virgin olive oil\n2 tablespoons red-wine vinegar\n2 tablespoons chopped fresh chives\n2 tablespoons chopped fresh parsley\n1 tablespoon nonfat or low-fat plain yogurt\n1 teaspoon Dijon mustard\n1 teaspoon prepared horseradish\n1 teaspoon sugar\n1/2 teaspoon salt\n\nSALAD\n1/2 small clove garlic\nPinch of salt\n2 cups Red Oak or other red leaf lettuce\n2 cups Freckles or other baby romaine\n1/2 cup sliced radishes\n4 scallions, sliced\n2 hard-boiled eggs, peeled and chopped (see Tip)");
			txt3.setText("To prepare vinaigrette: Puree cucumber, oil, vinegar, chives, parsley, yogurt, mustard, horseradish, sugar and 1/2 teaspoon salt in a blender until smooth.\nTo prepare salad: Season a wooden salad bowl by rubbing with garlic and pinch of salt.\nChop the garlic and add to the bowl along with all the lettuce.\nPour 1/4 cup of the vinaigrette over the greens; toss to coat.\n(Cover and refrigerate the remaining 1 cup vinaigrette for up to 3 days.) Serve the salad garnished with radishes, scallions and hard-boiled egg.");
			img1.setBackgroundResource(R.drawable.rec23);
			
		}else if(a == 24) {
			
			txt1.setText("Grilled Tuna with Olive Relish");
			txt2.setText("GRILLED TUNA WITH OLIVE RELISH\n\nOlive Relish\n1/2 cup finely chopped fresh parsley\n1/3 cup chopped pitted imported black olives, such as kalamata\n1/4 cup finely chopped celery\n1 small clove garlic, minced\n1/2 teaspoon dried oregano\n1 tablespoon lemon juice\n1 teaspoon extra-virgin olive oil\n1/8 teaspoon salt\nFreshly ground pepper, to taste\n\nGRILLED TUNA\n1 3/4 pounds tuna steak, trimmed and cut into 6 portions\n1 tablespoon extra-virgin olive oil\n1/4 teaspoon salt\n1/8 teaspoon freshly ground pepper\nLemon wedges, for garnish");
			txt3.setText("To prepare olive relish: Combine parsley, olives, celery, garlic, oregano, lemon juice, oil, salt and pepper in a small bowl.\nTo grill tuna: Preheat grill to medium-high.\nRub tuna all over with oil and season with salt and pepper.\nGrill the tuna until seared on both sides and just cooked through, about 4 minutes per side.\nServe with Olive Relish and lemon wedges.");
			img1.setBackgroundResource(R.drawable.rec24);
		}else if (a == 25) {
			
			txt1.setText("Maple-Nut Granola");
			txt2.setText("5 cups old-fashioned rolled oats\n1 cup unsweetened coconut chips, (see Ingredient Note) or flakes\n1/2 cup sliced almonds\n1/2 cup coarsely chopped pecans\n1/2 cup light brown sugar\n1/3 cup unsalted pumpkin seeds\n1/3 cup unsalted sunflower seeds\n1/2 cup pure maple syrup\n1/2 cup water\n1/4 cup canola oil\n1/2 cup dried cranberries\n1/2 cup raisins");
			txt3.setText("Preheat oven to 275�F.\nCombine oats, coconut, almonds, pecans, brown sugar, pumpkin seeds and sunflower seeds in a large bowl.\nCombine syrup, water and oil in a medium bowl or large measuring cup and pour over the oat mixture; stir until well combined.\nSpread the mixture into a large (12-by-15-inch) roasting pan or large rimmed baking sheet\n Bake for 45 minutes.\nRemove from the oven, stir, and continue baking until golden brown and beginning to crisp, about 45 minutes more.\nStir in cranberries and raisins.\nLet cool completely before storing.");
			img1.setBackgroundResource(R.drawable.rec25);
			
		}else if (a == 26) {
			
			txt1.setText("Tex-Mex Taco Salad");
			txt2.setText("1/2 cup prepared salsa\n2 tablespoons reduced-fat sour cream\n1/2 teaspoon canola oil\n1 small onion, chopped\n2 cloves garlic, minced\n8 ounces lean ground beef or turkey\n1 large plum tomato, diced\n1/2 cup canned kidney beans, rinsed (see Tips for Two)\n1 teaspoon ground cumin\n 1 teaspoon chili powder\n1/8 teaspoon salt, or to taste\n2 tablespoons chopped fresh cilantro\n4 cups shredded romaine lettuce\n1/4 cup shredded sharp Cheddar cheese");
			txt3.setText("Combine salsa and sour cream in a large bowl.\nHeat oil in a medium nonstick skillet over medium heat.\nAdd onion and garlic and cook, stirring often, until softened, 1 to 2 minutes.\nAdd beef (or turkey) and cook, stirring often, until cooked through, 3 to 5 minutes.\nAdd tomato, beans, cumin, chili powder and salt; cook, stirring, until the tomato begins to break down, about 2 minutes.\nRemove from the heat, stir in cilantro and 2 tablespoons of the salsa mixture.\nAdd lettuce to the remaining salsa mixture and toss to coat.\nDivide the lettuce between 2 plates, top with the cooked meat and sprinkle with cheese.");
			img1.setBackgroundResource(R.drawable.rec26);
			
		}else if (a == 27) {
			
			txt1.setText("Tuscan Pork Loin");
			txt2.setText("1 3-pound pork loin, trimmed\n1 teaspoon kosher salt\n3 cloves garlic, crushed and peeled\n2 tablespoons extra-virgin olive oil\n2 tablespoons chopped fresh rosemary\n1 tablespoon freshly grated lemon zest\n3/4 cup dry vermouth, or white wine\n2 tablespoons white-wine vinegar");
			txt3.setText("Tie kitchen string around pork in three places so it doesn�t flatten while roasting.\nPlace salt and garlic in a small bowl and mash with the back of a spoon to form a paste.\nStir in oil, rosemary and lemon zest; rub the mixture into the pork.\nRefrigerate, uncovered, for 1 hour.\nPreheat oven to 375�F.\nPlace the pork in a roasting pan.\nRoast, turning once or twice, until a thermometer inserted into the thickest part registers 145�F, 40 to 50 minutes.\nTransfer to a cutting board; let rest for 10 minutes.\nMeanwhile, add vermouth (or wine) and vinegar to the roasting pan and place over medium-high heat.\nBring to a simmer and cook, scraping up any browned bits, until the sauce is reduced by half, 2 to 4 minutes.\nRemove the string and slice the roast.\nAdd any accumulated juices to the sauce and serve with the pork.");
			img1.setBackgroundResource(R.drawable.rec27);
			
		}else if (a == 28) {
			
			txt1.setText("Blueberry-Maple Muffins");
			txt2.setText("1/3 cup whole flaxseeds\n1 cup whole-wheat flour\n3/4 cup plus 2 tablespoons all-purpose flour\n1 1/2 teaspoons baking powder\n1 teaspoon ground cinnamon\n1/2 teaspoon baking soda\n1/4 teaspoon salt\n2 large eggs\n1/2 cup pure maple syrup\n1 cup nonfat buttermilk, (see Tip)\n1/4 cup canola oil\n2 teaspoons freshly grated orange zest\n1 tablespoon orange juice\n1 teaspoon vanilla extract\n1 1/2 cups fresh blueberries\n1 tablespoon sugar");
			txt3.setText("Preheat oven to 400�F.\nCoat 12 muffin cups with cooking spray.\nGrind flaxseeds in a spice mill (such as a clean coffee grinder) or dry blender.\nTransfer to a large bowl.\nAdd whole-wheat flour, all-purpose flour, baking powder, cinnamon, baking soda and salt; whisk to blend.\nWhisk eggs and maple syrup in a medium bowl until smooth.\nAdd buttermilk, oil, orange zest, orange juice and vanilla; whisk until blended.\nMake a well in the dry ingredients and stir in the wet ingredients with a rubber spatula just until moistened.\nFold in blueberries.\nScoop the batter into the prepared muffin cups.\nSprinkle the tops with sugar.\nBake the muffins until the tops are golden brown and spring back when touched lightly, 15 to 25 minutes.\nLet cool in the pan for 5 minutes.\nLoosen edges and turn muffins out onto a wire rack to cool slightly.");
			img1.setBackgroundResource(R.drawable.rec28);
			
		}else if (a == 29) {
			
			txt1.setText("Quick Paella with Shrimp & Mussels");
			txt2.setText("1 tablespoon extra-virgin olive oil\n1/2 cup chopped onion\n1/2 cup chopped red bell pepper\n2 cloves garlic, minced\n2 cups instant brown rice\n1 1/3 cups reduced-sodium chicken broth\n1/2 teaspoon dried thyme\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n1 large pinch saffron (see Note)\n1 pound peeled and deveined raw shrimp (21-25 per pound)\n1 cup frozen green peas, thawed\n1 pound mussels, scrubbed well (see Tip)\n4 lemon wedges (optional)");
			txt3.setText("Heat oil in a large skillet over medium heat.\nAdd onion, bell pepper and garlic and cook, stirring occasionally, until the vegetables are softened, about 3 minutes.\nAdd rice, broth, thyme, salt, pepper and saffron and bring to a boil over medium heat.\nCover and cook for 5 minutes.\nStir in shrimp and peas.\nPlace mussels on top of the rice in an even layer.\nCover and continue cooking until the mussels have opened and the rice is tender, about 5 minutes more.\nRemove from the heat and let rest, covered, until most of the liquid is absorbed, about 5 minutes.\nServe with lemon wedges, if desired.");
			img1.setBackgroundResource(R.drawable.rec29);
			
		}else if (a == 30) {
			
			txt1.setText("Green Goddess Salad");
			txt2.setText("1/2 avocado, peeled and pitted\n3/4 cup nonfat buttermilk\n2 tablespoons chopped fresh herbs, such as tarragon, sorrel and/or chives\n2 teaspoons tarragon vinegar, or white-wine vinegar\n1 teaspoon anchovy paste, or minced anchovy fillet\n8 cups bite-size pieces green leaf lettuce\n12 ounces peeled and deveined cooked shrimp, (21-25 per pound; see Ingredient note)\n1/2 cucumber, sliced\n1 cup cherry or grape tomatoes\n1 cup canned chickpeas, rinsed\n1 cup rinsed and chopped canned artichoke hearts\n1/2 cup chopped celery");
			txt3.setText("Puree avocado, buttermilk, herbs, vinegar and anchovy in a blender until smooth.\nDivide lettuce among 4 plates.\nTop with shrimp, cucumber, tomatoes, chickpeas, artichoke hearts and celery.\nDrizzle the dressing over the salads.");
			img1.setBackgroundResource(R.drawable.rec30);
			
		}else if (a == 31) {
			
			txt1.setText("Spanish Tortilla");
			txt2.setText("3 teaspoons extra-virgin olive oil, divided\n1 small onion, thinly sliced\n1 cup precooked diced red potatoes, (see Tip)\n1 tablespoon chopped fresh thyme\n1/2 teaspoon smoked paprika\n6 large eggs\n4 large egg whites\n1/2 cup shredded Manchego, or Jack cheese\n3 cups baby spinach, roughly chopped\n1/2 teaspoon salt\n1/2 teaspoon freshly ground pepper");
			txt3.setText("Heat 2 teaspoons oil in a medium nonstick skillet over medium heat.\nAdd onion and cook, stirring, until translucent, 3 to 4 minutes.\nAdd potatoes, thyme and paprika and cook for 2 minutes more.\nLightly whisk eggs and egg whites in a large bowl.\nGently stir the potato mixture into the eggs along with cheese, spinach, salt and pepper until combined.\nWipe the pan clean; add the remaining 1 teaspoon oil and heat over medium heat.\nPour in the egg mixture, cover and cook until the edges are set and the bottom is browned, 4 to 5 minutes (it will still be moist in the center).\nTo flip the tortilla, run a spatula gently around the edges to loosen them.\nInvert a large plate over the pan and turn out the tortilla onto it.\nSlide the tortilla back into the pan and continue cooking until completely set in the middle, 3 to 6 minutes.\nServe warm or cold.");
			img1.setBackgroundResource(R.drawable.rec31);
			
		}else if (a == 32) {
			
			txt1.setText("Simple Saut�ed Spinach");
			txt2.setText("2 tablespoons extra-virgin olive oil\n4 cloves garlic, thinly sliced\n20 ounces fresh spinach, (see Note)\n1 tablespoon lemon juice\n1/4 teaspoon salt\n1/4 teaspoon crushed red pepper");
			txt3.setText("Heat oil in a Dutch oven over medium heat.\nAdd garlic and cook until beginning to brown, 1 to 2 minutes.\nAdd spinach and toss to coat.\nCover and cook until wilted, 3 to 5 minutes.\nRemove from the heat and add lemon juice, salt and crushed red pepper.\nToss to coat and serve immediately.");
			img1.setBackgroundResource(R.drawable.rec32);
			
		}else if(a == 33) {
			
			txt1.setText("Shrimp with Mango & Basil");
			txt2.setText("1 pound raw shrimp, (21-25 per pound), peeled and deveined, tails left on\n1/4 teaspoon salt\n1/4-1/2 teaspoon cayenne pepper\n1/4 teaspoon ground turmeric\n1 tablespoon extra-virgin olive oil\n1 large ripe, firm mango, peeled and cut into 1/2-inch cubes (see Tip)\n1 bunch scallions, green tops only, thinly sliced\n1/4 cup firmly packed fresh basil leaves, finely chopped");
			txt3.setText("Toss shrimp with salt, cayenne to taste and turmeric in a medium bowl.\nCover; refrigerate for about 30 minutes.\nHeat oil in a large nonstick skillet over medium-high heat; place the shrimp in a single layer and cook until the undersides turn salmon-pink, about 1 minute.Flip them over and cook for 1 minute more.\nAdd mango, scallion greens and basil and cook, stirring, until the shrimp is just cooked and starts to barely curl, 1 to 2 minutes.");
			img1.setBackgroundResource(R.drawable.rec33);
			
		}else if (a == 34) {
			
			txt1.setText("Salmon Chowder");
			txt2.setText("1 tablespoon canola oil\n1/3 cup chopped carrot\n1/3 cup chopped celery\n4 cups reduced-sodium chicken broth\n1 1/2 cups water\n1 12-ounce skinned salmon fillet, preferably wild-caught (see Note and Tip)\n2 1/2 cups frozen cauliflower florets, thawed and coarsely chopped\n3 tablespoons chopped fresh chives or scallions, or 1 1/2 tablespoons dried chives\n1 1/3 cups instant mashed potato flakes (see Note), or 2 cups leftover mashed potatoes\n1/4 cup chopped fresh dill, or 2 teaspoons dried tarragon\n1 tablespoon Dijon mustard\n1/4 teaspoon salt\nFreshly ground pepper to taste");
			txt3.setText("Heat oil in a large saucepan or Dutch oven over medium heat.\nAdd carrot and celery and cook, stirring frequently, until the vegetables just begin to brown, 3 to 4 minutes.\nAdd broth, water, salmon, cauliflower and chives (or scallions) and bring to a simmer.\nCover and cook, maintaining a gentle simmer, until the salmon is just cooked through, 5 to 8 minutes.\nRemove the salmon to a clean cutting board.\nFlake into bite-size pieces with a fork.\nStir potato flakes (or leftover mashed potatoes), dill (or tarragon) and mustard into the soup until well blended.\nReturn to a simmer.\nAdd the salmon and reheat.\nSeason with salt and pepper.");
			img1.setBackgroundResource(R.drawable.rec34);
			
		}else if (a == 35) {
			
			txt1.setText("Lemon-Dill Green Beans");
			txt2.setText("1 pound green beans, trimmed\n4 teaspoons chopped fresh dill\n1 tablespoon minced shallot\n1 tablespoon extra-virgin olive oil\n1 tablespoon lemon juice\n1 teaspoon whole-grain mustard\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper");
			txt3.setText("Bring an inch of water to a boil in a large saucepan fitted with a steamer basket.\nAdd green beans, cover and cook until tender-crisp, 5 to 7 minutes.\nRemove from the heat.\nMeanwhile, whisk dill, shallot, oil, lemon juice, mustard, salt and pepper in a large bowl.\nAdd the green beans and toss to coat.\nLet stand about 10 minutes before serving to blend flavors.");
			img1.setBackgroundResource(R.drawable.rec35);
			
		}else if(a == 36) {
			
			txt1.setText("Chicken Breasts Stuffed with Pimiento Cheese");
			txt2.setText("1/2 cup shredded Gouda cheese, preferably smoked\n2 tablespoons chopped scallion\n1 tablespoon sliced pimientos, chopped\n1 teaspoon paprika, divided\n4 small boneless, skinless chicken breasts (1 1/4-1 1/2 pounds total), trimmed and tenders removed (see Tip)\n1/2 teaspoon salt, divided\n1/2 teaspoon freshly ground pepper, divided\n1 tablespoon extra-virgin olive oil");
			txt3.setText("Preheat oven to 400�F.\nCombine Gouda, scallion, pimientos and 1/2 teaspoon paprika in a small bowl.\nCut a horizontal slit along the thin, long edge of each chicken breast, nearly through to the opposite side, and open like a book.\nSprinkle the breasts with 1/4 teaspoon each salt and pepper.\nDivide the cheese filling among the breasts, placing it in the center of each.\nClose the breast over the filling, pressing the edges firmly together to seal.\nSprinkle the breasts with the remaining 1/2 teaspoon paprika, 1/4 teaspoon salt and pepper.\nHeat oil in a large ovenproof skillet over medium-high heat.\nAdd the chicken and cook until browned on one side, about 2 minutes.\nTurn the chicken over and transfer the skillet to the oven.\nBake until the chicken is no longer pink in the center and an instant-read thermometer inserted into the thickest part registers 165�F, about 15 minutes.");
			img1.setBackgroundResource(R.drawable.rec36);
		}else if (a == 37) {
			
			txt1.setText("Green Eggs & Ham Frittata");
			txt2.setText("8 large eggs\n1 1/2 teaspoons dried dill\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n2 tablespoons extra-virgin olive oil\n2 leeks, white and light green parts only, diced\n1 5-ounce bag baby spinach, chopped\n1/2 cup diced ham\n1/2 cup shredded havarti or Muenster cheese");
			txt3.setText("Position rack in upper third of oven; preheat to 450�F.\nWhisk eggs, dill, salt and pepper in a medium bowl.\nHeat oil in a large ovenproof nonstick skillet over medium heat.\nAdd leeks; cook, stirring, until softened, about 4 minutes.\nAdd spinach and ham; cook, stirring, until the spinach is wilted, about 1 minute.\nPour the egg mixture over the vegetables and cook, lifting the edges of the frittata so uncooked egg can flow underneath, until the bottom is light golden, 2 to 3 minutes. Sprinkle cheese on top, transfer the pan to the oven and bake until the eggs are set, 6 to 8 minutes.\nLet rest for about 3 minutes before serving.\nServe hot or cold.");
			img1.setBackgroundResource(R.drawable.rec37);
			
		}else if (a == 38) {
			
			txt1.setText("Cornmeal-Crusted Chicken Nuggets with Blackberry Mustard");
			txt2.setText("1 cup fresh blackberries or raspberries, finely chopped\n1 1/2 tablespoons whole-grain mustard\n2 teaspoons honey\n1 pound chicken tenders, cut in half crosswise (see Tip)\n1/2 teaspoon salt\n1/4 teaspoon freshly ground pepper\n3 tablespoons cornmeal\n1 tablespoon extra-virgin olive oil");
			txt3.setText("Mash blackberries (or raspberries), mustard and honey in a small bowl until it looks like a chunky sauce.\nSprinkle chicken tenders with salt and pepper.\nPlace cornmeal in a medium bowl, add the chicken and toss to coat (discard any leftover cornmeal).\nHeat oil in a large nonstick skillet over medium-high heat.\nReduce heat to medium and cook the chicken, turning once or twice, until browned and just cooked through, 6 to 8 minutes total (thinner nuggets will cook faster than thicker ones).\nServe the chicken nuggets with the berry mustard.");
			img1.setBackgroundResource(R.drawable.rec38);
			
		}else if(a == 39) {
			
			txt1.setText("Spiced Corn & Rice Pilaf");
			txt2.setText("2 teaspoons extra-virgin olive oil\n1/4 cup finely chopped onion\n1 3-inch cinnamon stick\n3/4 teaspoon cumin seeds\n1/4 teaspoon ground cardamom\n1/4 teaspoon salt\n1 cup brown basmati or long-grain brown rice\n2 3/4 cups reduced-sodium chicken broth, or vegetable broth\n2 tablespoons hulled pumpkin seeds\n1 cup fresh corn kernels, (from 2 ears) or frozen");
			txt3.setText("Heat oil in a large saucepan over medium-high heat.\nAdd onion and cook, stirring often, until lightly browned, about 3 minutes.\nAdd cinnamon stick, cumin seeds, cardamom, salt and rice; cook, stirring often, until spices are fragrant, about 1 minute.\nStir in broth and bring to a boil.\nReduce heat to low; cover and simmer until the liquid is absorbed and the rice is tender, 35 to 40 minutes.\nMeanwhile, toast pumpkin seeds in a small dry skillet over medium-low heat, stirring constantly, until fragrant, 1 to 2 minutes.\nTransfer to a bowl to cool.\nWhen the rice is ready, stir in corn, cover and cook until heated through, about 5 minutes.\nRemove the cinnamon stick.\nFluff the pilaf with a fork and fold in the toasted pumpkin seeds");
			img1.setBackgroundResource(R.drawable.rec39);
		}else if (a == 40) {
			
			txt1.setText("Mediterranean Wrap");
			txt2.setText("1/2 cup water\n1/3 cup couscous, preferably whole-wheat\n1 cup chopped fresh parsley\n1/2 cup chopped fresh mint\n1/4 cup lemon juice\n3 tablespoons extra-virgin olive oil\n2 teaspoons minced garlic\n1/4 teaspoon salt, divided\n1/4 teaspoon freshly ground pepper\n1 pound chicken tenders\n1 medium tomato, chopped\n1 cup chopped cucumber\n4 10-inch spinach or sun-dried tomato wraps or tortillas");
			txt3.setText("Bring water to a boil in a small saucepan.\nStir in couscous and remove from the heat.\nCover and let stand for 5 minutes.\nFluff with a fork. Set aside.\nMeanwhile, combine parsley, mint, lemon juice, oil, garlic, 1/8 teaspoon salt and pepper in a small bowl.\nToss chicken tenders in a medium bowl with 1 tablespoon of the parsley mixture and the remaining 1/8 teaspoon salt.\nPlace the tenders in a large nonstick skillet and cook over medium heat until cooked though, 3 to 5 minutes per side.\nTransfer to a clean cutting board.\nCut into bite-size pieces when cool enough to handle.\nStir the remaining parsley mixture into the couscous along with tomato and cucumber.\nTo assemble wraps, spread about 3/4 cup of the couscous mixture onto each wrap.\nDivide the chicken among the wraps.\nRoll the wraps up like a burrito, tucking in the sides to hold the ingredients in.\nServe cut in half.");
			img1.setBackgroundResource(R.drawable.rec40);
			
		}else if (a == 41) {
			
			txt1.setText("Steak & Purple-Potato Salad");
			txt2.setText("1 teaspoon lime juice\n1 teaspoon chili powder\n1/2 teaspoon salt, divided\n1 clove garlic, mashed into a paste\n8 ounces sirloin steak, trimmed\n3/4 pound small purple potatoes, (see Tip), scrubbed\n2 tablespoons sherry vinegar\n1 tablespoon extra-virgin olive oil\n1/2 teaspoon ground cumin\n1/4 teaspoon freshly ground pepper\n4 large radishes, sliced\n3 scallions, thinly sliced\n1/4 cup chopped fresh cilantro");
			txt3.setText("Mix lime juice, chili powder, 1/4 teaspoon salt and garlic in a small bowl to form a paste; rub onto both sides of steak.\nRefrigerate the steak.\nPlace potatoes in a large pot, cover with water and bring to a boil over high heat.\nCook until tender when pierced with a fork, 15 to 20 minutes, depending on the size of the potatoes.\nDrain, let cool for 10 minutes, then quarter.\nWhile the potatoes cool, preheat grill or grill pan over medium-high heat.\nOil the grill rack (see Tip) or pan.\nGrill the steak, turning once, until an instant-read meat thermometer inserted into the thickest part registers 140�F, about 10 minutes total on the grill or 16 to 20 minutes in a grill pan.\nLet rest for 5 minutes, then cut into 1/4-inch-thick slices.\nWhisk vinegar, oil, cumin, pepper and the remaining 1/4 teaspoon salt in a large bowl.\nAdd the steak and any accumulated juices, the potatoes, radishes, scallions and cilantro; gently toss to coat");
			img1.setBackgroundResource(R.drawable.rec41);
			
		}else if(a == 42) {
			
			txt1.setText("Roasted Peach Sundaes");
			txt2.setText("3 ripe peaches, halved and pitted\n1 tablespoon brown sugar\n2 teaspoons lemon juice\n3 cups nonfat vanilla frozen yogurt\n6 gingersnaps, crumbled (optional)"); 
			txt3.setText("Preheat oven to 425�F.\nCoat a baking sheet with cooking spray.\nToss peach halves with brown sugar and lemon juice, and place them cut-side-up on the prepared baking sheet.\nRoast until the peaches are tender, 20 to 30 minutes.\nIf the juice on the pan begins to burn, add a little water and loosely cover the fruit with foil.\nTop each peach half with a 1/2-cup scoop of frozen yogurt and a sprinkle of crumbled gingersnaps (if using).\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec42);
		}else if (a == 43) {
			
			txt1.setText("Shrimp Po' Boy");
			txt2.setText("2 cups finely shredded red cabbage\n2 tablespoons dill pickle relish\n2 tablespoons reduced-fat mayonnaise\n2 tablespoons nonfat plain yogurt\n1 pound peeled and deveined raw shrimp, (51-60 per pound; see Shopping Tip)\n4 teaspoons canola oil, divided\n1 teaspoon chili powder\n1/2 teaspoon paprika\n1/4 teaspoon freshly ground pepper\n4 whole-wheat hot dog buns, or small sub rolls, split\n4 tomato slices, halved\n1/4 cup thinly sliced red onion");
			txt3.setText("Preheat grill to medium-high.\nCombine cabbage, relish, mayonnaise and yogurt in a medium bowl.\nToss shrimp with 2 teaspoons oil, chili powder, paprika and pepper in a medium bowl.\nPlace the remaining 2 teaspoons oil in a small bowl.\nDip a pastry brush in water, then in the oil and lightly brush the inside of each bun (or roll).\nPlace a grill basket (see Kitchen Tip) on the grill.\nAdd the shrimp and spread in a single layer.\nGrill, stirring occasionally, until the shrimp are pink and just cooked through, about 3 minutes.\nOpen the buns and grill, turning once, until toasted on both sides, about 1 minute total.\nTo assemble the sandwiches, divide tomato and onion among the buns.\nSpread about 1/3 cup cabbage mixture down the middle of each and top with about 1/2 cup grilled shrimp.");
			img1.setBackgroundResource(R.drawable.rec43);
			
		}else if (a == 44) {
			
			txt1.setText("One-Dish Chicken & Rice (Asopao de Pollo)");
			txt2.setText("1 tablespoon extra-virgin olive oil\n2 1/4 pounds boneless, skinless chicken thighs, trimmed and cut into 2-inch pieces\n4 Anaheim or poblano chile peppers, chopped\n1 small onion, chopped\n1 tablespoon dried oregano, crushed\n1 teaspoon sweet paprika\n1 teaspoon salt\n1 8-ounce can tomato sauce\n1 tomato, chopped\n1 4-ounce jar pimientos, rinsed\n8 pimiento-stuffed green olives, sliced\n2 tablespoons capers, rinsed\n8 cups water\n2 1/2 cups brown rice\n2/3 cup packed chopped fresh cilantro");
			txt3.setText("Heat oil in a Dutch oven over medium-high heat.\nAdd chicken, chiles, onion, oregano, paprika and salt and cook, stirring, until the onions have softened, 3 to 5 minutes.\nAdd tomato sauce, tomato, pimientos, olives, capers and water and bring to a boil.\nStir in rice; return to a boil.\nReduce heat to a simmer and cook, uncovered, until the sauce is thick, the rice is tender and the chicken is cooked through, 35 to 45 minutes.\nStir in cilantro and serve.");
			img1.setBackgroundResource(R.drawable.rec44);
			
		}else if(a == 45) {
			
			txt1.setText("Blueberry Tart with Walnut Crust");
			txt2.setText("CRUST\n1/2 cup walnuts, lightly toasted (see Tip)\n1 cup graham cracker crumbs, preferably whole-wheat (see Note)\n1 large egg white\n1 tablespoon butter, melted\n1 tablespoon peanut or canola oil\nPinch of salt\nFILLING\n8 ounces reduced-fat cream cheese (Neufch�tel), softened\n1/4 cup reduced-fat sour cream\n1/4 cup plus 2 tablespoons pure maple syrup, preferably grade B, divided\n2 cups fresh blueberries");
			txt3.setText("To prepare crust: Preheat oven to 325�F.\nCoarsely chop walnuts in a food processor.\n Add graham cracker crumbs and process until the mixture looks like fine crumbs.\nWhisk egg white in a medium bowl until frothy.\nAdd the crumb mixture, butter, oil and salt; toss to combine.\nPress the mixture into the bottom and 1/2 inch up the sides of a 9-inch removable-bottom tart pan.\nSet the pan on a baking sheet.\nBake until dry and slightly darker around the edges, about 8 minutes.\nCool on a wire rack.\nTo prepare filling: Beat cream cheese, sour cream and 1/4 cup maple syrup in a medium bowl with an electric mixer on low speed until smooth.\nWhen the crust is cool, spread the filling evenly into it, being careful not to break up the delicate crust.\nArrange blueberries on the filling, pressing lightly so they set in.\nDrizzle the remaining 2 tablespoons maple syrup over the berries.\nChill for at least 1 hour to firm up.");
			img1.setBackgroundResource(R.drawable.rec45);
		}else if (a == 46) {
			
			txt1.setText("Puerto Rican Fish Stew (Bacalao)");
			txt2.setText("2 tablespoons extra-virgin olive oil\n1 medium onion, chopped\n4 cloves garlic, minced\n1 pound flaky white fish, such as haddock, tilapia or cod (see Tip), cut into 1 1/2-inch pieces\n1 14-ounce can diced tomatoes\n1 Anaheim or poblano chile pepper, chopped\n1/4 cup packed chopped fresh cilantro\n2 tablespoons sliced pimento-stuffed green olives\n1 tablespoon capers, rinsed\n1 teaspoon dried oregano\n1/2 teaspoon salt\n1/2 cup water, as needed\n1 avocado, chopped (optional)");
			txt3.setText("Heat oil in a large high-sided skillet or Dutch oven over medium heat.\nAdd onion and cook, stirring occasionally, until softened, about 2 minutes.\nAdd garlic and cook, stirring, for 1 minute.\nAdd fish, tomatoes and their juices, chile pepper, cilantro, olives, capers, oregano and salt; stir to combine.\nAdd up to 1/2 cup water if the mixture seems dry.\nCover and simmer for 20 minutes.\nRemove from the heat.\nServe warm or at room temperature, garnished with avocado (if using).");
			img1.setBackgroundResource(R.drawable.rec46);
			
		}else if (a == 47) {
			
			txt1.setText("Maple-Glazed Chicken Breasts");
			txt2.setText("2 tablespoons pure maple syrup\n1 tablespoon reduced-sodium soy sauce\n2 teaspoons lemon juice\n1 clove garlic, minced\n1 teaspoon minced fresh ginger\n1/4 teaspoon freshly ground pepper\n2 boneless, skinless chicken breasts, (about 8 ounces), trimmed and tenders removed (see Tip)");
			txt3.setText("Whisk syrup, soy sauce, lemon juice, garlic, ginger and pepper in a small, shallow dish.\nAdd chicken and turn to coat with the marinade; cover and refrigerate for 2 hours, turning once.\nCoat an indoor grill pan with cooking spray and heat over medium heat.\nRemove the chicken from the marinade (reserving the marinade) and cook until an instant-read thermometer inserted into the thickest part of the breast registers 165�F, 3 to 5 minutes per side.\nMeanwhile, pour the reserved marinade into a small saucepan and bring to a simmer over medium heat.\nCook until reduced by about half, about 4 minutes.\nLiberally baste the chicken with the reduced sauce and serve.");
			img1.setBackgroundResource(R.drawable.rec47);
			
		}else if(a == 48) {
			
			txt1.setText("Roasted Squash & Fennel with Thyme");
			txt2.setText("2 small summer squash, (about 12 ounces)\n1 1/2 cups sliced fennel bulb, (about 1 small bulb), plus 1 tablespoon chopped fennel fronds, divided\n1 tablespoon extra-virgin olive oil\n1 tablespoon chopped fresh thyme\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n1/4 cup thinly sliced garlic");
			txt3.setText("Preheat oven to 450�F.\nQuarter squash lengthwise, then cut crosswise into 1-inch pieces.\nCombine the squash with sliced fennel, oil, thyme, salt and pepper in a large bowl.\nSpread the mixture evenly on a large, rimmed baking sheet.\nRoast for 10 minutes.\nStir in garlic and roast until the vegetables are tender and the fennel is beginning to brown, about 5 minutes more.\nStir in fennel fronds and serve.");
			img1.setBackgroundResource(R.drawable.rec48);
		}else if (a == 49) {
			
			txt1.setText("Lemon Chicken Stir-Fry");
			txt2.setText("1 lemon\n1/2 cup reduced-sodium chicken broth\n3 tablespoons reduced-sodium soy sauce\n2 teaspoons cornstarch\n1 tablespoon canola oil\n1 pound boneless, skinless chicken breasts, trimmed and cut into 1-inch pieces\n10 ounces mushrooms, halved or quartered\n1 cup diagonally sliced carrots, (1/4 inch thick)\n2 cups snow peas, (6 ounces), stems and strings removed\n1 bunch scallions, cut into 1-inch pieces, white and green parts divided\n1 tablespoon chopped garlic");
			txt3.setText("Grate 1 teaspoon lemon zest and set aside.\nJuice the lemon and whisk 3 tablespoons of the juice with broth, soy sauce and cornstarch in a small bowl.\nHeat oil in a large skillet over medium-high heat.\nAdd chicken and cook, stirring occasionally, until just cooked through, 4 to 5 minutes.\nTransfer to a plate with tongs.\nAdd mushrooms and carrots to the pan and cook until the carrots are just tender, about 5 minutes.\nAdd snow peas, scallion whites, garlic and the reserved lemon zest.\nCook, stirring, until fragrant, 30 seconds.\nWhisk the broth mixture and add to the pan; cook, stirring, until thickened, 2 to 3 minutes.\nAdd scallion greens and the chicken and any accumulated juices; cook, stirring, until heated through, 1 to 2 minutes");
			img1.setBackgroundResource(R.drawable.rec49);
			
		}else if (a == 50) {
			
			txt1.setText("Pistachio-Crusted Tuna Steaks");
			txt2.setText("1 tablespoon thinly sliced shallot\n1 bay leaf\n1/2 cup white wine\n3 tablespoons reduced-fat sour cream\n2 teaspoons lemon juice\n2 teaspoons chopped fresh dill, divided\n1 teaspoon whole-grain mustard\n1/2 teaspoon salt, divided\n1/4 cup coarse dry breadcrumbs, preferably whole-wheat (see Note)\n1/4 cup shelled pistachios\n4 4-ounce tuna steaks, 1-1 1/4 inches thick\n1 teaspoon extra-virgin olive oil");
			txt3.setText("Place shallot, bay leaf and wine in a small saucepan and bring to a boil.\nReduce until the wine is almost evaporated, about 5 minutes.\nRemove from the heat, discard bay leaf and transfer to a small bowl.\nAdd sour cream, lemon juice, 1 teaspoon dill, mustard and 1/4 teaspoon salt; stir to combine.\nPut breadcrumbs, pistachios, the remaining 1 teaspoon dill and 1/4 teaspoon salt in a blender or food processor.\nProcess until finely ground.\nTransfer to a shallow bowl.\nDredge both sides of the tuna in the pistachio mixture.\nHeat oil in a large nonstick skillet over medium heat.\nAdd the tuna and cook until browned, adjusting the heat as necessary to prevent burning, 4 to 5 minutes per side for medium-rare.\nServe with the lemon-dill sauce.");
			img1.setBackgroundResource(R.drawable.rec50);
			
		}else if(a == 51) {
			
			txt1.setText("Roasted Brussels Sprouts & Shallots");
			txt2.setText("24 small shallots\n2 tablespoons extra-virgin olive oil, divided\n2 pounds Brussels sprouts, preferably small\n1 teaspoon kosher salt");
			txt3.setText("Preheat oven to 375� F.\nPeel shallots, leaving the root ends intact so they'll hold together.\nPlace on a large sheet of foil; sprinkle 1 tablespoon oil over the top.\nSeal the packet and bake until the shallots are tender, about 45 minutes.\nRemove from foil and set aside to cool.\nMeanwhile, remove the outer leaves from Brussels sprouts and trim the stems.\nCut the small sprouts in half and quarter the larger ones.\nPlace the shallots and Brussels sprouts in a roasting pan.\nToss with the remaining 1 tablespoon oil and salt.\nIncrease oven temperature to 400� F.\nRoast, tossing twice during cooking, until the Brussels sprouts are tender and lightly browned, 25 to 35 minutes.");
			img1.setBackgroundResource(R.drawable.rec51);
		}else if (a == 52) {
			
			txt1.setText("Fragrant Fish Soup");
			txt2.setText("1 cup jasmine rice\n2 cups water\nZest and juice of 1 lemon\n4 cups reduced-sodium chicken broth, or vegetable broth\n1 pound tilapia fillets, or other firm white fish (see Tip)\n4 cups bite-size pieces arugula, or watercress (about 1 bunch), tough stems removed\n1 cup finely shredded carrots\n1/4 cup very thinly sliced fresh mint\n2 scallions, finely chopped");
			txt3.setText("Combine rice and water in a medium saucepan.\nBring to a simmer over medium heat; cover and cook until the water is absorbed, about 20 minutes.\nStir in lemon zest and juice.\nMeanwhile, bring broth to a simmer in another medium saucepan over medium-high heat.\nReduce the heat so the broth remains steaming, but not simmering.\nAdd fish and cook until just tender, about 5 minutes.\nRemove and break into bite-size chunks.\nDivide the lemony rice among 4 bowls.\nTop with equal portions of the fish, arugula (or watercress), carrot, mint and scallions.\nLadle 1 cup of the warm broth into each bowl and serve.");
			img1.setBackgroundResource(R.drawable.rec52);
			
		}else if (a == 53) {
			
			txt1.setText("Wok-Seared Chicken Tenders with Asparagus & Pistachios");
			txt2.setText("1 tablespoon toasted sesame oil\n1 1/2 pounds fresh asparagus, tough ends trimmed, cut into 1-inch pieces\n1 pound chicken tenders, (see Ingredient Note), cut into bite-size pieces\n4 scallions, trimmed and cut into 1-inch pieces\n2 tablespoons minced fresh ginger\n1 tablespoon oyster-flavored sauce\n1 teaspoon chile-garlic sauce, (see Ingredient Note)\n1/4 cup shelled salted pistachios, coarsely chopped");
			txt3.setText("Heat oil in a wok or large skillet over high heat.\nAdd asparagus; cook, stirring, for 2 minutes.\nAdd chicken; cook, stirring, for 4 minutes.\nStir in scallions, ginger, oyster sauce and chile-garlic sauce; cook, stirring, until the chicken is juicy and just cooked through, 1 to 2 minutes more.\nStir in pistachios and serve immediately.");
			img1.setBackgroundResource(R.drawable.rec53);
			
		}else if(a == 54) {
			
			txt1.setText("Oven-Fried Zucchini Sticks");
			txt2.setText("Canola or olive oil cooking spray\n1/2 cup whole-wheat flour\n1/2 cup all-purpose flour\n2 tablespoons cornmeal\n1 teaspoon salt\n1/2 teaspoon freshly ground pepper\n1 1/2 pounds zucchini, (about 3 medium), cut into 1/2-by-3-inch sticks\n2 large egg whites, lightly beaten");
			txt3.setText("Preheat oven to 475�F.\nCoat a large baking sheet with cooking spray.\nCombine flours, cornmeal, salt and pepper in a large sealable plastic bag.\nDip zucchini in egg white, shake in the bag to coat, and arrange, not touching, on the baking sheet.\nCoat all exposed sides with cooking spray.\nBake on the center rack for 10 minutes.\nTurn the zucchini and coat any floury spots with cooking spray.\nContinue to bake until golden and just tender, about 8 to 10 minutes more.\nServe hot.");
			img1.setBackgroundResource(R.drawable.rec54);
		}else if (a == 55) {
			
			txt1.setText("Nouveau Ni�oise");
			txt2.setText("8 cups water\n8 ounces green beans, trimmed and halved\n8 small red potatoes\n2 eggs\n1/4 cup minced shallots\n1/4 cup red-wine vinegar\n2 tablespoons Dijon mustard\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n3 tablespoons extra-virgin olive oil\n6 cups mixed salad greens\n2 6-ounce cans chunk light tuna, drained (see Note)\n12 Nicoise or Kalamata olives");
			txt3.setText("Bring water to a boil in a 3- to 4-quart saucepan.\nAdd green beans and cook until just tender and bright green, 1 to 2 minutes.\nUsing a slotted spoon, transfer the beans to a colander, rinse under cold water and set aside in a large bowl.\nCarefully place potatoes and eggs into the boiling water.\nCook the eggs until hard, 12 minutes.\nUsing a slotted spoon, transfer the eggs to the colander, rinse under cold water until cool and set aside.\nContinue cooking the potatoes until fork-tender, 3 minutes more.\nDrain the potatoes; rinse under cold water until cool enough to handle.\nMeanwhile, combine shallots, vinegar, mustard, salt and pepper in a small bowl.\nSlowly whisk in oil.\nCut the potatoes into quarters or eighths, depending on their size.\nAdd to the bowl with the beans.\nAdd greens, tuna and the dressing.\nToss well.\nPeel the eggs and cut into wedges.\nDivide the salad among 4 plates.\nTop with egg wedges and olives.\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec55);
			
		}else if (a == 56) {
			
			txt1.setText("Boneless Pork Chops with Mushrooms & Thyme");
			txt2.setText("2 5-ounce boneless, center-cut pork loin chops, trimmed and pounded to 1/4 inch thick (see Tip)\n1/4 teaspoon salt\n1/4 teaspoon freshly ground pepper\n1 teaspoon extra-virgin olive oil\n1 medium shallot, minced\n1 1/2 cups sliced mushrooms, (about 4 ounces)\n1/2 cup dry vermouth\n1 teaspoon Dijon mustard\n1 teaspoon chopped fresh thyme");
			txt3.setText("Sprinkle pork chops with salt and pepper.\nCoat a large nonstick skillet with cooking spray and place over medium heat.\nAdd the pork chops and cook until browned on both sides and cooked through, 2 to 3 minutes per side.\nTransfer to 2 serving plates; tent with foil to keep warm.\nSwirl oil into the pan, add shallot and cook, stirring, until soft, about 30 seconds.\nAdd mushrooms and cook, stirring occasionally, until they soften and begin to brown, about 2 minutes.\nAdd vermouth and cook for 15 seconds.\nStir in mustard, thyme and any juices that have accumulated from the pork; cook until the sauce is thickened and slightly reduced, 1 to 2 minutes more.\nSpoon the sauce over the pork chops and serve immediately.");
			img1.setBackgroundResource(R.drawable.rec56);
			
		}else if(a == 57) {
			
			txt1.setText("Ginger Crinkle Cookies");
			txt2.setText("2/3 cup canola oil\n1 1/2 cups turbinado sugar, divided (see Tip)\n1 large egg\n4 tablespoons molasses\n2 cups sifted whole-wheat pastry flour\n2 teaspoons baking soda\n1 1/4 teaspoons ground cinnamon\n1 1/4 teaspoons ground ginger\n1/4 teaspoon sea salt");
			txt3.setText("Preheat oven to 350�F.\nMix oil and 1 cup sugar in a large bowl until combined.\nBeat in egg until combined.\nStir in molasses until evenly incorporated.\nSift flour, baking soda, cinnamon, ginger and salt over the wet ingredients and stir until just combined.\nPut the remaining 1/2 cup sugar in a small bowl.\nRoll the dough into 1-inch balls and roll each ball in the sugar before placing 2 inches apart on an ungreased baking sheet.\nDo not flatten.\nBake the cookies until set, but still soft when gently touched, 10 to 12 minutes.\nTransfer to a wire rack to cool.");
			img1.setBackgroundResource(R.drawable.rec57);
			
		}else if (a == 58) {
			
			txt1.setText("Banana-Cocoa Soy Smoothie");
			txt2.setText("1 banana\n1/2 cup silken tofu\n1/2 cup soymilk\n2 tablespoons unsweetened cocoa powder\n1 tablespoon honey");
			txt3.setText("Slice banana and freeze until firm.\nBlend tofu, soymilk, cocoa and honey in a blender until smooth.\nWith the motor running, add the banana slices through the hole in the lid and continue to puree until smooth.");
			img1.setBackgroundResource(R.drawable.rec58);
			
		}else if (a == 59) {
			
			txt1.setText("Philly Cheese Steak Sandwich");
			txt2.setText("2 teaspoons extra-virgin olive oil\n1 medium onion, sliced\n8 ounces mushrooms, sliced\n1 red or green bell pepper, sliced\n2 tablespoons minced fresh oregano, or 2 teaspoons dried\n1/2 teaspoon freshly ground pepper\n1 pound sirloin steak, trimmed and thinly sliced (see Tip)\n1/4 teaspoon salt\n1 tablespoon all-purpose flour\n1/2 cup sliced hot banana peppers (optional)\n1/4 cup reduced-sodium chicken broth\n3 slices reduced-fat provolone cheese (about 3 ounces)\n4 whole-wheat buns, split and toasted");
			txt3.setText("Heat oil in a large nonstick skillet over medium-high heat.\nAdd onion and cook, stirring often, until soft and beginning to brown, 2 to 3 minutes.\nAdd mushrooms, bell pepper, oregano and pepper and cook, stirring often, until the vegetables are wilted and soft, about 7 minutes.\nAdd steak and salt and cook, stirring, until the meat is just cooked through, about 4 minutes.\nReduce heat to low.\nSprinkle the vegetables and meat with flour; stir to coat.\nStir in banana peppers (if using) and broth; bring to a simmer.\nRemove from the heat; lay cheese slices on top of the vegetables and meat, cover and let stand until melted, 1 to 2 minutes.\nDivide into 4 portions with a spatula, leaving the melted cheese layer on top.\nScoop a portion onto each bun and serve immediately.");
			img1.setBackgroundResource(R.drawable.rec59);
			
		}else if (a == 60) {
			
			txt1.setText("Fresh Pomodoro Pasta, White Beans & Olives");
			txt2.setText("8 ounces whole-wheat pasta shells, tubetti, ziti or rigatoni\n2 tablespoons extra-virgin olive oil\n1 15-ounce can cannellini beans, rinsed\n1 large clove garlic, minced\n1 pound ripe tomatoes, diced (about 3 cups)\n1/4 cup oil-cured black olives, pitted (see Tip) and chopped\n1/2 cup sliced fresh basil\n1/4 teaspoon kosher salt\nFreshly ground pepper, to taste\n1/4 cup grated Pecorino Romano cheese");
			txt3.setText("Put a large pot of water on to boil.\nCook pasta, stirring occasionally, until just tender, 8 to 10 minutes or according to package directions.\nDrain.\nMeanwhile, heat oil in a large skillet over medium heat.\nAdd beans and garlic; cook, stirring frequently, until the beans are just heated through, 2 to 3 minutes.\nRemove from the heat.\nAdd tomatoes, olives, basil, salt and pepper.\nStir gently to combine.\nTo serve, divide the pasta among 4 plates and top with sauce and cheese.");
			img1.setBackgroundResource(R.drawable.rec60);
			
		}else if (a == 61) {
			
			txt1.setText("Chicken & White Bean Soup");
			txt2.setText("2 teaspoons extra-virgin olive oil\n2 leeks, white and light green parts only, cut into 1/4-inch rounds\n1 tablespoon chopped fresh sage, or 1/4 teaspoon dried\n2 14-ounce cans reduced-sodium chicken broth\n2 cups water\n1 15-ounce can cannellini beans, rinsed\n1 2-pound roasted chicken, skin discarded, meat removed from bones and shredded (4 cups)");
			txt3.setText("Heat oil in a Dutch oven over medium-high heat.\nAdd leeks and cook, stirring often, until soft, about 3 minutes.\nStir in sage and continue cooking until aromatic, about 30 seconds.\nStir in broth and water, increase heat to high, cover and bring to a boil.\nAdd beans and chicken and cook, uncovered, stirring occasionally, until heated through, about 3 minutes.\nServe hot.");
			img1.setBackgroundResource(R.drawable.rec61);
			
		}else if (a == 62) {
			
			txt1.setText("Bistro Beef Tenderloin");
			txt2.setText("1 3-pound beef tenderloin, trimmed of fat\n2 tablespoons extra-virgin olive oil\n1 teaspoon kosher salt\n1/2 teaspoon freshly ground pepper\n2/3 cup chopped mixed fresh herbs, such as chives, parsley, chervil, tarragon, thyme\n2 tablespoons Dijon mustard");
			txt3.setText("Preheat oven to 400 degrees F.\nTie kitchen string around tenderloin in three places so it doesn�t flatten while roasting.\nRub the tenderloin with oil; pat on salt and pepper.\nPlace in a large roasting pan.\nRoast until a thermometer inserted into the thickest part of the tenderloin registers 140 degrees F for medium-rare, about 45 minutes, turning two or three times during roasting to ensure even cooking.\nTransfer to a cutting board; let rest for 10 minutes.\nRemove the string.\nPlace herbs on a large plate.\nCoat the tenderloin evenly with mustard; then roll in the herbs, pressing gently to adhere.\nSlice and serve.");
			img1.setBackgroundResource(R.drawable.rec62);
			
		}else if(a == 63) {
			
			txt1.setText("Roasted Baby Bok Choy");
			txt2.setText("4 heads baby bok choy, (1 1/4 pounds), trimmed, leaves separated\n4 teaspoons canola oil\n1 clove garlic, minced\n1/4 teaspoon kosher salt\n1/2 teaspoon freshly grated lemon zest\n1 tablespoon lemon juice\n1 1/2 teaspoons chopped fresh tarragon or 3/4 teaspoon dried\n1 teaspoon mirin, (see Note)\nFreshly ground pepper, to taste");
			txt3.setText("Preheat oven to 450�F.\nToss bok choy, oil, garlic and salt in a roasting pan.\nRoast on lowest rack, stirring twice, until wilted and tender-crisp, about 6 minutes.\nWhisk lemon zest and juice, tarragon, mirin and pepper in a small bowl.\nDrizzle over the roasted bok choy.");
			img1.setBackgroundResource(R.drawable.rec63);
		}else if (a == 64) {
			
			txt1.setText("Sweet Potato-Turkey Hash");
			txt2.setText("2 medium sweet potatoes, peeled and cut into 1/2-inch pieces\n1medium apple, cored and cut into 1/2-inch pieces\n1/2 cup reduced-fat sour cream\n1 teaspoon lemon juice\n1 tablespoon canola oil\n1 medium onion, chopped\n3 cups diced, cooked, skinless turkey, or chicken\n1 tablespoon chopped fresh thyme, or 1 teaspoon dried\n1/2 teaspoon salt\nFreshly ground pepper, to taste");
			txt3.setText("Place sweet potatoes in a medium saucepan, cover with lightly salted water and bring to a boil.\nReduce heat to medium, cover and cook for 3 minutes.\nAdd apple and cook until everything is just tender, but not mushy, 2 to 3 minutes longer Drain.\nTransfer 1 cup of the mixture to a large bowl; mash.\nStir in sour cream and lemon juice.\nAdd the remaining unmashed mixture and stir gently to mix.\nSet aside.\nHeat oil in a large nonstick skillet over medium-high heat.\nAdd onion and cook, stirring often, until softened, 2 to 3 minutes.\nAdd turkey (or chicken), thyme, salt and pepper; cook, stirring occasionally, until heated through, about 2 minutes.\nAdd the reserved sweet potato mixture to the pan; stir to mix.\nPress on the hash with a wide metal spatula; cook until the bottom is lightly browned, about 3 minutes.\nCut the hash into several rough sections; flip and cook until the undersides are browned, about 3 minutes longer.\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec64);
			
		}else if (a == 65) {
			
			txt1.setText("Cauliflower & Couscous Pilaf");
			txt2.setText("1 tablespoon extra-virgin olive oil\n4 cups finely chopped cauliflower florets, (about 1 medium head)\n1/2 teaspoon salt\n3/4 cup reduced-sodium chicken broth\n1 teaspoon freshly grated orange zest\n1/4 cup orange juice\n1/4 cup currants\n2/3 cup whole-wheat couscous\n1/2 cup sliced scallion greens");
			txt3.setText("Heat oil in a large saucepan over medium heat.\nAdd cauliflower and salt; cook, stirring, until softened, about 3 minutes.\nAdd broth, orange zest, juice and currants; bring to a boil over high heat.\nStir in couscous and scallions.\nRemove from heat and let stand, covered, until the liquid is absorbed, about 5 minutes.\nFluff with a fork.");
			img1.setBackgroundResource(R.drawable.rec65);
			
		}else if(a == 66) {
			
			txt1.setText("Mustard-Maple Pork Tenderloin");
			txt2.setText("3 tablespoons Dijon mustard, divided\n1/2 teaspoon kosher salt\n1/2 teaspoon freshly ground pepper\n1 pound pork tenderloin, trimmed\n2 teaspoons canola oil\n1/4 cup cider vinegar\n2 tablespoons maple syrup\n1 1/2 teaspoons chopped fresh sage");
			txt3.setText("Preheat oven to 425�F.\nCombine 1 tablespoon mustard, salt and pepper in a small bowl; rub all over pork.\nHeat oil in a large ovenproof skillet over medium-high heat.\nAdd pork and brown on all sides, 3 to 5 minutes.\nTransfer the pan to the oven and roast until an instant-read thermometer inserted in the center registers 145�F, about 15 minutes.\nTransfer to a cutting board and let rest for 5 minutes.\nPlace the skillet over medium-high heat (take care, the handle will still be hot), add vinegar, and boil, scraping up any browned bits with a wooden spoon, about 30 seconds.\nWhisk in maple syrup and the remaining 2 tablespoons mustard; bring to a boil, reduce heat to a simmer and cook until the sauce is thickened, about 5 minutes.\nSlice the pork. Add any accumulated juices to the sauce along with sage.\nServe the pork topped with the sauce.");
			img1.setBackgroundResource(R.drawable.rec66);
		}else if (a == 67) {
			
			txt1.setText("Sweet Potato-Turkey Hash");
			txt2.setText("2 medium sweet potatoes, peeled and cut into 1/2-inch pieces\n1 medium apple, cored and cut into 1/2-inch pieces\n1/2 cup reduced-fat sour cream\n1 teaspoon lemon juice\n1 tablespoon canola oil\n1 medium onion, chopped\n3 cups diced, cooked, skinless turkey, or chicken\n1 tablespoon chopped fresh thyme, or 1 teaspoon dried\n1/2 teaspoon salt\nFreshly ground pepper, to taste");
			txt3.setText("Place sweet potatoes in a medium saucepan, cover with lightly salted water and bring to a boil.\nReduce heat to medium, cover and cook for 3 minutes.\nAdd apple and cook until everything is just tender, but not mushy, 2 to 3 minutes longer.\nDrain.\nTransfer 1 cup of the mixture to a large bowl; mash.\nStir in sour cream and lemon juice.\nAdd the remaining unmashed mixture and stir gently to mix.\nSet aside.\nHeat oil in a large nonstick skillet over medium-high heat.\nAdd onion and cook, stirring often, until softened, 2 to 3 minutes.\nAdd turkey (or chicken), thyme, salt and pepper; cook, stirring occasionally, until heated through, about 2 minutes.\nAdd the reserved sweet potato mixture to the pan; stir to mix. Press on the hash with a wide metal spatula; cook until the bottom is lightly browned, about 3 minutes.\nCut the hash into several rough sections; flip and cook until the undersides are browned, about 3 minutes longer.\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec67);
			
		}else if(a == 68) {
			
			txt1.setText("Chocolate Bark with Pistachios & Dried Cherries");
			txt2.setText("3/4 cup roasted, shelled pistachios, (3 ounces), coarsely chopped\n3/4 cup dried cherries, or dried cranberries\n1 teaspoon freshly grated orange zest\n24 ounces bittersweet chocolate, finely chopped, divided");
			txt3.setText("Line the bottom and sides of a jelly-roll pan or baking sheet with foil.\n(Take care to avoid wrinkles.) Toss pistachios with cherries (or cranberries) in a medium bowl.\nDivide the mixture in half; stir orange zest into 1 portion.\nMelt 18 ounces chocolate in a double boiler over hot water.\n(Alternatively, microwave on low in 30-second bursts.) Stir often with a rubber spatula so it melts evenly.\nRemove the top pan and wipe dry (or remove the bowl from the microwave).\nStir in the remaining 6 ounces chocolate, in 2 additions, until thoroughly melted and smooth.\n\nAdd the pistachio mixture containing the orange zest to the chocolate; stir to mix well.\nWorking quickly, scrape the chocolate onto the prepared pan, spreading it to an even 1/4-inch thickness with a rubber spatula.\nSprinkle the remaining pistachio mixture on top; gently press it into the chocolate with your fingertips.\nRefrigerate, uncovered, just until set, about 20 minutes.\nInvert the pan onto a large cutting board.\nRemove the pan and peel off the foil.\nUsing the tip of a sharp knife, score the chocolate lengthwise with 6 parallel lines.\nBreak bark along the score lines.\nBreak the strips of bark into 2- to 3-inch chunks.");
			img1.setBackgroundResource(R.drawable.rec68);
		}else if (a == 69) {
			
			txt1.setText("Prosciutto-Wrapped Scallops with Spinach");
			txt2.setText("12 large dry sea scallops, (about 1 pound; see Note)\n1/4 teaspoon lemon pepper\n1 1/4 ounces very thinly sliced prosciutto, (about 3 slices), cut into 12 long strips\n3 tablespoons extra-virgin olive oil\n1 teaspoon freshly grated lemon zest\n1 tablespoon lemon juice\n1/4 teaspoon salt\nFreshly ground pepper, to taste\n12 ounces baby spinach");
			txt3.setText("Place rack in upper third of oven; preheat broiler.\nCoat a large baking sheet with cooking spray.\nPat scallops dry and sprinkle both sides with lemon pepper.\nWrap 1 piece of prosciutto around each scallop.\nThread 3 scallops crosswise onto each skewer (securing the prosciutto to the scallop) and place on the prepared baking sheet.\nBroil until just cooked through, about 6 minutes.\nMeanwhile, whisk oil, lemon zest, lemon juice, salt and pepper in a medium bowl. Reserve 1 tablespoon vinaigrette in a small bowl.\nPlace spinach in a colander and rinse under cold water.\nHeat a large skillet over medium heat.\nWhen hot, add handfuls of spinach (with water still clinging to it) to the pan and cook, stirring, until just wilted, 2 to 3 minutes.\nDrain the spinach and add to the medium bowl; toss to coat with the vinaigrette.\nDivide the spinach among 4 plates and top each portion with 3 scallops.\nDrizzle the scallops with the reserved vinaigrette.");
			img1.setBackgroundResource(R.drawable.rec69);
						
		}else if (a == 70) {
			
			txt1.setText("Wasabi Salmon Burgers");
			txt2.setText("2 tablespoons reduced-sodium soy sauce\n1 1/2 teaspoons wasabi powder, (see Note)\n1/2 teaspoon honey\n1 pound salmon fillet, skinned (see Tip)\n2 scallions, finely chopped\n1 egg, lightly beaten\n2 tablespoons minced peeled fresh ginger\n1 teaspoon toasted sesame oil");
			txt3.setText(" Whisk soy sauce, wasabi powder and honey in a small bowl until smooth.\nSet aside.\nWith a large chef's knife, chop salmon using quick, even, straight-up-and-down motions (do not rock the knife through the fish or it will turn mushy).\nContinue chopping, rotating the knife, until you have a mass of roughly 1/4-inch pieces.\nTransfer to a large bowl.\nAdd scallions, egg, ginger and oil; stir to combine.\nForm the mixture into 4 patties.\nThe mixture will be moist and loose, but holds together nicely once the first side is cooked.\nCoat a large nonstick skillet with cooking spray and heat over medium heat for 1 minute.\nAdd the patties and cook for 4 minutes.\nTurn and continue to cook until firm and fragrant, about 3 minutes.\nSpoon the reserved wasabi glaze evenly over the burgers and cook for 15 seconds more.\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec70);
						 
		}else if (a == 71) {
			
			txt1.setText("Sirloin & Portobello Stew");
			txt2.setText("1 pound sirloin steak, trimmed of fat, cut into 3/4-inch cubes\n1/3 cup all-purpose flour\n1 tablespoon extra-virgin olive oil\n6 cups chopped portobello mushroom caps, (about 6 medium), gills removed if desired\n2 cups frozen pearl onions, thawed and patted dry\n2 plum tomatoes, chopped\n2 cups frozen cut green beans, thawed\n1 14-ounce can reduced-sodium beef broth\n2/3 cup red wine\n2 teaspoons chopped fresh thyme or 1/2 teaspoon dried\n1/2 teaspoon salt\n1/4 teaspoon freshly ground pepper");
			txt3.setText("Place steak in a medium bowl and sprinkle with flour; turn to coat.\nHeat oil in a large saucepan over medium-high heat.\nAdd the steak (reserving excess flour) and cook, stirring once or twice, until browned on most sides and still pink in the center, about 3 minutes.\nTransfer to a plate and tent with foil to keep warm.\nAdd mushrooms, onions and tomatoes to the pan and cook, scraping up any browned bits, until the vegetables have released their juices, about 3 minutes.\nSprinkle the reserved flour over the vegetables; stir to coat.\nAdd green beans, broth, wine, thyme, salt and pepper; increase the heat to high and bring to a boil, stirring often.\nReduce heat to a simmer and cook, stirring often, until the broth has thickened, about 5 minutes.\nAdd the steak and any accumulated juices and cook, stirring often, until heated through, about 2 minutes.");
			img1.setBackgroundResource(R.drawable.rec71);
			
		}else if(a == 72) {
			
			txt1.setText("Peach & Blueberry Cobbler");
			txt2.setText("3 tablespoons unsalted butter\n3 tablespoons canola oil\n1 cup whole-wheat flour\n1 1/2 teaspoons baking powder\n1/2 teaspoon salt\n1 cup reduced-fat milk\n1/2 cup sugar\n1 teaspoon vanilla extract\n3 ripe but firm peaches, (about 1 pound), pitted and sliced into eighths, or 3 1/2 cups frozen\n2 cups (1 pint) fresh or frozen blueberries");
			txt3.setText("Preheat oven to 350�F.\nPlace butter and oil in a 12-inch cast-iron skillet or a 9-by-13-inch baking pan.\nHeat in the oven until melted and fragrant, 5 to 7 minutes.\nvMeanwhile, combine flour, baking powder and salt in a large bowl.\nAdd milk, sugar and vanilla; stir to combine.\nAdd the melted butter mixture to the batter and stir to combine.\nPour the batter into the hot pan.\nSpoon peaches and blueberries evenly over the batter.\nReturn the pan to the oven and bake until the top of the cobbler is browned and the batter around the fruit is completely set, 50 minutes to 1 hour.\nRemove to a wire rack to cool for at least 15 minutes.\nServe warm.");
			img1.setBackgroundResource(R.drawable.rec72);
		}else if (a == 73) {
			
			txt1.setText("Mediterranean Tuna Antipasto Salad for Two");
			txt2.setText("1/2 15- to 19-ounce can beans, such as chickpeas, black-eyed peas or kidney beans, rinsed, or 1 7-ounce can\n1 5- to 6-ounce can water-packed chunk light tuna, drained and flaked (see Note)\n1/2 large red bell pepper, finely diced\n1/4 cup finely chopped red onion\n1/4 cup chopped fresh parsley, divided\n2 teaspoons capers, rinsed\n3/4 teaspoon finely chopped fresh rosemary\n4 tablespoons lemon juice, divided\n2 tablespoons extra-virgin olive oil, divided\nFreshly ground pepper, to taste\n1/8 teaspoon salt\n4 cups mixed salad greens");
			txt3.setText("Combine beans, tuna, bell pepper, onion, parsley, capers, rosemary, 2 tablespoons lemon juice and 1 tablespoon oil in a medium bowl.\nSeason with pepper.\nCombine the remaining 2 tablespoons lemon juice, 1 tablespoon oil and salt in a large bowl.\nAdd salad greens; toss to coat. Divide the greens between 2 plates.\nTop each with the tuna salad.");
			img1.setBackgroundResource(R.drawable.rec73);
			
		}else if (a == 74) {
			
			txt1.setText("Black Bean Croquettes with Fresh Salsa");
			txt2.setText("2 15-ounce cans black beans, rinsed\n1 teaspoon ground cumin\n1 cup frozen corn kernels, thawed\n1/4 cup plus 1/3 cup plain dry breadcrumbs, divided\n2 cups finely chopped tomatoes\n2 scallions, sliced\n1/4 cup chopped fresh cilantro\n1 teaspoon chili powder, hot if desired, divided\n1/4 teaspoon salt\n1 tablespoon extra-virgin olive oil\n1 avocado, diced");
			txt3.setText(" Preheat oven to 425�F.\n Coat a baking sheet with cooking spray.\nMash black beans and cumin with a fork in a large bowl until no whole beans remain.\ntir in corn and 1/4 cup breadcrumbs.\nCombine tomatoes, scallions, cilantro, 1/2 teaspoon chili powder and salt in a medium bowl.\nStir 1 cup of the tomato mixture into the black bean mixture.\nMix the remaining 1/3 cup breadcrumbs, oil and the remaining 1/2 teaspoon chili powder in a small bowl until the breadcrumbs are coated with oil.\nDivide the bean mixture into 8 scant 1/2-cup balls.\nLightly press each bean ball into the breadcrumb mixture, turning to coat.\nPlace on the prepared baking sheet.\nBake the croquettes until heated through and the breadcrumbs are golden brown, about 20 minutes.\nStir avocado into the remaining tomato mixture.\nServe the salsa with the croquettes.");
			img1.setBackgroundResource(R.drawable.rec74);
			
		}else if(a == 75) {
			
			txt1.setText("Bev's Chocolate Chip Cookies");
			txt2.setText("3/4 cup rolled oats\n1 cup whole-wheat flour\n1/2 teaspoon baking soda\n1/2 teaspoon salt\n1/4 cup butter, softened\n1/4 cup canola oil\n1/3 cup granulated sugar\n1/3 cup brown sugar\n1 large egg\n1 teaspoon vanilla extract\n1 cup chocolate chips");
			txt3.setText("Preheat oven to 350�F.\nCoat 2 baking sheets with cooking spray.\nGrind oats in a blender or food processor.\nTransfer to a medium bowl and stir in flour, baking soda and salt.\nBeat butter in a large bowl with an electric mixer until fluffy.\nAdd oil, granulated sugar, brown sugar, egg and vanilla; beat until smooth and creamy.\nWith the mixer running, add the dry ingredients, beating on low speed until just combined.\nStir in chocolate chips.\nDrop the dough by heaping teaspoonfuls, at least 1 inch apart, onto the prepared baking sheets.\nBake cookies, 1 sheet at a time, until firm around the edges and golden on top, about 15 minutes.\nCool the cookies for 2 minutes on the baking sheets, then transfer to wire racks to cool completely.");
			img1.setBackgroundResource(R.drawable.rec75);
			
		}else if (a == 76) {
			
			txt1.setText("BLT Salad");
			txt2.setText("1 cup cubed whole-wheat country bread\n2 teaspoons extra-virgin olive oil\n4 medium tomatoes, divided\n3 tablespoons reduced-fat mayonnaise\n2 tablespoons minced chives, or scallion greens\n2 teaspoons distilled white vinegar\n1/4 teaspoon garlic powder\nFreshly ground pepper, to taste\n5 cups chopped hearts of romaine lettuce\n3 slices center-cut bacon, cooked and crumbled");
			txt3.setText("Preheat oven to 350�F.\nToss bread with oil and spread on a baking sheet.\nBake, turning once, until golden brown, 15 to 20 minutes.\nCut 1 tomato in half.\nWorking over a large bowl, shred both halves using the large holes on a box grater.\nDiscard the skin. Add mayonnaise, chives (or scallion greens), vinegar, garlic powder and pepper; whisk to combine.\nChop the remaining 3 tomatoes.\nAdd the tomatoes, romaine and croutons to the bowl with the dressing; toss to coat.\nSprinkle with bacon.");
			img1.setBackgroundResource(R.drawable.rec76);
			
		}else if (a == 77) {
			
			txt1.setText("Roasted Cod, Tomatoes, Orange & Onions");
			txt2.setText("1 pound ripe but firm small round or plum tomatoes, cut into 1/2-inch-thick wedges\n2 medium yellow onions, cut into 1/4-inch-thick wedges\n1 tablespoon finely slivered orange zest (see Tips)\n1 tablespoon extra-virgin olive oil\n1 tablespoon chopped fresh thyme leaves, plus sprigs for garnish\n1/2 teaspoon kosher salt, divided\nFreshly ground pepper, to taste\n1 pound boneless, skinless cod (see Tips) or other thick-cut, firm-fleshed fish, cut into 4 equal portions");
			txt3.setText("Preheat oven to 400�F.\nCombine tomatoes, onions, orange zest, oil and chopped thyme in a 3-quart glass or ceramic baking dish.\nSprinkle with 1/4 teaspoon salt and pepper; stir to combine.\nRoast, stirring occasionally, until the onions are golden and brown on the edges, about 45 minutes.\nRemove from the oven.\nIncrease oven temperature to 450�F.\nPush the vegetables aside, add fish and season with the remaining 1/4 teaspoon salt and pepper; spoon the vegetables over the fish.\nReturn the baking dish to the oven and bake until the fish is opaque in the center, about 10 to 12 minutes.\nTo serve, divide the fish and vegetables among 4 plates and garnish with thyme sprigs.");
			img1.setBackgroundResource(R.drawable.rec77);
			
		}else if(a == 78) {
			
			txt1.setText("Green Salad with Asparagus & Peas (Salat med Asparges og �rter)");
			txt2.setText("2 teaspoons freshly grated lemon zest\n1/4 cup lemon juice\n1/4 cup canola oil, or extra-virgin olive oil\n1 teaspoon sugar\n1/2 teaspoon salt\n1/4 teaspoon freshly ground pepper\n2 heads Boston or Bibb lettuce, torn into bite-size pieces\n2 cups very thinly sliced fresh asparagus, (about 1 bunch)\n2 cups shelled fresh peas, (about 3 pounds unshelled)\n1 pint grape or cherry tomatoes, halved\n2 tablespoons minced fresh chives, or scallion greens");
			txt3.setText(" Combine lemon zest and juice, oil, sugar, salt and pepper in a large salad bowl.\nAdd lettuce, asparagus, peas, tomatoes and chives (or scallion greens); toss to coat.");
			img1.setBackgroundResource(R.drawable.rec78);
		}else if (a == 79) {
			
			txt1.setText("Fragrant Shredded Beef Stew");
			txt2.setText("1 1/2 cups reduced-sodium chicken broth\n1/4 cup sherry vinegar\n2 stalks celery, thinly sliced\n1 large onion, chopped\n1 large red bell pepper, seeded and chopped\n3 cloves garlic, minced\n1 tablespoon ground cumin\n1 teaspoon salt\n1/2 teaspoon freshly ground pepper\n3 pounds flank steak, trimmed of fat, each steak cut into thirds\n1/2 cup packed fresh cilantro leaves, chopped\n1/2 cup chopped pickled jalapenos\n10 corn tortillas, heated (see Tip)");
			txt3.setText(" Combine broth, vinegar, celery, onion, bell pepper, garlic, cumin, salt and pepper in a 6-quart slow cooker.\nAdd beef, submerging it by tucking the vegetables under, over and between the pieces.\nPut the lid on and cook on low until the meat is fork-tender, about 8 hours.\nTransfer the meat to a cutting board; let stand for 10 minutes.\nShred the meat with 2 forks and return it to the slow cooker.\nStir in cilantro.\nGarnish with jalapeno and serve warm tortillas on the side.");
			img1.setBackgroundResource(R.drawable.rec79);
			
		}else if (a == 80) {
			
			txt1.setText("Seared Scallops with Brandied Leeks & Mushrooms");
			txt2.setText("4 teaspoons extra-virgin olive oil, divided\n10 ounces mushrooms, sliced\n2 cups thinly sliced leeks, white and light green parts only (about 2)\n1/4 cup brandy, or dry vermouth\n1/4 cup reduced-sodium chicken broth\n3 tablespoons reduced-fat sour cream\n1 tablespoon chopped fresh parsley\n1/2 teaspoon salt, divided\nFreshly ground pepper, to taste\n1 pound large dry sea scallops, (see Note)");
			txt3.setText("Heat 2 teaspoons oil in a large skillet over medium-high heat.\nAdd mushrooms; cook, stirring occasionally, until they begin to give off liquid, about 3 minutes.\nStir in leeks; cook, adjusting heat to prevent scorching, until the vegetables are very tender and the leeks are starting to brown, about 8 minutes.\nAdd brandy (or vermouth) and broth; cook until reduced and thickened, about 30 seconds.\nRemove from the heat and stir in sour cream, parsley, 1/4 teaspoon salt and pepper to taste.\nCover and set aside.\nPat scallops dry and sprinkle with the remaining 1/4 teaspoon salt and pepper.\nHeat the remaining 2 teaspoons oil in a large nonstick skillet over medium-high heat.\nAdd the scallops and cook until golden brown, 2 to 3 minutes per side.\nTo serve, place some of the leek-mushroom mixture on each plate and top with scallops.");
			img1.setBackgroundResource(R.drawable.rec80);
						 
		}else if (a == 81) {
			
			txt1.setText("Southwestern Rice & Pinto Bean Salad");
			txt2.setText("1 cup Wehani brown rice, (see Note) or brown basmati rice\n2-2 1/2 cups water\n2 teaspoons cumin seeds, or 1 teaspoon ground cumin\n1/4 cup extra-virgin olive oil\n1/4 cup sherry vinegar\n1 tablespoon chopped fresh oregano, or 1 teaspoon dried\n1 large clove garlic, crushed and peeled\n1/4 teaspoon salt\n1/2 teaspoon freshly ground pepper\n2 15-ounce cans pinto beans, rinsed\n8 scallions, trimmed and sliced (about 1 1/2 cups)\n1 medium bell pepper, (green, yellow, orange or red), chopped (about 1 cup)");
			txt3.setText("Combine rice and water (2 cups water if using brown basmati) in a 3-quart saucepan; bring to a boil.\nReduce heat to low, cover and cook until all the water has been absorbed, 40 to 45 minutes.\nRemove from heat; let rest, covered, for 10 minutes.\nSpread the rice out on a large baking sheet until cooled to room temperature, about 15 minutes.\nMeanwhile, toast cumin in a small skillet over medium-high heat until fragrant and lightly toasted, 1 to 2 minutes for seeds, 1 minute for ground cumin.\nTransfer to a blender or food processor and let cool for several minutes.\nAdd oil, vinegar, oregano, garlic, salt and pepper and process until the garlic is finely chopped.\nTransfer the rice to a large bowl and toss with beans, scallions and bell pepper.\nPour the dressing over the salad and toss well to combine.");
			img1.setBackgroundResource(R.drawable.rec81);
			
		}else if (a == 82) {
			
			txt1.setText("Grilled Salmon with Mustard & Herbs");
			txt2.setText("2 lemons, thinly sliced, plus 1 lemon cut into wedges for garnish\n20-30 sprigs mixed fresh herbs, plus 2 tablespoons chopped, divided\n1 clove garlic\n1/4 teaspoon salt\n1 tablespoon Dijon mustard\n1 pound center-cut salmon, skinned (see Tip)");
			txt3.setText("Preheat grill to medium-high.\nLay two 9-inch pieces of heavy-duty foil on top of each other and place on a rimless baking sheet.\nArrange lemon slices in two layers in the center of the foil.\nSpread herb sprigs over the lemons.\nWith the side of a chef�s knife, mash garlic with salt to form a paste.\nTransfer to a small dish and stir in mustard and the remaining 2 tablespoons chopped herbs.\nSpread the mixture over both sides of the salmon.\nPlace the salmon on the herb sprigs.\nSlide the foil and salmon off the baking sheet onto the grill without disturbing the salmon-lemon stack.\nCover the grill; cook until the salmon is opaque in the center, 18 to 24 minutes.\nWearing oven mitts, carefully transfer foil and salmon back onto the baking sheet.\nCut the salmon into 4 portions and serve with lemon wedges (discard herb sprigs and lemon slices).");
			img1.setBackgroundResource(R.drawable.rec82);
			
		}else if(a == 83) {
			
			txt1.setText("Warm Red Cabbage Salad");
			txt2.setText("1 tablespoon extra-virgin olive oil\n4 cups red cabbage, thinly sliced (about 1/4 large head)\n3/4 teaspoon caraway seeds\n1/2 teaspoon salt\n1 crisp, sweet apple, such as Braeburn or Gala, cut into matchsticks\n1 shallot, minced\n1 tablespoon red-wine vinegar\n1/2 teaspoon Dijon mustard\n1/2 teaspoon freshly, ground pepper\n2 tablespoons chopped walnuts, toasted (see Tip)");
			txt3.setText("Heat oil in a large saucepan over medium heat.\nAdd cabbage, caraway seeds and salt.\nCook, covered, stirring occasionally, until tender, 8 to 10 minutes.\nRemove from the heat.\nAdd apple, shallot, vinegar, mustard and pepper and stir until combined.\nServe sprinkled with toasted walnuts.");
			img1.setBackgroundResource(R.drawable.rec83);
		}else if (a == 84) {
			
			txt1.setText("EatingWell Waffles");
			txt2.setText("1 cup whole-wheat flour\n1 cup all-purpose flour\n1 1/2 teaspoons baking powder\n1/2 teaspoon salt\n1/4 teaspoon baking soda\n2 cups nonfat buttermilk, (see Tip)\n1 large egg, separated\n1 tablespoon canola oil\n1 tablespoon vanilla extract, (optional)\n2 large egg whites\n2 tablespoons sugar");
			txt3.setText("Stir whole-wheat flour, all-purpose flour, baking powder, salt and baking soda in a large bowl.\nWhisk buttermilk, the egg yolk, oil and vanilla (if using) in a separate bowl.\nAdd the wet ingredients to the dry ingredients and stir with a wooden spoon just until moistened.\nBeat the 3 egg whites in a grease-free mixing bowl with an electric mixer until soft peaks form.\nAdd sugar and continue beating until stiff and glossy.\nWhisk one-quarter of the beaten egg whites into the batter.\nFold in the remaining beaten egg whites with a rubber spatula.\nPreheat a waffle iron.\nBrush the surface lightly with oil.\nFill the waffle iron two-thirds full of batter.\nCook until the waffles are crisp and golden, 5 to 6 minutes.\nRepeat with the remaining batter, brushing the surface with oil before cooking each batch.");
			img1.setBackgroundResource(R.drawable.rec84);
		}else if (a == 85) {
			
			txt1.setText("Bacony Barley Salad with Marinated Shrimp");
			txt2.setText("3 strips bacon, chopped\n1 1/3 cups water\n1/2 teaspoon salt\n2/3 cup quick-cooking barley\n1 pound peeled cooked shrimp, (21-25 per pound; thawed if frozen), tails removed, coarsely chopped\n1/3 cup lime juice\n2 cups cherry tomatoes, halved\n1/2 cup finely diced red onion\n1/2 cup chopped fresh cilantro\n2 tablespoons extra-virgin olive oil\nFreshly ground pepper, to taste\n1 avocado, peeled and diced");
			txt3.setText("Cook bacon in a small saucepan over medium heat, stirring often, until crispy, about 4 minutes.\nDrain on paper towel; discard fat.\nAdd water and salt to the pan and bring to a boil.\nAdd barley and return to a simmer.\nReduce heat to low, cover and simmer until all the liquid is absorbed, 10 to 12 minutes.\nCombine shrimp and lime juice in a large bowl.\nAdd the cooked barley; toss to coat.\nLet stand for 10 minutes, stirring occasionally, to allow the barley to absorb some of the lime juice.\nAdd tomatoes, onion, cilantro and the bacon; toss to coat.\nAdd oil and pepper and toss again.\nStir in avocado and serve.");
			img1.setBackgroundResource(R.drawable.rec85);
		}else if (a == 86) {
			
			txt1.setText("Oven-Fried Chicken");
			txt2.setText("1/2 cup nonfat buttermilk, (see Tip)\n1 tablespoon Dijon mustard\n2 cloves garlic, minced\n1 teaspoon hot sauce\n2 1/2-3 pounds whole chicken legs, skin removed, trimmed and cut into thighs and drumsticks\n1/2 cup whole-wheat flour\n2 tablespoons sesame seeds\n1 1/2 teaspoons paprika\n1 teaspoon dried thyme\n1 teaspoon baking powder\n1/8 teaspoon salt\nFreshly ground pepper, to taste\nOlive oil cooking spray");
			txt3.setText("Whisk buttermilk, mustard, garlic and hot sauce in a shallow glass dish until well blended.\nAdd chicken and turn to coat.\nCover and marinate in the refrigerator for at least 30 minutes or for up to 8 hours.\nPreheat oven to 425�F.\nLine a baking sheet with foil.\nSet a wire rack on the baking sheet and coat it with cooking spray.\nWhisk flour, sesame seeds, paprika, thyme, baking powder, salt and pepper in a small bowl.\nPlace the flour mixture in a paper bag or large sealable plastic bag.\nShaking off excess marinade, place one or two pieces of chicken at a time in the bag and shake to coat.\nShake off excess flour and place the chicken on the prepared rack.\n(Discard any leftover flour mixture and marinade.) Spray the chicken pieces with cooking spray.\nBake the chicken until golden brown and no longer pink in the center, 40 to 50 minutes.");
			img1.setBackgroundResource(R.drawable.rec86);
		}else if (a == 87) {
			
			txt1.setText("Blueberry-Ricotta Pancakes");
			txt2.setText("1/2 cup whole-wheat pastry flour (see Source)\n1/4 cup plus 2 tablespoons all-purpose flour\n1 teaspoon sugar\n1 teaspoon baking powder\n1/4 teaspoon baking soda\n1/2 teaspoon freshly grated nutmeg\n3/4 cup part-skim ricotta cheese\n1 large egg\n1 large egg white\n1/2 cup nonfat buttermilk (see Tip)\n1 teaspoon freshly grated lemon zest\n1 tablespoon lemon juice\n 2 teaspoons canola oil, divided\n3/4 cup fresh or frozen (not thawed) blueberries");
			txt3.setText("Whisk whole-wheat flour, all-purpose flour, sugar, baking powder, baking soda and nutmeg in a small bowl.\nWhisk ricotta, egg, egg white, buttermilk, lemon zest and juice in a large bowl until smooth.\nStir the dry ingredients into the wet ingredients until just combined.\nBrush a large nonstick skillet with 1/2 teaspoon oil and place over medium heat until hot.\nUsing a generous 1/4 cup of batter for each pancake, pour the batter for 2 pancakes into the pan, sprinkle blueberries on each pancake and cook until the edges are dry and bubbles begin to form, about 2 minutes.\nFlip the pancakes and cook until golden brown, about 2 minutes more.\nRepeat with the remaining oil, batter and berries, adjusting the heat as necessary to prevent burning.");
			img1.setBackgroundResource(R.drawable.rec87);
		}else if (a == 88) {
			
			txt1.setText("Crispy Fish Sandwich with Pineapple Slaw");
			txt2.setText("2 tablespoons low-fat mayonnaise\n2 tablespoons nonfat plain yogurt\n2 teaspoons rice vinegar\n1/8-1/4 teaspoon crushed red pepper\n1 8-ounce can pineapple chunks or rings, drained and coarsely chopped\n2 cups coleslaw mix\n1/4 cup cornmeal\n1 1/4 pounds haddock or cod (see Tip), skinned and cut into 4 portions\n1/2 teaspoon Cajun seasoning\n1/4 teaspoon salt\n4 teaspoons canola oil, divided\n 8 slices whole-wheat country bread, toasted");
			txt3.setText("Whisk mayonnaise, yogurt, vinegar and crushed red pepper to taste in a medium bowl.\nAdd pineapple and coleslaw mix and stir to combine.\nPlace cornmeal in a shallow dish.\nSprinkle both sides of fish with Cajun seasoning and salt.\nDredge the fish in the cornmeal.\nHeat 2 teaspoons oil in a large nonstick skillet over medium-high heat.\nAdd half the fish and cook until golden, about 2 minutes per side.\nTransfer to a plate and repeat with the remaining 2 teaspoons oil and fish, adjusting heat as needed to prevent burning.\nTop toasted bread with the fish and pineapple slaw to make sandwiches.\nServe immediately.");
			img1.setBackgroundResource(R.drawable.rec88);
		}else if (a == 89) {
			
			txt1.setText("Thai Chicken Satay with Spicy Peanut Sauce");
			txt2.setText("THAI CHICKEN SATAY WITH SPICY PEANUT SAUCE\n3 tablespoons lime juice\n3 tablespoons canola oil\n2 teaspoons reduced-sodium soy sauce\n2 teaspoons fish sauce, (see Ingredient Note)\n 1/2 teaspoon crushed red pepper\n 1 pound chicken tenders\n SPICY PEANUT SAUCE\n 2 tablespoons smooth natural peanut butter\n 2 tablespoons 'lite' coconut milk, (see Tip)\n 1 tablespoon lime juice\n 2 teaspoons reduced-sodium soy sauce\n 1 teaspoon brown sugar\n 1/2 teaspoon crushed red pepper, or to taste");
			txt3.setText("Whisk lime juice, oil, soy sauce, fish sauce and red pepper in a shallow dish until combined; add chicken and turn to coat.\nLet marinate in the refrigerator for 15 minutes.\nTo prepare peanut sauce: Whisk peanut butter, coconut milk, lime juice, soy sauce, brown sugar and red pepper until smooth.\nPreheat grill to high.\nThread each chicken tender onto a wooden skewer.\nGrill until cooked through and no longer pink in the middle, about 3 minutes per side.\nServe warm or chilled with Spicy Peanut Sauce.");
			img1.setBackgroundResource(R.drawable.rec89);
		}else if (a == 90) {
			
			txt1.setText("Quick Breakfast Taco");
			txt2.setText("2 corn tortillas\n1 tablespoon salsa\n2 tablespoons shredded reduced-fat Cheddar cheese\n1/2 cup liquid egg substitute, such as Egg Beaters");
			txt3.setText("Top tortillas with salsa and cheese.\nHeat in the microwave until the cheese is melted, about 30 seconds.\nMeanwhile coat a small nonstick skillet with cooking spray.\nHeat over medium heat, add egg substitute and cook, stirring, until the eggs are cooked through, about 90 seconds.\nDivide the scrambled egg between the tacos.");
			img1.setBackgroundResource(R.drawable.rec90);
		}else if (a == 91) {
			
			txt1.setText("Bok Choy-Apple Slaw");
			txt2.setText("1/3 cup reduced-fat sour cream\n1/3 cup reduced-fat mayonnaise\n2 tablespoons white-wine vinegar\n2 teaspoons sugar or honey\n1/2 teaspoon celery salt\n1/4 teaspoon salt\n6 cups very thinly sliced bok choy, (1-pound head, trimmed)\n1 large Granny Smith apple, julienned or shredded\n1 large carrot, julienned or shredded\n1/2 cup slivered red onion");
			txt3.setText("Whisk sour cream, mayonnaise, vinegar, sugar (or honey), celery salt and salt in a large bowl until smooth.\nAdd bok choy, apple, carrot and onion; toss to coat.");
			img1.setBackgroundResource(R.drawable.rec91);
		}else if (a == 92) {
			
			txt1.setText("Grilled Pork Tenderloin Marinated in Spicy Soy Sauce");
			txt2.setText("1/4 cup reduced-sodium soy sauce\n2 tablespoons sugar\n1 large clove garlic, peeled and finely grated or minced\n1 tablespoon finely grated fresh ginger\n1 fresh red Thai chile (see Note) or cayenne chile pepper, stemmed, seeded and minced\n1 tablespoon toasted sesame oil\n1 1/2 pounds pork tenderloin, trimmed of fat and cut into 1-inch-thick medallions");
			txt3.setText("Whisk soy sauce and sugar in a medium bowl until the sugar is completely dissolved.\nStir in garlic, ginger, chile and oil.\nPlace pork in a resealable plastic bag.\nAdd the marinade and seal the bag, squeezing air out.\nTurn the bag to coat the medallions.\nRefrigerate for 2 hours, turning the bag once to redistribute the marinade.\nPreheat the grill to medium.\nRemove the pork from the marinade.\n(Discard marinade.) Grill the medallions until just cooked through, 3 to 5 minutes per side.");
			img1.setBackgroundResource(R.drawable.rec92);
		}else if (a == 93) {
			
			txt1.setText("Egg & Salmon Sandwich");
			txt2.setText("1/2 teaspoon extra-virgin olive oil\n1 tablespoon finely chopped red onion\n2 large egg whites, beaten\nPinch of salt\n1/2 teaspoon capers, rinsed and chopped (optional)\n1 ounce smoked salmon\n1 slice tomato\n1 whole-wheat English muffin, split and toasted");
			txt3.setText("Heat oil in a small nonstick skillet over medium heat.\nAdd onion and cook, stirring, until it begins to soften, about 1 minute.\nAdd egg whites, salt and capers (if using) and cook, stirring constantly, until whites are set, about 30 seconds.\nTo make the sandwich, layer the egg whites, smoked salmon and tomato on English muffin.");
			img1.setBackgroundResource(R.drawable.rec93);
		}else if (a == 94) {
			
			txt1.setText("Cucumber & Black-Eyed Pea Salad");
			txt2.setText("3 tablespoons extra-virgin olive oil\n2 tablespoons lemon juice\n2 teaspoons chopped fresh oregano, or 1 teaspoon dried\nFreshly ground pepper to taste\n4 cups peeled and diced cucumbers\n1 14-ounce can black-eyed peas, rinsed\n2/3 cup diced red bell pepper\n1/2 cup crumbled feta cheese\n1/4 cup slivered red onion\n2 tablespoons chopped black olives");
			txt3.setText("Whisk oil, lemon juice, oregano and pepper in a large bowl until combined.\nAdd cucumber, black-eyed peas, bell pepper, feta, onion and olives; toss to coat.\nServe at room temperature or chilled.");
			img1.setBackgroundResource(R.drawable.rec94);
		}else if (a == 95) {
			
			txt1.setText("Barbecue Pulled Chicken");
			txt2.setText("1 8-ounce can reduced-sodium tomato sauce\n1 4-ounce can chopped green chiles, drained\n3 tablespoons cider vinegar\n2 tablespoons honey\n1 tablespoon sweet or smoked paprika\n1 tablespoon tomato paste\n1 tablespoon Worcestershire sauce\n2 teaspoons dry mustard\n1  teaspoon ground chipotle chile\n1/2 teaspoon salt\n2 1/2 pounds boneless, skinless chicken thighs, trimmed of fat\n1 small onion, finely chopped\n1 clove garlic, minced");
			txt3.setText("Stir tomato sauce, chiles, vinegar, honey, paprika, tomato paste, Worcestershire sauce, mustard, ground chipotle and salt in a 6-quart slow cooker until smooth.\nAdd chicken, onion and garlic; stir to combine.\nPut the lid on and cook on low until the chicken can be pulled apart, about 5 hours.\nTransfer the chicken to a cutting board and shred with a fork.\nReturn the chicken to the sauce, stir well and serve.");
			img1.setBackgroundResource(R.drawable.rec95);
		}else if (a == 96) {
			
			txt1.setText("Quick Breakfast Taco");
			txt2.setText("2 corn tortillas\n1 tablespoon salsa\n2 tablespoons shredded reduced-fat Cheddar cheese\n1/2 cup liquid egg substitute, such as Egg Beaters");
			txt3.setText("Top tortillas with salsa and cheese.\nHeat in the microwave until the cheese is melted, about 30 seconds.\nMeanwhile coat a small nonstick skillet with cooking spray.\nHeat over medium heat, add egg substitute and cook, stirring, until the eggs are cooked through, about 90 seconds.\nDivide the scrambled egg between the tacos.");
			img1.setBackgroundResource(R.drawable.rec96);
		}else if (a == 97) {
			
			txt1.setText("Grilled Smoky Eggplant Salad");
			txt2.setText("2 small eggplants, (about 1 pound total)\n3/4 teaspoon kosher salt, divided\nOlive oil cooking spray\n1/4 cup extra-virgin olive oil\n1 tablespoon sherry vinegar\n1 small plum tomato, diced\n1 small clove garlic, chopped\n1 1/2 teaspoons smoked paprika, (see Note)\n3 cups mixed baby salad greens\n2 ounces Manchego cheese, cut into thin curls with a vegetable peeler (see Note)");
			txt3.setText("Preheat grill to medium.\nCut stripes in each eggplant�s peel by running a vegetable peeler down the length of it and repeating at about 1-inch intervals.\nSlice the eggplants into rounds 1/3 to 1/2 inch thick.\nLay them on a baking sheet and sprinkle lightly with 1/2 teaspoon salt.\nLet stand for about 5 minutes.\nBlot the eggplant slices with paper towels and lightly coat both sides with olive oil cooking spray.\nGrill the eggplant, flipping halfway through, until soft and browned on both sides, 9 to 11 minutes total.\nPuree oil, vinegar, tomato, garlic, paprika and the remaining 1/4 teaspoon salt in a blender until well combined.\nToss salad greens with half the vinaigrette in a medium bowl.\nArrange the eggplant slices on 6 salad plates.\nDrizzle with the remaining vinaigrette.\nPlace the salad greens over and between the eggplant slices, then scatter the cheese curls on top of each salad.\nServe warm or at room temperature.");
			img1.setBackgroundResource(R.drawable.rec97);
		}else if (a == 98) {
			
			txt1.setText("Jumbo Prawns & Balsamic-Orange Onions");
			txt2.setText("2 large sweet onions, sliced\n2 tablespoons extra-virgin olive oil\n1 teaspoon kosher salt\n1 teaspoon freshly grated orange zest\nJuice of 1 orange\n2 tablespoons balsamic vinegar\n1 teaspoon finely chopped fresh rosemary, or 1/4 teaspoon dried\nPinch of crushed red pepper\n12 raw shrimp, (6-8 per pound; see Note), peeled and deveined\n1/4 cup sliced scallion greens");
			txt3.setText("Preheat oven to 400�F.\nToss onions, oil and salt in a 9-by-13-inch baking pan until coated.\nCover with foil.\nBake until softened and juicy, about 45 minutes.\nRemove foil, stir and continue baking, uncovered, until the onions around the edges of the pan are lightly golden, 25 to 30 minutes.\nStir in orange zest, orange juice, vinegar, rosemary and crushed red pepper.\nBake until most of the liquid has evaporated, about 30 minutes.\nStir in shrimp and bake until cooked through, 20 to 25 minutes.\nStir in scallion greens and serve.");
			img1.setBackgroundResource(R.drawable.rec98);
		}else if (a == 99) {
			
			txt1.setText("Papaya-Avocado Salad");
			txt2.setText("1 medium papaya, diced\n1 medium avocado, diced\n3/4 cup diced jicama\n2 tablespoons chopped toasted walnuts\n2 tablespoons low-fat raspberry vinaigrette");
			txt3.setText("Toss papaya, avocado, jicama, walnuts and raspberry vinaigrette in a medium bowl.");
			img1.setBackgroundResource(R.drawable.rec99);
		}else if (a == 100) {
			
			txt1.setText("Gnocchi with Tomatoes, Pancetta & Wilted Watercress");
			txt2.setText("2 ounces pancetta, chopped\n3 cloves garlic, minced\n2 large tomatoes, chopped\n1/2 teaspoon sugar\n1/4 teaspoon crushed red pepper\n2 teaspoons red-wine vinegar\n1/4 teaspoon salt\n1 pound gnocchi, (see Shopping Tip)\n4 ounces watercress, tough stems removed, coarsely chopped (6 cups packed)\n1/3 cup freshly grated Parmesan cheese");
			txt3.setText("Put a large pan of water on to boil.\nCook pancetta in a large nonstick skillet over medium heat, stirring occasionally, until it begins to brown, 4 to 5 minutes.\nAdd garlic and cook, stirring, for 30 seconds.\nAdd tomatoes, sugar and crushed red pepper and cook, stirring, until the tomatoes are almost completely broken down, about 5 minutes.\nStir in vinegar and salt.\nRemove from the heat.\nCook gnocchi in the boiling water until they float, 3 to 5 minutes or according to package directions.\nPlace watercress in a colander and drain the gnocchi over the watercress, wilting it slightly.\nAdd the gnocchi and watercress to the sauce in the pan; toss to combine.\nServe immediately, with Parmesan.");
			img1.setBackgroundResource(R.drawable.rec100);
		}else if (a == 101) {
			
			txt1.setText("Bread & Tomato Salad");
			txt2.setText("3 tablespoons extra-virgin olive oil\n3 tablespoons lemon juice\n1 small clove garlic, minced\n1/4 teaspoon salt, or to taste\nFreshly ground pepper, to taste\n4 cups diced seeded tomatoes, (1 1/2 pounds)\n2 cups cubed whole-wheat country bread, (5 ounces), crusts removed\n1/4 cup thinly slivered red onion\n3 tablespoons chopped fresh basil\n2 tablespoons capers, rinsed\n4 4-1/2-ounce cans sardines, (see Ingredient note), optional");
			txt3.setText("Whisk oil, lemon juice, garlic, salt and pepper in a large bowl.\nAdd tomatoes, bread, onion, basil and capers.\nToss to combine.\nLet the salad sit for about 5 minutes to allow it to absorb the dressing's flavors, stirring occasionally.\nServe at room temperature.");
			img1.setBackgroundResource(R.drawable.rec101);
			
		}else if(a == 102) {
			
			txt1.setText("Rhubarb-Vanilla Compote");
			txt2.setText("4 cups diced rhubarb\n1/2 cup sugar\n1/4 teaspoon cinnamon\n1/2 teaspoon vanilla");
			txt3.setText("Combine rhubarb, sugar and cinnamon in a medium saucepan.\nBring to a simmer over medium-high heat; reduce heat to a gentle simmer and cook until the rhubarb begins to break down, about 5 minutes.\nRemove from heat and stir in vanilla.");
			img1.setBackgroundResource(R.drawable.rec102);
		}else if (a == 103) {
			
			txt1.setText("Grilled Salmon with Mustard & Herbs");
			txt2.setText("2 lemons, thinly sliced, plus 1 lemon cut into wedges for garnish\n20-30 sprigs mixed fresh herbs, plus 2 tablespoons chopped, divided\n1 clove garlic\n1/4 teaspoon salt\n1 tablespoon Dijon mustard\n1 pound center-cut salmon, skinned (see Tip)");
			txt3.setText("Preheat grill to medium-high.\nLay two 9-inch pieces of heavy-duty foil on top of each other and place on a rimless baking sheet.\nArrange lemon slices in two layers in the center of the foil.\nSpread herb sprigs over the lemons.\nWith the side of a chef�s knife, mash garlic with salt to form a paste.\nTransfer to a small dish and stir in mustard and the remaining 2 tablespoons chopped herbs.\nSpread the mixture over both sides of the salmon.\nPlace the salmon on the herb sprigs.\nSlide the foil and salmon off the baking sheet onto the grill without disturbing the salmon-lemon stack.\nCover the grill; cook until the salmon is opaque in the center, 18 to 24 minutes.\nWearing oven mitts, carefully transfer foil and salmon back onto the baking sheet.\nCut the salmon into 4 portions and serve with lemon wedges (discard herb sprigs and lemon slices).");
			img1.setBackgroundResource(R.drawable.rec103);
		}
		 
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {


		case R.id.about:
			Intent aboutIntent = new Intent(Recipe.this, AboutActivity.class);
			startActivity(aboutIntent);
			return true;
			
		case R.id.share:
			
			 Intent sendIntent = new Intent();
			 sendIntent.setAction(Intent.ACTION_SEND);
			 sendIntent.putExtra(Intent.EXTRA_TEXT,"  Recipe: "+txt1.getText().toString()+"\n"+
					 											txt10.getText().toString()+"\n"+
					 											txt2.getText().toString()+"\n"+
					 											txt12.getText().toString()+"\n"+
					 											txt3.getText().toString()+"\n"+
					 											" I Would like to share this with you. Here You Can Download This Application from PlayStore "+
					 											"https://play.google.com/store/apps/details?id="+getPackageName());
			 sendIntent.setType("text/plain");
			 startActivity(sendIntent);
			return true;
			
		default:
			return super.onOptionsItemSelected(item);
		}
		
	}
	
	
}
