package speedymatch.entities;

import java.util.ArrayList;

public class horoscope {

	private String horoscope;
	private String horoscopeDesc;

	public horoscope() {

	}

	public horoscope(String horoscope, String horoscopeDesc) {
		this.horoscope = horoscope;
		this.horoscopeDesc = horoscopeDesc;
	}

	public String getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(String horoscope) {
		this.horoscope = horoscope;
	}

	public String getHoroscopeDesc() {
		return horoscopeDesc;
	}

	public void setHoroscopeDesc(String horoscopeDesc) {
		this.horoscopeDesc = horoscopeDesc;
	}

	public static void main(String args[]) {

		horoscope aries = new horoscope(
				"Aries",
				"An Aries is a person born between the 21st of March and the 20th of April. The Ram is the symbol assigned to an Aries and Fire is the element. The ruling planet for Aries is Mars. Tuesday is said to be a lucky day for Aries. Adventurous, entergetic, courageous, and confident are the strengths of Aries. Weaknesses include being self-centered, short-tempered, impulsive, and impatient.\nAries are known to be friendly and outgoing people. You would notice an Aries in a room full of people since they would be the ones talking and introducing themselves. Aries stand up for what they believe in. You will find them rooting for the under dog or defending and assisting those with weaker personality traits.\nThe Ram symbol is the first zodiac sign. The Ram symbolizes birth and is said to be the infant. In comparison to infants, Aries only are aware of their wants and needs. They are not selfish they just don't always realize they are putting someone else out.\nAries are very trusting and this can make them vulnerable as they believe and trust so easily that they often wear their hearts on their sleeves. Though an Aries can be pushed to have a temper, it normally won't last long. Seldom will you come across an Aries that holds a grudge. Forgive and forget is a motto most Aries live by.");
		horoscope taurus = new horoscope(
				"Taurus",
				"A person who is a Taurus is born between the 21st of April and the 21st of May. The Bull is the symbol assigned to Taurus. The ruling planet for Taurus is Venus and their element is Earth. Fridays are said to be lucky days for Taurus people. Strengths of Taurus include being compassionate, dependable, loyal, reliable, and also being strong both physically and emotionally. Stubbornness, aggressiveness, sensitivity and a dislike when faced with change are all weaknesses associated with a Taurus.\nThe Bull symbolizes strong and silent, and this is exactly how a Taurus is said to be. Until you really get to know a Taurus you will probably not see his or her true self. Taurus are very stubborn individuals and once their minds are made up, swaying them even a little is next to impossible. If you do not try to push, Taurus folks will come across as being laid back and reserved. Take heed though because if you anger a Taurus, it is likely that you might find a violent temper. However, Taurus tempers generally will not flare until they are pushed.\nTaurus make wonderful friends, and whenever you need them they will certainly be some of the first ones there. Taurus know exactly how to brighten the day of friends in need. Don't count on a Taurus ever calling on you to return the favor. They are very in tune with their emotions and rarely display them. Taurus are loyal and will stand beside a friend until the bitter end.");
		horoscope gemini = new horoscope(
				"Gemini",
				"A Gemini is a person born between the 22nd of May and the 21st of June. The Twins is the symbol assigned to Gemini. Mercury is the ruling planet for Gemini and Air is the element. Wednesdays are said to be lucky days for Gemini. Jovial, good communication skills, inquisitiveness and flexibility are all strengths of the Gemini. Weaknesses of the Gemini include selfishness, restlessness, confusing personalities and difficulty being on time.\nThe Twins, which is the symbol of the Gemini, is said to be the child of the Zodiac. Gemini will have multiple personalities. Gemini change their minds as often as they change their underwear. Boredom quickly makes a Gemini turn and look for other avenues of excitement and entertainment.\nGemini have little to no patience. They do not flourish in environments where indecisive people are present. Gemini can talk themselves in and out of a situation all in the same breath. They do not stay in one place too long. In most disagreements, Gemini will come out the victor with an extraordinary ability to use words in their favor.\nFalling in love with a Gemini can be exciting and dangerous. With their dual personalities Gemini keep their love life spicy. In matters of the heart, hang on tight because you are in for an ever-changing ride. Don't hold them to a time schedule as something can catch their eye and cause them to be late in a heartbeat.");
		horoscope cancer = new horoscope(
				"Cancer",
				"A Cancer is a person born between the 22nd of June and the 23rd of July. The symbol of Cancer is the Crab. The moon is the ruling planet of Cancer and the element is Water. Mondays are said to be lucky days for Cancer. Cancer strengths are adaptability, loyalty, genuine attachment to a family, and empathy. Weaknesses of Cancer include moodiness, sensitivity, and emotional outbursts and indecisiveness.\nPeople assigned the sign of Cancer are genuinely moody and have ever changing emotions. One minute they may be laughing and having a good time and the next minute you may find them mad at the world. No one single emotion or personality can label a Cancer.\nCancer will often masquerade their emotions with humor. Laughing is a common disguise used by Cancer to hide signs of depression. Cancer will set their aspirations high. Constant struggles for success and achievement lay beneath the exterior shell of Cancer.\nYelling or harshly snapping at individuals born under Cancer can cause their hearts to hurt. They will either shed tears openly or just completely shut down when hurt. When a Cancer is hurt you will not be able to break through the exterior shell. Time is the only thing that can heal the heart of a Cancer.");
		horoscope leo = new horoscope(
				"Leo",
				"A Leo is a person born between the 24th of July and the 23rd of August. The Lion is the sign of a Leo. The Leo's ruling planet is the Sun and the element is Fire. Sundays are said to be lucky days for a Leo. Strengths of a Leo include kindness, big-heartedness, an energetic nature, optimism, honesty and loyalty. The weaknesses of a Leo are prone to jealousy, possessiveness, egotism or a more dominating personality.\nA Leo is similar to his sign the Lion, as he believes he is the leader of all. Putting a Leo in his or her place will certainly put a knife in his or her big but fragile heart. Leos dislike being bored and enjoy being around many people as they are at home playing the role of a leader. Leos can quickly revert to becoming lazy if they are not careful.\nWhen Leos love, they love with all their hearts, and they take what they believe is theirs. They enjoy dishing out tons of advice and they expect that you should heed their advice as truth. A Leo can be hurt deeply if you question their authority. The best way to tame the proud lion is to feed into their opinion of themselves. You can easily have the roaring lion eating out of the palm of your hand with kind words and praise.\nA Leo will tell it like it is - always. They have difficulty holding their tongues whether they are right or not. Leos will mean what they say and say what they mean. They speak their opinion whether you want to hear it or not so be prepared.\nLeo prospers most when in a loving relationship. You will rarely find a Leo alone. Leos automatically take on the leading role in a relationship even though they may complain now and again about having too much responsibility. They really do not feel that way they just growl now and again.");
		horoscope virgo = new horoscope(
				"Virgo",
				"A Virgo is a person born between the 24th of August and the 23rd of September. The symbol assigned to Virgo is the Virgin. Mercury is the ruling planet for Virgo and the element is Earth. Wednesdays are said to be lucky days for Virgo. Strengths of Virgo are perfectionist, realistic, practical, dependable, sincere and patient. Weaknesses of Virgo include being way too critical, restless, and they lack demonstrativeness and tend to push themselves too much.\nVirgo also tend to be quiet and family oriented people. Though you may notice a Virgo quietly off to the side, you can bet that he or she is simply taking in the details of every little thing. Virgos do not often put themselves in crowded situations, as they prefer to socialize one on one. Virgos are perfectionists meaning everything has its place.\nVirgos live in reality and seldom daydream. They take life for what it is and don't set themselves up for disappointment. Virgos are workaholics and even in their work they expect and demand perfection from themselves. From their clothes to their homes, everything must be perfect. Much time is spent worrying about whether things are correct.\nVirgos are tidy and neat freaks. Dirt and sloppiness can cause a Virgo to offer a harsh tongue-lashing. A Virgo can also be a wonderful friend. Knowing what to say and when to say it is a trait most Virgos possess.\nA Virgo will show love by dedication and subtlety. While a Virgo may not climb the local water tower and spell out I Love You in bright green letters, you will know you are loved by the little things they do and say.");
		horoscope libra = new horoscope(
				"Libra",
				"People who are Libra are born between the 24th of September and 23rd of October. The symbol of the Libra is the Balance. The ruling planet of the Libra is Venus and the element is Air. Fridays are said to be lucky days for Libra. The strengths of a Libra are patience, balance, gregarious, loving, affectionate, cheerful, energetic and a social nature. Weaknesses of the Libra include indecisiveness, carelessness, prone to indulgence, and being overly emotional and sensitive.\nThe Libra is the seventh sign of the Zodiac. You will find a Libra to be extremely nice and polite. Libras love being around people and often serve as mediators between quarreling parties. A Libra will most always appear cheerful.\nLibras are very independent individuals and do not take orders well. Libras are intelligent and excellent listeners. They can also be naïve and restless. Libras are often as confused as the people surrounding them by their wishy-washy traits.\nA Libra can bring laughter to the dreariest of circumstances. They are happiest when the people surrounding them are happy as well. They do not like for friends to be sad or upset. Libras take their time weighing pros and cons of a decision before committing one way or the other.");
		horoscope scorpio = new horoscope(
				"Scorpio",
				"A Scorpio is a person born between the 22nd of October and the 21st of November. The symbol of Scorpio is the Scorpion. The ruling planet for Scorpio is Pluto and Water is the element. Tuesdays are said to be lucky days for Scorpio. Strengths of the Scorpio include loyalty, trustworthiness, passionate, charismatic, mystifying, caring and patience. Weaknesses of Scorpio are stubbornness, becoming jealous easily, and being overly sensitive and egotistical.\nScorpios have the ability to appear as though they are staring through people. Their gaze seems to penetrate the outer body and see directly into the soul. Scorpios have large egos and can stand on their own. Once they get something in their heads they can't rest until they finish the task.\nScorpios rarely let their emotions surface. They possess a sense of knowing when they are right and when they are wrong. Rarely will you notice a Scorpio playing bashful or shy. If you want an honest opinion about anything ask a Scorpio. Brutal honesty is a feature they cannot help but offer.\nScorpios love with their complete hearts, but they have no tolerance for unfaithfulness. Questioning their own worth causes Scorpios to be very jealous and overly possessive especially in matters of the heart. They will stand beside the ones they live come what may, through thick and thin. You could not ask for a more loyal friend.");
		horoscope sagittarius = new horoscope(
				"Sagittarius",
				"A Sagittarius is a person born between the 23rd of November and the 21st of December. The symbol of the Sagittarius is the Archer. The Sagittarius ruling planet is Jupiter and the element is Fire. Thursdays are said to be lucky days for Sagittarius. Strengths of the Sagittarius include honesty, forthrightness, lightheartedness, intellectualism, and possession of excellent communication skills. Weaknesses of the Sagittarius are sharp tongue, prone to change, restlessness and a flirtatious nature.\nSagittarius have a way with words like no other. They try to come across nice and friendly but normally end up hurting the feelings of others or just downright annoying others. They are not at all gifted with a talent for dishing out compliments. Most often compliments will come out more like insults and any attempts to correct misunderstandings are futile.\nSagittarius are animal lovers and are most always the ones apt to take in homeless and stray animals that no one else would think about touching. They will nurture these outcasts back to health and prove they can be wonderful pets.\nSagittarius are the first ones to try to cheer up friends when they are down. Though they may not be the greatest at this, nonetheless they will try. You may find yourself laughing whether you want to or not in their presence.\nDecisions of the heart take Sagittarius some time to make. They fall in love easily, but do not love lightly. A long internal struggle goes on inside the head of a Sagittarius before a decision related to commitment can be arrived at.");
		horoscope capricorn = new horoscope(
				"Capricorn",
				"A Capricorn is a person born between the 22nd of December and the 20th of January. The symbol of the Capricorn is the Sea Goat. Saturn is the ruling planet of the Capricorn and Earth is the element. Saturdays are said to be lucky days for Capricorn. Strengths of the Capricorn include hardworking, responsible, reliable, loyal, sincere and strong will power. Weaknesses of the Capricorn are introvert, slightly obstinate, short tempered and difficulty accepting authority.\nA Capricorn has the ability to fit in and adjust to surroundings. They are the type that could make you believe the sky is purple if they wanted to. Capricorns are very calm individuals. They do not become agitated easily.\nCapricorns are not ones to reach for stardom but they know how to deal with it if it is thrust their way. They prefer to enjoy blending in with groups around them. Capricorns are similar to chameleons and are similarly harmless.\nCapricorns like being leaders in the workplace and they do not take orders from others well at all. You may find a Capricorn unleashing a sharp tongue lashing if you try to take control of a project.\nIn matters of the heart, Capricorns are very romantic. Dinners by candlelight and flowers for no reason are qualities you can expect from a Capricorn. Capricorns like to be wanted and needed.");
		horoscope aquarius = new horoscope(
				"Aquarius",
				"A person who is Aquarius is born between the 21st of January and the 19th of February. The sign of the Aquarius is the Water Bearer. Uranus is the ruling planet of Aquarius and Air is the element. Saturdays are said to be lucky days for Aquarius. Strengths of Aquarius include being friendly, affable, intelligent, kind, compassionate and practical. Weaknesses of the Aquarius are being unpredictable, adamant, dislike towards making commitments and hating adhering to conventions.\nAquarius never meet anyone they don't at first glance consider a friend. Friend is a term they use very loosely. Aquarius are always kind and caring and enjoy getting to know new people. Unless you give them reason to dislike you, they like everyone.\nAquarius are generally soft spoken but can demonstrate the ability to change up now and again. They love things that are new and enjoy experimenting with new ideas and concepts. Creativity flows through the veins of individuals with the Aquarius sign.\nAquarius tend to have a large number of friends though normally not many close or best buddies. They are friendly and nice and enjoy being around other people. Their flighty and every changing personality make getting close with an Aquarius next to impossible. One minute you may be an Aquarius' best friend and the next just someone who is in the way.");
		horoscope pisces = new horoscope(
				"Pisces",
				"A Pisces is a person born between the 20th of February and the 20th of March. The sign of the Pisces is the Fish. The ruling planet of Pisces is Neptune and the element is Water. Thursdays are said to be lucky days for Pisces. Strengths of the Pisces include being intuitive, empathetic, uninterested in material things and having a sharp memory. Weaknesses of the Pisces include being emotional or sensitive, and prone to wistfulness, mood swings and inflexibility.\nGreed in not a quality Pisces possess. They are not materialistic people. Pisces are well aware of how the world works but they also know their place. Pisces either run with the flow of the people around them or they run against it. They are either one extreme or the other there is no in between.\nPisces are calm and cool and rarely lose their tempers. Pisces can charm your socks off without blinking an eye. In the event of troubling situations, Pisces have the ability to remain calm and rational. They think through situations rather than through reacting impulsively.\nPisces are great lovers of music and art. You may find a Pisces in an orchestra or crafting a new picture for an art gallery. Pisces try to help everyone around them. They dislike their friends being unhappy and they will bend over backwards to be helpful.");

		ArrayList<horoscope> h = new ArrayList<horoscope>();

		h.add(aries);
		h.add(taurus);
		h.add(gemini);
		h.add(cancer);
		h.add(leo);
		h.add(virgo);
		h.add(libra);
		h.add(scorpio);
		h.add(sagittarius);
		h.add(capricorn);
		h.add(aquarius);
		h.add(pisces);

		for (int j = 0; j < h.size(); j++) {
			horoscope x = h.get(j);
			System.out.println(x.getHoroscope() + "\n" + x.getHoroscopeDesc());

		}
	}

}
