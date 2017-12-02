import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign=JOptionPane.showInputDialog(null,"What is your zodiac sign?");
	if(sign.equalsIgnoreCase("leo")){
		JOptionPane.showMessageDialog(null,"Leo signs tend to like relaxation, preferably someplace warm and comfortable. Leo likes the big picture, not the small details and fine print. Things that are too complicated, involved, or boring, they have no patience.");
	}else if(sign.equalsIgnoreCase("taurus")){
		JOptionPane.showMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension.");
	}else if(sign.equalsIgnoreCase("aries")){
		JOptionPane.showMessageDialog(null,"The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice.");
	}else if(sign.equalsIgnoreCase("gemini")){
		JOptionPane.showMessageDialog(null, "Gemini are great at parties because they can find almost anything to talk about with anyone. Gemini are adventurous by nature and so engage in traveling as often as they can as it affords them the opportunity to meet new people, experience new ideas, and to learn new concept");
	}else if(sign.equalsIgnoreCase("cancer")){
		JOptionPane.showMessageDialog(null, "The typical cancer person is all about home and family and is very dedicated and loyal to friends and family. ");
	}else if(sign.equalsIgnoreCase("virgo")){
		JOptionPane.showMessageDialog(null, "The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things.");
	}else if(sign.equalsIgnoreCase("libra")){
		JOptionPane.showMessageDialog(null, "Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives. Because of this need Libra signs can sometimes seem wishy-washy when they are asked to make a decision.");
	}else if(sign.equalsIgnoreCase("scorpio")){
		JOptionPane.showMessageDialog(null, "The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative. They crave alone time and often become extremely annoyed when they don’t get it. Scorpio people are great secret keepers and feel each emotion more intensely than other signs.");
	}else if(sign.equalsIgnoreCase("sagittarius")){
		JOptionPane.showMessageDialog(null, "Sagittarians crave the freedom of the open road, both metaphorically and physically. They are most unhappy when they are tied to a normal routine and can become restless in situations where there is not enough variety involved. Because they travel so much and are eager to experience new things, those of this sign are fun to be around and often have large numbers of friends. ");
	}else if(sign.equalsIgnoreCase("capricorn")){
		JOptionPane.showMessageDialog(null, "Achievement is everything to a Capricorn. For this reason they tend to take life very seriously and are not tolerant of those who do not. They are also very good at state’s craft engaging in mental parrying at a high level. They are natural born leaders, politicians, mathematicians, and diplomats. Capricorn people tend to guard their hearts closely and well. To get close to a Capricorn may take some time, but once achieved, well worth it.");
	}else if(sign.equalsIgnoreCase("aquarius")){
		JOptionPane.showMessageDialog(null, "Fascinated by all things gadget, many Aquarians enjoy tinkering with inventions and processes. On the surface, Aquarius people are often not very emotional, because they are more concerned with the exchanging of ideas and how they might better assist someone in their cause. Aquarians have a great deal of patience and tolerance for their fellow man. ");
	}else if(sign.equalsIgnoreCase("pisces")){
		JOptionPane.showMessageDialog(null, "They are tremendously dedicated individuals, staying with companies for decades where others move from one job to the next. So, too, with relationships. Others may find Pisces difficult to get to know because they don’t often readily share their underlying passion and compassion. Pisces signs tend to be highly and deeply religious, and sometimes will go overboard with their devotion to their particular faith.");
	}else{
		JOptionPane.showMessageDialog(null,"That's not a star sign!");
	}
}
}
