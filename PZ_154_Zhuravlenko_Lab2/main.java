import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.util.Random;

//---створення головного класу

class main {
    public static void main(String[] args) {
		
		//---Підключення класів
		
		Random random = new Random();
		Flower_properties flower_properties_cls = new Flower_properties();
		
		//---Створення головної форми
		
		JFrame Flower = new JFrame("Flower");
		Flower.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Flower.setVisible(true);
		
		JButton create_flower = new JButton("Create Flower");
		create_flower.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		GridLayout flower_grid = new GridLayout(1, 1);
		Flower.setLayout(flower_grid);
		
		Flower.getContentPane().add(create_flower);
		
		Flower.setSize(300, 70);
		Flower.setResizable(false);
		
		//---створення форми для вибору квітки
		
		JFrame Flower_Choice = new JFrame("Flower Choice");
		Flower_Choice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Flower_Choice.setVisible(false);
		
		JButton flower_random = new JButton("Create Random Flower");
		flower_random.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton flower_from_list = new JButton("Create Flower From List");
		flower_from_list.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		GridLayout create_flower_grid = new GridLayout(1, 2);
		Flower_Choice.setLayout(create_flower_grid);
		
		Flower_Choice.getContentPane().add(flower_random);
		Flower_Choice.getContentPane().add(flower_from_list);
		
		Flower_Choice.setSize(400, 70);
		Flower_Choice.setResizable(false);
		
		//---створення форми для вибору квітки зі списку
		
		JFrame Flower_Choice_From_List = new JFrame("Flower Choice From List");
		Flower_Choice_From_List.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Flower_Choice_From_List.setVisible(false);
		
		JComboBox<String> flower_list = new JComboBox<>(flower_properties_cls.get_array_name_of_flowers());
		flower_list.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton ok = new JButton("Ok");
		ok.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		GridLayout flower_list_grid = new GridLayout(2, 1);
		Flower_Choice_From_List.setLayout(flower_list_grid);
		
		Flower_Choice_From_List.getContentPane().add(flower_list);
		Flower_Choice_From_List.getContentPane().add(ok);
		
		Flower_Choice_From_List.setSize(400, 140);
		Flower_Choice_From_List.setResizable(false);
		
		//---творення форми для квітки
		
		JFrame Current_Flower = new JFrame("Current Flower");
		Current_Flower.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Current_Flower.setVisible(false);
		
		JTextField current_flower_name = new JTextField();
		current_flower_name.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_number_of_blades = new JTextField();
		current_flower_number_of_blades.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_height_of_flowers = new JTextField();
		current_flower_height_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_make_tea = new JTextField();
		current_flower_make_tea.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_color_of_blades = new JTextField();
		current_flower_color_of_blades.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_healing_porperties = new JTextField();
		current_flower_healing_porperties.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_the_place_where_they_grows = new JTextField();
		current_flower_the_place_where_they_grows.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_familia_of_flowers = new JTextField();
		current_flower_familia_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_form_of_blades = new JTextField();
		current_flower_form_of_blades.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_domain_of_flowers = new JTextField();
		current_flower_domain_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_regnum_of_flowers = new JTextField();
		current_flower_regnum_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_division_of_flowers = new JTextField();
		current_flower_division_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_classis_of_flowers = new JTextField();
		current_flower_classis_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_ordo_of_flowers = new JTextField();
		current_flower_ordo_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_genus_of_flowers = new JTextField();
		current_flower_genus_of_flowers.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton current_flower_plant_flower = new JButton("Plant Flower");
		current_flower_plant_flower.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton current_flower_watered_flower = new JButton("Watered Flower");
		current_flower_watered_flower.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton current_flower_tear_off_petal = new JButton("Tear Off Petal");
		current_flower_tear_off_petal.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton current_flower_pick_the_flower = new JButton("Pick the flower");
		current_flower_pick_the_flower.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_water_level = new JTextField();
		current_flower_water_level.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_level_of_nutrients = new JTextField();
		current_flower_level_of_nutrients.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_new_number_of_blades = new JTextField();
		current_flower_new_number_of_blades.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField current_flower_is_plant_flower = new JTextField();
		current_flower_is_plant_flower.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JPanel current_flower_info_jpanel = new JPanel(new GridLayout(5, 3));
		current_flower_info_jpanel.add(current_flower_name);
		current_flower_info_jpanel.add(current_flower_number_of_blades);
		current_flower_info_jpanel.add(current_flower_height_of_flowers);
		current_flower_info_jpanel.add(current_flower_make_tea);
		current_flower_info_jpanel.add(current_flower_color_of_blades);
		current_flower_info_jpanel.add(current_flower_healing_porperties);
		current_flower_info_jpanel.add(current_flower_the_place_where_they_grows);
		current_flower_info_jpanel.add(current_flower_familia_of_flowers);
		current_flower_info_jpanel.add(current_flower_form_of_blades);
		current_flower_info_jpanel.add(current_flower_domain_of_flowers);
		current_flower_info_jpanel.add(current_flower_regnum_of_flowers);
		current_flower_info_jpanel.add(current_flower_division_of_flowers);
		current_flower_info_jpanel.add(current_flower_classis_of_flowers);
		current_flower_info_jpanel.add(current_flower_ordo_of_flowers);
		current_flower_info_jpanel.add(current_flower_genus_of_flowers);
		
		JPanel current_flower_action_jpanel = new JPanel(new GridLayout(4, 1));
		current_flower_action_jpanel.add(current_flower_plant_flower);
		current_flower_action_jpanel.add(current_flower_watered_flower);
		current_flower_action_jpanel.add(current_flower_tear_off_petal);
		current_flower_action_jpanel.add(current_flower_pick_the_flower);
		
		JPanel current_flower_action_info_jpanel = new JPanel(new GridLayout(4, 1));
		current_flower_action_info_jpanel.add(current_flower_water_level);
		current_flower_action_info_jpanel.add(current_flower_level_of_nutrients);
		current_flower_action_info_jpanel.add(current_flower_new_number_of_blades);
		current_flower_action_info_jpanel.add(current_flower_is_plant_flower);
		
		Container current_flower_container = Current_Flower.getContentPane();
		current_flower_container.setLayout(new GridLayout(3, 1));
		current_flower_container.add(current_flower_info_jpanel);
		current_flower_container.add(current_flower_action_jpanel);
		current_flower_container.add(current_flower_action_info_jpanel);
		
		Current_Flower.setSize(900, 700);
		Current_Flower.setResizable(false);
		
		//---Створення обробників натискання кнопо
		
		create_flower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Flower_Choice.setVisible(true);
			}
		}
		);
		
		flower_random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rnd = random.nextInt(5);
				flower_properties_cls.rrr = flower_properties_cls.get_number_of_blades(rnd);
				current_flower_name.setText("the name of flower - \n" + flower_properties_cls.get_name_of_flowers(rnd));
				current_flower_number_of_blades.setText("the number of blades - \n" + Integer.toString(flower_properties_cls.get_number_of_blades(rnd)));
				current_flower_height_of_flowers.setText("the height of flower - \n" + Integer.toString(flower_properties_cls.get_height_of_flowers(rnd)));
				current_flower_make_tea.setText("can i make a tea with flower ? - \n" + Boolean.toString(flower_properties_cls.get_make_tea(rnd)));
				current_flower_color_of_blades.setText("the color of flower blades - \n" + flower_properties_cls.get_color_of_blades(rnd));
				current_flower_healing_porperties.setText("the healing porperties of this flower - \n" + flower_properties_cls.get_healing_porperties(rnd));
				current_flower_the_place_where_they_grows.setText("the place where they grows - \n" + flower_properties_cls.get_the_place_where_they_grows(rnd));
				current_flower_familia_of_flowers.setText("the familia of flowers - \n" + flower_properties_cls.get_familia_of_flowers(rnd));
				current_flower_form_of_blades.setText("the form of blades - \n" + flower_properties_cls.get_form_of_blades(rnd));
				current_flower_domain_of_flowers.setText("the domain of flowers - \n" + flower_properties_cls.get_domain_of_flowers(rnd));
				current_flower_regnum_of_flowers.setText("the regnum of flowers - \n" + flower_properties_cls.get_regnum_of_flowers(rnd));
				current_flower_division_of_flowers.setText("the division of flowers - \n" + flower_properties_cls.get_division_of_flowers(rnd));
				current_flower_classis_of_flowers.setText("the classis of flowers - \n" + flower_properties_cls.get_classis_of_flowers(rnd));
				current_flower_ordo_of_flowers.setText("the ordo of flowers - \n" + flower_properties_cls.get_ordo_of_flowers(rnd));
				current_flower_genus_of_flowers.setText("the genus of flowers - \n" + flower_properties_cls.get_genus_of_flowers(rnd));
				Current_Flower.setVisible(true);
			}
		}
		);
		
		flower_from_list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Flower_Choice.setVisible(false);
				Flower_Choice_From_List.setVisible(true);
			}
		}
		);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int rnd = flower_list.getSelectedIndex();
				flower_properties_cls.rrr = flower_properties_cls.get_number_of_blades(rnd);
				current_flower_name.setText("the name of flower - \n" + flower_properties_cls.get_name_of_flowers(rnd));
				current_flower_number_of_blades.setText("the number of blades - \n" + Integer.toString(flower_properties_cls.get_number_of_blades(rnd)));
				current_flower_height_of_flowers.setText("the height of flower - \n" + Integer.toString(flower_properties_cls.get_height_of_flowers(rnd)));
				current_flower_make_tea.setText("can i make a tea with flower ? - \n" + Boolean.toString(flower_properties_cls.get_make_tea(rnd)));
				current_flower_color_of_blades.setText("the color of flower blades - \n" + flower_properties_cls.get_color_of_blades(rnd));
				current_flower_healing_porperties.setText("the healing porperties of this flower - \n" + flower_properties_cls.get_healing_porperties(rnd));
				current_flower_the_place_where_they_grows.setText("the place where they grows - \n" + flower_properties_cls.get_the_place_where_they_grows(rnd));
				current_flower_familia_of_flowers.setText("the familia of flowers - \n" + flower_properties_cls.get_familia_of_flowers(rnd));
				current_flower_form_of_blades.setText("the form of blades - \n" + flower_properties_cls.get_form_of_blades(rnd));
				current_flower_domain_of_flowers.setText("the domain of flowers - \n" + flower_properties_cls.get_domain_of_flowers(rnd));
				current_flower_regnum_of_flowers.setText("the regnum of flowers - \n" + flower_properties_cls.get_regnum_of_flowers(rnd));
				current_flower_division_of_flowers.setText("the division of flowers - \n" + flower_properties_cls.get_division_of_flowers(rnd));
				current_flower_classis_of_flowers.setText("the classis of flowers - \n" + flower_properties_cls.get_classis_of_flowers(rnd));
				current_flower_ordo_of_flowers.setText("the ordo of flowers - \n" + flower_properties_cls.get_ordo_of_flowers(rnd));
				current_flower_genus_of_flowers.setText("the genus of flowers - \n" + flower_properties_cls.get_genus_of_flowers(rnd));
				Current_Flower.setVisible(true);
			}
		}
		);
		
		current_flower_plant_flower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				flower_properties_cls.plant_flower(current_flower_is_plant_flower, current_flower_new_number_of_blades, current_flower_level_of_nutrients, current_flower_water_level, Current_Flower);
			}
		}
		);
		
		current_flower_watered_flower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				flower_properties_cls.watered_flower(current_flower_water_level, current_flower_level_of_nutrients, Current_Flower);
			}
		}
		);
		
		current_flower_tear_off_petal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				flower_properties_cls.tear_off_petal(current_flower_new_number_of_blades, Current_Flower);
			}
		}
		);
		
		current_flower_pick_the_flower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				flower_properties_cls.pick_the_flower(current_flower_is_plant_flower, current_flower_new_number_of_blades, current_flower_level_of_nutrients, current_flower_water_level, Current_Flower);
			}
		}
		);
    }
}

