jshell> // Convertir el formato de hora AM/PM a hora militar (formato 24hrs)

jshell> String input = "07:05:45 PM";
input ==> "07:05:45 PM"

jshell> String[] firstSplit = input.split(" ");
firstSplit ==> String[2] { "07:05:45", "PM" }

jshell> String[] secondSplit = firstSplit[0].split(":");
secondSplit ==> String[3] { "07", "05", "45" }

jshell> String time = firstSplit[1];
time ==> "PM"

jshell> // Casteo de String a Integer
   ...> Integer hours   = Integer.valueOf(secondSplit[0]);
   ...> Integer minutes = Integer.valueOf(secondSplit[1]);
   ...> Integer seconds = Integer.valueOf(secondSplit[2]);
hours ==> 7
minutes ==> 5
seconds ==> 45

jshell> // Condicionar AM o PM
   ...> if (time.equals("AM") && hours == 12){
   ...>    hours = 0;
   ...> }
   ...> if (time.equals("PM") && hours < 12){
   ...>    hours = hours + 12;
   ...> }

jshell> String output = hours + ":" + minutes + ":" + seconds;
output ==> "19:5:45"

