package com.marcianos.learning.streams;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String email;
    private String phone;
    private String education;
    private String occupation;
    private int experienceYears;
    private String maritalStatus;
    private int numberOfChildren;


    public static List<Person> getPersons() {
        return
        Arrays.stream(getAsString()
                .split("\n"))
                .map(line -> {
                    String [] fields = line.split(",");
                    return Person.builder()
                            .firstName(fields[0])
                            .lastName(fields[1])
                            .gender(fields[2])
                            .age(Integer.parseInt(fields[3]))
                            .email(fields[4])
                            .phone(fields[5])
                            .education(fields[6])
                            .occupation(fields[7])
                            .experienceYears(Integer.parseInt(fields[8]))
                            .maritalStatus(fields[9])
                            .numberOfChildren(Integer.parseInt(fields[10]))
                            .build();
                })
                .collect(Collectors.toList());
    }

    public static String getAsString() {
        return
                        "Evelyn,Montgomery,Female,24,e.montgomery@randatmail.com,341-0874-66,Bachelor,Dancer,11,Single,4\n" +
                        "Chelsea,Owens,Female,19,c.owens@randatmail.com,997-0341-88,Bachelor,Agronomist,0,Married,1\n" +
                        "Daisy,Clark,Female,30,d.clark@randatmail.com,456-8268-76,Bachelor,Baker,5,Married,3\n" +
                        "Paul,Armstrong,Male,25,p.armstrong@randatmail.com,052-1480-77,Master,Graphic Designer,8,Single,4\n" +
                        "Hailey,Farrell,Female,30,h.farrell@randatmail.com,762-5415-79,Bachelor,Engineer,3,Single,4\n" +
                        "Tara,Davis,Female,18,t.davis@randatmail.com,042-5445-70,Lower secondary,Programmer,0,Single,5\n" +
                        "Albert,Farrell,Male,20,a.farrell@randatmail.com,505-2610-85,Lower secondary,Dancer,3,Single,1\n" +
                        "Jared,Carroll,Male,30,j.carroll@randatmail.com,158-4359-76,Upper secondary,Composer,3,Married,4\n" +
                        "Lilianna,Dixon,Female,18,l.dixon@randatmail.com,603-0921-52,Bachelor,Geologist,9,Married,3\n" +
                        "Alina,Dixon,Female,25,a.dixon@randatmail.com,811-8849-00,Lower secondary,Florist,3,Single,1\n" +
                        "Lenny,Richardson,Male,26,l.richardson@randatmail.com,263-6499-97,Doctoral,Historian,8,Single,1\n" +
                        "Anna,Hamilton,Female,26,a.hamilton@randatmail.com,446-9421-04,Primary,Firefighter,3,Single,1\n" +
                        "Wilson,Chapman,Male,22,w.chapman@randatmail.com,911-8825-93,Bachelor,Actor,0,Married,3\n" +
                        "Heather,Cooper,Female,23,h.cooper@randatmail.com,612-7697-88,Lower secondary,Accountant,7,Single,3\n" +
                        "Eric,Cameron,Male,27,e.cameron@randatmail.com,698-5462-82,Primary,Meteorologist,9,Single,1\n" +
                        "Aston,Morgan,Male,20,a.morgan@randatmail.com,848-7674-02,Lower secondary,Electrician,3,Married,4\n" +
                        "Sabrina,Martin,Female,30,s.martin@randatmail.com,598-6642-56,Bachelor,Fine Artist,10,Single,0\n" +
                        "Michelle,Anderson,Female,27,m.anderson@randatmail.com,380-5867-40,Bachelor,Agronomist,6,Married,1\n" +
                        "Connie,Moore,Female,26,c.moore@randatmail.com,944-8447-87,Upper secondary,Aeroplane Pilot,0,Married,1\n" +
                        "Carina,Phillips,Female,26,c.phillips@randatmail.com,768-2114-46,Doctoral,Producer,4,Single,5\n" +
                        "Wilson,Stevens,Male,23,w.stevens@randatmail.com,608-5076-99,Doctoral,Architect,0,Single,5\n" +
                        "Lily,Grant,Female,20,l.grant@randatmail.com,268-5573-32,Primary,Veterinarian,9,Married,0\n" +
                        "Steven,Brooks,Male,25,s.brooks@randatmail.com,540-6109-85,Bachelor,Florist,2,Married,4\n" +
                        "Adrian,Payne,Male,24,a.payne@randatmail.com,684-7291-79,Bachelor,Pharmacist,7,Married,5\n" +
                        "Jordan,Hunt,Male,18,j.hunt@randatmail.com,078-4585-47,Lower secondary,Composer,3,Married,5\n" +
                        "Abigail,Lloyd,Female,23,a.lloyd@randatmail.com,612-0472-04,Master,Police Officer,9,Married,0\n" +
                        "Olivia,Reed,Female,25,o.reed@randatmail.com,830-2623-24,Doctoral,Scientist,10,Married,0\n" +
                        "Julian,Johnston,Male,19,j.johnston@randatmail.com,258-5216-19,Primary,Florist,3,Married,2\n" +
                        "Sam,Bailey,Male,22,s.bailey@randatmail.com,911-2561-87,Master,Dancer,0,Married,4\n" +
                        "Aiden,Johnson,Male,27,a.johnson@randatmail.com,557-4955-72,Primary,Fine Artist,7,Single,0\n" +
                        "Jordan,Roberts,Male,20,j.roberts@randatmail.com,529-6803-83,Master,Electrician,5,Single,1\n" +
                        "Nicole,Brown,Female,19,n.brown@randatmail.com,153-9873-30,Doctoral,Police Officer,7,Single,2\n" +
                        "Connie,Spencer,Female,23,c.spencer@randatmail.com,380-0569-30,Lower secondary,Insurer,9,Married,5\n" +
                        "Fenton,Wilson,Male,29,f.wilson@randatmail.com,359-5716-55,Upper secondary,Economist,2,Married,5\n" +
                        "Lilianna,Hill,Female,30,l.hill@randatmail.com,339-6353-02,Bachelor,Teacher,15,Married,0\n" +
                        "Joyce,Payne,Female,22,j.payne@randatmail.com,332-8446-75,Bachelor,Teacher,5,Married,1\n" +
                        "Jenna,Hall,Female,20,j.hall@randatmail.com,323-6686-68,Lower secondary,Pharmacist,8,Married,5\n" +
                        "Adelaide,Kelley,Female,19,a.kelley@randatmail.com,184-0600-75,Primary,Pharmacist,3,Married,1\n" +
                        "Fenton,Cameron,Male,18,f.cameron@randatmail.com,028-4383-08,Lower secondary,Mechanic,9,Married,4\n" +
                        "Michelle,Gray,Female,19,m.gray@randatmail.com,543-9114-26,Primary,Scientist,2,Single,0\n" +
                        "Arianna,Grant,Female,19,a.grant@randatmail.com,815-0674-14,Master,Agronomist,5,Single,3\n" +
                        "Valeria,Williams,Female,26,v.williams@randatmail.com,572-5351-85,Bachelor,Baker,1,Single,5\n" +
                        "Penelope,Kelley,Female,28,p.kelley@randatmail.com,258-2254-33,Lower secondary,Teacher,13,Single,1\n" +
                        "Marcus,Turner,Male,23,m.turner@randatmail.com,600-5355-95,Upper secondary,Teacher,7,Single,2\n" +
                        "Carina,Ellis,Female,29,c.ellis@randatmail.com,215-9614-12,Lower secondary,Aeroplane Pilot,9,Single,2\n" +
                        "Ellia,Howard,Female,30,e.howard@randatmail.com,348-6455-51,Primary,Teacher,7,Single,5\n" +
                        "Jared,Turner,Male,19,j.turner@randatmail.com,236-5529-80,Lower secondary,Graphic Designer,6,Single,4\n" +
                        "Sawyer,Ross,Male,29,s.ross@randatmail.com,774-2822-68,Master,Mathematician,7,Single,5\n" +
                        "Ashton,Harrison,Male,23,a.harrison@randatmail.com,238-8704-08,Lower secondary,Singer,6,Single,2\n" +
                        "Carl,Farrell,Male,27,c.farrell@randatmail.com,021-5723-15,Bachelor,Firefighter,3,Married,4\n" +
                        "Darcy,Walker,Female,19,d.walker@randatmail.com,384-7914-07,Master,Programmer,0,Married,4\n" +
                        "Camila,Howard,Female,18,c.howard@randatmail.com,228-9941-92,Upper secondary,Lecturer,8,Married,3\n" +
                        "Eleanor,Richards,Female,30,e.richards@randatmail.com,600-1948-08,Bachelor,Physicist,5,Married,1\n" +
                        "Fiona,Reed,Female,21,f.reed@randatmail.com,916-8307-25,Primary,Electrician,3,Single,1\n" +
                        "Arianna,Lloyd,Female,26,a.lloyd@randatmail.com,704-7043-21,Lower secondary,Interpreter,12,Married,3\n" +
                        "Joyce,Tucker,Female,20,j.tucker@randatmail.com,883-6478-58,Doctoral,Salesman,9,Single,3\n" +
                        "Nicholas,West,Male,25,n.west@randatmail.com,422-4796-66,Bachelor,Agronomist,4,Married,3\n" +
                        "Kelvin,Clark,Male,22,k.clark@randatmail.com,562-0685-33,Bachelor,Meteorologist,9,Married,3\n" +
                        "Kelsey,Wells,Female,19,k.wells@randatmail.com,146-7578-30,Doctoral,Lecturer,5,Married,5\n" +
                        "Lenny,Jones,Male,25,l.jones@randatmail.com,490-4528-18,Lower secondary,Programmer,6,Single,2\n" +
                        "Lana,Elliott,Female,23,l.elliott@randatmail.com,451-5009-53,Bachelor,Jeweller,3,Single,1\n" +
                        "Jenna,Carroll,Female,26,j.carroll@randatmail.com,865-9580-33,Upper secondary,Insurer,1,Single,2\n" +
                        "Charlotte,Cameron,Female,26,c.cameron@randatmail.com,092-9829-10,Primary,Fine Artist,5,Married,4\n" +
                        "Lilianna,Mitchell,Female,30,l.mitchell@randatmail.com,822-7538-65,Doctoral,Interpreter,4,Single,3\n" +
                        "Thomas,Wilson,Male,19,t.wilson@randatmail.com,224-6874-03,Upper secondary,Baker,8,Single,2\n" +
                        "Victoria,Barrett,Female,19,v.barrett@randatmail.com,321-2452-96,Lower secondary,Aeroplane Pilot,4,Single,1\n" +
                        "Alford,Bennett,Male,18,a.bennett@randatmail.com,687-2613-83,Lower secondary,Electrician,2,Single,3\n" +
                        "Tiana,Ryan,Female,28,t.ryan@randatmail.com,354-1693-55,Doctoral,Chef,11,Single,5\n" +
                        "Adelaide,Hunt,Female,29,a.hunt@randatmail.com,072-1618-08,Upper secondary,Lecturer,2,Single,3\n" +
                        "Savana,Clark,Female,26,s.clark@randatmail.com,288-5884-86,Upper secondary,Journalist,7,Single,5\n" +
                        "Lana,Riley,Female,19,l.riley@randatmail.com,012-0683-99,Doctoral,Architect,6,Single,5\n" +
                        "Tony,Hill,Male,30,t.hill@randatmail.com,517-9895-40,Upper secondary,Medic,12,Married,0\n" +
                        "Valeria,Howard,Female,27,v.howard@randatmail.com,029-5900-85,Master,Baker,6,Married,4\n" +
                        "Adelaide,Williams,Female,30,a.williams@randatmail.com,678-9841-93,Lower secondary,Aeroplane Pilot,1,Single,3\n" +
                        "Sydney,Fowler,Female,27,s.fowler@randatmail.com,958-2368-49,Bachelor,Interior Designer,8,Married,2\n" +
                        "Dexter,Davis,Male,22,d.davis@randatmail.com,868-0356-47,Upper secondary,Archeologist,2,Married,1\n" +
                        "Florrie,Phillips,Female,21,f.phillips@randatmail.com,768-6572-45,Upper secondary,Engineer,7,Single,0\n" +
                        "Daisy,Hill,Female,24,d.hill@randatmail.com,255-4488-26,Lower secondary,Programmer,5,Single,1\n" +
                        "Byron,Phillips,Male,23,b.phillips@randatmail.com,608-6194-79,Primary,Engineer,10,Married,0\n" +
                        "Vincent,Higgins,Male,23,v.higgins@randatmail.com,209-8911-98,Lower secondary,Jeweller,11,Married,4\n" +
                        "Jasmine,Wells,Female,30,j.wells@randatmail.com,430-8995-44,Doctoral,Medic,10,Married,2\n" +
                        "Maria,Holmes,Female,20,m.holmes@randatmail.com,563-0370-61,Lower secondary,Medic,10,Single,5\n" +
                        "Alexia,Bailey,Female,28,a.bailey@randatmail.com,705-5137-99,Doctoral,Baker,10,Single,0\n" +
                        "Lenny,Brooks,Male,21,l.brooks@randatmail.com,472-4381-18,Lower secondary,Manager,3,Married,3\n" +
                        "Dexter,Montgomery,Male,21,d.montgomery@randatmail.com,355-6338-85,Lower secondary,Lawer,1,Single,4\n" +
                        "Harold,Campbell,Male,24,h.campbell@randatmail.com,159-6641-19,Bachelor,Physicist,0,Single,3\n" +
                        "Spike,Murphy,Male,26,s.murphy@randatmail.com,902-2071-21,Upper secondary,Economist,5,Single,0\n" +
                        "Blake,Jones,Male,27,b.jones@randatmail.com,612-4671-86,Lower secondary,Programmer,11,Single,5\n" +
                        "Dominik,Bailey,Male,18,d.bailey@randatmail.com,545-6459-71,Doctoral,Firefighter,3,Married,4\n" +
                        "Tyler,Robinson,Male,18,t.robinson@randatmail.com,585-1099-46,Lower secondary,Lecturer,9,Married,3\n" +
                        "Florrie,Thompson,Female,18,f.thompson@randatmail.com,569-1571-86,Lower secondary,Lawer,0,Single,2\n" +
                        "Cherry,Fowler,Female,27,c.fowler@randatmail.com,627-6406-49,Primary,Botanist,7,Married,2\n" +
                        "Owen,Warren,Male,21,o.warren@randatmail.com,138-7372-36,Lower secondary,Baker,9,Married,1\n" +
                        "Alberta,Turner,Female,30,a.turner@randatmail.com,617-4251-24,Bachelor,Veterinarian,9,Married,5\n" +
                        "Vanessa,Perkins,Female,28,v.perkins@randatmail.com,682-2473-69,Upper secondary,Jeweller,0,Married,3\n" +
                        "James,Cunningham,Male,28,j.cunningham@randatmail.com,100-9458-62,Doctoral,Agronomist,0,Single,3\n" +
                        "Aldus,Hunt,Male,28,a.hunt@randatmail.com,551-9940-92,Upper secondary,Baker,0,Single,0\n" +
                        "Amanda,Thomas,Female,18,a.thomas@randatmail.com,404-6253-28,Lower secondary,Police Officer,0,Single,4\n" +
                        "Mike,Jones,Male,30,m.jones@randatmail.com,660-8668-95,Bachelor,Chemist,14,Single,5\n" +
                        "Isabella,Campbell,Female,19,i.campbell@randatmail.com,305-5319-21,Primary,Physicist,2,Single,2\n";
    }
}