//---класс з властивостями і методами

class Flower_properties {
	
	//---Оголошення полів
	
	String[] name_of_flowers = {
		"Aster",
		"Begonia",
		"Buttercup",
		"Chrysanthemum",
		"Crocus"
	};
	int[] number_of_blades = {13, 19, 5, 40, 6};
	int[] height_of_flowers = {27, 45,  35, 65, 10};
	boolean[] make_tea = {
		true,
		true,
		false,
		false,
		true
	};
	String[] color_of_blades = {
		"white",
		"red",
		"yellow",
		"pink",
		"white"
	};
	String[] healing_porperties = {
		"itch, inflammation, flu",
		"soothes and relieves stress",
		"no",
		"cold",
		"cold"
	};
	String[] the_place_where_they_grows = {
		"steppe",
		"wet forest",
		"moderate and cold climate",
		"Japan",
		"Ukraine"
	};
	String[] form_of_blades = {
		"oval",
		"circle",
		"convex",
		"oval",
		"oval"
	};
	String[] familia_of_flowers = {
		"Asteraceae",
		"Begoniaceae",
		"Ranunculaceae",
		"Asteraceae",
		"Iridaceae"
	};
	String[] domain_of_flowers = {
		"Eukaryota",
		"---",
		"Eukaryota",
		"Eukaryota",
		"Eukaryota"
	};
	String[] regnum_of_flowers = {
		"Viridiplantae",
		"Viridiplantae",
		"Viridiplantae",
		"Viridiplantae",
		"Viridiplantae"
	};
	String[] division_of_flowers = {
		"Streptophyta",
		"Streptophyta",
		"Streptophyta",
		"Streptophyta",
		"Streptophyta"
	};
	String[] classis_of_flowers = {
		"---",
		"---",
		"Eudicots",
		"Eudicots",
		"Liliopsida"
	};
	String[] ordo_of_flowers = {
		"Asterales",
		"Cucurbitales",
		"Ranunculales",
		"Asterales",
		"Asparagales",
	};
	String[] genus_of_flowers = {
		"Aster",
		"Begonia",
		"Ranunculus",
		"Chrysanthemum",
		"Crocus"
	};
	int water_level = 0;
	int level_of_nutrients = 0;
	int new_number_of_blades = 0;
	boolean is_plant_flower = false;
	int rrr = 0;
	
