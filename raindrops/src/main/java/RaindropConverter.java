class RaindropConverter {
    String raindrops ="";
    String convert(int number) {
        if (number % 3 ==0){
            raindrops += "Pling";
        } 
        if (number % 5 == 0){
            raindrops+= "Plang";
        }
        if (number % 7 == 0){
            raindrops+="Plong";
        }
        if (number %3 !=0 && number %5!=0 && number %7!=0){
            raindrops = Integer.toString(number);
        }
        return raindrops;
    }

}
