package com.marcianos.learning.streams;

import lombok.Builder;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class Actor {

    private int index;
    private int year;
    private int age;
    private String name;
    private String movie;

    public static List<Actor> getActors()  {
        return Arrays.stream(getActorsAsString()
                .split("\n"))
                .skip(1)
                .map(line -> line.split(";"))
                .map(col -> new Actor(Integer.parseInt(col[0].trim()), Integer.parseInt(col[1].trim()), Integer.parseInt(col[2].trim()), col[3].trim(), col[4].trim()))
                .collect(Collectors.toList());
    }

    public static List<Actor> getActress()  {
        return Arrays.stream(getActorsAsString()
                .split("\n"))
                .skip(1)
                .map(line -> line.split(";"))
                .map(col -> new Actor(Integer.parseInt(col[0].trim()), Integer.parseInt(col[1].trim()), Integer.parseInt(col[2].trim()), col[3].trim(), col[4].trim()))
                .collect(Collectors.toList());
    }

    public static String getActorsAsString() {
        return
                "Index; Year; Age; Name; Movie\n" +
                        "1; 1928; 44; Emil Jannings; The Last Command, The Way of All Flesh\n" +
                        "2; 1929; 41; Warner Baxter; In Old Arizona\n" +
                        "3; 1930; 62; George Arliss; Disraeli\n" +
                        "4; 1931; 53; Lionel Barrymore; A Free Soul\n" +
                        "5; 1932; 47; Wallace Beery; The Champ\n" +
                        "6; 1933; 35; Fredric March; Dr. Jekyll and Mr. Hyde\n" +
                        "7; 1934; 34; Charles Laughton; The Private Life of Henry VIII\n" +
                        "8; 1935; 34; Clark Gable; It Happened One Night\n" +
                        "9; 1936; 49; Victor McLaglen; The Informer\t\n" +
                        "10; 1937; 41; Paul Muni; The Story of Louis Pasteur\t\n" +
                        "11; 1938; 37; Spencer Tracy; Captains Courageous\n" +
                        "12; 1939; 38; Spencer Tracy; Boys Town\n" +
                        "13; 1940; 34; Robert Donat; Goodbye, Mr. Chips\t\n" +
                        "14; 1941; 32; James Stewart; The Philadelphia Story\n" +
                        "15; 1942; 40; Gary Cooper; Sergeant York\n" +
                        "16; 1943; 43; James Cagney; Yankee Doodle Dandy\t\n" +
                        "17; 1944; 48; Paul Lukas; Watch on the Rhine\t\n" +
                        "18; 1945; 41; Bing Crosby; Going My Way\n" +
                        "19; 1946; 39; Ray Milland; The Lost Weekend \t\n" +
                        "20; 1947; 49; Fredric March; The Best Years of Our Lives\n" +
                        "21; 1948; 57; Ronald Colman; A Double Life\n" +
                        "22; 1949; 41; Laurence Olivier; Hamlet\n" +
                        "23; 1950; 38; Broderick Crawford; All the King's Men\n" +
                        "24; 1951; 39; José Ferrer; Cyrano de Bergerac\n" +
                        "25; 1952; 52; Humphrey Bogart; The African Queen\n" +
                        "26; 1953; 51; Gary Cooper; High Noon\n" +
                        "27; 1954; 35; William Holden; Stalag 17\n" +
                        "28; 1955; 30; Marlon Brando; On the Waterfront\n" +
                        "29; 1956; 39; Ernest Borgnine; Marty\n" +
                        "30; 1957; 36; Yul Brynner; The King and I\n" +
                        "31; 1958; 43; Alec Guinness; The Bridge on the River Kwai\n" +
                        "32; 1959; 49; David Niven; Separate Tables\n" +
                        "33; 1960; 36; Charlton Heston; Ben-Hur\n" +
                        "34; 1961; 47; Burt Lancaster; Elmer Gantry\n" +
                        "35; 1962; 31; Maximilian Schell; Judgment at Nuremberg\t\n" +
                        "36; 1963; 47; Gregory Peck; To Kill a Mockingbird\n" +
                        "37; 1964; 37; Sidney Poitier; Lilies of the Field\n" +
                        "38; 1965; 57; Rex Harrison; My Fair Lady\n" +
                        "39; 1966; 42; Lee Marvin; Cat Ballou\t\n" +
                        "40; 1967; 45; Paul Scofield; A Man for All Seasons\n" +
                        "41; 1968; 42; Rod Steiger; In the Heat of the Night\t\n" +
                        "42; 1969; 45; Cliff Robertson; Charly\n" +
                        "43; 1970; 62; John Wayne; True Grit\n" +
                        "44; 1971; 43; George C. Scott; Patton\n" +
                        "45; 1972; 42; Gene Hackman; The French Connection\n" +
                        "46; 1973; 48; Marlon Brando; The Godfather\n" +
                        "47; 1974; 49; Jack Lemmon; Save the Tiger\n" +
                        "48; 1975; 56; Art Carney; Harry and Tonto\n" +
                        "49; 1976; 38; Jack Nicholson; One Flew Over the Cuckoo's Nest\n" +
                        "50; 1977; 60; Peter Finch; Network\n" +
                        "51; 1978; 30; Richard Dreyfuss; The Goodbye Girl\n" +
                        "52; 1979; 40; Jon Voight; Coming Home\n" +
                        "53; 1980; 42; Dustin Hoffman; Kramer vs. Kramer\n" +
                        "54; 1981; 37; Robert De Niro; Raging Bull\n" +
                        "55; 1982; 76; Henry Fonda; On Golden Pond\n" +
                        "56; 1983; 39; Ben Kingsley; Gandhi\n" +
                        "57; 1984; 53; Robert Duvall; Tender Mercies\n" +
                        "58; 1985; 45; F. Murray Abraham; Amadeus\n" +
                        "59; 1986; 36; William Hurt; Kiss of the Spider Woman\n" +
                        "60; 1987; 62; Paul Newman; The Color of Money\n" +
                        "61; 1988; 43; Michael Douglas; Wall Street\n" +
                        "62; 1989; 51; Dustin Hoffman; Rain Man\n" +
                        "63; 1990; 32; Daniel Day-Lewis; My Left Foot\n" +
                        "64; 1991; 42; Jeremy Irons; Reversal of Fortune\n" +
                        "65; 1992; 54; Anthony Hopkins; The Silence of the Lambs\n" +
                        "66; 1993; 52; Al Pacino; Scent of a Woman\n" +
                        "67; 1994; 37; Tom Hanks; Philadelphia\n" +
                        "68; 1995; 38; Tom Hanks; Forrest Gump\n" +
                        "69; 1996; 32; Nicolas Cage; Leaving Las Vegas\n" +
                        "70; 1997; 45; Geoffrey Rush; Shine\n" +
                        "71; 1998; 60; Jack Nicholson; As Good as It Gets\n" +
                        "72; 1999; 46; Roberto Benigni; Life Is Beautiful\n" +
                        "73; 2000; 40; Kevin Spacey; American Beauty\n" +
                        "74; 2001; 36; Russell Crowe; Gladiator\n" +
                        "75; 2002; 47; Denzel Washington; Training Day\t\n" +
                        "76; 2003; 29; Adrien Brody; The Pianist\n" +
                        "77; 2004; 43; Sean Penn; Mystic River\n" +
                        "78; 2005; 37; Jamie Foxx; Ray\n" +
                        "79; 2006; 38; Philip Seymour Hoffman; Capote\n" +
                        "80; 2007; 45; Forest Whitaker; The Last King of Scotland\t\n" +
                        "81; 2008; 50; Daniel Day-Lewis; There Will Be Blood\n" +
                        "82; 2009; 48; Sean Penn; Milk\n" +
                        "83; 2010; 60; Jeff Bridges; Crazy Heart\n" +
                        "84; 2011; 50; Colin Firth; The King's Speech\t\n" +
                        "85; 2012; 39; Jean Dujardin; The Artist\n" +
                        "86; 2013; 55; Daniel Day-Lewis; Lincoln\n" +
                        "87; 2014; 44; Matthew McConaughey; Dallas Buyers Club\n" +
                        "88; 2015; 33; Eddie Redmayne; The Theory of Everything\t\n" +
                        "89; 2016; 41; Leonardo DiCaprio; The Revenant\n";

    }

    public static String getActressAsString() {
        return
                "Index; Year; Age; Name; Movie\n" +
                        "1; 1928; 22; Janet Gaynor; Seventh Heaven, Street Angel and Sunrise: A Song of Two Humans\n" +
                        "2; 1929; 37; Mary Pickford; Coquette\n" +
                        "3; 1930; 28; Norma Shearer; The Divorcee\t\n" +
                        "4; 1931; 63; Marie Dressler; Min and Bill\n" +
                        "5; 1932; 32; Helen Hayes; The Sin of Madelon Claudet\t\n" +
                        "6; 1933; 26; Katharine Hepburn; Morning Glory\n" +
                        "7; 1934; 31; Claudette Colbert; It Happened One Night\n" +
                        "8; 1935; 27; Bette Davis; Dangerous\n" +
                        "9; 1936; 27; Luise Rainer; The Great Ziegfeld\n" +
                        "10; 1937; 28; Luise Rainer; The Good Earth\n" +
                        "11; 1938; 30; Bette Davis; Jezebel\n" +
                        "12; 1939; 26; Vivien Leigh; Gone with the Wind\n" +
                        "13; 1940; 29; Ginger Rogers; Kitty Foyle\n" +
                        "14; 1941; 24; Joan Fontaine; Suspicion\t\n" +
                        "15; 1942; 38; Greer Garson; Mrs. Miniver\n" +
                        "16; 1943; 25; Jennifer Jones; The Song of Bernadette\n" +
                        "17; 1944; 29; Ingrid Bergman; Gaslight\n" +
                        "18; 1945; 40; Joan Crawford; Mildred Pierce\n" +
                        "19; 1946; 30; Olivia de Havilland; To Each His Own\n" +
                        "20; 1947; 35; Loretta Young; The Farmer's Daughter\n" +
                        "21; 1948; 32; Jane Wyman; Johnny Belinda\n" +
                        "22; 1949; 33; Olivia de Havilland; The Heiress\n" +
                        "23; 1950; 29; Judy Holliday; Born Yesterday\n" +
                        "24; 1951; 38; Vivien Leigh; A Streetcar Named Desire\n" +
                        "25; 1952; 54; Shirley Booth; Come Back, Little Sheba\n" +
                        "26; 1953; 24; Audrey Hepburn; Roman Holiday\n" +
                        "27; 1954; 25; Grace Kelly; The Country Girl\n" +
                        "28; 1955; 48; Anna Magnani; The Rose Tattoo\n" +
                        "29; 1956; 41; Ingrid Bergman; Anastasia\n" +
                        "30; 1957; 28; Joanne Woodward; The Three Faces of Eve\n" +
                        "31; 1958; 41; Susan Hayward; I Want to Live!\n" +
                        "32; 1959; 39; Simone Signoret; Room at the Top\n" +
                        "33; 1960; 29; Elizabeth Taylor; BUtterfield 8\n" +
                        "34; 1961; 27; Sophia Loren; Two Women\n" +
                        "35; 1962; 31; Anne Bancroft; The Miracle Worker\n" +
                        "36; 1963; 31; Patricia Neal; Hud\n" +
                        "37; 1964; 29; Julie Andrews; Mary Poppins\n" +
                        "38; 1965; 25; Julie Christie; Darling\n" +
                        "39; 1966; 35; Elizabeth Taylor; Who's Afraid of Virginia Woolf?\n" +
                        "40; 1967; 60; Katharine Hepburn; Guess Who's Coming to Dinner\n" +
                        "41; 1968; 61; Katharine Hepburn; The Lion in Winter\n" +
                        "42; 1969; 26; Barbra Streisand; Funny Girl\n" +
                        "43; 1970; 35; Maggie Smith; The Prime of Miss Jean Brodie\n" +
                        "44; 1971; 34; Glenda Jackson; Women in Love\n" +
                        "45; 1972; 34; Jane Fonda; Klute\n" +
                        "46; 1973; 27; Liza Minnelli; Cabaret\n" +
                        "47; 1974; 37; Glenda Jackson; A Touch of Class\n" +
                        "48; 1975; 42; Ellen Burstyn; Alice Doesn't Live Here Anymore\t\n" +
                        "49; 1976; 41; Louise Fletcher; One Flew Over the Cuckoo's Nest\n" +
                        "50; 1977; 36; Faye Dunaway; Network\n" +
                        "51; 1978; 32; Diane Keaton; Annie Hall\n" +
                        "52; 1979; 41; Jane Fonda; Coming Home\n" +
                        "53; 1980; 33; Sally Field; Norma Rae\n" +
                        "54; 1981; 31; Sissy Spacek; Coal Miner's Daughter\t\n" +
                        "55; 1982; 74; Katharine Hepburn; On Golden Pond\n" +
                        "56; 1983; 33; Meryl Streep; Sophie's Choice\n" +
                        "57; 1984; 49; Shirley MacLaine; Terms of Endearment\t\n" +
                        "58; 1985; 38; Sally Field; Places in the Heart\n" +
                        "59; 1986; 61; Geraldine Page; The Trip to Bountiful\t\n" +
                        "60; 1987; 21; Marlee Matlin; Children of a Lesser God\n" +
                        "61; 1988; 41; Cher; Moonstruck\n" +
                        "62; 1989; 26; Jodie Foster; The Accused\n" +
                        "63; 1990; 80; Jessica Tandy; Driving Miss Daisy\n" +
                        "64; 1991; 42; Kathy Bates; Misery\n" +
                        "65; 1992; 29; Jodie Foster; The Silence of the Lambs\n" +
                        "66; 1993; 33; Emma Thompson; Howards End\n" +
                        "67; 1994; 36; Holly Hunter; The Piano\n" +
                        "68; 1995; 45; Jessica Lange; Blue Sky\n" +
                        "69; 1996; 49; Susan Sarandon; Dead Man Walking\n" +
                        "70; 1997; 39; Frances McDormand; Fargo\n" +
                        "71; 1998; 34; Helen Hunt; As Good as It Gets\n" +
                        "72; 1999; 26; Gwyneth Paltrow; Shakespeare in Love\n" +
                        "73; 2000; 25; Hilary Swank; Boys Don't Cry\n" +
                        "74; 2001; 33; Julia Roberts; Erin Brockovich\n" +
                        "75; 2002; 35; Halle Berry; Monster's Ball\n" +
                        "76; 2003; 35; Nicole Kidman; The Hours\n" +
                        "77; 2004; 28; Charlize Theron; Monster\n" +
                        "78; 2005; 30; Hilary Swank; Million Dollar Baby\n" +
                        "79; 2006; 29; Reese Witherspoon; Walk the Line\n" +
                        "80; 2007; 61; Helen Mirren; The Queen\n" +
                        "81; 2008; 32; Marion Cotillard; La Vie en rose\n" +
                        "82; 2009; 33; Kate Winslet; The Reader\n" +
                        "83; 2010; 45; Sandra Bullock; The Blind Side\n" +
                        "84; 2011; 29; Natalie Portman; Black Swan\n" +
                        "85; 2012; 62; Meryl Streep; The Iron Lady\n" +
                        "86; 2013; 22; Jennifer Lawrence; Silver Linings Playbook\n" +
                        "87; 2014; 44; Cate Blanchett; Blue Jasmine\n" +
                        "88; 2015; 54; Julianne Moore; Still Alice\n" +
                        "89; 2016; 26; Brie Larson; Room\n";
    }
}