	//---Оголошення методів
	
	void change_water_level(int i) {
		water_level = water_level + i;
	}
	
	void change_level_of_nutrients(int i) {
		level_of_nutrients = level_of_nutrients + i;
	}
	
	void change_new_number_of_blades(int i) {
		if (new_number_of_blades != 0) {
			new_number_of_blades = new_number_of_blades - 1;
		}
	}
	
	void change_is_plant_flower(boolean tr) {
		is_plant_flower = tr;
	}
	
	void plant_flower(JTextField cur_flower_is_plant_flower, JTextField cur_flower_new_number_of_blades, JTextField cur_flower_level_of_nutrients, JTextField cur_flower_water_level, JFrame Cur_Flower) {
		change_is_plant_flower(true);
		change_water_level(15);
		change_level_of_nutrients(10);
		new_number_of_blades = rrr;
		cur_flower_is_plant_flower.setText("Is plant flower - " + Boolean.toString(is_plant_flower));
		cur_flower_new_number_of_blades.setText("Number of blades - " + Integer.toString(new_number_of_blades));
		cur_flower_water_level.setText("Water level - " + Integer.toString(water_level));
		cur_flower_level_of_nutrients.setText("Level of nutriens - " + Integer.toString(level_of_nutrients));
	}
	
	void watered_flower(JTextField cur_flower_water_level, JTextField cur_flower_level_of_nutrients, JFrame Current_Flower) {
		if (is_plant_flower) {
			change_water_level(15);
			change_level_of_nutrients(12);
			cur_flower_water_level.setText("Water level - " + Integer.toString(water_level));
			cur_flower_level_of_nutrients.setText("Level of nutriens - " + Integer.toString(level_of_nutrients));
		}
	}
	
	void tear_off_petal(JTextField cur_flower_new_number_of_blades, JFrame Current_Flower) {
		if (is_plant_flower) {
			change_new_number_of_blades(1);
			cur_flower_new_number_of_blades.setText("Number of blades - " + Integer.toString(new_number_of_blades));
		}
	}
	
	void pick_the_flower(JTextField cur_flower_is_plant_flower, JTextField cur_flower_new_number_of_blades, JTextField cur_flower_level_of_nutrients, JTextField cur_flower_water_level, JFrame Cur_Flower) {
		if (is_plant_flower) {
			change_is_plant_flower(false);
			water_level = 0;
			level_of_nutrients = 0;
			new_number_of_blades = 0;
			cur_flower_is_plant_flower.setText("Is plant flower - " + Boolean.toString(is_plant_flower));
			cur_flower_new_number_of_blades.setText("Number of blades - " + Integer.toString(new_number_of_blades));
			cur_flower_water_level.setText("Water level - " + Integer.toString(water_level));
			cur_flower_level_of_nutrients.setText("Level of nutriens - " + Integer.toString(level_of_nutrients));
		}
	}
		
	String[] get_array_name_of_flowers() {
		return name_of_flowers;
	}
	
	String get_name_of_flowers(int i) {
		return name_of_flowers[i];
	}
	
	int get_number_of_blades(int i) {
		return number_of_blades[i];
	}
	
	int get_height_of_flowers(int i) {
		return height_of_flowers[i];
	}
	
	boolean get_make_tea(int i) {
		return make_tea[i];
	}
	
	String get_color_of_blades(int i) {
		return color_of_blades[i];
	}
	String get_healing_porperties(int i) {
		return healing_porperties[i];
	}
	String get_the_place_where_they_grows(int i) {
		return the_place_where_they_grows[i];
	}
	String get_form_of_blades(int i) {
		return form_of_blades[i];
	}
	String get_familia_of_flowers(int i) {
		return familia_of_flowers[i];
	}
	String get_domain_of_flowers(int i) {
		return domain_of_flowers[i];
	}
	String get_regnum_of_flowers(int i) {
		return regnum_of_flowers[i];
	}
	String get_division_of_flowers(int i) {
		return division_of_flowers[i];
	}
	String get_classis_of_flowers(int i) {
		return classis_of_flowers[i];
	}
	String get_ordo_of_flowers(int i) {
		return ordo_of_flowers[i];
	}
	String get_genus_of_flowers(int i) {
		return genus_of_flowers[i];
	}
}